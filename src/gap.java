public class gap extends gca {
   private final gbv a;

   protected gap(fxt $$0, double $$1, double $$2, double $$3, gbv $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbe b() {
      return gbe.d;
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

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gap($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbd<lm> {
      private final gbv a;

      public b(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gba $$8 = new gap($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
