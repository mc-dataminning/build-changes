public class guq extends guj<cif, har, gdy> {
   private static final aku a = aku.b("textures/entity/parrot/parrot_red_blue.png");
   private static final aku b = aku.b("textures/entity/parrot/parrot_blue.png");
   private static final aku k = aku.b("textures/entity/parrot/parrot_green.png");
   private static final aku l = aku.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aku m = aku.b("textures/entity/parrot/parrot_grey.png");

   public guq(gtd.a $$0) {
      super($$0, new gdy($$0.a(ggb.bP)), 0.3F);
   }

   public aku a(har $$0) {
      return a($$0.a);
   }

   public har b() {
      return new har();
   }

   public void a(cif $$0, har $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      float $$3 = ayz.h($$2, $$0.bM, $$0.bJ);
      float $$4 = ayz.h($$2, $$0.bL, $$0.bK);
      $$1.b = (ayz.a($$3) + 1.0F) * $$4;
      $$1.c = gdy.a($$0);
   }

   public static aku a(cif.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
