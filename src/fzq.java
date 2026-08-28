import javax.annotation.Nullable;

public class fzq extends gaf {
   @Nullable
   private fuy a;

   public fzq(xc $$0) {
      super($$0);
   }

   @Override
   protected void aS_() {
      this.a = this.c(new fuy(this.n, this.l, this.p, 12));
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
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.r();
      this.a($$0);
   }
}
