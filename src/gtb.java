public class gtb extends gsc<cob, gza, gcj> {
   private static final alp b = alp.b("textures/entity/piglin/piglin.png");
   private static final alp k = alp.b("textures/entity/piglin/piglin_brute.png");
   public static final gve.a a = new gve.a(0.0F, 0.0F, 1.0019531F);

   public gtb(grl.a $$0, geh $$1, geh $$2, geh $$3, geh $$4, geh $$5, geh $$6) {
      super($$0, new gcj($$0.a($$1)), new gcj($$0.a($$2)), 0.5F, a);
      this.a(new gvp<>(this, new gbt($$0.a($$3)), new gbt($$0.a($$4)), new gbt($$0.a($$5)), new gbt($$0.a($$6)), $$0.h()));
   }

   public alp a(gza $$0) {
      return $$0.a ? k : b;
   }

   public gza b() {
      return new gza();
   }

   public void a(cob $$0, gza $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvi.aT;
      $$1.d = $$0.gp();
      $$1.c = (float)cvx.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gza $$0) {
      return super.a($$0) || $$0.b;
   }
}
