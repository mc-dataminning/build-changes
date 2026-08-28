public class ggj extends gey<hdb> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gkc g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gjt i = this.c.b("left_chest");
   private final gjt j = this.c.b("right_chest");

   public ggj(gjt $$0) {
      super($$0);
   }

   public static gjz a(float $$0) {
      return gjz.a(gey.a(gjx.a), 64, 64).a(g).a(gkc.scaling($$0));
   }

   public static gjz b(float $$0) {
      return gjz.a(gey.c(gjx.a), 64, 64).a(g).a(b).a(gkc.scaling($$0));
   }

   public static gjz a(float $$0, boolean $$1) {
      return ggq.b($$1).a(g).a($$1 ? gey.b : gkc.a).a(gkc.scaling($$0));
   }

   private static void a(gkd $$0) {
      gkd $$1 = $$0.b("body");
      gjy $$2 = gjy.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gjv.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gjv.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gkd $$3 = $$0.b("head_parts").b("head");
      gjy $$4 = gjy.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gjv.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gjv.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hdb $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
