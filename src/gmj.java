public class gmj extends gmr<cnz, gsu> {
   private static final alb a = alb.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final ghe b = ghe.f(a);

   public gmj(gms.a $$0) {
      super($$0);
   }

   protected int a(cnz $$0, je $$1) {
      return 15;
   }

   @Override
   public void a(gsu $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      fcu.a $$4 = $$1.c();
      fcy $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fcy $$0, fcu.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gwb.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public alb a(gsu $$0) {
      return a;
   }

   @Override
   public gsu b() {
      return new gsu();
   }
}
