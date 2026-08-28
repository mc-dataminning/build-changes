import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fzj extends gad {
   private static final xa a = xa.c("addServer.enterIp");
   private ful b;
   private final gmq c;
   private fuu d;
   private final BooleanConsumer s;
   private final gad u;

   public fzj(gad $$0, BooleanConsumer $$1, gmq $$2) {
      super(xa.c("selectServer.direct"));
      this.u = $$0;
      this.c = $$2;
      this.s = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aM_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aS_() {
      this.d = new fuu(this.p, this.n / 2 - 100, 116, 200, 20, xa.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.n.Y);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(ful.a(xa.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(ful.a(wz.e, $$0 -> this.s.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aG_() {
      this.b(this.d);
   }

   @Override
   public void a(frd $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void m() {
      this.c.b = this.d.a();
      this.s.accept(true);
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }

   @Override
   public void aJ_() {
      this.m.n.Y = this.d.a();
      this.m.n.az();
   }

   private void E() {
      this.b.j = gnt.b(this.d.a());
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
