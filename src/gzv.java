public class gzv extends gzo<cke, hfx, giz> {
   private static final ali a = ali.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ali j = ali.b("textures/entity/parrot/parrot_blue.png");
   private static final ali k = ali.b("textures/entity/parrot/parrot_green.png");
   private static final ali l = ali.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ali m = ali.b("textures/entity/parrot/parrot_grey.png");

   public gzv(gyi.a $$0) {
      super($$0, new giz($$0.a(gld.cb)), 0.3F);
   }

   public ali a(hfx $$0) {
      return a($$0.a);
   }

   public hfx b() {
      return new hfx();
   }

   public void a(cke $$0, hfx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      float $$3 = azo.h($$2, $$0.bP, $$0.bM);
      float $$4 = azo.h($$2, $$0.bO, $$0.bN);
      $$1.b = (azo.a($$3) + 1.0F) * $$4;
      $$1.c = giz.a($$0);
   }

   public static ali a(cke.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
