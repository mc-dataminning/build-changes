public class gah extends fyu<ccn, flh> {
   private static final agt a = new agt("textures/entity/illager/vex.png");
   private static final agt i = new agt("textures/entity/illager/vex_charging.png");

   public gah(fxo.a $$0) {
      super($$0, new flh($$0.a(flx.bL)), 0.3F);
      this.a(new gbs<>(this, $$0.d()));
   }

   protected int a(ccn $$0, hv $$1) {
      return 15;
   }

   public agt a(ccn $$0) {
      return $$0.gf() ? i : a;
   }
}
