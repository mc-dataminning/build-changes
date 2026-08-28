public class gib extends ggj<heq> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gle[] m;

   public gib(gle $$0) {
      super($$0);
      gle $$1 = this.d.b("left_saddle_line");
      gle $$2 = this.d.b("right_saddle_line");
      this.m = new gle[]{$$1, $$2};
   }

   public static glk a(boolean $$0) {
      return b($$0).a($$0 ? b : gln.a);
   }

   public static glk b(boolean $$0) {
      glm $$1 = $$0 ? c(gli.a) : a(gli.a);
      glo $$2 = $$1.a();
      glo $$3 = $$2.b("body");
      glo $$4 = $$2.b("head_parts");
      $$3.a("saddle", glj.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gli(0.5F)), glg.a);
      $$4.a("left_saddle_mouth", glj.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), glg.a);
      $$4.a("right_saddle_mouth", glj.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), glg.a);
      $$4.a("left_saddle_line", glj.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), glg.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", glj.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), glg.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", glj.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gli(0.22F)), glg.a);
      $$4.a("mouth_saddle_wrap", glj.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gli(0.2F)), glg.a);
      return glk.a($$1, 64, 64);
   }

   @Override
   public void a(heq $$0) {
      super.a($$0);

      for (gle $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
