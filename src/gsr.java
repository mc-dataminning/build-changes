public class gsr extends gse {
   public gsr(ave $$0, avg $$1, float $$2, float $$3, aym $$4, ja $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gsr a(ave $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gsr a(jj<ave> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gsr a(ave $$0, float $$1, float $$2) {
      return new gsr($$0.a(), avg.a, $$2, $$1, gsw.t(), false, 0, gsw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsr a(ave $$0) {
      return new gsr($$0.a(), avg.b, 1.0F, 1.0F, gsw.t(), false, 0, gsw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsr a(ave $$0, evz $$1) {
      return new gsr($$0, avg.c, 4.0F, 1.0F, gsw.t(), false, 0, gsw.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gsr b(ave $$0, float $$1, float $$2) {
      return new gsr($$0.a(), avg.i, $$2, $$1, gsw.t(), false, 0, gsw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsr b(ave $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gsr a(ave $$0, aym $$1, double $$2, double $$3, double $$4) {
      return new gsr($$0, avg.i, 1.0F, 1.0F, $$1, false, 0, gsw.a.b, $$2, $$3, $$4);
   }

   public gsr(ave $$0, avg $$1, float $$2, float $$3, aym $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gsw.a.b, $$5, $$6, $$7);
   }

   private gsr(ave $$0, avg $$1, float $$2, float $$3, aym $$4, boolean $$5, int $$6, gsw.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gsr(akk $$0, avg $$1, float $$2, float $$3, aym $$4, boolean $$5, int $$6, gsw.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
