public class gzb extends gzi<hbi, gev> {
   private static final ale a = ale.b("textures/entity/creeper/creeper_armor.png");
   private final gev b;

   public gzb(gxh<hbi, gev> $$0, gic $$1) {
      super($$0);
      this.b = new gev($$1.a(gif.an));
   }

   protected boolean a(hbi $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ale a() {
      return a;
   }

   protected gev b() {
      return this.b;
   }
}
