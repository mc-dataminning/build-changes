public class gdk extends gde<cbc, foe> {
   private static final ajc a = new ajc("textures/entity/parrot/parrot_red_blue.png");
   private static final ajc i = new ajc("textures/entity/parrot/parrot_blue.png");
   private static final ajc j = new ajc("textures/entity/parrot/parrot_green.png");
   private static final ajc k = new ajc("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ajc l = new ajc("textures/entity/parrot/parrot_grey.png");

   public gdk(gby.a $$0) {
      super($$0, new foe($$0.a(fqe.aC)), 0.3F);
   }

   public ajc a(cbc $$0) {
      return a($$0.gt());
   }

   public static ajc a(cbc.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cbc $$0, float $$1) {
      float $$2 = awm.i($$1, $$0.cb, $$0.bY);
      float $$3 = awm.i($$1, $$0.ca, $$0.bZ);
      return (awm.a($$2) + 1.0F) * $$3;
   }
}
