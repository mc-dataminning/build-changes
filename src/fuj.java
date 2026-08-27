public class fuj extends fud<buz, fft> {
   private static final aer a = new aer("textures/entity/parrot/parrot_red_blue.png");
   private static final aer i = new aer("textures/entity/parrot/parrot_blue.png");
   private static final aer j = new aer("textures/entity/parrot/parrot_green.png");
   private static final aer k = new aer("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aer l = new aer("textures/entity/parrot/parrot_grey.png");

   public fuj(fsx.a $$0) {
      super($$0, new fft($$0.a(fhr.aA)), 0.3F);
   }

   public aer a(buz $$0) {
      return a($$0.gi());
   }

   public static aer a(buz.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(buz $$0, float $$1) {
      float $$2 = arp.i($$1, $$0.bZ, $$0.bW);
      float $$3 = arp.i($$1, $$0.bY, $$0.bX);
      return (arp.a($$2) + 1.0F) * $$3;
   }
}
