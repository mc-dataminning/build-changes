public class gwc extends gvq<cnx, hcr> {
   private static final alg a = alg.b("textures/entity/skeleton/bogged.png");
   private static final alg j = alg.b("textures/entity/skeleton/bogged_overlay.png");

   public gwc(gwy.a $$0) {
      super($$0, gjs.G, gjs.H, new gft($$0.a(gjs.F)));
      this.a(new hbq<>(this, $$0.f(), gjs.I, j));
   }

   public alg a(hcr $$0) {
      return a;
   }

   public hcr a() {
      return new hcr();
   }

   public void a(cnx $$0, hcr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
   }
}
