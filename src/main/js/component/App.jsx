import React from 'react';

export default class App extends React.Component {
    render() {
        return (
        <body>
        	<div class="container">
        		<div class="navbar">
        			<div class="navbar-inner">
        				<a class="brand" href="http://spring.io"> Spring </a>
        				<ul class="nav">
        					<li><a href="/"> Home </a></li>
        				</ul>
        			</div>
        		</div>
        		<h1>Super Special Greeting</h1>
        		<div>Hello World</div>
        	</div>
        </body>
        );
    }
}