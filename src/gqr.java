public class gqr extends gqk {
   private float a;

   gqr(gmb $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.t = (int)(Math.random() * 60.0) + 30;
      this.n = false;
      this.j = 0.0;
      this.k = -0.05;
      this.l = 0.0;
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.u = 0.002F;
   }

   @Override
   public gpo b() {
      return gpo.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         float $$0 = 0.6F;
         this.j = this.j + (double)(0.6F * azo.b(this.a));
         this.l = this.l + (double)(0.6F * azo.a(this.a));
         this.j *= 0.07;
         this.l *= 0.07;
         this.a(this.j, this.k, this.l);
         if (!this.c.b_(iv.a(this.g, this.h, this.i)).a(axj.a) || this.m) {
            this.k();
         }

         this.a += 0.08F;
      }
   }

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqr $$8 = new gqr($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
