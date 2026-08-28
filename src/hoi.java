public class hoi extends hnv {
   public hoi(awx $$0, awz $$1, float $$2, float $$3, bai $$4, iw $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hoi a(awx $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hoi a(jg<awx> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hoi a(awx $$0, float $$1, float $$2) {
      return new hoi($$0.a(), awz.a, $$2, $$1, hon.t(), false, 0, hon.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hoi a(awx $$0) {
      return new hoi($$0.a(), awz.b, 1.0F, 1.0F, hon.t(), false, 0, hon.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hoi a(awx $$0, fgc $$1) {
      return new hoi($$0, awz.c, 4.0F, 1.0F, hon.t(), false, 0, hon.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hoi b(awx $$0, float $$1, float $$2) {
      return new hoi($$0.a(), awz.i, $$2, $$1, hon.t(), false, 0, hon.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hoi b(awx $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hoi a(awx $$0, bai $$1, double $$2, double $$3, double $$4) {
      return new hoi($$0, awz.i, 1.0F, 1.0F, $$1, false, 0, hon.a.b, $$2, $$3, $$4);
   }

   public hoi(awx $$0, awz $$1, float $$2, float $$3, bai $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hon.a.b, $$5, $$6, $$7);
   }

   private hoi(awx $$0, awz $$1, float $$2, float $$3, bai $$4, boolean $$5, int $$6, hon.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hoi(alr $$0, awz $$1, float $$2, float $$3, bai $$4, boolean $$5, int $$6, hon.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
      super($$0, $$1, $$4);
      this.d = $$2;
      this.e = $$3;
      this.f = $$8;
      this.g = $$9;
      this.h = $$10;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$11;
   }
}
