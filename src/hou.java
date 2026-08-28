public class hou extends hoh {
   public hou(awq $$0, aws $$1, float $$2, float $$3, azz $$4, iw $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hou a(awq $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hou a(jg<awq> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hou a(awq $$0, float $$1, float $$2) {
      return new hou($$0.a(), aws.a, $$2, $$1, hoz.t(), false, 0, hoz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hou a(awq $$0) {
      return new hou($$0.a(), aws.b, 1.0F, 1.0F, hoz.t(), false, 0, hoz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hou a(awq $$0, ffs $$1) {
      return new hou($$0, aws.c, 4.0F, 1.0F, hoz.t(), false, 0, hoz.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hou b(awq $$0, float $$1, float $$2) {
      return new hou($$0.a(), aws.i, $$2, $$1, hoz.t(), false, 0, hoz.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hou b(awq $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hou a(awq $$0, azz $$1, double $$2, double $$3, double $$4) {
      return new hou($$0, aws.i, 1.0F, 1.0F, $$1, false, 0, hoz.a.b, $$2, $$3, $$4);
   }

   public hou(awq $$0, aws $$1, float $$2, float $$3, azz $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hoz.a.b, $$5, $$6, $$7);
   }

   private hou(awq $$0, aws $$1, float $$2, float $$3, azz $$4, boolean $$5, int $$6, hoz.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hou(alk $$0, aws $$1, float $$2, float $$3, azz $$4, boolean $$5, int $$6, hoz.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
