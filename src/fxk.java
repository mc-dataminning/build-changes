public class fxk<T extends bsq> extends fuw<T> {
   private final fye a;
   private final fye b;

   public fxk(fye $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fyk a(fyi $$0) {
      fym $$1 = new fym();
      fyn $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fyj.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fyg.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fyj.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fyg.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fyj.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fyg.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fyj.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fyg.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fyj.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fyg.a(0.0F, 20.5F, -3.0F));
      return fyk.a($$1, 32, 32);
   }

   @Override
   public fye a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bf()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ayn.a(0.6F * $$3);
   }
}
