public class gmp<T extends bsq & cnk> extends gkc<T> {
   private static final float a = 12.25F;
   private final glb f;
   private final float g;
   private final boolean h;

   public gmp(gkd.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.f = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gmp(gkd.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jd $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      if ($$0.ai >= 2 || !(this.c.b.g().g($$0) < 12.25)) {
         $$3.a();
         $$3.b(this.g, this.g, this.g);
         $$3.a(this.c.b());
         this.f.a($$0.p(), cul.h, $$5, gpw.d, $$3, $$4, $$0.dQ(), $$0.an());
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public akq a(bsq $$0) {
      return gqe.e;
   }
}
