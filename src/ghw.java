public class ghw extends ggl<hen> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final glp g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final glg i = this.c.b("left_chest");
   private final glg j = this.c.b("right_chest");

   public ghw(glg $$0) {
      super($$0);
   }

   public static glm a(float $$0) {
      return glm.a(ggl.a(glk.a), 64, 64).a(g).a(glp.scaling($$0));
   }

   public static glm b(float $$0) {
      return glm.a(ggl.c(glk.a), 64, 64).a(g).a(b).a(glp.scaling($$0));
   }

   public static glm a(float $$0, boolean $$1) {
      return gid.b($$1).a(g).a($$1 ? ggl.b : glp.a).a(glp.scaling($$0));
   }

   private static void a(glq $$0) {
      glq $$1 = $$0.b("body");
      gll $$2 = gll.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gli.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gli.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      glq $$3 = $$0.b("head_parts").b("head");
      gll $$4 = gll.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gli.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gli.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hen $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
