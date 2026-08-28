public class gsx extends gsk {
   public gsx(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, ja $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gsx a(avg $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gsx a(jj<avg> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gsx a(avg $$0, float $$1, float $$2) {
      return new gsx($$0.a(), avi.a, $$2, $$1, gtc.t(), false, 0, gtc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsx a(avg $$0) {
      return new gsx($$0.a(), avi.b, 1.0F, 1.0F, gtc.t(), false, 0, gtc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsx a(avg $$0, ewf $$1) {
      return new gsx($$0, avi.c, 4.0F, 1.0F, gtc.t(), false, 0, gtc.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gsx b(avg $$0, float $$1, float $$2) {
      return new gsx($$0.a(), avi.i, $$2, $$1, gtc.t(), false, 0, gtc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsx b(avg $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gsx a(avg $$0, ayo $$1, double $$2, double $$3, double $$4) {
      return new gsx($$0, avi.i, 1.0F, 1.0F, $$1, false, 0, gtc.a.b, $$2, $$3, $$4);
   }

   public gsx(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gtc.a.b, $$5, $$6, $$7);
   }

   private gsx(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, boolean $$5, int $$6, gtc.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gsx(akk $$0, avi $$1, float $$2, float $$3, ayo $$4, boolean $$5, int $$6, gtc.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
