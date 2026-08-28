public class gcc extends gdn {
   private final gdi a;

   protected gcc(fzf $$0, double $$1, double $$2, double $$3, gdi $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gcr b() {
      return gcr.d;
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

   public static class a implements gcq<lq> {
      private final gdi a;

      public a(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcc($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gcq<lq> {
      private final gdi a;

      public b(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcn $$8 = new gcc($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
