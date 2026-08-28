public class ghy extends gjq {
   private final gjl a;

   protected ghy(gfi $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gjl $$7) {
      super($$0, $$1, $$2, $$3);
      this.u = -0.1F;
      this.B = 0.9F;
      this.a = $$7;
      this.j = $$4 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.k = $$5 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.l = $$6 + (Math.random() * 2.0 - 1.0) * 0.05F;
      float $$8 = this.r.i() * 0.3F + 0.7F;
      this.v = $$8;
      this.w = $$8;
      this.x = $$8;
      this.D = 0.1F * (this.r.i() * this.r.i() * 6.0F + 1.0F);
      this.t = (int)(16.0 / ((double)this.r.i() * 0.8 + 0.2)) + 2;
      this.b($$7);
   }

   @Override
   public giu b() {
      return giu.b;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static class a implements git<lw> {
      private final gjl a;

      public a(gjl $$0) {
         this.a = $$0;
      }

      public giq a(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
