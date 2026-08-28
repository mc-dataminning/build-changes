public class gfs extends geh<hcj> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gjl g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gjc i = this.c.b("left_chest");
   private final gjc j = this.c.b("right_chest");

   public gfs(gjc $$0) {
      super($$0);
   }

   public static gji a(float $$0) {
      return gji.a(geh.a(gjg.a), 64, 64).a(g).a(gjl.scaling($$0));
   }

   public static gji b(float $$0) {
      return gji.a(geh.c(gjg.a), 64, 64).a(g).a(b).a(gjl.scaling($$0));
   }

   public static gji a(float $$0, boolean $$1) {
      return gfz.b($$1).a(g).a($$1 ? geh.b : gjl.a).a(gjl.scaling($$0));
   }

   private static void a(gjm $$0) {
      gjm $$1 = $$0.b("body");
      gjh $$2 = gjh.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gje.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gje.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gjm $$3 = $$0.b("head_parts").b("head");
      gjh $$4 = gjh.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gje.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gje.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hcj $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
