public class gzx extends gzq<ckg, hfz, gjb> {
   private static final alk a = alk.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alk j = alk.b("textures/entity/parrot/parrot_blue.png");
   private static final alk k = alk.b("textures/entity/parrot/parrot_green.png");
   private static final alk l = alk.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alk m = alk.b("textures/entity/parrot/parrot_grey.png");

   public gzx(gyk.a $$0) {
      super($$0, new gjb($$0.a(glf.cb)), 0.3F);
   }

   public alk a(hfz $$0) {
      return a($$0.a);
   }

   public hfz b() {
      return new hfz();
   }

   public void a(ckg $$0, hfz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      float $$3 = azq.h($$2, $$0.bP, $$0.bM);
      float $$4 = azq.h($$2, $$0.bO, $$0.bN);
      $$1.b = (azq.a($$3) + 1.0F) * $$4;
      $$1.c = gjb.a($$0);
   }

   public static alk a(ckg.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
