public class gkl extends gke<cfw, fvb> {
   private static final alf a = new alf("textures/entity/parrot/parrot_red_blue.png");
   private static final alf i = new alf("textures/entity/parrot/parrot_blue.png");
   private static final alf j = new alf("textures/entity/parrot/parrot_green.png");
   private static final alf k = new alf("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alf l = new alf("textures/entity/parrot/parrot_grey.png");

   public gkl(giy.a $$0) {
      super($$0, new fvb($$0.a(fxa.aG)), 0.3F);
   }

   public alf a(cfw $$0) {
      return a($$0.gy());
   }

   public static alf a(cfw.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfw $$0, float $$1) {
      float $$2 = ayz.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayz.i($$1, $$0.cd, $$0.cc);
      return (ayz.a($$2) + 1.0F) * $$3;
   }
}
