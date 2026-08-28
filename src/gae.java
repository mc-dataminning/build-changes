public abstract class gae extends fzq {
   private static final xg u = xg.c("advMode.setCommand");
   private static final xg v = xg.c("advMode.command");
   private static final xg w = xg.c("advMode.previousOutput");
   protected fuh a;
   protected fuh b;
   protected fty c;
   protected fty d;
   protected fuf<Boolean> s;
   fub x;

   public gae() {
      super(fqh.a);
   }

   @Override
   public void e() {
      if (!this.m().j()) {
         this.aQ_();
      }
   }

   abstract dji m();

   abstract int E();

   @Override
   protected void aT_() {
      this.c = this.c(fty.a(xf.d, $$0x -> this.F()).a(this.n / 2 - 4 - 150, this.o / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(fty.a(xf.e, $$0x -> this.aQ_()).a(this.n / 2 + 4, this.o / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.m().p();
      this.s = this.c(fuf.a(xg.b("O"), xg.b("X")).a($$0).a().a(this.n / 2 + 150 - 20, this.E(), 20, 20, xg.c("advMode.trackOutput"), ($$0x, $$1) -> {
         dji $$2 = this.m();
         $$2.a($$1);
         this.c($$1);
      }));
      this.a = new fuh(this.p, this.n / 2 - 150, 50, 300, 20, xg.c("advMode.command")) {
         @Override
         protected xu d() {
            return super.d().b(gae.this.x.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fuh(this.p, this.n / 2 - 150, this.E(), 276, 20, xg.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.x = new fub(this.m, this, this.a, this.p, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.x.a(true);
      this.x.d();
      this.c($$0);
   }

   @Override
   protected void aH_() {
      this.b(this.a);
   }

   @Override
   protected xg z() {
      return this.x.a() ? this.x.b() : super.z();
   }

   @Override
   public void a(fqq $$0, int $$1, int $$2) {
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
      dji $$0 = this.m();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.m.a(null);
   }

   protected abstract void a(dji var1);

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
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
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
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
