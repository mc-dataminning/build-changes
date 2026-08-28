public class gfk extends gfa {
   gfk(gbh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, gfj $$8) {
      super($$0, $$1, $$2, $$3, $$8, 0.0F);
      this.B = 0.92F;
      this.D = 0.5F;
      this.e(1.0F);
      this.a((float)axo.b($$7), (float)axo.c($$7), (float)axo.d($$7));
      this.t = (int)((double)(this.D * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.b($$8);
      this.n = false;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         this.b(this.a);
         if (this.s > this.t / 2) {
            this.e(1.0F - ((float)this.s - (float)(this.t / 2)) / (float)this.t);
         }

         if (this.c.a_(je.a(this.g, this.h, this.i)).l()) {
            this.k -= 0.0074F;
         }
      }
   }

   public static class a implements ger<lr> {
      private final gfj a;

      public a(gfj $$0) {
         this.a = $$0;
      }

      public geo a(lr $$0, gbh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfk($$1, $$2, $$3, $$4, $$5, $$6, $$7, axo.a(255, 204, 31, 102), this.a);
      }
   }

   public static class b implements ger<lr> {
      private final gfj a;

      public b(gfj $$0) {
         this.a = $$0;
      }

      public geo a(lr $$0, gbh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfk($$1, $$2, $$3, $$4, $$5, $$6, $$7, axo.a(255, 255, 255, 255), this.a);
      }
   }
}
