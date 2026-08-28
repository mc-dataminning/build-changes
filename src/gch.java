public class gch extends gca {
   protected gch(fxt $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.j *= 0.3F;
      this.k = Math.random() * 0.2F + 0.1F;
      this.l *= 0.3F;
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public gbe b() {
      return gbe.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         this.j *= 0.98F;
         this.k *= 0.98F;
         this.l *= 0.98F;
         if (this.m) {
            if (Math.random() < 0.5) {
               this.k();
            }

            this.j *= 0.7F;
            this.l *= 0.7F;
         }

         iz $$0 = iz.a(this.g, this.h, this.i);
         double $$1 = Math.max(
            this.c.a_($$0).k(this.c, $$0).b(je.a.b, this.g - (double)$$0.u(), this.i - (double)$$0.w()), (double)this.c.b_($$0).a((dbc)this.c, $$0)
         );
         if ($$1 > 0.0 && this.h < (double)$$0.v() + $$1) {
            this.k();
         }
      }
   }

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gch $$8 = new gch($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
