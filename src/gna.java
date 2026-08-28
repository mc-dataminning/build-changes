public class gna extends gni<coe, gtl> {
   private static final alc a = alc.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final ghq b = ghq.f(a);

   public gna(gnj.a $$0) {
      super($$0);
   }

   protected int a(coe $$0, je $$1) {
      return 15;
   }

   @Override
   public void a(gtl $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      fde.a $$4 = $$1.c();
      fdi $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fdi $$0, fde.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gws.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public alc a(gtl $$0) {
      return a;
   }

   @Override
   public gtl b() {
      return new gtl();
   }
}
