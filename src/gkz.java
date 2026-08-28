public class gkz extends gks<cfh, fvo> {
   private static final akk a = new akk("textures/entity/parrot/parrot_red_blue.png");
   private static final akk i = new akk("textures/entity/parrot/parrot_blue.png");
   private static final akk j = new akk("textures/entity/parrot/parrot_green.png");
   private static final akk k = new akk("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akk l = new akk("textures/entity/parrot/parrot_grey.png");

   public gkz(gjm.a $$0) {
      super($$0, new fvo($$0.a(fxn.aG)), 0.3F);
   }

   public akk a(cfh $$0) {
      return a($$0.gw());
   }

   public static akk a(cfh.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfh $$0, float $$1) {
      float $$2 = ayg.i($$1, $$0.cg, $$0.cd);
      float $$3 = ayg.i($$1, $$0.cf, $$0.ce);
      return (ayg.a($$2) + 1.0F) * $$3;
   }
}
