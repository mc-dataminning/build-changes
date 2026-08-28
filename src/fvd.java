public class fvd extends fun {
   private boolean a;

   public fvd(int $$0, int $$1, fun.c $$2) {
      super($$0, $$1, 20, 20, xc.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xq d() {
      return xb.a(super.d(), this.a() ? xc.c("narrator.button.difficulty_lock.locked") : xc.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      fvd.a $$4;
      if (!this.j) {
         $$4 = this.a ? fvd.a.c : fvd.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fvd.a.b : fvd.a.e;
      } else {
         $$4 = this.a ? fvd.a.a : fvd.a.d;
      }

      $$0.a(gsn::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(alk.b("widget/locked_button")),
      b(alk.b("widget/locked_button_highlighted")),
      c(alk.b("widget/locked_button_disabled")),
      d(alk.b("widget/unlocked_button")),
      e(alk.b("widget/unlocked_button_highlighted")),
      f(alk.b("widget/unlocked_button_disabled"));

      final alk g;

      private a(final alk $$0) {
         this.g = $$0;
      }
   }
}
