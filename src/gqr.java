public class gqr extends gnn<cpf, gwd> {
   private static final ale a = ale.b("textures/entity/wither/wither_invulnerable.png");
   private static final ale b = ale.b("textures/entity/wither/wither.png");
   private final fzk h;

   public gqr(gno.a $$0) {
      super($$0);
      this.h = new fzk($$0.a(gap.df));
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("head", gav.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gas.a);
      return gaw.a($$0, 64, 64);
   }

   protected int a(cpf $$0, jf $$1) {
      return 15;
   }

   public void a(gwd $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fdm $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gwx.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ale a(gwd $$0) {
      return $$0.a ? a : b;
   }

   public gwd c() {
      return new gwd();
   }

   public void a(cpf $$0, gwd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.w();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
