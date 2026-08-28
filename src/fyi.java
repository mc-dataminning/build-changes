public abstract class fyi extends fxu {
   private static final wy u = wy.c("advMode.setCommand");
   private static final wy v = wy.c("advMode.command");
   private static final wy w = wy.c("advMode.previousOutput");
   protected fsl a;
   protected fsl b;
   protected fsc c;
   protected fsc d;
   protected fsj<Boolean> s;
   fsf x;

   public fyi() {
      super(foi.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.aK_();
      }
   }

   abstract dhw m();

   abstract int E();

   @Override
   protected void aN_() {
      this.c = this.c(fsc.a(wx.d, $$0x -> this.F()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(fsc.a(wx.e, $$0x -> this.aK_()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(fsj.a(wy.b("O"), wy.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.E(), 20, 20, wy.c("advMode.trackOutput"), ($$0x, $$1) -> {
         dhw $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fsl(this.p, this.n / 2 - 150, 50, 300, 20, wy.c("advMode.command")) {
         @Override
         protected xm d() {
            return super.d().b(fyi.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fsl(this.p, this.n / 2 - 150, this.E(), 276, 20, wy.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new fsf(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aB_() {
      this.b(this.a);
   }

   @Override
   protected wy z() {
      return this.x.a() ? this.x.b() : super.z();
   }

   @Override
   public void a(fos $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.x.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.m().l().getString() : "-");
   }

   protected void F() {
      dhw $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(dhw var1);

   private void a(String $$0) {
      this.x.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.x.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.F();
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.x.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.x.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, u, this.n / 2, 20, 16777215);
      $$0.b(this.p, v, this.n / 2 - 150 + 1, 40, 10526880);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.E() - 135;
         $$0.b(this.p, w, this.n / 2 - 150 + 1, $$4 + 4, 10526880);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.x.a($$0, $$1, $$2);
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
