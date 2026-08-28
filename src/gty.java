public class gty extends gqh<cqb, gzr> {
   public static final alz a = alz.b("textures/entity/projectiles/arrow.png");
   public static final alz b = alz.b("textures/entity/projectiles/tipped_arrow.png");

   public gty(grj.a $$0) {
      super($$0);
   }

   protected alz a(gzr $$0) {
      return $$0.d ? b : a;
   }

   public gzr a() {
      return new gzr();
   }

   public void a(cqb $$0, gzr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.C() > 0;
   }
}
