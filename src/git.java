public class git extends gfq<clg> {
   private static final ajv a = new ajv("textures/entity/wither/wither_invulnerable.png");
   private static final ajv f = new ajv("textures/entity/wither/wither.png");
   private final fsr g;

   public git(gfr.a $$0) {
      super($$0);
      this.g = new fsr($$0.a(ftu.cb));
   }

   public static fub a() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("head", fua.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ftx.a);
      return fub.a($$0, 64, 64);
   }

   protected int a(clg $$0, id $$1) {
      return 15;
   }

   public void a(clg $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = axm.j($$2, $$0.N, $$0.dC());
      float $$7 = axm.i($$2, $$0.O, $$0.dE());
      ewv $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(clg $$0) {
      return $$0.y() ? a : f;
   }
}
