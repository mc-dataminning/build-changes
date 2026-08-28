public class gum extends gti<gya, gbz> {
   private static final alj a = alj.b("textures/entity/wither/wither_armor.png");
   private final gbz b;

   public gum(grh<gya, gbz> $$0, gch $$1) {
      super($$0);
      this.b = new gbz($$1.a(gck.ds));
   }

   protected boolean a(gya $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alj a() {
      return a;
   }

   protected gbz b() {
      return this.b;
   }
}
