public class gri extends gqw<cli, gxx> {
   private static final akv a = akv.b("textures/entity/skeleton/bogged.png");
   private static final akv b = akv.b("textures/entity/skeleton/bogged_overlay.png");

   public gri(gse.a $$0) {
      super($$0, gfc.G, gfc.H, new gbj($$0.a(gfc.F)));
      this.a(new gww<>(this, $$0.f(), gfc.I, b));
   }

   public akv a(gxx $$0) {
      return a;
   }

   public gxx a() {
      return new gxx();
   }

   public void a(cli $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}
