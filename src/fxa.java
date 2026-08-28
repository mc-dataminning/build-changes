import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fxa extends fxu {
   private static final wy a = wy.c("addServer.enterIp");
   private fsc b;
   private final gkg c;
   private fsl d;
   private final BooleanConsumer s;
   private final fxu u;

   public fxa(fxu $$0, BooleanConsumer $$1, gkg $$2) {
      super(wy.c("selectServer.direct"));
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
      this.d = new fsl(this.p, this.n / 2 - 100, 116, 200, 20, wy.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.n.Y);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(fsc.a(wy.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(fsc.a(wx.e, $$0 -> this.s.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aB_() {
      this.b(this.d);
   }

   @Override
   public void a(fos $$0, int $$1, int $$2) {
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
      this.b.j = glj.b(this.d.a());
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
