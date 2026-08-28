public class gng extends gkc<cob> {
   private static final akq a = akq.b("textures/entity/wither/wither_invulnerable.png");
   private static final akq f = akq.b("textures/entity/wither/wither.png");
   private final fxa g;

   public gng(gkd.a $$0) {
      super($$0);
      this.g = new fxa($$0.a(fyd.cc));
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("head", fyj.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyg.a);
      return fyk.a($$0, 64, 64);
   }

   protected int a(cob $$0, jd $$1) {
      return 15;
   }

   public void a(cob $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayn.j($$2, $$0.O, $$0.dG());
      float $$7 = ayn.i($$2, $$0.P, $$0.dI());
      fbg $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gpw.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(cob $$0) {
      return $$0.y() ? a : f;
   }
}
