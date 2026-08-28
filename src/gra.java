public class gra extends gqb<cnh, gwy, gal> {
   private static final alj b = alj.b("textures/entity/piglin/piglin.png");
   private static final alj k = alj.b("textures/entity/piglin/piglin_brute.png");
   public static final gtd.a a = new gtd.a(0.0F, 0.0F, 1.0019531F);

   public gra(gpk.a $$0, gcj $$1, gcj $$2, gcj $$3, gcj $$4, gcj $$5, gcj $$6) {
      super($$0, new gal($$0.a($$1)), new gal($$0.a($$2)), 0.5F, a);
      this.a(new gto<>(this, new fzv($$0.a($$3)), new fzv($$0.a($$4)), new fzv($$0.a($$5)), new fzv($$0.a($$6)), $$0.h()));
   }

   public alj a(gwy $$0) {
      return $$0.a ? k : b;
   }

   public gwy b() {
      return new gwy();
   }

   public void a(cnh $$0, gwy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bus.aP;
      $$1.d = $$0.go();
      $$1.c = (float)cvd.b($$0.fz(), $$0);
      $$1.b = $$0.gm();
   }

   protected boolean b(gwy $$0) {
      return super.a($$0) || $$0.b;
   }
}
