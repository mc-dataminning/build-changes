public class hba extends gzx<hes, gii> {
   private static final alg a = alg.b("textures/entity/wither/wither_armor.png");
   private final gii b;

   public hba(gxw<hes, gii> $$0, giq $$1) {
      super($$0);
      this.b = new gii($$1.a(git.dR));
   }

   protected boolean a(hes $$0) {
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

   protected gii b() {
      return this.b;
   }
}
