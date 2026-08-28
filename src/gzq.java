public class gzq extends gzx<hby, gfi> {
   private static final alg a = alg.b("textures/entity/creeper/creeper_armor.png");
   private final gfi b;

   public gzq(gxw<hby, gfi> $$0, giq $$1) {
      super($$0);
      this.b = new gfi($$1.a(git.ap));
   }

   protected boolean a(hby $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected gfi b() {
      return this.b;
   }
}
