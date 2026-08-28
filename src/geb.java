public class geb extends gcl<hal> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final ghd[] m;

   public geb(ghd $$0) {
      super($$0);
      ghd $$1 = this.d.b("left_saddle_line");
      ghd $$2 = this.d.b("right_saddle_line");
      this.m = new ghd[]{$$1, $$2};
   }

   public static ghj a(boolean $$0) {
      return b($$0).a($$0 ? b : ghm.a);
   }

   public static ghj b(boolean $$0) {
      ghl $$1 = $$0 ? c(ghh.a) : a(ghh.a);
      ghn $$2 = $$1.a();
      ghn $$3 = $$2.b("body");
      ghn $$4 = $$2.b("head_parts");
      $$3.a("saddle", ghi.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new ghh(0.5F)), ghf.a);
      $$4.a("left_saddle_mouth", ghi.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), ghf.a);
      $$4.a("right_saddle_mouth", ghi.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), ghf.a);
      $$4.a("left_saddle_line", ghi.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), ghf.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", ghi.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), ghf.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", ghi.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new ghh(0.22F)), ghf.a);
      $$4.a("mouth_saddle_wrap", ghi.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new ghh(0.2F)), ghf.a);
      return ghj.a($$1, 64, 64);
   }

   @Override
   public void a(hal $$0) {
      super.a($$0);

      for (ghd $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
