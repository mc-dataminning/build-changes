public class gvm extends gxn<cpa, hca, gfe> {
   private static final alg a = alg.b("textures/entity/breeze/breeze.png");

   public gvm(gwh.a $$0) {
      super($$0, new gfe($$0.a(gjb.K)), 0.5F);
      this.a(new gzu($$0, this));
      this.a(new gzt(this));
   }

   public void a(hca $$0, fjj $$1, gqa $$2, int $$3) {
      gfe $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alg a(hca $$0) {
      return a;
   }

   public hca a() {
      return new hca();
   }

   public void a(cpa $$0, hca $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bG);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bH);
      $$1.f.a($$0.d);
   }

   public static gfe a(gfe $$0, gjc... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gjc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
