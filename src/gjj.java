public class gjj extends gln<cff, fum<cff>> {
   private static final akr a = akr.b("textures/entity/bee/bee_angry.png");
   private static final akr i = akr.b("textures/entity/bee/bee_angry_nectar.png");
   private static final akr j = akr.b("textures/entity/bee/bee.png");
   private static final akr k = akr.b("textures/entity/bee/bee_nectar.png");

   public gjj(gkh.a $$0) {
      super($$0, new fum<>($$0.a(fyh.k)), 0.4F);
   }

   public akr a(cff $$0) {
      if ($$0.ad_()) {
         return $$0.gv() ? i : a;
      } else {
         return $$0.gv() ? k : j;
      }
   }
}
