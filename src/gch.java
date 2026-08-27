public class gch extends gbu {
   public gch(apc $$0, ape $$1, float $$2, float $$3, asc $$4, gw $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gch a(apc $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gch a(he<apc> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gch a(apc $$0, float $$1, float $$2) {
      return new gch($$0.a(), ape.a, $$2, $$1, gcm.t(), false, 0, gcm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gch a(apc $$0) {
      return new gch($$0.a(), ape.b, 1.0F, 1.0F, gcm.t(), false, 0, gcm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gch a(apc $$0, ehn $$1) {
      return new gch($$0, ape.c, 4.0F, 1.0F, gcm.t(), false, 0, gcm.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gch b(apc $$0, float $$1, float $$2) {
      return new gch($$0.a(), ape.i, $$2, $$1, gcm.t(), false, 0, gcm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gch b(apc $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gch a(apc $$0, asc $$1, double $$2, double $$3, double $$4) {
      return new gch($$0, ape.i, 1.0F, 1.0F, $$1, false, 0, gcm.a.b, $$2, $$3, $$4);
   }

   public gch(apc $$0, ape $$1, float $$2, float $$3, asc $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gcm.a.b, $$5, $$6, $$7);
   }

   private gch(apc $$0, ape $$1, float $$2, float $$3, asc $$4, boolean $$5, int $$6, gcm.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gch(aew $$0, ape $$1, float $$2, float $$3, asc $$4, boolean $$5, int $$6, gcm.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
