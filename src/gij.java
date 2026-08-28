public class gij extends gir<cnb> {
   private static final alb a = new alb("textures/entity/enderdragon/dragon_fireball.png");
   private static final gdr f = gdr.e(a);

   public gij(gis.a $$0) {
      super($$0);
   }

   protected int a(cnb $$0, iz $$1) {
      return 15;
   }

   public void a(cnb $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      ezt.a $$6 = $$3.c();
      ezx $$7 = $$4.getBuffer(f);
      a($$7, $$6, $$5, 0.0F, 0, 0, 1);
      a($$7, $$6, $$5, 1.0F, 0, 1, 1);
      a($$7, $$6, $$5, 1.0F, 1, 1, 0);
      a($$7, $$6, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(ezx $$0, ezt.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(gol.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public alb a(cnb $$0) {
      return a;
   }
}
