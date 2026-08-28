public class grg extends gqu<clh, gxv> {
   private static final aku a = aku.b("textures/entity/skeleton/bogged.png");
   private static final aku b = aku.b("textures/entity/skeleton/bogged_overlay.png");

   public grg(gsc.a $$0) {
      super($$0, gfb.G, gfb.H, new gbi($$0.a(gfb.F)));
      this.a(new gwu<>(this, $$0.f(), gfb.I, b));
   }

   public aku a(gxv $$0) {
      return a;
   }

   public gxv a() {
      return new gxv();
   }

   public void a(clh $$0, gxv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
   }
}
