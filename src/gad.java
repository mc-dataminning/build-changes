public class gad implements fzq<dlo> {
   private final fpw<?> a;

   public gad(fzr.a $$0) {
      this.a = new fpw($$0.a(frc.bg));
   }

   public void a(dlo $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      ih $$6 = ih.b;
      if ($$0.m()) {
         dmz $$7 = $$0.i().a_($$0.aC_());
         if ($$7.b() instanceof dgy) {
            $$6 = $$7.c(dgy.b);
         }
      }

      cpb $$8 = $$0.s();
      glc $$9;
      if ($$8 == null) {
         $$9 = fyf.i;
      } else {
         $$9 = fyf.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      frd $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eud $$13 = $$9.a($$3, fxy::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
