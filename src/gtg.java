public class gtg extends gsh<cok, gzf, gco> {
   private static final alz b = alz.b("textures/entity/piglin/piglin.png");
   private static final alz k = alz.b("textures/entity/piglin/piglin_brute.png");
   public static final gvj.a a = new gvj.a(0.0F, 0.0F, 1.0019531F);

   public gtg(grq.a $$0, gem $$1, gem $$2, gem $$3, gem $$4, gem $$5, gem $$6) {
      super($$0, new gco($$0.a($$1)), new gco($$0.a($$2)), 0.5F, a);
      this.a(new gvu<>(this, new gby($$0.a($$3)), new gby($$0.a($$4)), new gby($$0.a($$5)), new gby($$0.a($$6)), $$0.h()));
   }

   public alz a(gzf $$0) {
      return $$0.a ? k : b;
   }

   public gzf b() {
      return new gzf();
   }

   public void a(cok $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvr.aT;
      $$1.d = $$0.gp();
      $$1.c = (float)cwg.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzf $$0) {
      return super.a($$0) || $$0.b;
   }
}
