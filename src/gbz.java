public class gbz extends gch<cca, fjp<cca>> {
   private static final ahg a = new ahg("textures/entity/creeper/creeper_armor.png");
   private final fjp<cca> b;

   public gbz(gag<cca, fjp<cca>> $$0, fmr $$1) {
      super($$0);
      this.b = new fjp<>($$1.a(fmu.F));
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
   protected fjv<cca> b() {
      return this.b;
   }
}
