public class gfe extends gdo<hbq> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gig[] m;

   public gfe(gig $$0) {
      super($$0);
      gig $$1 = this.d.b("left_saddle_line");
      gig $$2 = this.d.b("right_saddle_line");
      this.m = new gig[]{$$1, $$2};
   }

   public static gim a(boolean $$0) {
      return b($$0).a($$0 ? b : gip.a);
   }

   public static gim b(boolean $$0) {
      gio $$1 = $$0 ? c(gik.a) : a(gik.a);
      giq $$2 = $$1.a();
      giq $$3 = $$2.b("body");
      giq $$4 = $$2.b("head_parts");
      $$3.a("saddle", gil.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gik(0.5F)), gii.a);
      $$4.a("left_saddle_mouth", gil.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gii.a);
      $$4.a("right_saddle_mouth", gil.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gii.a);
      $$4.a("left_saddle_line", gil.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gii.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gil.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gii.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gil.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gik(0.22F)), gii.a);
      $$4.a("mouth_saddle_wrap", gil.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gik(0.2F)), gii.a);
      return gim.a($$1, 64, 64);
   }

   @Override
   public void a(hbq $$0) {
      super.a($$0);

      for (gig $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
