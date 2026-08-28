public class grh extends gqv<clh, gxw> {
   private static final akv a = akv.b("textures/entity/skeleton/bogged.png");
   private static final akv b = akv.b("textures/entity/skeleton/bogged_overlay.png");

   public grh(gsd.a $$0) {
      super($$0, gfb.G, gfb.H, new gbi($$0.a(gfb.F)));
      this.a(new gwv<>(this, $$0.f(), gfb.I, b));
   }

   public akv a(gxw $$0) {
      return a;
   }

   public gxw a() {
      return new gxw();
   }

   public void a(clh $$0, gxw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}
