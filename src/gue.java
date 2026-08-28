public class gue extends gqn<cqf, gzx> {
   public static final alz a = alz.b("textures/entity/projectiles/arrow.png");
   public static final alz b = alz.b("textures/entity/projectiles/tipped_arrow.png");

   public gue(grp.a $$0) {
      super($$0);
   }

   protected alz a(gzx $$0) {
      return $$0.d ? b : a;
   }

   public gzx a() {
      return new gzx();
   }

   public void a(cqf $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.C() > 0;
   }
}
