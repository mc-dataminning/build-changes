public class ghd extends ggx<ccy, frv> {
   private static final ajv a = new ajv("textures/entity/parrot/parrot_red_blue.png");
   private static final ajv i = new ajv("textures/entity/parrot/parrot_blue.png");
   private static final ajv j = new ajv("textures/entity/parrot/parrot_green.png");
   private static final ajv k = new ajv("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ajv l = new ajv("textures/entity/parrot/parrot_grey.png");

   public ghd(gfr.a $$0) {
      super($$0, new frv($$0.a(ftu.aG)), 0.3F);
   }

   public ajv a(ccy $$0) {
      return a($$0.gv());
   }

   public static ajv a(ccy.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(ccy $$0, float $$1) {
      float $$2 = axm.i($$1, $$0.cd, $$0.ca);
      float $$3 = axm.i($$1, $$0.cc, $$0.cb);
      return (axm.a($$2) + 1.0F) * $$3;
   }
}
