public class gkb extends gjo {
   public gkb(atj $$0, atl $$1, float $$2, float $$3, awo $$4, hz $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gkb a(atj $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gkb a(ij<atj> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gkb a(atj $$0, float $$1, float $$2) {
      return new gkb($$0.a(), atl.a, $$2, $$1, gkg.t(), false, 0, gkg.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gkb a(atj $$0) {
      return new gkb($$0.a(), atl.b, 1.0F, 1.0F, gkg.t(), false, 0, gkg.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gkb a(atj $$0, ens $$1) {
      return new gkb($$0, atl.c, 4.0F, 1.0F, gkg.t(), false, 0, gkg.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gkb b(atj $$0, float $$1, float $$2) {
      return new gkb($$0.a(), atl.i, $$2, $$1, gkg.t(), false, 0, gkg.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gkb b(atj $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gkb a(atj $$0, awo $$1, double $$2, double $$3, double $$4) {
      return new gkb($$0, atl.i, 1.0F, 1.0F, $$1, false, 0, gkg.a.b, $$2, $$3, $$4);
   }

   public gkb(atj $$0, atl $$1, float $$2, float $$3, awo $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gkg.a.b, $$5, $$6, $$7);
   }

   private gkb(atj $$0, atl $$1, float $$2, float $$3, awo $$4, boolean $$5, int $$6, gkg.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gkb(aiy $$0, atl $$1, float $$2, float $$3, awo $$4, boolean $$5, int $$6, gkg.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
