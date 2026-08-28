public class gxx extends gwy<cpq, hdy, ghb> {
   private static final alg j = alg.b("textures/entity/piglin/piglin.png");
   private static final alg k = alg.b("textures/entity/piglin/piglin_brute.png");
   public static final haa.a a = new haa.a(0.0F, 0.0F, 1.0019531F);

   public gxx(gwh.a $$0, gja $$1, gja $$2, gja $$3, gja $$4, gja $$5, gja $$6) {
      super($$0, new ghb($$0.a($$1)), new ghb($$0.a($$2)), 0.5F, a);
      this.a(new hak<>(this, new ggl($$0.a($$3)), new ggl($$0.a($$4)), new ggl($$0.a($$5)), new ggl($$0.a($$6)), $$0.h()));
   }

   public alg a(hdy $$0) {
      return $$0.a ? k : j;
   }

   public hdy b() {
      return new hdy();
   }

   public void a(cpq $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bwo.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cxw.b($$0.fB(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hdy $$0) {
      return super.a($$0) || $$0.b;
   }
}
