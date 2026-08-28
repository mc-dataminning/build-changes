public class fuo extends fty {
   private boolean a;

   public fuo(int $$0, int $$1, fty.c $$2) {
      super($$0, $$1, 20, 20, xg.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xu d() {
      return xf.a(super.d(), this.a() ? xg.c("narrator.button.difficulty_lock.locked") : xg.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      fuo.a $$4;
      if (!this.j) {
         $$4 = this.a ? fuo.a.c : fuo.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fuo.a.b : fuo.a.e;
      } else {
         $$4 = this.a ? fuo.a.a : fuo.a.d;
      }

      $$0.a(gry::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(alr.b("widget/locked_button")),
      b(alr.b("widget/locked_button_highlighted")),
      c(alr.b("widget/locked_button_disabled")),
      d(alr.b("widget/unlocked_button")),
      e(alr.b("widget/unlocked_button_highlighted")),
      f(alr.b("widget/unlocked_button_disabled"));

      final alr g;

      private a(final alr $$0) {
         this.g = $$0;
      }
   }
}
