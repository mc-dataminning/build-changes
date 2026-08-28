public class grj extends gtk<cmu, gxy, gbl> {
   private static final akv a = akv.b("textures/entity/breeze/breeze.png");

   public grj(gse.a $$0) {
      super($$0, new gbl($$0.a(gfc.K)), 0.5F);
      this.a(new gvr($$0, this));
      this.a(new gvq(this));
   }

   public void a(gxy $$0, ffu $$1, gly $$2, int $$3) {
      gbl $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public akv a(gxy $$0) {
      return a;
   }

   public gxy a() {
      return new gxy();
   }

   public void a(cmu $$0, gxy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bY);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bZ);
      $$1.f.a($$0.d);
   }

   public static gbl a(gbl $$0, gfd... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gfd $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
