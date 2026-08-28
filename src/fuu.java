public class fuu<T extends bsq> extends fvn<T> {
   private final fye a;
   private final fye b;

   public fuu(fye $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fyj.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fyg.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fyj.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fyg.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fyj.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fyg.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fyj.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fyg.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fyj.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fyg.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fyj.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fyg.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fyj.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fyg.a(0.0F, 20.0F, 0.0F));
      return fyk.a($$0, 32, 32);
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
