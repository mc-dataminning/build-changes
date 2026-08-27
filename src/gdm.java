public class gdm extends gcj<cbi, fmn<cbi>> {
   private static final ahg a = new ahg("textures/entity/wither/wither_armor.png");
   private final fmn<cbi> b;

   public gdm(gai<cbi, fmn<cbi>> $$0, fmt $$1) {
      super($$0);
      this.b = new fmn<>($$1.a(fmw.bT));
   }

   @Override
   protected float a(float $$0) {
      return auo.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ahg a() {
      return a;
   }

   @Override
   protected fjx<cbi> b() {
      return this.b;
   }
}
