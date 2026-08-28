public class gpm extends gpf<chc, gvj, fyx> {
   private static final alh a = alh.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alh b = alh.b("textures/entity/parrot/parrot_blue.png");
   private static final alh k = alh.b("textures/entity/parrot/parrot_green.png");
   private static final alh l = alh.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alh m = alh.b("textures/entity/parrot/parrot_grey.png");

   public gpm(gnz.a $$0) {
      super($$0, new fyx($$0.a(gba.br)), 0.3F);
   }

   public alh a(gvj $$0) {
      return a($$0.a);
   }

   public gvj c() {
      return new gvj();
   }

   public void a(chc $$0, gvj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gJ();
      float $$3 = azj.h($$2, $$0.cf, $$0.cc);
      float $$4 = azj.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azj.a($$3) + 1.0F) * $$4;
      $$1.c = fyx.a($$0);
   }

   public static alh a(chc.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
