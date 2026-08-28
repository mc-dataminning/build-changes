public abstract class fxw extends fxi {
   private static final ww u = ww.c("advMode.setCommand");
   private static final ww v = ww.c("advMode.command");
   private static final ww w = ww.c("advMode.previousOutput");
   protected frz a;
   protected frz b;
   protected frq c;
   protected frq d;
   protected frx<Boolean> s;
   frt x;

   public fxw() {
      super(fnw.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.aK_();
      }
   }

   abstract dhq m();

   abstract int E();

   @Override
   protected void aN_() {
      this.c = this.c(frq.a(wv.d, $$0x -> this.F()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(frq.a(wv.e, $$0x -> this.aK_()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(frx.a(ww.b("O"), ww.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.E(), 20, 20, ww.c("advMode.trackOutput"), ($$0x, $$1) -> {
         dhq $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new frz(this.p, this.n / 2 - 150, 50, 300, 20, ww.c("advMode.command")) {
         @Override
         protected xk d() {
            return super.d().b(fxw.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new frz(this.p, this.n / 2 - 150, this.E(), 276, 20, ww.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new frt(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aB_() {
      this.b(this.a);
   }

   @Override
   protected ww z() {
      return this.x.a() ? this.x.b() : super.z();
   }

   @Override
   public void a(fof $$0, int $$1, int $$2) {
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
      dhq $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(dhq var1);

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
   public void a(frc $$0, int $$1, int $$2, float $$3) {
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
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
