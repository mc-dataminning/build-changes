public class gmr extends gjc<cnd> {
   public static final akq a = akq.b("textures/entity/projectiles/arrow.png");
   public static final akq f = akq.b("textures/entity/projectiles/tipped_arrow.png");

   public gmr(gkd.a $$0) {
      super($$0);
   }

   public akq a(cnd $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
