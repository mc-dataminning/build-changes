public class fxt extends gaf<gub> {
   private final gbm a;

   public fxt(gbm $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static gbs a() {
      gbu $$0 = fyx.a(gbq.a, 0.0F);
      gbw $$1 = $$0.a();
      gaf.a($$1);
      gbw $$2 = $$1.b("head").a("mushrooms");
      $$2.a("red_mushroom_1", gbr.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), gbo.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", gbr.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), gbo.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", gbr.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), gbo.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", gbr.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), gbo.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         gbr.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         gbo.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         gbr.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         gbo.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return gbs.a($$0, 64, 32);
   }

   public void a(gub $$0) {
      super.a($$0);
      this.a.k = !$$0.a;
   }
}
