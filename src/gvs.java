public class gvs extends gsb<cqa, hbo> {
   public static final aku a = aku.b("textures/entity/projectiles/arrow.png");
   public static final aku b = aku.b("textures/entity/projectiles/tipped_arrow.png");

   public gvs(gtd.a $$0) {
      super($$0);
   }

   protected aku a(hbo $$0) {
      return $$0.d ? b : a;
   }

   public hbo a() {
      return new hbo();
   }

   public void a(cqa $$0, hbo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
