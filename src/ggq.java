public class ggq extends gey<hdg> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gjt[] m;

   public ggq(gjt $$0) {
      super($$0);
      gjt $$1 = this.d.b("left_saddle_line");
      gjt $$2 = this.d.b("right_saddle_line");
      this.m = new gjt[]{$$1, $$2};
   }

   public static gjz a(boolean $$0) {
      return b($$0).a($$0 ? b : gkc.a);
   }

   public static gjz b(boolean $$0) {
      gkb $$1 = $$0 ? c(gjx.a) : a(gjx.a);
      gkd $$2 = $$1.a();
      gkd $$3 = $$2.b("body");
      gkd $$4 = $$2.b("head_parts");
      $$3.a("saddle", gjy.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gjx(0.5F)), gjv.a);
      $$4.a("left_saddle_mouth", gjy.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gjv.a);
      $$4.a("right_saddle_mouth", gjy.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gjv.a);
      $$4.a("left_saddle_line", gjy.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gjv.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gjy.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gjv.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gjy.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gjx(0.22F)), gjv.a);
      $$4.a("mouth_saddle_wrap", gjy.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gjx(0.2F)), gjv.a);
      return gjz.a($$1, 64, 64);
   }

   @Override
   public void a(hdg $$0) {
      super.a($$0);

      for (gjt $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
