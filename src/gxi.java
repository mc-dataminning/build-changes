public class gxi extends gye<coh, hdq, ggv> {
   private static final alg a = alg.b("textures/entity/ghast/ghast.png");
   private static final alg j = alg.b("textures/entity/ghast/ghast_shooting.png");

   public gxi(gwy.a $$0) {
      super($$0, new ggv($$0.a(gjs.bb)), 1.5F);
   }

   public alg a(hdq $$0) {
      return $$0.a ? j : a;
   }

   public hdq b() {
      return new hdq();
   }

   public void a(coh $$0, hdq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
