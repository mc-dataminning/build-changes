import javax.annotation.Nullable;

public class fzb extends fzq {
   @Nullable
   private fuj a;

   public fzb(xg $$0) {
      super($$0);
   }

   @Override
   protected void aO_() {
      this.a = this.c(new fuj(this.n, this.l, this.p, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.n);
         this.a.c(this.n / 2 - this.a.A() / 2, this.o / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.r();
      this.a($$0);
   }
}
