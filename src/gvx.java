public class gvx extends gvl<cnu, hcl> {
   private static final alg a = alg.b("textures/entity/skeleton/bogged.png");
   private static final alg j = alg.b("textures/entity/skeleton/bogged_overlay.png");

   public gvx(gwt.a $$0) {
      super($$0, gjn.G, gjn.H, new gfo($$0.a(gjn.F)));
      this.a(new hbk<>(this, $$0.f(), gjn.I, j));
   }

   public alg a(hcl $$0) {
      return a;
   }

   public hcl a() {
      return new hcl();
   }

   public void a(cnu $$0, hcl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
   }
}
