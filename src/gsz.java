public class gsz extends gsm {
   public gsz(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, ja $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gsz a(avg $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gsz a(jj<avg> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gsz a(avg $$0, float $$1, float $$2) {
      return new gsz($$0.a(), avi.a, $$2, $$1, gte.t(), false, 0, gte.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsz a(avg $$0) {
      return new gsz($$0.a(), avi.b, 1.0F, 1.0F, gte.t(), false, 0, gte.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsz a(avg $$0, ewh $$1) {
      return new gsz($$0, avi.c, 4.0F, 1.0F, gte.t(), false, 0, gte.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gsz b(avg $$0, float $$1, float $$2) {
      return new gsz($$0.a(), avi.i, $$2, $$1, gte.t(), false, 0, gte.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gsz b(avg $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gsz a(avg $$0, ayo $$1, double $$2, double $$3, double $$4) {
      return new gsz($$0, avi.i, 1.0F, 1.0F, $$1, false, 0, gte.a.b, $$2, $$3, $$4);
   }

   public gsz(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gte.a.b, $$5, $$6, $$7);
   }

   private gsz(avg $$0, avi $$1, float $$2, float $$3, ayo $$4, boolean $$5, int $$6, gte.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gsz(akk $$0, avi $$1, float $$2, float $$3, ayo $$4, boolean $$5, int $$6, gte.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
