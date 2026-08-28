public class gmy extends glj<cmi, fxp<cmi>> {
   private static final akq a = akq.b("textures/entity/villager/villager.png");

   public gmy(gkd.a $$0) {
      super($$0, new fxp<>($$0.a(fyd.bQ)), 0.5F);
      this.a(new gnu<>(this, $$0.f(), $$0.d()));
      this.a(new gpa<>(this, $$0.e(), "villager"));
      this.a(new gnt<>(this, $$0.d()));
   }

   public akq a(cmi $$0) {
      return a;
   }

   protected void a(cmi $$0, fbc $$1, float $$2) {
      float $$3 = 0.9375F * $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmi $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
