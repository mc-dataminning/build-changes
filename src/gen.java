public class gen extends geh<cbu, fpf> {
   private static final ajh a = new ajh("textures/entity/parrot/parrot_red_blue.png");
   private static final ajh i = new ajh("textures/entity/parrot/parrot_blue.png");
   private static final ajh j = new ajh("textures/entity/parrot/parrot_green.png");
   private static final ajh k = new ajh("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ajh l = new ajh("textures/entity/parrot/parrot_grey.png");

   public gen(gdb.a $$0) {
      super($$0, new fpf($$0.a(fre.aG)), 0.3F);
   }

   public ajh a(cbu $$0) {
      return a($$0.gv());
   }

   public static ajh a(cbu.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cbu $$0, float $$1) {
      float $$2 = aww.i($$1, $$0.cd, $$0.ca);
      float $$3 = aww.i($$1, $$0.cc, $$0.cb);
      return (aww.a($$2) + 1.0F) * $$3;
   }
}
