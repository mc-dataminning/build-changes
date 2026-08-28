public class grk extends gtl<cmv, gxz, gbm> {
   private static final akv a = akv.b("textures/entity/breeze/breeze.png");

   public grk(gsf.a $$0) {
      super($$0, new gbm($$0.a(gfd.K)), 0.5F);
      this.a(new gvs($$0, this));
      this.a(new gvr(this));
   }

   public void a(gxz $$0, ffv $$1, glz $$2, int $$3) {
      gbm $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public akv a(gxz $$0) {
      return a;
   }

   public gxz a() {
      return new gxz();
   }

   public void a(cmv $$0, gxz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bY);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bZ);
      $$1.f.a($$0.d);
   }

   public static gbm a(gbm $$0, gfe... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gfe $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
