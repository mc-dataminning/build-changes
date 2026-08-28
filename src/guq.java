public class guq extends gqz<cpe, ham> {
   public static final aku a = aku.b("textures/entity/projectiles/arrow.png");
   public static final aku b = aku.b("textures/entity/projectiles/tipped_arrow.png");

   public guq(gsb.a $$0) {
      super($$0);
   }

   protected aku a(ham $$0) {
      return $$0.d ? b : a;
   }

   public ham a() {
      return new ham();
   }

   public void a(cpe $$0, ham $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
