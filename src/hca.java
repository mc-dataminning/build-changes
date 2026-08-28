public class hca extends haw<hfs, gjh> {
   private static final alg a = alg.b("textures/entity/wither/wither_armor.png");
   private final gjh b;

   public hca(gyv<hfs, gjh> $$0, gjp $$1) {
      super($$0);
      this.b = new gjh($$1.a(gjs.dV));
   }

   protected boolean a(hfs $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected gjh b() {
      return this.b;
   }
}
