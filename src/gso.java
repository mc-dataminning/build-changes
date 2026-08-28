public class gso extends grm<gwc, gae> {
   private static final ale a = ale.b("textures/entity/wither/wither_armor.png");
   private final gae b;

   public gso(gpk<gwc, gae> $$0, gam $$1) {
      super($$0);
      this.b = new gae($$1.a(gap.da));
   }

   protected boolean a(gwc $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azf.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ale a() {
      return a;
   }

   protected gae b() {
      return this.b;
   }
}
