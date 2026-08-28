public class gdq extends gft {
   private final gfo a;

   gdq(gbm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gfo $$7) {
      super($$0, $$1, $$2, $$3);
      this.a = $$7;
      this.t = 4;
      this.u = 0.008F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.b($$7);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         this.b(this.a);
      }
   }

   @Override
   public gex b() {
      return gex.b;
   }

   public static class a implements gew<ls> {
      private final gfo a;

      public a(gfo $$0) {
         this.a = $$0;
      }

      public get a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
