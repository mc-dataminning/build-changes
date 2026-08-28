import javax.annotation.Nullable;

public abstract class fuy extends fuj {
   fuy(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wz.a);
   }

   public static fuy a(int $$0, int $$1, ali $$2, int $$3, int $$4) {
      return new fuy.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fuy a(int $$0, int $$1, ali $$2) {
      return new fuy.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fyi $$0) {
   }

   @Override
   public void a(hqd $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public ftu a(fyo $$0) {
      return null;
   }

   static class a extends fuy {
      private final ali a;

      public a(int $$0, int $$1, int $$2, int $$3, ali $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, float $$3) {
         $$0.a(gsl::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fuy {
      private final ali a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ali $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ftx $$0, int $$1, int $$2, float $$3) {
         $$0.a(gsl::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
