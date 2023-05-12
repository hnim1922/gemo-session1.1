# gemo-session1.1
<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->



<!-- PROJECT LOGO -->
<br />
<div align="center">


  <h1 align="center">Coffee Shop </h1>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#functions">Functions</a></li>
    <li><a href="#lessons-learned">Lesson Learned</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This is the solution for the first homework in the Tech course.
The solution is a small project which calculate the total price of an order at a cafe.

### Built With

* Java

<!-- ROADMAP -->
## Functions

- [ ] Calculate the price of a coffee order based on the customization
- [ ] Add more custmoization for the drinks
- [ ] Allow customization options for chocolate sauce, which can only be added to hot drinks
- [ ] Add more customization options for breakfast items
- [ ] Calculates a list of items instead of one item at a time.


 ## Design choice
 Core Java for the language
 The code uses the Single Responsibility Principle (SRP), where each method from each class has a specific responsibility and performs a single task.

 
## Implement
<p>This project implements a coffee shop ordering system with five different pricing functions for different types of items. The system calculates the total price of an order based on the list of items ordered. The prices for each item are based on the item's type, size, and any customizations selected by the customer.</p>
<p>There are three classes: Coffee, Breakfast, and Order. The Coffee class represents a coffee drink and contains methods for calculating the price of a coffee drink with various customizations. The Breakfast class represents a breakfast item (either a sandwich or a bagel) and contains a method for calculating the price of the breakfast item with various customizations. The Order class represents an order and contains methods for calculating the total price of the order and the price breakdown for each item in the order.</p>
There are five different pricing functions: calculatePrice1, calculatePrice2, calculatePrice3, calculatePrice4, and calculatePrice5. Each function calculates the price of a specific type of item and takes into account any customizations selected by the customer. The calculatePrice5 function is the most general, as it can handle any list of items and calculate the total price and price breakdown for the entire order.


<!-- lessons learned -->
## Lessons learned

* Know how to write simple test case for the project.
*  




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
