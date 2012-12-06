/* 
 * TitledXYSeries.java
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2009–2012 Steinbeis Forschungszentrum (STZ Ölbronn),
 * Copyright (c) 2006–2012 by Michael Hoffer
 * 
 * This file is part of Visual Reflection Library (VRL).
 *
 * VRL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * see: http://opensource.org/licenses/LGPL-3.0
 *      file://path/to/VRL/src/eu/mihosoft/vrl/resources/license/lgplv3.txt
 *
 * VRL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * This version of VRL includes copyright notice and attribution requirements.
 * According to the LGPL this information must be displayed even if you modify
 * the source code of VRL. Neither the VRL Canvas attribution icon nor any
 * copyright statement/attribution may be removed.
 *
 * Attribution Requirements:
 *
 * If you create derived work you must do three things regarding copyright
 * notice and author attribution.
 *
 * First, the following text must be displayed on the Canvas:
 * "based on VRL source code". In this case the VRL canvas icon must be removed.
 * 
 * Second, the copyright notice must remain. It must be reproduced in any
 * program that uses VRL.
 *
 * Third, add an additional notice, stating that you modified VRL. In addition
 * you must cite the publications listed below. A suitable notice might read
 * "VRL source code modified by YourName 2012".
 * 
 * Note, that these requirements are in full accordance with the LGPL v3
 * (see 7. Additional Terms, b).
 *
 * Publications:
 *
 * M. Hoffer, C.Poliwoda, G.Wittum. Visual Reflection Library -
 * A Framework for Declarative GUI Programming on the Java Platform.
 * Computing and Visualization in Science, 2011, in press.
 */

package edu.gcsc.vrl.jfreechart;

import eu.mihosoft.vrl.math.Trajectory;
import org.jfree.data.xy.XYSeries;

public class TitledXYSeries extends XYSeries {

    private String title;
    private String xAxisLabel;
    private String yAxisLabel;
    private boolean xAxisLogarithmic;
    private boolean yAxisLogarithmic;

    public TitledXYSeries(String title, String label) {
        super(label, false, true);
        this.title = title;
    }

    public TitledXYSeries(
            String title, String label, String xAxisLabel,
            String yAxisLabel,
            boolean autoSort, boolean allowDuplicateXValues) {
        super(label, autoSort, allowDuplicateXValues);
        this.title = title;
        this.xAxisLabel = xAxisLabel;
        this.yAxisLabel = yAxisLabel;
    }

    public TitledXYSeries(Trajectory t) {
        super(t.getLabel(), false, true);
        setTitle(t.getTitle());
        setxAxisLabel(t.getxAxisLabel());
        setyAxisLabel(t.getyAxisLabel());

        for (int i = 0; i < t.size(); i++) {
            double[] v = t.get(i);
            add(v[0], v[1]);
        }
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the xAxisLabel
     */
    public String getxAxisLabel() {
        return xAxisLabel;
    }

    /**
     * @param xAxisLabel the xAxisLabel to set
     */
    public void setxAxisLabel(String xAxisLabel) {
        this.xAxisLabel = xAxisLabel;
    }

    /**
     * @return the yAxisLabel
     */
    public String getyAxisLabel() {
        return yAxisLabel;
    }

    /**
     * @param yAxisLabel the yAxisLabel to set
     */
    public void setyAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
    }

    /**
     * @return the xAxisLogarithmic
     */
    public boolean isxAxisLogarithmic() {
        return xAxisLogarithmic;
    }

    /**
     * @param xAxisLogarithmic the xAxisLogarithmic to set
     */
    public void setxAxisLogarithmic(boolean xAxisLogarithmic) {
        this.xAxisLogarithmic = xAxisLogarithmic;
    }

    /**
     * @return the yAxisLogarithmic
     */
    public boolean isyAxisLogarithmic() {
        return yAxisLogarithmic;
    }

    /**
     * @param yAxisLogarithmic the yAxisLogarithmic to set
     */
    public void setyAxisLogarithmic(boolean yAxisLogarithmic) {
        this.yAxisLogarithmic = yAxisLogarithmic;
    }
}
