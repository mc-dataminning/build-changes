public class gxa extends gwb<cpg, hda, ggg> {
   private static final ale j = ale.b("textures/entity/piglin/piglin.png");
   private static final ale k = ale.b("textures/entity/piglin/piglin_brute.png");
   public static final gzd.a a = new gzd.a(0.0F, 0.0F, 1.0019531F);

   public gxa(gvk.a $$0, gie $$1, gie $$2, gie $$3, gie $$4, gie $$5, gie $$6) {
      super($$0, new ggg($$0.a($$1)), new ggg($$0.a($$2)), 0.5F, a);
      this.a(new gzn<>(this, new gfq($$0.a($$3)), new gfq($$0.a($$4)), new gfq($$0.a($$5)), new gfq($$0.a($$6)), $$0.h()));
   }

   public ale a(hda $$0) {
      return $$0.a ? k : j;
   }

   public hda b() {
      return new hda();
   }

   public void a(cpg $$0, hda $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bwj.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cxl.b($$0.fA(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hda $$0) {
      return super.a($$0) || $$0.b;
   }
}
