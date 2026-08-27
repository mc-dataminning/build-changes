public class fyo extends fzk {
   fyo(fvw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public fzg b() {
      return fzg.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public float b(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      return this.D * (1.0F - $$1 * $$1 * 0.5F);
   }

   @Override
   public int a(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      $$1 = axz.a($$1, 0.0F, 1.0F);
      int $$2 = super.a($$0);
      int $$3 = $$2 & 0xFF;
      int $$4 = $$2 >> 16 & 0xFF;
      $$3 += (int)($$1 * 15.0F * 16.0F);
      if ($$3 > 240) {
         $$3 = 240;
      }

      return $$3 | $$4 << 16;
   }

   public static class a implements fzf<la> {
      private final fzx a;

      public a(fzx $$0) {
         this.a = $$0;
      }

      public fzc a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fyo $$8 = new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements fzf<la> {
      private final fzx a;

      public b(fzx $$0) {
         this.a = $$0;
      }

      public fzc a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fyo $$8 = new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.d(0.5F);
         return $$8;
      }
   }
}
