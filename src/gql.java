public class gql<T extends btz & coy> extends gny<T, gwd> {
   private final gox a;
   private final float b;
   private final boolean h;

   public gql(gnz.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gql(gnz.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jg $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gwd $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cvv.h, false, $$1, $$2, $$3, gxj.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwd a() {
      return new gwd();
   }

   public void a(T $$0, gwd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvx $$3 = $$0.m();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dX(), null, $$0.ar()) : null;
      $$1.b = $$3.v();
   }
}
