public class gro extends gnz<cpa, gxg> {
   public static final all a = all.b("textures/entity/projectiles/arrow.png");
   public static final all b = all.b("textures/entity/projectiles/tipped_arrow.png");

   public gro(gpa.a $$0) {
      super($$0);
   }

   protected all a(gxg $$0) {
      return $$0.d ? b : a;
   }

   public gxg a() {
      return new gxg();
   }

   public void a(cpa $$0, gxg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
