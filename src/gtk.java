public class gtk extends gvl<cof, gzy, gdi> {
   private static final ald a = ald.b("textures/entity/breeze/breeze.png");

   public gtk(guf.a $$0) {
      super($$0, new gdi($$0.a(ghc.K)), 0.5F);
      this.a(new gxs($$0, this));
      this.a(new gxr(this));
   }

   public void a(gzy $$0, fho $$1, gny $$2, int $$3) {
      gdi $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ald a(gzy $$0) {
      return a;
   }

   public gzy a() {
      return new gzy();
   }

   public void a(cof $$0, gzy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bE);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bF);
      $$1.f.a($$0.d);
   }

   public static gdi a(gdi $$0, ghd... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (ghd $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
