public class MovableAdapterImpl implements MovableAdapter{

  double speeKm;
  public double Speed( double speeKm) {
    this.speeKm = speeKm;
    return speeKm;
  }

  @Override
  public double Speed() {
    return (speeKm * 1.60934);
  }
}
