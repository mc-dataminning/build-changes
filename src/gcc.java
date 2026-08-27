public class gcc extends gbp {
   public gcc(aoy $$0, apa $$1, float $$2, float $$3, arx $$4, gw $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gcc a(aoy $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gcc a(hg<aoy> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gcc a(aoy $$0, float $$1, float $$2) {
      return new gcc($$0.a(), apa.a, $$2, $$1, gch.t(), false, 0, gch.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gcc a(aoy $$0) {
      return new gcc($$0.a(), apa.b, 1.0F, 1.0F, gch.t(), false, 0, gch.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gcc a(aoy $$0, ehi $$1) {
      return new gcc($$0, apa.c, 4.0F, 1.0F, gch.t(), false, 0, gch.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gcc b(aoy $$0, float $$1, float $$2) {
      return new gcc($$0.a(), apa.i, $$2, $$1, gch.t(), false, 0, gch.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gcc b(aoy $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gcc a(aoy $$0, arx $$1, double $$2, double $$3, double $$4) {
      return new gcc($$0, apa.i, 1.0F, 1.0F, $$1, false, 0, gch.a.b, $$2, $$3, $$4);
   }

   public gcc(aoy $$0, apa $$1, float $$2, float $$3, arx $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gch.a.b, $$5, $$6, $$7);
   }

   private gcc(aoy $$0, apa $$1, float $$2, float $$3, arx $$4, boolean $$5, int $$6, gch.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gcc(aeu $$0, apa $$1, float $$2, float $$3, arx $$4, boolean $$5, int $$6, gch.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
