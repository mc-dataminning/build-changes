public class hcb extends hci<hek, ghu> {
   private static final alk a = alk.b("textures/entity/creeper/creeper_armor.png");
   private final ghu b;

   public hcb(hah<hek, ghu> $$0, glc $$1) {
      super($$0);
      this.b = new ghu($$1.a(glf.ar));
   }

   protected boolean a(hek $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alk a() {
      return a;
   }

   protected ghu b() {
      return this.b;
   }
}
