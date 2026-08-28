import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fzl extends gad {
   private static final xa a = xa.c("addServer.enterName");
   private static final xa b = xa.c("addServer.enterIp");
   private ful c;
   private final BooleanConsumer d;
   private final gmq s;
   private fuu u;
   private fuu v;
   private final gad w;

   public fzl(gad $$0, BooleanConsumer $$1, gmq $$2) {
      super(xa.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aS_() {
      this.v = new fuu(this.p, this.n / 2 - 100, 66, 200, 20, xa.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.E());
      this.d(this.v);
      this.u = new fuu(this.p, this.n / 2 - 100, 106, 200, 20, xa.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.E());
      this.d(this.u);
      this.c(
         fus.<gmq.a>a(gmq.a::a)
            .a(gmq.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xa.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(ful.a(xa.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(ful.a(wz.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.E();
   }

   @Override
   protected void aG_() {
      this.b(this.v);
   }

   @Override
   public void a(frd $$0, int $$1, int $$2) {
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
   public void aP_() {
      this.m.a(this.w);
   }

   private void E() {
      this.c.j = gnt.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
