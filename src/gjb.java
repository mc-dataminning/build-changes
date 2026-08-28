public class gjb extends gjr {
   private final gjm a;

   gjb(gfj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gjm $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.0F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public giv b() {
      return giv.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(gjm a) implements giu<lw> {
      public gir a(lw $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjb $$8 = new gjb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.a($$1.A.a(4) + 6);
         return $$8;
      }
   }
}
