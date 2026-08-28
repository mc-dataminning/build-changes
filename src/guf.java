public class guf extends gqo<cqg, gzy> {
   public static final alz a = alz.b("textures/entity/projectiles/arrow.png");
   public static final alz b = alz.b("textures/entity/projectiles/tipped_arrow.png");

   public guf(grq.a $$0) {
      super($$0);
   }

   protected alz a(gzy $$0) {
      return $$0.d ? b : a;
   }

   public gzy a() {
      return new gzy();
   }

   public void a(cqg $$0, gzy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
