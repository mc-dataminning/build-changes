public class gmv<T extends bsr & cnm> extends gki<T> {
   private static final float a = 12.25F;
   private final glh g;
   private final float h;
   private final boolean i;

   public gmv(gkj.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.g = $$0.b();
      this.h = $$1;
      this.i = $$2;
   }

   public gmv(gkj.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jd $$1) {
      return this.i ? 15 : super.a($$0, $$1);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      if ($$0.ai >= 2 || !(this.d.b.g().g($$0) < 12.25)) {
         $$3.a();
         $$3.b(this.h, this.h, this.h);
         $$3.a(this.d.b());
         this.g.a($$0.p(), cun.h, $$5, gqc.d, $$3, $$4, $$0.dO(), $$0.an());
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public akr a(bsr $$0) {
      return gqk.e;
   }
}
