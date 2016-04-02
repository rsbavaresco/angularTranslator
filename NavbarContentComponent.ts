import {Component, View} from 'angular2/angular2';

@Component({
	selector: 'NavbarContentDirective'	
})

@View({
	templateUrl: '/components/navbarcontrol/navbardirective.html'
})		

export class NavbarContentDirective {
	constructor($angular, $log, $route){
	}
}