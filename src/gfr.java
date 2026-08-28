public class gfr extends gea<hcg> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final giu[] m;

   public gfr(giu $$0) {
      super($$0);
      giu $$1 = this.d.b("left_saddle_line");
      giu $$2 = this.d.b("right_saddle_line");
      this.m = new giu[]{$$1, $$2};
   }

   public static gja a(boolean $$0) {
      return b($$0).a($$0 ? b : gjd.a);
   }

   public static gja b(boolean $$0) {
      gjc $$1 = $$0 ? c(giy.a) : a(giy.a);
      gje $$2 = $$1.a();
      gje $$3 = $$2.b("body");
      gje $$4 = $$2.b("head_parts");
      $$3.a("saddle", giz.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new giy(0.5F)), giw.a);
      $$4.a("left_saddle_mouth", giz.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), giw.a);
      $$4.a("right_saddle_mouth", giz.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), giw.a);
      $$4.a("left_saddle_line", giz.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), giw.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", giz.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), giw.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", giz.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new giy(0.22F)), giw.a);
      $$4.a("mouth_saddle_wrap", giz.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new giy(0.2F)), giw.a);
      return gja.a($$1, 64, 64);
   }

   @Override
   public void a(hcg $$0) {
      super.a($$0);

      for (giu $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
