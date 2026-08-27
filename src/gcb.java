public class gcb extends gcj<ccb, fjr<ccb>> {
   private static final ahg a = new ahg("textures/entity/creeper/creeper_armor.png");
   private final fjr<ccb> b;

   public gcb(gai<ccb, fjr<ccb>> $$0, fmt $$1) {
      super($$0);
      this.b = new fjr<>($$1.a(fmw.F));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ahg a() {
      return a;
   }

   @Override
   protected fjx<ccb> b() {
      return this.b;
   }
}
