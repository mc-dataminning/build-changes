public class hkk extends hjx {
   public hkk(awj $$0, awl $$1, float $$2, float $$3, azs $$4, jj $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hkk a(awj $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hkk a(js<awj> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hkk a(awj $$0, float $$1, float $$2) {
      return new hkk($$0.a(), awl.a, $$2, $$1, hkp.t(), false, 0, hkp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hkk a(awj $$0) {
      return new hkk($$0.a(), awl.b, 1.0F, 1.0F, hkp.t(), false, 0, hkp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hkk a(awj $$0, fcu $$1) {
      return new hkk($$0, awl.c, 4.0F, 1.0F, hkp.t(), false, 0, hkp.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hkk b(awj $$0, float $$1, float $$2) {
      return new hkk($$0.a(), awl.i, $$2, $$1, hkp.t(), false, 0, hkp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hkk b(awj $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hkk a(awj $$0, azs $$1, double $$2, double $$3, double $$4) {
      return new hkk($$0, awl.i, 1.0F, 1.0F, $$1, false, 0, hkp.a.b, $$2, $$3, $$4);
   }

   public hkk(awj $$0, awl $$1, float $$2, float $$3, azs $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hkp.a.b, $$5, $$6, $$7);
   }

   private hkk(awj $$0, awl $$1, float $$2, float $$3, azs $$4, boolean $$5, int $$6, hkp.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hkk(ald $$0, awl $$1, float $$2, float $$3, azs $$4, boolean $$5, int $$6, hkp.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
