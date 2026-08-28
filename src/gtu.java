public class gtu extends gsv<cnk, gzv, gdd> {
   private static final akv b = akv.b("textures/entity/piglin/piglin.png");
   private static final akv k = akv.b("textures/entity/piglin/piglin_brute.png");
   public static final gvx.a a = new gvx.a(0.0F, 0.0F, 1.0019531F);

   public gtu(gse.a $$0, gfb $$1, gfb $$2, gfb $$3, gfb $$4, gfb $$5, gfb $$6) {
      super($$0, new gdd($$0.a($$1)), new gdd($$0.a($$2)), 0.5F, a);
      this.a(new gwi<>(this, new gcn($$0.a($$3)), new gcn($$0.a($$4)), new gcn($$0.a($$5)), new gcn($$0.a($$6)), $$0.h()));
   }

   public akv a(gzv $$0) {
      return $$0.a ? k : b;
   }

   public gzv b() {
      return new gzv();
   }

   public void a(cnk $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bus.aS;
      $$1.d = $$0.gt();
      $$1.c = (float)cvg.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzv $$0) {
      return super.a($$0) || $$0.b;
   }
}
