public class gig extends gjr {
   private final gjm a;

   protected gig(gfj $$0, double $$1, double $$2, double $$3, gjm $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public giv b() {
      return giv.b;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements giu<lw> {
      private final gjm a;

      public a(gjm $$0) {
         this.a = $$0;
      }

      public gir a(lw $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gig($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements giu<lw> {
      private final gjm a;

      public b(gjm $$0) {
         this.a = $$0;
      }

      public gir a(lw $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gir $$8 = new gig($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
