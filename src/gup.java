public class gup extends gvl<cnd, hav, geg> {
   private static final ald a = ald.b("textures/entity/ghast/ghast.png");
   private static final ald j = ald.b("textures/entity/ghast/ghast_shooting.png");

   public gup(guf.a $$0) {
      super($$0, new geg($$0.a(ghc.aX)), 1.5F);
   }

   public ald a(hav $$0) {
      return $$0.a ? j : a;
   }

   public hav b() {
      return new hav();
   }

   public void a(cnd $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
