public class fzs extends fzb {
   private fun c;

   public fzs() {
      super("");
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.c = fun.a(xc.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.n / 2 - 100, this.o - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      if (!this.m.J().a(this.m.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aP_() {
      this.E();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.m.J().a(this.m.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
      }

      if (!this.m.J().a(this.m.T())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.m.m.d().d();
         return true;
      }
   }

   private void E() {
      gme $$0 = this.m.t.j;
      $$0.b(new aia(this.m.t, aia.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.m.a(null);
      } else {
         this.m.a(new fzb(this.b.a()));
      }
   }
}
