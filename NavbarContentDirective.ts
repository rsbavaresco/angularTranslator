export function NavbarContentDirective(): ng.IDirective {
	return {    
		anotherOne: 'anotherOneAttribute',     
		templateUrl: '/components/navbarcontrol/navbardirective.html',
		controller: ['$angular', '$log', '$route', function(interval, log, route){
		}]
	};
}