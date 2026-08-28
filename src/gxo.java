public class gxo extends gxc<cok, hed> {
   private static final alk a = alk.b("textures/entity/skeleton/bogged.png");
   private static final alk j = alk.b("textures/entity/skeleton/bogged_overlay.png");

   public gxo(gyk.a $$0) {
      super($$0, glf.G, glf.H, new ghg($$0.a(glf.F)));
      this.a(new hdc<>(this, $$0.f(), glf.I, j));
   }

   public alk a(hed $$0) {
      return a;
   }

   public hed a() {
      return new hed();
   }

   public void a(cok $$0, hed $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}
