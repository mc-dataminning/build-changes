public class gvs extends gvl<ciw, hbs, gez> {
   private static final ald a = ald.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ald j = ald.b("textures/entity/parrot/parrot_blue.png");
   private static final ald k = ald.b("textures/entity/parrot/parrot_green.png");
   private static final ald l = ald.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ald m = ald.b("textures/entity/parrot/parrot_grey.png");

   public gvs(guf.a $$0) {
      super($$0, new gez($$0.a(ghc.bX)), 0.3F);
   }

   public ald a(hbs $$0) {
      return a($$0.a);
   }

   public hbs b() {
      return new hbs();
   }

   public void a(ciw $$0, hbs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
      float $$3 = azk.h($$2, $$0.bL, $$0.bI);
      float $$4 = azk.h($$2, $$0.bK, $$0.bJ);
      $$1.b = (azk.a($$3) + 1.0F) * $$4;
      $$1.c = gez.a($$0);
   }

   public static ald a(ciw.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
