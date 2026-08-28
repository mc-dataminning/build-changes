public class gxl extends gxe<cjn, hea, ghb> {
   private static final alk a = alk.b("textures/entity/bee/bee_angry.png");
   private static final alk j = alk.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alk k = alk.b("textures/entity/bee/bee.png");
   private static final alk l = alk.b("textures/entity/bee/bee_nectar.png");

   public gxl(gyk.a $$0) {
      super($$0, new ghb($$0.a(glf.x)), new ghb($$0.a(glf.y)), 0.4F);
   }

   public alk a(hea $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hea a() {
      return new hea();
   }

   public void a(cjn $$0, hea $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gH();
      $$1.c = $$0.aH() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ae_();
      $$1.e = $$0.gG();
   }
}
