public class ged extends gfo {
   private final gfj a;

   protected ged(gbh $$0, double $$1, double $$2, double $$3, gfj $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public ges b() {
      return ges.b;
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

   public static class a implements ger<lr> {
      private final gfj a;

      public a(gfj $$0) {
         this.a = $$0;
      }

      public geo a(lr $$0, gbh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ged($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements ger<lr> {
      private final gfj a;

      public b(gfj $$0) {
         this.a = $$0;
      }

      public geo a(lr $$0, gbh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         geo $$8 = new ged($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
