public class gix extends gjf<cmq> {
   private static final akk a = new akk("textures/entity/enderdragon/dragon_fireball.png");
   private static final gef f = gef.e(a);

   public gix(gjg.a $$0) {
      super($$0);
   }

   protected int a(cmq $$0, ja $$1) {
      return 15;
   }

   public void a(cmq $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      fag.a $$6 = $$3.c();
      fak $$7 = $$4.getBuffer(f);
      a($$7, $$6, $$5, 0.0F, 0, 0, 1);
      a($$7, $$6, $$5, 1.0F, 0, 1, 1);
      a($$7, $$6, $$5, 1.0F, 1, 1, 0);
      a($$7, $$6, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fak $$0, fag.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(goz.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public akk a(cmq $$0) {
      return a;
   }
}
