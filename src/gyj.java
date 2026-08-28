public class gyj extends gxk<cpx, hek, ghn> {
   private static final alg j = alg.b("textures/entity/piglin/piglin.png");
   private static final alg k = alg.b("textures/entity/piglin/piglin_brute.png");
   public static final ham.a a = new ham.a(0.0F, 0.0F, 1.0019531F);

   public gyj(gwt.a $$0, gjm $$1, gjm $$2, gjm $$3, gjm $$4, gjm $$5, gjm $$6) {
      super($$0, new ghn($$0.a($$1)), new ghn($$0.a($$2)), 0.5F, a);
      this.a(new haw<>(this, new ggx($$0.a($$3)), new ggx($$0.a($$4)), new ggx($$0.a($$5)), new ggx($$0.a($$6)), $$0.h()));
   }

   public alg a(hek $$0) {
      return $$0.a ? k : j;
   }

   public hek b() {
      return new hek();
   }

   public void a(cpx $$0, hek $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.an() == bwr.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cyd.b($$0.fA(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hek $$0) {
      return super.a($$0) || $$0.b;
   }
}
