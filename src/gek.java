public class gek extends gdx {
   public gek(aqm $$0, aqo $$1, float $$2, float $$3, ato $$4, ht $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gek a(aqm $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gek a(ib<aqm> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gek a(aqm $$0, float $$1, float $$2) {
      return new gek($$0.a(), aqo.a, $$2, $$1, gep.t(), false, 0, gep.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gek a(aqm $$0) {
      return new gek($$0.a(), aqo.b, 1.0F, 1.0F, gep.t(), false, 0, gep.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gek a(aqm $$0, eji $$1) {
      return new gek($$0, aqo.c, 4.0F, 1.0F, gep.t(), false, 0, gep.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gek b(aqm $$0, float $$1, float $$2) {
      return new gek($$0.a(), aqo.i, $$2, $$1, gep.t(), false, 0, gep.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gek b(aqm $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gek a(aqm $$0, ato $$1, double $$2, double $$3, double $$4) {
      return new gek($$0, aqo.i, 1.0F, 1.0F, $$1, false, 0, gep.a.b, $$2, $$3, $$4);
   }

   public gek(aqm $$0, aqo $$1, float $$2, float $$3, ato $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gep.a.b, $$5, $$6, $$7);
   }

   private gek(aqm $$0, aqo $$1, float $$2, float $$3, ato $$4, boolean $$5, int $$6, gep.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gek(agg $$0, aqo $$1, float $$2, float $$3, ato $$4, boolean $$5, int $$6, gep.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
