public class gnf extends gpf<cmi, gtr, fxk> {
   private static final alh a = alh.b("textures/entity/breeze/breeze.png");

   public gnf(gnz.a $$0) {
      super($$0, new fxk($$0.a(gba.B)), 0.5F);
      this.a(new grl($$0, this));
      this.a(new grk(this));
   }

   public void a(gtr $$0, fdt $$1, ghw $$2, int $$3) {
      fxk $$4 = this.e();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alh a(gtr $$0) {
      return a;
   }

   public gtr a() {
      return new gtr();
   }

   public void a(cmi $$0, gtr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.e);
   }

   public static fxk a(fxk $$0, gbb... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gbb $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
