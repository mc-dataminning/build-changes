public abstract class gar extends gad {
   private static final xa u = xa.c("advMode.setCommand");
   private static final xa v = xa.c("advMode.command");
   private static final xa w = xa.c("advMode.previousOutput");
   protected fuu a;
   protected fuu b;
   protected ful c;
   protected ful d;
   protected fus<Boolean> s;
   fuo x;

   public gar() {
      super(fqu.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.aP_();
      }
   }

   abstract diw m();

   abstract int E();

   @Override
   protected void aS_() {
      this.c = this.c(ful.a(wz.d, $$0x -> this.F()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(ful.a(wz.e, $$0x -> this.aP_()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(fus.a(xa.b("O"), xa.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.E(), 20, 20, xa.c("advMode.trackOutput"), ($$0x, $$1) -> {
         diw $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fuu(this.p, this.n / 2 - 150, 50, 300, 20, xa.c("advMode.command")) {
         @Override
         protected xo d() {
            return super.d().b(gar.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fuu(this.p, this.n / 2 - 150, this.E(), 276, 20, xa.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new fuo(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aG_() {
      this.b(this.a);
   }

   @Override
   protected xa z() {
      return this.x.a() ? this.x.b() : super.z();
   }

   @Override
   public void a(frd $$0, int $$1, int $$2) {
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
      diw $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(diw var1);

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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
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
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
