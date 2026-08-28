public class fwo extends fxu {
   private static final wy s = wy.c("selectWorld.backupJoinSkipButton");
   public static final wy a = wy.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fwo.a b;
   private final wy v;
   private final boolean w;
   private fsv x = fsv.a;
   final wy c;
   protected int d;
   private fse y;

   public fwo(Runnable $$0, fwo.a $$1, wy $$2, wy $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fwo(Runnable $$0, fwo.a $$1, wy $$2, wy $$3, wy $$4, boolean $$5) {
      super($$2);
      this.u = $$0;
      this.b = $$1;
      this.v = $$3;
      this.w = $$5;
      this.c = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.x = fsv.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = fse.a(wy.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fsc.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fsc.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fsc.a(wx.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.x.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.u.run();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
