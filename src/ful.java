import javax.annotation.Nullable;

public abstract class ful extends ftw {
   ful(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xf.a);
   }

   public static ful a(int $$0, int $$1, alr $$2, int $$3, int $$4) {
      return new ful.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static ful a(int $$0, int $$1, alr $$2) {
      return new ful.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fxv $$0) {
   }

   @Override
   public void a(hpt $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fth a(fyb $$0) {
      return null;
   }

   static class a extends ful {
      private final alr a;

      public a(int $$0, int $$1, int $$2, int $$3, alr $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ftk $$0, int $$1, int $$2, float $$3) {
         $$0.a(gry::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends ful {
      private final alr a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alr $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ftk $$0, int $$1, int $$2, float $$3) {
         $$0.a(gry::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
