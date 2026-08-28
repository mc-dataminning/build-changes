import javax.annotation.Nullable;

public class fxf extends fxu {
   @Nullable
   private fsn a;

   public fxf(wy $$0) {
      super($$0);
   }

   @Override
   protected void aN_() {
      this.a = this.c(new fsn(this.n, this.l, this.p, 12));
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
   public boolean aC_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.r();
      this.a($$0);
   }
}
