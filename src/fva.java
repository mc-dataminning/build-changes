import javax.annotation.Nullable;

public abstract class fva extends ful {
   fva(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xb.a);
   }

   public static fva a(int $$0, int $$1, alk $$2, int $$3, int $$4) {
      return new fva.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fva a(int $$0, int $$1, alk $$2) {
      return new fva.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fyk $$0) {
   }

   @Override
   public void a(hqf $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public ftw a(fyq $$0) {
      return null;
   }

   static class a extends fva {
      private final alk a;

      public a(int $$0, int $$1, int $$2, int $$3, alk $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         $$0.a(gsn::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fva {
      private final alk a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alk $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ftz $$0, int $$1, int $$2, float $$3) {
         $$0.a(gsn::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
