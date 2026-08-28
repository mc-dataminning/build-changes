public class gxw extends gyd<had, gds> {
   private static final ald a = ald.b("textures/entity/creeper/creeper_armor.png");
   private final gds b;

   public gxw(gwc<had, gds> $$0, ggz $$1) {
      super($$0);
      this.b = new gds($$1.a(ghc.an));
   }

   protected boolean a(had $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ald a() {
      return a;
   }

   protected gds b() {
      return this.b;
   }
}
