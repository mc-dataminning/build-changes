public class gpj extends gog<ciu, fya<ciu>> {
   private static final akr a = akr.b("textures/entity/wither/wither_armor.png");
   private final fya<ciu> b;

   public gpj(gmf<ciu, fya<ciu>> $$0, fyg $$1) {
      super($$0);
      this.b = new fya<>($$1.a(fyj.bX));
   }

   @Override
   protected float a(float $$0) {
      return ayo.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akr a() {
      return a;
   }

   @Override
   protected fvk<ciu> b() {
      return this.b;
   }
}
