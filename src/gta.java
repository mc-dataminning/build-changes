public class gta extends gvl<cjp, gzn, gcp> {
   private static final ald a = ald.b("textures/entity/allay/allay.png");

   public gta(guf.a $$0) {
      super($$0, new gcp($$0.a(ghc.c)), 0.4F);
      this.a(new gyl<>(this));
   }

   public ald a(gzn $$0) {
      return a;
   }

   public gzn a() {
      return new gzn();
   }

   public void a(cjp $$0, gzn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzp.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.L($$2);
      $$1.d = $$0.K($$2);
   }

   protected int a(cjp $$0, jj $$1) {
      return 15;
   }
}
