public class goc extends gmr<bul, gty> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gnq h;

   protected goc(gms.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public alb a(gty $$0) {
      return gwj.d;
   }

   public gty a() {
      return new gty();
   }

   public void a(bul $$0, gty $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvl $$3 = $$0.o();
      $$1.b = $$3;
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dS(), null, 0) : null;
   }

   public void a(gty $$0, fcu $$1, ggv $$2, int $$3) {
      gym $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azc.g($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gno.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azk.a());
         $$1.b();
      }
   }
}
