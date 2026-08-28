public class gtc extends gsv<cim, gzb, gcj> {
   private static final alz a = alz.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alz b = alz.b("textures/entity/parrot/parrot_blue.png");
   private static final alz k = alz.b("textures/entity/parrot/parrot_green.png");
   private static final alz l = alz.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alz m = alz.b("textures/entity/parrot/parrot_grey.png");

   public gtc(grp.a $$0) {
      super($$0, new gcj($$0.a(gem.bK)), 0.3F);
   }

   public alz a(gzb $$0) {
      return a($$0.a);
   }

   public gzb b() {
      return new gzb();
   }

   public void a(cim $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      float $$3 = bae.h($$2, $$0.cg, $$0.cd);
      float $$4 = bae.h($$2, $$0.cf, $$0.ce);
      $$1.b = (bae.a($$3) + 1.0F) * $$4;
      $$1.c = gcj.a($$0);
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
