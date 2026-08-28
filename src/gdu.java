public class gdu extends gcl<hag> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final ghm g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final ghd i = this.c.b("left_chest");
   private final ghd j = this.c.b("right_chest");

   public gdu(ghd $$0) {
      super($$0);
   }

   public static ghj a(float $$0) {
      return ghj.a(gcl.a(ghh.a), 64, 64).a(g).a(ghm.scaling($$0));
   }

   public static ghj b(float $$0) {
      return ghj.a(gcl.c(ghh.a), 64, 64).a(g).a(b).a(ghm.scaling($$0));
   }

   public static ghj a(float $$0, boolean $$1) {
      return geb.b($$1).a(g).a($$1 ? gcl.b : ghm.a).a(ghm.scaling($$0));
   }

   private static void a(ghn $$0) {
      ghn $$1 = $$0.b("body");
      ghi $$2 = ghi.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, ghf.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, ghf.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      ghn $$3 = $$0.b("head_parts").b("head");
      ghi $$4 = ghi.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, ghf.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, ghf.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hag $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
