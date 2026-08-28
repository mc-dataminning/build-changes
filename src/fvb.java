public class fvb extends ful {
   private boolean a;

   public fvb(int $$0, int $$1, ful.c $$2) {
      super($$0, $$1, 20, 20, xa.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xo d() {
      return wz.a(super.d(), this.a() ? xa.c("narrator.button.difficulty_lock.locked") : xa.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      fvb.a $$4;
      if (!this.j) {
         $$4 = this.a ? fvb.a.c : fvb.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fvb.a.b : fvb.a.e;
      } else {
         $$4 = this.a ? fvb.a.a : fvb.a.d;
      }

      $$0.a(gsl::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(ali.b("widget/locked_button")),
      b(ali.b("widget/locked_button_highlighted")),
      c(ali.b("widget/locked_button_disabled")),
      d(ali.b("widget/unlocked_button")),
      e(ali.b("widget/unlocked_button_highlighted")),
      f(ali.b("widget/unlocked_button_disabled"));

      final ali g;

      private a(final ali $$0) {
         this.g = $$0;
      }
   }
}
