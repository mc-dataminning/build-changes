public class gve extends gxf<cow, hbs, gex> {
   private static final alg a = alg.b("textures/entity/breeze/breeze.png");

   public gve(gvz.a $$0) {
      super($$0, new gex($$0.a(git.K)), 0.5F);
      this.a(new gzm($$0, this));
      this.a(new gzl(this));
   }

   public void a(hbs $$0, fjc $$1, gps $$2, int $$3) {
      gex $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alg a(hbs $$0) {
      return a;
   }

   public hbs a() {
      return new hbs();
   }

   public void a(cow $$0, hbs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bF);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bG);
      $$1.f.a($$0.d);
   }

   public static gex a(gex $$0, giu... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (giu $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
