public class ghe extends gjw<heb> {
   private final gle a;

   public ghe(gle $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static glk a() {
      glm $$0 = gio.a(gli.a, 0.0F);
      glo $$1 = $$0.a();
      gjw.a($$1);
      glo $$2 = $$1.b("head").a("mushrooms", glj.c(), glg.a);
      $$2.a("red_mushroom_1", glj.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), glg.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", glj.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), glg.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", glj.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), glg.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", glj.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), glg.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         glj.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         glg.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         glj.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         glg.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return glk.a($$0, 64, 32);
   }

   public void a(heb $$0) {
      super.a($$0);
      this.a.k = !$$0.a;
   }
}
