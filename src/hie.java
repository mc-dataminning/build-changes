public class hie extends hhr {
   public hie(avy $$0, awa $$1, float $$2, float $$3, azg $$4, ji $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hie a(avy $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hie a(jr<avy> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hie a(avy $$0, float $$1, float $$2) {
      return new hie($$0.a(), awa.a, $$2, $$1, hij.t(), false, 0, hij.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hie a(avy $$0) {
      return new hie($$0.a(), awa.b, 1.0F, 1.0F, hij.t(), false, 0, hij.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hie a(avy $$0, fay $$1) {
      return new hie($$0, awa.c, 4.0F, 1.0F, hij.t(), false, 0, hij.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hie b(avy $$0, float $$1, float $$2) {
      return new hie($$0.a(), awa.i, $$2, $$1, hij.t(), false, 0, hij.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hie b(avy $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hie a(avy $$0, azg $$1, double $$2, double $$3, double $$4) {
      return new hie($$0, awa.i, 1.0F, 1.0F, $$1, false, 0, hij.a.b, $$2, $$3, $$4);
   }

   public hie(avy $$0, awa $$1, float $$2, float $$3, azg $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hij.a.b, $$5, $$6, $$7);
   }

   private hie(avy $$0, awa $$1, float $$2, float $$3, azg $$4, boolean $$5, int $$6, hij.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hie(aku $$0, awa $$1, float $$2, float $$3, azg $$4, boolean $$5, int $$6, hij.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
