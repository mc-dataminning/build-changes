public class gnc extends gmv<cjq> {
   private static final akt b = new akt("textures/entity/skeleton/stray.png");
   private static final akt g = new akt("textures/entity/skeleton/stray_overlay.png");

   public gnc(gkq.a $$0) {
      super($$0, fyr.bF, fyr.bG, fyr.bH);
      this.a(new gpm<>(this, $$0.f(), fyr.bI, g));
   }

   public akt a(cjq $$0) {
      return $$0.dV() ? gmv.a : b;
   }
}
