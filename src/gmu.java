public class gmu extends gou<clz, gtf, fwz> {
   private static final ale a = ale.b("textures/entity/breeze/breeze.png");

   public gmu(gno.a $$0) {
      super($$0, new fwz($$0.a(gap.B)), 0.5F);
      this.a(new gra($$0, this));
      this.a(new gqz(this));
   }

   public void a(gtf $$0, fdi $$1, ghl $$2, int $$3) {
      fwz $$4 = this.e();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ale a(gtf $$0) {
      return a;
   }

   public gtf a() {
      return new gtf();
   }

   public void a(clz $$0, gtf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.e);
   }

   public static fwz a(fwz $$0, gaq... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gaq $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
