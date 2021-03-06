/*
 * Copyright (C) 2016 Michigan State University Board of Trustees
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.msu.cme.rdp.primerdesign.screenoligos.filter;

import edu.msu.cme.rdp.primerdesign.screenoligos.oligo.Oligo;

/**
 *  Implements OligoFilter interface. HomodimerTemp filter.
 * @author gunturus
 */
public class HomodimerTempFilter implements OligoTempFilter {
    
    double max;
    
    public HomodimerTempFilter(double max) {
        this.max = max;
    }
    /**
     * Checks an Oligo HomodimerTemp based off the max
     * 
     * @param oligo - oligo to be evaluated
     * @return boolean - true means the HomodimerTemp is less than or equal to max
     */
    @Override
    public boolean check(Oligo oligo) {
        return oligo.getHomodimerTm() <= max;
    }

    
//    public boolean check(String seq) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
