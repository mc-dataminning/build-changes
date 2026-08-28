public class gpe<T extends btj & cof> extends gmr<T, guv> {
   private final gnq a;
   private final float b;
   private final boolean h;

   public gpe(gms.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gpe(gms.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, je $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(guv $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cvi.h, false, $$1, $$2, $$3, gwb.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public guv a() {
      return new guv();
   }

   public void a(T $$0, guv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvl $$3 = $$0.m();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dS(), null, $$0.ap()) : null;
      $$1.b = $$3;
   }

   public alb a(guv $$0) {
      return gwj.d;
   }
}
