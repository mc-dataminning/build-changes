public class gca extends gci<cca, fjq<cca>> {
   private static final ahg a = new ahg("textures/entity/creeper/creeper_armor.png");
   private final fjq<cca> b;

   public gca(gah<cca, fjq<cca>> $$0, fms $$1) {
      super($$0);
      this.b = new fjq<>($$1.a(fmv.F));
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
   protected fjw<cca> b() {
      return this.b;
   }
}
