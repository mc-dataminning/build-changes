public class gqc extends gmn<cog, gvt> {
   public static final ale a = ale.b("textures/entity/projectiles/arrow.png");
   public static final ale b = ale.b("textures/entity/projectiles/tipped_arrow.png");

   public gqc(gno.a $$0) {
      super($$0);
   }

   protected ale a(gvt $$0) {
      return $$0.d ? b : a;
   }

   public gvt a() {
      return new gvt();
   }

   public void a(cog $$0, gvt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.E() > 0;
   }
}
