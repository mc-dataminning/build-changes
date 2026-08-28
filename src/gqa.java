public class gqa extends gpb<cna, gvx, fzm> {
   private static final ali b = ali.b("textures/entity/piglin/piglin.png");
   private static final ali k = ali.b("textures/entity/piglin/piglin_brute.png");
   public static final gsc.a a = new gsc.a(0.0F, 0.0F, 1.0019531F);

   public gqa(gok.a $$0, gbk $$1, gbk $$2, gbk $$3, gbk $$4, gbk $$5, gbk $$6) {
      super($$0, new fzm($$0.a($$1)), new fzm($$0.a($$2)), 0.5F, a);
      this.a(new gsn<>(this, new fyw($$0.a($$3)), new fyw($$0.a($$4)), new fyw($$0.a($$5)), new fyw($$0.a($$6)), $$0.h()));
   }

   public ali a(gvx $$0) {
      return $$0.a ? k : b;
   }

   public gvx c() {
      return new gvx();
   }

   public void a(cna $$0, gvx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar() == bul.aB;
      $$1.d = $$0.gw();
      $$1.c = (float)cus.b($$0.fD(), $$0);
      $$1.b = $$0.gu();
   }

   protected boolean b(gvx $$0) {
      return super.a($$0) || $$0.b;
   }
}
