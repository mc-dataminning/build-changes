public class gsh extends grv<cmc, gyw> {
   private static final aku a = aku.b("textures/entity/skeleton/bogged.png");
   private static final aku b = aku.b("textures/entity/skeleton/bogged_overlay.png");

   public gsh(gtd.a $$0) {
      super($$0, ggb.G, ggb.H, new gch($$0.a(ggb.F)));
      this.a(new gxv<>(this, $$0.f(), ggb.I, b));
   }

   public aku a(gyw $$0) {
      return a;
   }

   public gyw a() {
      return new gyw();
   }

   public void a(cmc $$0, gyw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gt();
   }
}
