public class gvt extends gws<gxz, gbm> {
   private static final akv a = akv.b("textures/entity/cat/cat_collar.png");
   private final gbm b;
   private final gbm c;

   public gvt(gua<gxz, gbm> $$0, gey $$1) {
      super($$0);
      this.b = new gbm($$1.a(gfb.R));
      this.c = new gbm($$1.a(gfb.Q));
   }

   public void a(fft $$0, glx $$1, int $$2, gxz $$3, float $$4, float $$5) {
      cvl $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gbm $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
