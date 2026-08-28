public class gmy extends gmr<cod, gtb> {
   private final gnq a;

   public gmy(gms.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gtb $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cvi.h, false, $$1, $$2, $$3, gwb.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gtb $$0) {
      return gwj.d;
   }

   public gtb a() {
      return new gtb();
   }

   public void a(cod $$0, gtb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.m();
      $$1.b = !$$1.c.f() ? this.a.a($$1.c, $$0.dS(), null, $$0.ap()) : null;
   }
}
