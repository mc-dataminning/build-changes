public class gmh extends glz<cev, fwt<cev>> {
   private static final akt a = new akt("textures/entity/pig/pig.png");
   private static final akt b = new akt("textures/entity/pig/pig_hwat.png");

   public gmh(gkq.a $$0) {
      super($$0, new fwt<>($$0.a(fyr.aM)), 0.7F);
      this.a(new gpj<>(this, new fwt<>($$0.a(fyr.aU)), new akt("textures/entity/pig/pig_saddle.png")));
   }

   public akt a(cev $$0) {
      return $$0.dV() && $$0.t() ? b : a;
   }
}
