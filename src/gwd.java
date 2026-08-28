public class gwd extends gye<cpk, hcs, gfv> {
   private static final alg a = alg.b("textures/entity/breeze/breeze.png");

   public gwd(gwy.a $$0) {
      super($$0, new gfv($$0.a(gjs.K)), 0.5F);
      this.a(new hal($$0, this));
      this.a(new hak(this));
   }

   public void a(hcs $$0, fkd $$1, gqr $$2, int $$3) {
      gfv $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alg a(hcs $$0) {
      return a;
   }

   public hcs a() {
      return new hcs();
   }

   public void a(cpk $$0, hcs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bG);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bH);
      $$1.f.a($$0.d);
   }

   public static gfv a(gfv $$0, gjt... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gjt $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
