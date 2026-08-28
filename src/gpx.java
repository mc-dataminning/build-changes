public class gpx extends gpq<chh, gvu, fzi> {
   private static final ali a = ali.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ali b = ali.b("textures/entity/parrot/parrot_blue.png");
   private static final ali k = ali.b("textures/entity/parrot/parrot_green.png");
   private static final ali l = ali.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ali m = ali.b("textures/entity/parrot/parrot_grey.png");

   public gpx(gok.a $$0) {
      super($$0, new fzi($$0.a(gbl.br)), 0.3F);
   }

   public ali a(gvu $$0) {
      return a($$0.a);
   }

   public gvu c() {
      return new gvu();
   }

   public void a(chh $$0, gvu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      float $$3 = azk.h($$2, $$0.cf, $$0.cc);
      float $$4 = azk.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azk.a($$3) + 1.0F) * $$4;
      $$1.c = fzi.a($$0);
   }

   public static ali a(chh.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
