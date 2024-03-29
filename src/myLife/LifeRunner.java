/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */
package myLife;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import myLife.grid.BoundedGrid;
import myLife.grid.Grid;
import myLife.grid.Location;
import myLife.legasy.actors.Actor;
import myLife.legasy.actors.ActorWorld;

import java.util.ArrayList;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public static class LifeRunner extends Application
{
    public static void main(String[] args)
    {
        makeLifeWorld(100, 100);

    }



    /**
     * Makes a Game of Life grid with an r-pentomino.
     */
    public static void makeLifeWorld(int rows, int cols){
        BoundedGrid grid = new BoundedGrid(rows, cols);
        ActorWorld world = new ActorWorld(grid);
        makeRocks(world);
        makePentomino(world, rows/2, cols/2);
        world.show();
    }
    /**
     * Fills the grid with LifeRocks.
     */
    public static void makeRocks(ActorWorld world){
       /* for (int i = 0; i <world.getGrid().getNumCols() ; i++) {
            for (int j = 0; j < world.getGrid().getNumRows(); j++) {
                Location loc = new Location(i, j);
                LifeRock rock = new LifeRock();
                world.add(loc, rock);

            }
        }*/
    }

    public static void makePentomino(ActorWorld world, int x, int y) {
      /*  Grid<Actor> grid = world.getGrid();
        ArrayList<Location> locs = new ArrayList<Location>();
        locs.add(new Location(x-1, y));
        locs.add(new Location(x-1, y+1));
        locs.add(new Location(x,   y-1));
        locs.add(new Location(x,   y));
        locs.add(new Location(x+1, y));

        for (Location loc: locs) {
            LifeRock rock = (LifeRock) grid.get(loc);
            rock.setAlive();*/
        }
    }

    public static class Controller {
    }





    }
}
