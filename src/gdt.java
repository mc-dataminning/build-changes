public class gdt extends gfe {
   private final gez a;

   protected gdt(gax $$0, double $$1, double $$2, double $$3, gez $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gei b() {
      return gei.b;
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

   public static class a implements geh<lr> {
      private final gez a;

      public a(gez $$0) {
         this.a = $$0;
      }

      public gee a(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdt($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements geh<lr> {
      private final gez a;

      public b(gez $$0) {
         this.a = $$0;
      }

      public gee a(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gee $$8 = new gdt($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
