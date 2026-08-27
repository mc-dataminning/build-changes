public class geh extends gep<cdz, flv<cdz>> {
   private static final aiy a = new aiy("textures/entity/creeper/creeper_armor.png");
   private final flv<cdz> b;

   public geh(gco<cdz, flv<cdz>> $$0, foy $$1) {
      super($$0);
      this.b = new flv<>($$1.a(fpb.E));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aiy a() {
      return a;
   }

   @Override
   protected fmb<cdz> b() {
      return this.b;
   }
}
