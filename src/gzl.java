public class gzl extends gym<cqw, hfp, giq> {
   private static final alr j = alr.b("textures/entity/piglin/piglin.png");
   private static final alr k = alr.b("textures/entity/piglin/piglin_brute.png");
   public static final hbo.a a = new hbo.a(0.0F, 0.0F, 1.0019531F);

   public gzl(gxv.a $$0, gkp $$1, gkp $$2, gkp $$3, gkp $$4, gkp $$5, gkp $$6) {
      super($$0, new giq($$0.a($$1)), new giq($$0.a($$2)), 0.5F, a);
      this.a(new hby<>(this, new gia($$0.a($$3)), new gia($$0.a($$4)), new gia($$0.a($$5)), new gia($$0.a($$6)), $$0.h()));
   }

   public alr a(hfp $$0) {
      return $$0.a ? k : j;
   }

   public hfp b() {
      return new hfp();
   }

   public void a(cqw $$0, hfp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.an() == bxn.aT;
      $$1.d = $$0.gw();
      $$1.c = (float)czd.b($$0.fB(), $$0);
      $$1.b = $$0.gu();
   }

   protected boolean b(hfp $$0) {
      return super.a($$0) || $$0.b;
   }
}
