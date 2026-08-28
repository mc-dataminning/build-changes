public class hcx extends hbt<hgs, gkf> {
   private static final alr a = alr.b("textures/entity/wither/wither_armor.png");
   private final gkf b;

   public hcx(gzs<hgs, gkf> $$0, gkn $$1) {
      super($$0);
      this.b = new gkf($$1.a(gkq.dV));
   }

   protected boolean a(hgs $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alr a() {
      return a;
   }

   protected gkf b() {
      return this.b;
   }
}
