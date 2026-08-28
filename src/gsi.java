public class gsi extends grv {
   public gsi(avz $$0, awb $$1, float $$2, float $$3, azh $$4, iz $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gsi a(avz $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gsi a(ji<avz> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gsi a(avz $$0, float $$1, float $$2) {
      return new gsi($$0.a(), awb.a, $$2, $$1, gsn.t(), false, 0, gsn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsi a(avz $$0) {
      return new gsi($$0.a(), awb.b, 1.0F, 1.0F, gsn.t(), false, 0, gsn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsi a(avz $$0, evr $$1) {
      return new gsi($$0, awb.c, 4.0F, 1.0F, gsn.t(), false, 0, gsn.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gsi b(avz $$0, float $$1, float $$2) {
      return new gsi($$0.a(), awb.i, $$2, $$1, gsn.t(), false, 0, gsn.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsi b(avz $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gsi a(avz $$0, azh $$1, double $$2, double $$3, double $$4) {
      return new gsi($$0, awb.i, 1.0F, 1.0F, $$1, false, 0, gsn.a.b, $$2, $$3, $$4);
   }

   public gsi(avz $$0, awb $$1, float $$2, float $$3, azh $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gsn.a.b, $$5, $$6, $$7);
   }

   private gsi(avz $$0, awb $$1, float $$2, float $$3, azh $$4, boolean $$5, int $$6, gsn.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gsi(alf $$0, awb $$1, float $$2, float $$3, azh $$4, boolean $$5, int $$6, gsn.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
