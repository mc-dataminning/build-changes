public class gjw extends glz<cka, fuz<cka>> {
   private static final akt a = new akt("textures/entity/breeze/breeze.png");

   public gjw(gkq.a $$0) {
      super($$0, new fuz<>($$0.a(fyr.t)), 0.5F);
      this.a(new goe(this));
      this.a(new god(this));
   }

   public void a(cka $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      fuz<cka> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cka $$0) {
      return a;
   }

   public static fuz<cka> a(fuz<cka> $$0, fys... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fys $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
