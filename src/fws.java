public class fws<T extends bsq> extends fvn<T> {
   private static final String a = "body_front";
   private static final String b = "body_back";
   private final fye f;
   private final fye g;

   public fws(fye $$0) {
      this.f = $$0;
      this.g = $$0.b("body_back");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      int $$2 = 20;
      fyn $$3 = $$1.a("body_front", fyj.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fyg.a(0.0F, 20.0F, 0.0F));
      fyn $$4 = $$1.a("body_back", fyj.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fyg.a(0.0F, 20.0F, 8.0F));
      $$1.a("head", fyj.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fyg.a(0.0F, 20.0F, 0.0F));
      $$4.a("back_fin", fyj.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), fyg.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", fyj.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), fyg.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", fyj.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), fyg.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", fyj.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fyg.a(-1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fyj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fyg.a(1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return fyk.a($$0, 32, 32);
   }

   @Override
   public fye a() {
      return this.f;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.bf()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      this.g.f = -$$6 * 0.25F * ayn.a($$7 * 0.6F * $$3);
   }
}
