public class gar extends gcc {
   private final gbx a;

   protected gar(fxv $$0, double $$1, double $$2, double $$3, gbx $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbg b() {
      return gbg.d;
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

   public static class a implements gbf<lm> {
      private final gbx a;

      public a(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gar($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbf<lm> {
      private final gbx a;

      public b(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbc $$8 = new gar($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
