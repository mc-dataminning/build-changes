public class gkp extends glg {
   private final glb a;

   gkp(ggy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, glb $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.5F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gkk b() {
      return gkk.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(glb a) implements gkj<lv> {
      public gkg a(lv $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gkp $$8 = new gkp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.b();
         $$8.z = $$0.b();
         $$8.a($$1.A.a(12) + 8);
         return $$8;
      }
   }
}
