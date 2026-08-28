public class giw extends gkh {
   private final gkc a;

   protected giw(gfz $$0, double $$1, double $$2, double $$3, gkc $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gjl b() {
      return gjl.b;
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

   public static class a implements gjk<lx> {
      private final gkc a;

      public a(gkc $$0) {
         this.a = $$0;
      }

      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new giw($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gjk<lx> {
      private final gkc a;

      public b(gkc $$0) {
         this.a = $$0;
      }

      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjh $$8 = new giw($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
