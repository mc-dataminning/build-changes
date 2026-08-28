public class fuv extends fue {
   private fpq c;

   public fuv() {
      super("");
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c = fpq.a(wp.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.n / 2 - 100, this.o - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      if (!this.m.J().a(this.m.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aO_() {
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
      ggz $$0 = this.m.t.j;
      $$0.b(new ahm(this.m.t, ahm.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.m.a(null);
      } else {
         this.m.a(new fue(this.b.a()));
      }
   }
}
