public class gjz extends glj<cjr, fvc<cjr>> {
   private static final akq a = akq.b("textures/entity/enderman/enderman.png");
   private final ayv i = ayv.a();

   public gjz(gkd.a $$0) {
      super($$0, new fvc<>($$0.a(fyd.Y)), 0.5F);
      this.a(new gnz<>(this));
      this.a(new gnq(this, $$0.c()));
   }

   public void a(cjr $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      dta $$6 = $$0.gm();
      fvc<cjr> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gn();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eww a(cjr $$0, float $$1) {
      if ($$0.gn()) {
         double $$2 = 0.02 * (double)$$0.ec();
         return new eww(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akq a(cjr $$0) {
      return a;
   }
}
