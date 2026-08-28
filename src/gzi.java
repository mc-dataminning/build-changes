public class gzi extends gzb<ckp, hfm, gim> {
   private static final alr a = alr.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alr j = alr.b("textures/entity/parrot/parrot_blue.png");
   private static final alr k = alr.b("textures/entity/parrot/parrot_green.png");
   private static final alr l = alr.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alr m = alr.b("textures/entity/parrot/parrot_grey.png");

   public gzi(gxv.a $$0) {
      super($$0, new gim($$0.a(gkq.cb)), 0.3F);
   }

   public alr a(hfm $$0) {
      return a($$0.a);
   }

   public hfm b() {
      return new hfm();
   }

   public void a(ckp $$0, hfm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      float $$3 = azz.h($$2, $$0.bP, $$0.bM);
      float $$4 = azz.h($$2, $$0.bO, $$0.bN);
      $$1.b = (azz.a($$3) + 1.0F) * $$4;
      $$1.c = gim.a($$0);
   }

   public static alr a(ckp.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
