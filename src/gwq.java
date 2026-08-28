public class gwq extends gsz<cnw, hck, ggf> {
   private static final ald a = ald.b("textures/entity/strider/strider.png");
   private static final ald j = ald.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gwq(guf.a $$0) {
      super($$0, new ggf($$0.a(ghc.dp)), new ggf($$0.a(ghc.dr)), 0.5F);
      this.a(new gyv<>(this, $$0.h(), hiy.d.h, $$0x -> $$0x.a, new ggf($$0.a(ghc.dq)), new ggf($$0.a(ghc.ds))));
   }

   public ald a(hck $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hck $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hck b() {
      return new hck();
   }

   public void a(cnw $$0, hck $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwc.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.ca();
   }

   protected boolean c(hck $$0) {
      return super.a($$0) || $$0.b;
   }
}
