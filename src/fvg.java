public class fvg<T extends brv> extends fvz<T> {
   private final fys a;
   private final fys b;

   public fvg(fys $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fyx.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fyu.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fyx.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fyu.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fyx.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fyu.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fyx.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fyu.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fyx.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fyu.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fyx.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fyu.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fyx.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fyu.a(0.0F, 20.0F, 0.0F));
      return fyy.a($$0, 32, 32);
   }

   @Override
   public fys a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bi()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * aym.a(0.6F * $$3);
   }
}
