public class gtb extends gsu<cim, gza, gci> {
   private static final alz a = alz.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alz b = alz.b("textures/entity/parrot/parrot_blue.png");
   private static final alz k = alz.b("textures/entity/parrot/parrot_green.png");
   private static final alz l = alz.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alz m = alz.b("textures/entity/parrot/parrot_grey.png");

   public gtb(gro.a $$0) {
      super($$0, new gci($$0.a(gel.bK)), 0.3F);
   }

   public alz a(gza $$0) {
      return a($$0.a);
   }

   public gza b() {
      return new gza();
   }

   public void a(cim $$0, gza $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
      float $$3 = bae.h($$2, $$0.cg, $$0.cd);
      float $$4 = bae.h($$2, $$0.cf, $$0.ce);
      $$1.b = (bae.a($$3) + 1.0F) * $$4;
      $$1.c = gci.a($$0);
   }

   public static alz a(cim.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
