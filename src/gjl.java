public class gjl extends glp<cff, fuo<cff>> {
   private static final akr a = akr.b("textures/entity/bee/bee_angry.png");
   private static final akr i = akr.b("textures/entity/bee/bee_angry_nectar.png");
   private static final akr j = akr.b("textures/entity/bee/bee.png");
   private static final akr k = akr.b("textures/entity/bee/bee_nectar.png");

   public gjl(gkj.a $$0) {
      super($$0, new fuo<>($$0.a(fyj.k)), 0.4F);
   }

   public akr a(cff $$0) {
      if ($$0.ad_()) {
         return $$0.gu() ? i : a;
      } else {
         return $$0.gu() ? k : j;
      }
   }
}
