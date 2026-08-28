public class gic extends gjn {
   private final gji a;

   protected gic(gff $$0, double $$1, double $$2, double $$3, gji $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gir b() {
      return gir.b;
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

   public static class a implements giq<lw> {
      private final gji a;

      public a(gji $$0) {
         this.a = $$0;
      }

      public gin a(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gic($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements giq<lw> {
      private final gji a;

      public b(gji $$0) {
         this.a = $$0;
      }

      public gin a(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gin $$8 = new gic($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
