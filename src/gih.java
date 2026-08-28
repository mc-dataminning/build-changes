public class gih extends gjs {
   private final gjn a;

   protected gih(gfk $$0, double $$1, double $$2, double $$3, gjn $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public giw b() {
      return giw.b;
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

   public static class a implements giv<lw> {
      private final gjn a;

      public a(gjn $$0) {
         this.a = $$0;
      }

      public gis a(lw $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gih($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements giv<lw> {
      private final gjn a;

      public b(gjn $$0) {
         this.a = $$0;
      }

      public gis a(lw $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gis $$8 = new gih($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
