public class glh extends gku {
   public glh(ato $$0, atq $$1, float $$2, float $$3, awt $$4, ib $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static glh a(ato $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static glh a(il<ato> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static glh a(ato $$0, float $$1, float $$2) {
      return new glh($$0.a(), atq.a, $$2, $$1, glm.t(), false, 0, glm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static glh a(ato $$0) {
      return new glh($$0.a(), atq.b, 1.0F, 1.0F, glm.t(), false, 0, glm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static glh a(ato $$0, eov $$1) {
      return new glh($$0, atq.c, 4.0F, 1.0F, glm.t(), false, 0, glm.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static glh b(ato $$0, float $$1, float $$2) {
      return new glh($$0.a(), atq.i, $$2, $$1, glm.t(), false, 0, glm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static glh b(ato $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static glh a(ato $$0, awt $$1, double $$2, double $$3, double $$4) {
      return new glh($$0, atq.i, 1.0F, 1.0F, $$1, false, 0, glm.a.b, $$2, $$3, $$4);
   }

   public glh(ato $$0, atq $$1, float $$2, float $$3, awt $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, glm.a.b, $$5, $$6, $$7);
   }

   private glh(ato $$0, atq $$1, float $$2, float $$3, awt $$4, boolean $$5, int $$6, glm.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public glh(ajc $$0, atq $$1, float $$2, float $$3, awt $$4, boolean $$5, int $$6, glm.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
