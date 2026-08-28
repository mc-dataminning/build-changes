public class gfz extends geh<hco> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gjc[] m;

   public gfz(gjc $$0) {
      super($$0);
      gjc $$1 = this.d.b("left_saddle_line");
      gjc $$2 = this.d.b("right_saddle_line");
      this.m = new gjc[]{$$1, $$2};
   }

   public static gji a(boolean $$0) {
      return b($$0).a($$0 ? b : gjl.a);
   }

   public static gji b(boolean $$0) {
      gjk $$1 = $$0 ? c(gjg.a) : a(gjg.a);
      gjm $$2 = $$1.a();
      gjm $$3 = $$2.b("body");
      gjm $$4 = $$2.b("head_parts");
      $$3.a("saddle", gjh.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gjg(0.5F)), gje.a);
      $$4.a("left_saddle_mouth", gjh.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gje.a);
      $$4.a("right_saddle_mouth", gjh.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gje.a);
      $$4.a("left_saddle_line", gjh.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gje.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gjh.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gje.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gjh.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gjg(0.22F)), gje.a);
      $$4.a("mouth_saddle_wrap", gjh.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gjg(0.2F)), gje.a);
      return gji.a($$1, 64, 64);
   }

   @Override
   public void a(hco $$0) {
      super.a($$0);

      for (gjc $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
