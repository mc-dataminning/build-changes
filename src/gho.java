public class gho extends gfw<hed> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gkr[] m;

   public gho(gkr $$0) {
      super($$0);
      gkr $$1 = this.d.b("left_saddle_line");
      gkr $$2 = this.d.b("right_saddle_line");
      this.m = new gkr[]{$$1, $$2};
   }

   public static gkx a(boolean $$0) {
      return b($$0).a($$0 ? b : gla.a);
   }

   public static gkx b(boolean $$0) {
      gkz $$1 = $$0 ? c(gkv.a) : a(gkv.a);
      glb $$2 = $$1.a();
      glb $$3 = $$2.b("body");
      glb $$4 = $$2.b("head_parts");
      $$3.a("saddle", gkw.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gkv(0.5F)), gkt.a);
      $$4.a("left_saddle_mouth", gkw.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gkt.a);
      $$4.a("right_saddle_mouth", gkw.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gkt.a);
      $$4.a("left_saddle_line", gkw.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gkt.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gkw.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gkt.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gkw.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gkv(0.22F)), gkt.a);
      $$4.a("mouth_saddle_wrap", gkw.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gkv(0.2F)), gkt.a);
      return gkx.a($$1, 64, 64);
   }

   @Override
   public void a(hed $$0) {
      super.a($$0);

      for (gkr $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
