public class glq extends glj<cfs, fwe> {
   private static final akq a = akq.b("textures/entity/parrot/parrot_red_blue.png");
   private static final akq i = akq.b("textures/entity/parrot/parrot_blue.png");
   private static final akq j = akq.b("textures/entity/parrot/parrot_green.png");
   private static final akq k = akq.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akq l = akq.b("textures/entity/parrot/parrot_grey.png");

   public glq(gkd.a $$0) {
      super($$0, new fwe($$0.a(fyd.aH)), 0.3F);
   }

   public akq a(cfs $$0) {
      return a($$0.gy());
   }

   public static akq a(cfs.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfs $$0, float $$1) {
      float $$2 = ayn.i($$1, $$0.ch, $$0.ce);
      float $$3 = ayn.i($$1, $$0.cg, $$0.cf);
      return (ayn.a($$2) + 1.0F) * $$3;
   }
}
