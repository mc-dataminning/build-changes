public class gfk extends gea<hcb> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gjd g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final giu i = this.c.b("left_chest");
   private final giu j = this.c.b("right_chest");

   public gfk(giu $$0) {
      super($$0);
   }

   public static gja a(float $$0) {
      return gja.a(gea.a(giy.a), 64, 64).a(g).a(gjd.scaling($$0));
   }

   public static gja b(float $$0) {
      return gja.a(gea.c(giy.a), 64, 64).a(g).a(b).a(gjd.scaling($$0));
   }

   public static gja a(float $$0, boolean $$1) {
      return gfr.b($$1).a(g).a($$1 ? gea.b : gjd.a).a(gjd.scaling($$0));
   }

   private static void a(gje $$0) {
      gje $$1 = $$0.b("body");
      giz $$2 = giz.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, giw.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, giw.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gje $$3 = $$0.b("head_parts").b("head");
      giz $$4 = giz.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, giw.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, giw.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hcb $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
