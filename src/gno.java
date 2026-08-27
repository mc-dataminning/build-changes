public class gno extends glz<cll, fyd<cll>> {
   private static final akt a = new akt("textures/entity/villager/villager.png");

   public gno(gkq.a $$0) {
      super($$0, new fyd<>($$0.a(fyr.bV)), 0.5F);
      this.a(new gok<>(this, $$0.f(), $$0.d()));
      this.a(new gpt<>(this, $$0.e(), "villager"));
      this.a(new goj<>(this, $$0.d()));
   }

   public akt a(cll $$0) {
      return a;
   }

   protected void a(cll $$0, fbc $$1, float $$2) {
      float $$3 = 0.9375F * $$0.el();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cll $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
