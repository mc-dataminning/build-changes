public class gtv extends gsw<cnl, gzw, gde> {
   private static final akv b = akv.b("textures/entity/piglin/piglin.png");
   private static final akv k = akv.b("textures/entity/piglin/piglin_brute.png");
   public static final gvy.a a = new gvy.a(0.0F, 0.0F, 1.0019531F);

   public gtv(gsf.a $$0, gfc $$1, gfc $$2, gfc $$3, gfc $$4, gfc $$5, gfc $$6) {
      super($$0, new gde($$0.a($$1)), new gde($$0.a($$2)), 0.5F, a);
      this.a(new gwj<>(this, new gco($$0.a($$3)), new gco($$0.a($$4)), new gco($$0.a($$5)), new gco($$0.a($$6)), $$0.h()));
   }

   public akv a(gzw $$0) {
      return $$0.a ? k : b;
   }

   public gzw b() {
      return new gzw();
   }

   public void a(cnl $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == but.aS;
      $$1.d = $$0.gt();
      $$1.c = (float)cvh.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzw $$0) {
      return super.a($$0) || $$0.b;
   }
}
