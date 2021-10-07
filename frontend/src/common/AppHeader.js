import React, { Component } from 'react';
import { Link, NavLink } from 'react-router-dom';
import './gh-fork-ribbon.min.css';

class AppHeader extends Component {
    render() {
        return (
            <header className="app-header">
            <a className="github-fork-ribbon" href="/signup" data-ribbon="Sign Up or Sign In" data-toggle="modal" data-target="#exampleModalCenter" title="Sign Up or Sign In">Sign Up or Sign In</a>
        
            </header>
        )
    }
}

export default AppHeader;