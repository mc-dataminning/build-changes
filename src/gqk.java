public class gqk extends goz<bvk, gwh> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gpy h;

   protected gqk(gpa.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gwh a() {
      return new gwh();
   }

   public void a(bvk $$0, gwh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwf $$3 = $$0.o();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dY(), null, 0) : null;
   }

   public void a(gwh $$0, fek $$1, gix $$2, int $$3) {
      hav $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azn.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gpw.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azv.a());
         $$1.b();
      }
   }
}
