public class gqr extends gqk<chy, gxf, gap> {
   private static final alz a = alz.b("textures/entity/bee/bee_angry.png");
   private static final alz b = alz.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alz k = alz.b("textures/entity/bee/bee.png");
   private static final alz l = alz.b("textures/entity/bee/bee_nectar.png");

   public gqr(grq.a $$0) {
      super($$0, new gap($$0.a(gen.u)), new gap($$0.a(gen.v)), 0.4F);
   }

   public alz a(gxf $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gxf a() {
      return new gxf();
   }

   public void a(chy $$0, gxf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gB();
      $$1.c = $$0.aJ() && $$0.dz().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gA();
   }
}
