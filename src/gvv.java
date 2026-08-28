public class gvv extends gwc<gyd, gbt> {
   private static final akv a = akv.b("textures/entity/creeper/creeper_armor.png");
   private final gbt b;

   public gvv(gub<gyd, gbt> $$0, gez $$1) {
      super($$0);
      this.b = new gbt($$1.a(gfc.aj));
   }

   protected boolean a(gyd $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akv a() {
      return a;
   }

   protected gbt b() {
      return this.b;
   }
}
