public class gqq extends gpr<cne, gwn, gac> {
   private static final all b = all.b("textures/entity/piglin/piglin.png");
   private static final all k = all.b("textures/entity/piglin/piglin_brute.png");
   public static final gss.a a = new gss.a(0.0F, 0.0F, 1.0019531F);

   public gqq(gpa.a $$0, gca $$1, gca $$2, gca $$3, gca $$4, gca $$5, gca $$6) {
      super($$0, new gac($$0.a($$1)), new gac($$0.a($$2)), 0.5F, a);
      this.a(new gtd<>(this, new fzm($$0.a($$3)), new fzm($$0.a($$4)), new fzm($$0.a($$5)), new fzm($$0.a($$6)), $$0.h()));
   }

   public all a(gwn $$0) {
      return $$0.a ? k : b;
   }

   public gwn c() {
      return new gwn();
   }

   public void a(cne $$0, gwn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar() == bup.aB;
      $$1.d = $$0.gx();
      $$1.c = (float)cuw.b($$0.fE(), $$0);
      $$1.b = $$0.gv();
   }

   protected boolean b(gwn $$0) {
      return super.a($$0) || $$0.b;
   }
}
