public class ghu extends ggj<hel> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gln g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gle i = this.c.b("left_chest");
   private final gle j = this.c.b("right_chest");

   public ghu(gle $$0) {
      super($$0);
   }

   public static glk a(float $$0) {
      return glk.a(ggj.a(gli.a), 64, 64).a(g).a(gln.scaling($$0));
   }

   public static glk b(float $$0) {
      return glk.a(ggj.c(gli.a), 64, 64).a(g).a(b).a(gln.scaling($$0));
   }

   public static glk a(float $$0, boolean $$1) {
      return gib.b($$1).a(g).a($$1 ? ggj.b : gln.a).a(gln.scaling($$0));
   }

   private static void a(glo $$0) {
      glo $$1 = $$0.b("body");
      glj $$2 = glj.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, glg.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, glg.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      glo $$3 = $$0.b("head_parts").b("head");
      glj $$4 = glj.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, glg.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, glg.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hel $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
