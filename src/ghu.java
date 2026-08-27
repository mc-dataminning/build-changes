public class ghu extends ghh {
   public ghu(arq $$0, ars $$1, float $$2, float $$3, auu $$4, hx $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static ghu a(arq $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static ghu a(ih<arq> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static ghu a(arq $$0, float $$1, float $$2) {
      return new ghu($$0.a(), ars.a, $$2, $$1, ghz.t(), false, 0, ghz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghu a(arq $$0) {
      return new ghu($$0.a(), ars.b, 1.0F, 1.0F, ghz.t(), false, 0, ghz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghu a(arq $$0, els $$1) {
      return new ghu($$0, ars.c, 4.0F, 1.0F, ghz.t(), false, 0, ghz.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static ghu b(arq $$0, float $$1, float $$2) {
      return new ghu($$0.a(), ars.i, $$2, $$1, ghz.t(), false, 0, ghz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ghu b(arq $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static ghu a(arq $$0, auu $$1, double $$2, double $$3, double $$4) {
      return new ghu($$0, ars.i, 1.0F, 1.0F, $$1, false, 0, ghz.a.b, $$2, $$3, $$4);
   }

   public ghu(arq $$0, ars $$1, float $$2, float $$3, auu $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, ghz.a.b, $$5, $$6, $$7);
   }

   private ghu(arq $$0, ars $$1, float $$2, float $$3, auu $$4, boolean $$5, int $$6, ghz.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public ghu(ahg $$0, ars $$1, float $$2, float $$3, auu $$4, boolean $$5, int $$6, ghz.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
