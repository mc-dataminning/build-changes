public class hdm extends hci<hhe, gku> {
   private static final alk a = alk.b("textures/entity/wither/wither_armor.png");
   private final gku b;

   public hdm(hah<hhe, gku> $$0, glc $$1) {
      super($$0);
      this.b = new gku($$1.a(glf.dV));
   }

   protected boolean a(hhe $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azq.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alk a() {
      return a;
   }

   protected gku b() {
      return this.b;
   }
}
