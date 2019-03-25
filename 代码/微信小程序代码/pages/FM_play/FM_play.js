Page({
  data: {
    bofang: true,
    current: {
      poster: '../../images/mainPic/7.png',
      name: '听电影原声学英式英语发音',
      author: 'lan studio',
      src: 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E06DCBDC9AB7C49FD713D632D313AC4858BACB8DDD29067D3C601481D36E62053BF8DFEAF74C0A5CCFADD6471160CAF3E6A&fromtag=46',
    },
    audioAction: {
      method: 'pause'
    }
  },
  audioPlayed: function(e) {
    console.log('audio is played')
  },
  audioTimeUpdated: function(e) {
    this.duration = e.detail.duration;
  },

  timeSliderChanged: function(e) {
    if (!this.duration)
      return;

    var time = this.duration * e.detail.value / 100;

    this.setData({
      audioAction: {
        method: 'setCurrentTime',
        data: time
      }
    });
  },
  playbackRateSliderChanged: function(e) {
    this.setData({
      audioAction: {
        method: 'setPlaybackRate',
        data: e.detail.value
      }
    })
  },

  playAudio: function() {
    this.setData({
      bofang: false,
      audioAction: {
        method: 'play'
      }
    });
  },
  pauseAudio: function() {
    this.setData({
      bofang: true,
      audioAction: {
        method: 'pause'
      }
    });
  }
})