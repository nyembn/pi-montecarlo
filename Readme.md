Monte Carlo methods can be thought of as statistical simulation methods that utilize a sequences of random numbers to perform the simulation. In a typical process one compute the number of points in a set A that lies inside box R.  The ratio of the number of points that fall inside A to the total number of points tried is equal to the ratio of the two areas (or volume in 3 dimensions).  The accuracy of the ratio depends on the number of points used, with more points leading to a more accurate value.

A simple Monte Carlo simulation to approximate the value of  pi could involve randomly selecting points  (xi, yi) for i = 1 to n, in the unit square and determining the ratio  d = m / n; where m is number of points that satisfy  xi^2 + yi^2 <= 1 

Every time a Monte Carlo simulation is made using the same sample size it will come up with a slightly different value. The values converge very slowly. This property is a consequence of the Central Limit Theorem.

Source: http://mathfaculty.fullerton.edu/mathews/n2003/montecarlopimod.html
