public class gid extends ggl<hes> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final glg[] m;

   public gid(glg $$0) {
      super($$0);
      glg $$1 = this.d.b("left_saddle_line");
      glg $$2 = this.d.b("right_saddle_line");
      this.m = new glg[]{$$1, $$2};
   }

   public static glm a(boolean $$0) {
      return b($$0).a($$0 ? b : glp.a);
   }

   public static glm b(boolean $$0) {
      glo $$1 = $$0 ? c(glk.a) : a(glk.a);
      glq $$2 = $$1.a();
      glq $$3 = $$2.b("body");
      glq $$4 = $$2.b("head_parts");
      $$3.a("saddle", gll.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new glk(0.5F)), gli.a);
      $$4.a("left_saddle_mouth", gll.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gli.a);
      $$4.a("right_saddle_mouth", gll.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gli.a);
      $$4.a("left_saddle_line", gll.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gli.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gll.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gli.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gll.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new glk(0.22F)), gli.a);
      $$4.a("mouth_saddle_wrap", gll.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new glk(0.2F)), gli.a);
      return glm.a($$1, 64, 64);
   }

   @Override
   public void a(hes $$0) {
      super.a($$0);

      for (glg $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
