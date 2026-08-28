public class gud extends gqm<cqf, gzw> {
   public static final alz a = alz.b("textures/entity/projectiles/arrow.png");
   public static final alz b = alz.b("textures/entity/projectiles/tipped_arrow.png");

   public gud(gro.a $$0) {
      super($$0);
   }

   protected alz a(gzw $$0) {
      return $$0.d ? b : a;
   }

   public gzw a() {
      return new gzw();
   }

   public void a(cqf $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.C() > 0;
   }
}
