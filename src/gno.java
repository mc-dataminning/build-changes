public class gno extends goz {
   private final gou a;

   protected gno(gkq $$0, double $$1, double $$2, double $$3, gou $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public god b() {
      return god.b;
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

   public static class a implements goc<mc> {
      private final gou a;

      public a(gou $$0) {
         this.a = $$0;
      }

      public gnz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gno($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements goc<mc> {
      private final gou a;

      public b(gou $$0) {
         this.a = $$0;
      }

      public gnz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gnz $$8 = new gno($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
