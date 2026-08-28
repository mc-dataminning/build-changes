public class gmx extends gji<cnf> {
   public static final akr a = akr.b("textures/entity/projectiles/arrow.png");
   public static final akr g = akr.b("textures/entity/projectiles/tipped_arrow.png");

   public gmx(gkj.a $$0) {
      super($$0);
   }

   public akr a(cnf $$0) {
      return $$0.F() > 0 ? g : a;
   }
}
