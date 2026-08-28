public class gba extends gcl {
   private final gcg a;

   protected gba(fyd $$0, double $$1, double $$2, double $$3, gcg $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbp b() {
      return gbp.d;
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

   public static class a implements gbo<ln> {
      private final gcg a;

      public a(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gba($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbo<ln> {
      private final gcg a;

      public b(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbl $$8 = new gba($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
