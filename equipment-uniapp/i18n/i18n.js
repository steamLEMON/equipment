import Vue from 'vue'
import VueI18n from 'vue-i18n'
import messages from './langs/index'
Vue.use(VueI18n)
const i18n = new VueI18n({
	locale: localStorage.lang || 'zh', //初始未选择默认 zh 中文
	messages,
})
export default i18n;