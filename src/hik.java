public class hik extends hhx {
   public hik(avz $$0, awb $$1, float $$2, float $$3, azh $$4, ji $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hik a(avz $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hik a(jr<avz> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hik a(avz $$0, float $$1, float $$2) {
      return new hik($$0.a(), awb.a, $$2, $$1, hip.t(), false, 0, hip.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hik a(avz $$0) {
      return new hik($$0.a(), awb.b, 1.0F, 1.0F, hip.t(), false, 0, hip.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hik a(avz $$0, fba $$1) {
      return new hik($$0, awb.c, 4.0F, 1.0F, hip.t(), false, 0, hip.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hik b(avz $$0, float $$1, float $$2) {
      return new hik($$0.a(), awb.i, $$2, $$1, hip.t(), false, 0, hip.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hik b(avz $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hik a(avz $$0, azh $$1, double $$2, double $$3, double $$4) {
      return new hik($$0, awb.i, 1.0F, 1.0F, $$1, false, 0, hip.a.b, $$2, $$3, $$4);
   }

   public hik(avz $$0, awb $$1, float $$2, float $$3, azh $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hip.a.b, $$5, $$6, $$7);
   }

   private hik(avz $$0, awb $$1, float $$2, float $$3, azh $$4, boolean $$5, int $$6, hip.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hik(akv $$0, awb $$1, float $$2, float $$3, azh $$4, boolean $$5, int $$6, hip.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
