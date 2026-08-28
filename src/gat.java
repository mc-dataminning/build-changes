public class gat extends gce {
   private final gbz a;

   protected gat(fxx $$0, double $$1, double $$2, double $$3, gbz $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbi b() {
      return gbi.d;
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

   public static class a implements gbh<lm> {
      private final gbz a;

      public a(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gat($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbh<lm> {
      private final gbz a;

      public b(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbe $$8 = new gat($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
