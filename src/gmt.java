public class gmt extends glq<chw, fvm<chw>> {
   private static final akn a = new akn("textures/entity/wither/wither_armor.png");
   private final fvm<chw> b;

   public gmt(gjp<chw, fvm<chw>> $$0, fvs $$1) {
      super($$0);
      this.b = new fvm<>($$1.a(fvv.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayf.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akn a() {
      return a;
   }

   @Override
   protected fsw<chw> b() {
      return this.b;
   }
}
