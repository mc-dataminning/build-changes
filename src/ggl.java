public class ggl extends get<hda> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gjo[] m;

   public ggl(gjo $$0) {
      super($$0);
      gjo $$1 = this.d.b("left_saddle_line");
      gjo $$2 = this.d.b("right_saddle_line");
      this.m = new gjo[]{$$1, $$2};
   }

   public static gju a(boolean $$0) {
      return b($$0).a($$0 ? b : gjx.a);
   }

   public static gju b(boolean $$0) {
      gjw $$1 = $$0 ? c(gjs.a) : a(gjs.a);
      gjy $$2 = $$1.a();
      gjy $$3 = $$2.b("body");
      gjy $$4 = $$2.b("head_parts");
      $$3.a("saddle", gjt.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gjs(0.5F)), gjq.a);
      $$4.a("left_saddle_mouth", gjt.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gjq.a);
      $$4.a("right_saddle_mouth", gjt.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gjq.a);
      $$4.a("left_saddle_line", gjt.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gjq.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gjt.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gjq.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gjt.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gjs(0.22F)), gjq.a);
      $$4.a("mouth_saddle_wrap", gjt.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gjs(0.2F)), gjq.a);
      return gju.a($$1, 64, 64);
   }

   @Override
   public void a(hda $$0) {
      super.a($$0);

      for (gjo $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
