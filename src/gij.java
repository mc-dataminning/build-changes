public class gij extends ghw {
   public gij(ars $$0, aru $$1, float $$2, float $$3, auw $$4, hx $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gij a(ars $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gij a(ih<ars> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gij a(ars $$0, float $$1, float $$2) {
      return new gij($$0.a(), aru.a, $$2, $$1, gio.t(), false, 0, gio.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gij a(ars $$0) {
      return new gij($$0.a(), aru.b, 1.0F, 1.0F, gio.t(), false, 0, gio.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gij a(ars $$0, emc $$1) {
      return new gij($$0, aru.c, 4.0F, 1.0F, gio.t(), false, 0, gio.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gij b(ars $$0, float $$1, float $$2) {
      return new gij($$0.a(), aru.i, $$2, $$1, gio.t(), false, 0, gio.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gij b(ars $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gij a(ars $$0, auw $$1, double $$2, double $$3, double $$4) {
      return new gij($$0, aru.i, 1.0F, 1.0F, $$1, false, 0, gio.a.b, $$2, $$3, $$4);
   }

   public gij(ars $$0, aru $$1, float $$2, float $$3, auw $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gio.a.b, $$5, $$6, $$7);
   }

   private gij(ars $$0, aru $$1, float $$2, float $$3, auw $$4, boolean $$5, int $$6, gio.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gij(ahh $$0, aru $$1, float $$2, float $$3, auw $$4, boolean $$5, int $$6, gio.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
