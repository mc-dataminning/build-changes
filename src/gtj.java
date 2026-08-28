public class gtj extends gsx<cmt, gzx> {
   private static final ald a = ald.b("textures/entity/skeleton/bogged.png");
   private static final ald j = ald.b("textures/entity/skeleton/bogged_overlay.png");

   public gtj(guf.a $$0) {
      super($$0, ghc.G, ghc.H, new gdg($$0.a(ghc.F)));
      this.a(new gyw<>(this, $$0.f(), ghc.I, j));
   }

   public ald a(gzx $$0) {
      return a;
   }

   public gzx a() {
      return new gzx();
   }

   public void a(cmt $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gr();
   }
}
