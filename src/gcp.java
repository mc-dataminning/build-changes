public class gcp extends gcx<cjb> {
   private static final ajh a = new ajh("textures/entity/enderdragon/dragon_fireball.png");
   private static final fxy f = fxy.e(a);

   public gcp(gcy.a $$0) {
      super($$0);
   }

   protected int a(cjb $$0, ib $$1) {
      return 15;
   }

   public void a(cjb $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      etz.a $$6 = $$3.c();
      eud $$7 = $$4.getBuffer(f);
      a($$7, $$6, $$5, 0.0F, 0, 0, 1);
      a($$7, $$6, $$5, 1.0F, 0, 1, 1);
      a($$7, $$6, $$5, 1.0F, 1, 1, 0);
      a($$7, $$6, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(eud $$0, etz.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(giq.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public ajh a(cjb $$0) {
      return a;
   }
}
