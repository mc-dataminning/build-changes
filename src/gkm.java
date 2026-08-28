public class gkm extends gkf<cfx, fvc> {
   private static final alf a = new alf("textures/entity/parrot/parrot_red_blue.png");
   private static final alf i = new alf("textures/entity/parrot/parrot_blue.png");
   private static final alf j = new alf("textures/entity/parrot/parrot_green.png");
   private static final alf k = new alf("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alf l = new alf("textures/entity/parrot/parrot_grey.png");

   public gkm(giz.a $$0) {
      super($$0, new fvc($$0.a(fxb.aG)), 0.3F);
   }

   public alf a(cfx $$0) {
      return a($$0.gy());
   }

   public static alf a(cfx.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfx $$0, float $$1) {
      float $$2 = ayz.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayz.i($$1, $$0.cd, $$0.cc);
      return (ayz.a($$2) + 1.0F) * $$3;
   }
}
