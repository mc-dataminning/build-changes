public class gww extends gwp<cjw, hdl, ggm> {
   private static final alr a = alr.b("textures/entity/bee/bee_angry.png");
   private static final alr j = alr.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alr k = alr.b("textures/entity/bee/bee.png");
   private static final alr l = alr.b("textures/entity/bee/bee_nectar.png");

   public gww(gxv.a $$0) {
      super($$0, new ggm($$0.a(gkq.x)), new ggm($$0.a(gkq.y)), 0.4F);
   }

   public alr a(hdl $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hdl a() {
      return new hdl();
   }

   public void a(cjw $$0, hdl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gH();
      $$1.c = $$0.aH() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gG();
   }
}
