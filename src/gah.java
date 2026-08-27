public class gah extends gay {
   private final gat a;

   gah(fwr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gat $$7) {
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
   public gac b() {
      return gac.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(gat a) implements gab<kz> {
      public fzy a(kz $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gah $$8 = new gah($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.b();
         $$8.z = $$0.b();
         $$8.a($$1.z.a(12) + 8);
         return $$8;
      }
   }
}
