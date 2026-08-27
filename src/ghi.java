public class ghi extends ggv {
   public ghi(arl $$0, arn $$1, float $$2, float $$3, aup $$4, hx $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static ghi a(arl $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static ghi a(ih<arl> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static ghi a(arl $$0, float $$1, float $$2) {
      return new ghi($$0.a(), arn.a, $$2, $$1, ghn.t(), false, 0, ghn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghi a(arl $$0) {
      return new ghi($$0.a(), arn.b, 1.0F, 1.0F, ghn.t(), false, 0, ghn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghi a(arl $$0, elm $$1) {
      return new ghi($$0, arn.c, 4.0F, 1.0F, ghn.t(), false, 0, ghn.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static ghi b(arl $$0, float $$1, float $$2) {
      return new ghi($$0.a(), arn.i, $$2, $$1, ghn.t(), false, 0, ghn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghi b(arl $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static ghi a(arl $$0, aup $$1, double $$2, double $$3, double $$4) {
      return new ghi($$0, arn.i, 1.0F, 1.0F, $$1, false, 0, ghn.a.b, $$2, $$3, $$4);
   }

   public ghi(arl $$0, arn $$1, float $$2, float $$3, aup $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, ghn.a.b, $$5, $$6, $$7);
   }

   private ghi(arl $$0, arn $$1, float $$2, float $$3, aup $$4, boolean $$5, int $$6, ghn.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public ghi(ahd $$0, arn $$1, float $$2, float $$3, aup $$4, boolean $$5, int $$6, ghn.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
