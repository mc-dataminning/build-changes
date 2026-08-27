public class gpa extends gon {
   public gpa(aun $$0, aup $$1, float $$2, float $$3, axt $$4, id $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gpa a(aun $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gpa a(in<aun> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gpa a(aun $$0, float $$1, float $$2) {
      return new gpa($$0.a(), aup.a, $$2, $$1, gpf.t(), false, 0, gpf.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gpa a(aun $$0) {
      return new gpa($$0.a(), aup.b, 1.0F, 1.0F, gpf.t(), false, 0, gpf.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gpa a(aun $$0, esj $$1) {
      return new gpa($$0, aup.c, 4.0F, 1.0F, gpf.t(), false, 0, gpf.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gpa b(aun $$0, float $$1, float $$2) {
      return new gpa($$0.a(), aup.i, $$2, $$1, gpf.t(), false, 0, gpf.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gpa b(aun $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gpa a(aun $$0, axt $$1, double $$2, double $$3, double $$4) {
      return new gpa($$0, aup.i, 1.0F, 1.0F, $$1, false, 0, gpf.a.b, $$2, $$3, $$4);
   }

   public gpa(aun $$0, aup $$1, float $$2, float $$3, axt $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gpf.a.b, $$5, $$6, $$7);
   }

   private gpa(aun $$0, aup $$1, float $$2, float $$3, axt $$4, boolean $$5, int $$6, gpf.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gpa(ajv $$0, aup $$1, float $$2, float $$3, axt $$4, boolean $$5, int $$6, gpf.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
