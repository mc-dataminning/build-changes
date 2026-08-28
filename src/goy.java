public class goy extends gnn<but, guu> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gom h;

   protected goy(gno.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public guu a() {
      return new guu();
   }

   public void a(but $$0, guu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvs $$3 = $$0.o();
      $$1.b = $$3.u();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dS(), null, 0) : null;
   }

   public void a(guu $$0, fdi $$1, ghl $$2, int $$3) {
      gzi $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azf.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gok.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azn.a());
         $$1.b();
      }
   }
}
