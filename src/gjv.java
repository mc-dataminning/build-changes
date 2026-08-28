public class gjv extends glg {
   private final glb a;

   protected gjv(ggy $$0, double $$1, double $$2, double $$3, glb $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gkk b() {
      return gkk.b;
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

   public static class a implements gkj<lx> {
      private final glb a;

      public a(glb $$0) {
         this.a = $$0;
      }

      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjv($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gkj<lx> {
      private final glb a;

      public b(glb $$0) {
         this.a = $$0;
      }

      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gkg $$8 = new gjv($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
