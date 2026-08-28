public class gtr extends gss<cni, gzs, gda> {
   private static final aku b = aku.b("textures/entity/piglin/piglin.png");
   private static final aku k = aku.b("textures/entity/piglin/piglin_brute.png");
   public static final gvu.a a = new gvu.a(0.0F, 0.0F, 1.0019531F);

   public gtr(gsb.a $$0, gey $$1, gey $$2, gey $$3, gey $$4, gey $$5, gey $$6) {
      super($$0, new gda($$0.a($$1)), new gda($$0.a($$2)), 0.5F, a);
      this.a(new gwf<>(this, new gck($$0.a($$3)), new gck($$0.a($$4)), new gck($$0.a($$5)), new gck($$0.a($$6)), $$0.h()));
   }

   public aku a(gzs $$0) {
      return $$0.a ? k : b;
   }

   public gzs b() {
      return new gzs();
   }

   public void a(cni $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == buq.aS;
      $$1.d = $$0.gq();
      $$1.c = (float)cve.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzs $$0) {
      return super.a($$0) || $$0.b;
   }
}
