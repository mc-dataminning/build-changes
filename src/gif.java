public class gif extends gjq {
   private final gjl a;

   protected gif(gfi $$0, double $$1, double $$2, double $$3, gjl $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public giu b() {
      return giu.b;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements git<lw> {
      private final gjl a;

      public a(gjl $$0) {
         this.a = $$0;
      }

      public giq a(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gif($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements git<lw> {
      private final gjl a;

      public b(gjl $$0) {
         this.a = $$0;
      }

      public giq a(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         giq $$8 = new gif($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
