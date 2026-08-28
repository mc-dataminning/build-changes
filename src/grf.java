public class grf extends gqt<clg, gxu> {
   private static final aku a = aku.b("textures/entity/skeleton/bogged.png");
   private static final aku b = aku.b("textures/entity/skeleton/bogged_overlay.png");

   public grf(gsb.a $$0) {
      super($$0, gez.G, gez.H, new gbg($$0.a(gez.F)));
      this.a(new gwt<>(this, $$0.f(), gez.I, b));
   }

   public aku a(gxu $$0) {
      return a;
   }

   public gxu a() {
      return new gxu();
   }

   public void a(clg $$0, gxu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
   }
}
