public class gnq extends gny<cos, guc> {
   private static final alh a = alh.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gig b = gig.f(a);

   public gnq(gnz.a $$0) {
      super($$0);
   }

   protected int a(cos $$0, jg $$1) {
      return 15;
   }

   @Override
   public void a(guc $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      fdt.a $$4 = $$1.c();
      fdx $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fdx $$0, fdt.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gxj.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public guc b() {
      return new guc();
   }
}
