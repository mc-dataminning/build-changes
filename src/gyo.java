public class gyo extends gxp<cqa, heq, ghs> {
   private static final alg j = alg.b("textures/entity/piglin/piglin.png");
   private static final alg k = alg.b("textures/entity/piglin/piglin_brute.png");
   public static final har.a a = new har.a(0.0F, 0.0F, 1.0019531F);

   public gyo(gwy.a $$0, gjr $$1, gjr $$2, gjr $$3, gjr $$4, gjr $$5, gjr $$6) {
      super($$0, new ghs($$0.a($$1)), new ghs($$0.a($$2)), 0.5F, a);
      this.a(new hbb<>(this, new ghc($$0.a($$3)), new ghc($$0.a($$4)), new ghc($$0.a($$5)), new ghc($$0.a($$6)), $$0.h()));
   }

   public alg a(heq $$0) {
      return $$0.a ? k : j;
   }

   public heq b() {
      return new heq();
   }

   public void a(cqa $$0, heq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.an() == bwr.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cyg.b($$0.fA(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(heq $$0) {
      return super.a($$0) || $$0.b;
   }
}
