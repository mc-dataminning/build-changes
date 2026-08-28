public class gop extends god<cli, gvc> {
   private static final alj a = alj.b("textures/entity/skeleton/bogged.png");
   private static final alj b = alj.b("textures/entity/skeleton/bogged_overlay.png");

   public gop(gpk.a $$0) {
      super($$0, gck.D, gck.E, new fys($$0.a(gck.C)));
      this.a(new gub<>(this, $$0.f(), gck.F, b));
   }

   public alj a(gvc $$0) {
      return a;
   }

   public gvc a() {
      return new gvc();
   }

   public void a(cli $$0, gvc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
   }
}
