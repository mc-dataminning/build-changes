public class gie extends geq<cki> {
   public static final ajv a = new ajv("textures/entity/projectiles/arrow.png");
   public static final ajv f = new ajv("textures/entity/projectiles/tipped_arrow.png");

   public gie(gfr.a $$0) {
      super($$0);
   }

   public ajv a(cki $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
