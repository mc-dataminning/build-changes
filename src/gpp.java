public class gpp extends goq<cmv, gvm, fzb> {
   private static final alh b = alh.b("textures/entity/piglin/piglin.png");
   private static final alh k = alh.b("textures/entity/piglin/piglin_brute.png");
   public static final grr.a a = new grr.a(0.0F, 0.0F, 1.0019531F);

   public gpp(gnz.a $$0, gaz $$1, gaz $$2, gaz $$3, gaz $$4, gaz $$5, gaz $$6) {
      super($$0, new fzb($$0.a($$1)), new fzb($$0.a($$2)), 0.5F, a);
      this.a(new gsc<>(this, new fyl($$0.a($$3)), new fyl($$0.a($$4)), new fyl($$0.a($$5)), new fyl($$0.a($$6)), $$0.h()));
   }

   public alh a(gvm $$0) {
      return $$0.a ? k : b;
   }

   public gvm c() {
      return new gvm();
   }

   public void a(cmv $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bug.aB;
      $$1.d = $$0.gx();
      $$1.c = (float)cuo.b($$0.fD(), $$0);
      $$1.b = $$0.gv();
   }

   protected boolean b(gvm $$0) {
      return super.a($$0) || $$0.b;
   }
}
