public class gmk extends gms<cjn, fts<cjn>> {
   private static final ale a = new ale("textures/entity/creeper/creeper_armor.png");
   private final fts<cjn> b;

   public gmk(gkr<cjn, fts<cjn>> $$0, fwu $$1) {
      super($$0);
      this.b = new fts<>($$1.a(fwx.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ale a() {
      return a;
   }

   @Override
   protected fty<cjn> b() {
      return this.b;
   }
}
