public class fun extends fve {
   private final fuz a;

   fun(fra $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fuz $$7) {
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
   public fui b() {
      return fui.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(fuz a) implements fuh<kc> {
      public fue a(kc $$0, fra $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fun $$8 = new fun($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.b();
         $$8.z = $$0.b();
         $$8.a($$1.z.a(12) + 8);
         return $$8;
      }
   }
}
