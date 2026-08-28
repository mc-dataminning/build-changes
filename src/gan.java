public class gan extends gcr {
   gan(fyj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.j = $$4 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.k = $$5 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.l = $$6 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.k += 0.002;
         this.a(this.j, this.k, this.l);
         this.j *= 0.85F;
         this.k *= 0.85F;
         this.l *= 0.85F;
         if (!this.c.b_(ja.a(this.g, this.h, this.i)).a(awc.a)) {
            this.k();
         }
      }
   }

   @Override
   public gbv b() {
      return gbv.b;
   }

   public static class a implements gbu<ln> {
      private final gcm a;

      public a(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gan $$8 = new gan($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
