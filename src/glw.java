public class glw extends glp<cfu, fwk> {
   private static final akr a = akr.b("textures/entity/parrot/parrot_red_blue.png");
   private static final akr i = akr.b("textures/entity/parrot/parrot_blue.png");
   private static final akr j = akr.b("textures/entity/parrot/parrot_green.png");
   private static final akr k = akr.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akr l = akr.b("textures/entity/parrot/parrot_grey.png");

   public glw(gkj.a $$0) {
      super($$0, new fwk($$0.a(fyj.aH)), 0.3F);
   }

   public akr a(cfu $$0) {
      return a($$0.gw());
   }

   public static akr a(cfu.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfu $$0, float $$1) {
      float $$2 = ayo.i($$1, $$0.cj, $$0.cg);
      float $$3 = ayo.i($$1, $$0.ci, $$0.ch);
      return (ayo.a($$2) + 1.0F) * $$3;
   }
}
