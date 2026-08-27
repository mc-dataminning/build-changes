public class gdk extends gch<cbh, fml<cbh>> {
   private static final ahg a = new ahg("textures/entity/wither/wither_armor.png");
   private final fml<cbh> b;

   public gdk(gag<cbh, fml<cbh>> $$0, fmr $$1) {
      super($$0);
      this.b = new fml<>($$1.a(fmu.bT));
   }

   @Override
   protected float a(float $$0) {
      return aun.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ahg a() {
      return a;
   }

   @Override
   protected fjv<cbh> b() {
      return this.b;
   }
}
