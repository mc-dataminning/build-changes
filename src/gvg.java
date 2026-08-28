public class gvg extends gvn<gxn, gbd> {
   private static final alz a = alz.b("textures/entity/creeper/creeper_armor.png");
   private final gbd b;

   public gvg(gtm<gxn, gbd> $$0, gej $$1) {
      super($$0);
      this.b = new gbd($$1.a(gem.ag));
   }

   protected boolean a(gxn $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alz a() {
      return a;
   }

   protected gbd b() {
      return this.b;
   }
}
