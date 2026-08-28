public class haa extends gzb<cqn, hgc, gjf> {
   private static final alk j = alk.b("textures/entity/piglin/piglin.png");
   private static final alk k = alk.b("textures/entity/piglin/piglin_brute.png");
   public static final hcd.a a = new hcd.a(0.0F, 0.0F, 1.0019531F);

   public haa(gyk.a $$0, gle $$1, gle $$2, gle $$3, gle $$4, gle $$5, gle $$6) {
      super($$0, new gjf($$0.a($$1)), new gjf($$0.a($$2)), 0.5F, a);
      this.a(new hcn<>(this, new gip($$0.a($$3)), new gip($$0.a($$4)), new gip($$0.a($$5)), new gip($$0.a($$6)), $$0.h()));
   }

   public alk a(hgc $$0) {
      return $$0.a ? k : j;
   }

   public hgc b() {
      return new hgc();
   }

   public void a(cqn $$0, hgc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.an() == bxe.aT;
      $$1.d = $$0.x();
      $$1.c = (float)cyt.b($$0.fB(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hgc $$0) {
      return super.a($$0) || $$0.b;
   }
}
