import javax.annotation.Nullable;

public class fvr extends fuj {
   @Nullable
   protected fvy a;
   protected boolean b;

   public fvr(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wz.a);
      this.b = $$4;
   }

   public void a(fvy $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fyi $$0) {
      this.c($$0);
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gsl::H, this.a.a(this.b, this.D()), this.F(), this.G(), this.g, this.h);
      }
   }
}
