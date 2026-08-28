public class gjf extends glj<cfd, fui<cfd>> {
   private static final akq a = akq.b("textures/entity/bee/bee_angry.png");
   private static final akq i = akq.b("textures/entity/bee/bee_angry_nectar.png");
   private static final akq j = akq.b("textures/entity/bee/bee.png");
   private static final akq k = akq.b("textures/entity/bee/bee_nectar.png");

   public gjf(gkd.a $$0) {
      super($$0, new fui<>($$0.a(fyd.k)), 0.4F);
   }

   public akq a(cfd $$0) {
      if ($$0.Z_()) {
         return $$0.gw() ? i : a;
      } else {
         return $$0.gw() ? k : j;
      }
   }
}
