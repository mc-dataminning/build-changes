public class gfn extends gge {
   private final gfz a;

   gfn(gbx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gfz $$7) {
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
   public gfi b() {
      return gfi.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(gfz a) implements gfh<ls> {
      public gfe a(ls $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfn $$8 = new gfn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.b();
         $$8.z = $$0.b();
         $$8.a($$1.A.a(12) + 8);
         return $$8;
      }
   }
}
