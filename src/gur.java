public class gur extends gra<cpg, han> {
   public static final aku a = aku.b("textures/entity/projectiles/arrow.png");
   public static final aku b = aku.b("textures/entity/projectiles/tipped_arrow.png");

   public gur(gsc.a $$0) {
      super($$0);
   }

   protected aku a(han $$0) {
      return $$0.d ? b : a;
   }

   public han a() {
      return new han();
   }

   public void a(cpg $$0, han $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
