// Simple interface for MinimumWeightPerfectMatching (MWPM) solutions to simplify testing.

package com.anzal.algorithms.dp;

public interface MwpmInterface {
  public double getMinWeightCost();

  public int[] getMatching();
}
