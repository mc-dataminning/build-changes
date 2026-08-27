public class ggu extends ggo<cct, frm> {
   private static final ajt a = new ajt("textures/entity/parrot/parrot_red_blue.png");
   private static final ajt i = new ajt("textures/entity/parrot/parrot_blue.png");
   private static final ajt j = new ajt("textures/entity/parrot/parrot_green.png");
   private static final ajt k = new ajt("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ajt l = new ajt("textures/entity/parrot/parrot_grey.png");

   public ggu(gfi.a $$0) {
      super($$0, new frm($$0.a(ftl.aG)), 0.3F);
   }

   public ajt a(cct $$0) {
      return a($$0.gv());
   }

   public static ajt a(cct.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cct $$0, float $$1) {
      float $$2 = axk.i($$1, $$0.cd, $$0.ca);
      float $$3 = axk.i($$1, $$0.cc, $$0.cb);
      return (axk.a($$2) + 1.0F) * $$3;
   }
}
