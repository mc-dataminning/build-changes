public class gqp extends gqd<cly, gxd> {
   private static final alp a = alp.b("textures/entity/skeleton/bogged.png");
   private static final alp b = alp.b("textures/entity/skeleton/bogged_overlay.png");

   public gqp(grl.a $$0) {
      super($$0, gei.G, gei.H, new gap($$0.a(gei.F)));
      this.a(new gwd<>(this, $$0.f(), gei.I, b));
   }

   public alp a(gxd $$0) {
      return a;
   }

   public gxd a() {
      return new gxd();
   }

   public void a(cly $$0, gxd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gr();
   }
}
