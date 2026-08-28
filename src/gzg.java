public class gzg extends gyd<hcx, ggr> {
   private static final ald a = ald.b("textures/entity/wither/wither_armor.png");
   private final ggr b;

   public gzg(gwc<hcx, ggr> $$0, ggz $$1) {
      super($$0);
      this.b = new ggr($$1.a(ghc.dN));
   }

   protected boolean a(hcx $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azk.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ald a() {
      return a;
   }

   protected ggr b() {
      return this.b;
   }
}
