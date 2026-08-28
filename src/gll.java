public class gll extends ghw<cnf> {
   public static final alf a = new alf("textures/entity/projectiles/arrow.png");
   public static final alf f = new alf("textures/entity/projectiles/tipped_arrow.png");

   public gll(gix.a $$0) {
      super($$0);
   }

   public alf a(cnf $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
