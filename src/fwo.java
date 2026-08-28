import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fwo extends fxi {
   private static final ww a = ww.c("addServer.enterIp");
   private frq b;
   private final gjs c;
   private frz d;
   private final BooleanConsumer s;
   private final fxi u;

   public fwo(fxi $$0, BooleanConsumer $$1, gjs $$2) {
      super(ww.c("selectServer.direct"));
      this.u = $$0;
      this.c = $$2;
      this.s = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aH_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aN_() {
      this.d = new frz(this.p, this.n / 2 - 100, 116, 200, 20, ww.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.n.Y);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(frq.a(ww.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(frq.a(wv.e, $$0 -> this.s.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aB_() {
      this.b(this.d);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void m() {
      this.c.b = this.d.a();
      this.s.accept(true);
   }

   @Override
   public void aK_() {
      this.m.a(this.u);
   }

   @Override
   public void aE_() {
      this.m.n.Y = this.d.a();
      this.m.n.az();
   }

   private void E() {
      this.b.j = gkv.b(this.d.a());
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
