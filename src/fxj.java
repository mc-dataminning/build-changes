import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fxj extends fyb {
   private static final wy a = wy.c("addServer.enterName");
   private static final wy b = wy.c("addServer.enterIp");
   private fsj c;
   private final BooleanConsumer d;
   private final gko s;
   private fss u;
   private fss v;
   private final fyb w;

   public fxj(fyb $$0, BooleanConsumer $$1, gko $$2) {
      super(wy.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aO_() {
      this.v = new fss(this.p, this.n / 2 - 100, 66, 200, 20, wy.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.E());
      this.d(this.v);
      this.u = new fss(this.p, this.n / 2 - 100, 106, 200, 20, wy.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.E());
      this.d(this.u);
      this.c(
         fsq.a(gko.a::a)
            .a(gko.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, wy.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(fsj.a(wy.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fsj.a(wx.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.E();
   }

   @Override
   protected void aC_() {
      this.b(this.v);
   }

   @Override
   public void a(foz $$0, int $$1, int $$2) {
      String $$3 = this.u.a();
      String $$4 = this.v.a();
      this.b($$0, $$1, $$2);
      this.u.a($$3);
      this.v.a($$4);
   }

   private void m() {
      this.s.a = this.v.a();
      this.s.b = this.u.a();
      this.d.accept(true);
   }

   @Override
   public void aL_() {
      this.m.a(this.w);
   }

   private void E() {
      this.c.j = glr.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
