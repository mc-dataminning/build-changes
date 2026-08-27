public class gbt extends gcb<cbv, fjj<cbv>> {
   private static final ahd a = new ahd("textures/entity/creeper/creeper_armor.png");
   private final fjj<cbv> b;

   public gbt(gaa<cbv, fjj<cbv>> $$0, fml $$1) {
      super($$0);
      this.b = new fjj<>($$1.a(fmo.F));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ahd a() {
      return a;
   }

   @Override
   protected fjp<cbv> b() {
      return this.b;
   }
}
