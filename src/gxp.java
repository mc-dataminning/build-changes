public class gxp extends gwq<cpm, hdq, ggt> {
   private static final alg j = alg.b("textures/entity/piglin/piglin.png");
   private static final alg k = alg.b("textures/entity/piglin/piglin_brute.png");
   public static final gzs.a a = new gzs.a(0.0F, 0.0F, 1.0019531F);

   public gxp(gvz.a $$0, gis $$1, gis $$2, gis $$3, gis $$4, gis $$5, gis $$6) {
      super($$0, new ggt($$0.a($$1)), new ggt($$0.a($$2)), 0.5F, a);
      this.a(new hac<>(this, new ggd($$0.a($$3)), new ggd($$0.a($$4)), new ggd($$0.a($$5)), new ggd($$0.a($$6)), $$0.h()));
   }

   public alg a(hdq $$0) {
      return $$0.a ? k : j;
   }

   public hdq b() {
      return new hdq();
   }

   public void a(cpm $$0, hdq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bwm.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cxr.b($$0.fA(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hdq $$0) {
      return super.a($$0) || $$0.b;
   }
}
