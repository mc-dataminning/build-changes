public class fxm extends fys {
   private static final wy s = wy.c("selectWorld.backupJoinSkipButton");
   public static final wy a = wy.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fxm.a b;
   private final wy v;
   private final boolean w;
   private ftt x = ftt.a;
   final wy c;
   protected int d;
   private ftc y;

   public fxm(Runnable $$0, fxm.a $$1, wy $$2, wy $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fxm(Runnable $$0, fxm.a $$1, wy $$2, wy $$3, wy $$4, boolean $$5) {
      super($$2);
      this.u = $$0;
      this.b = $$1;
      this.v = $$3;
      this.w = $$5;
      this.c = $$4;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.x = ftt.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = ftc.a(wy.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fta.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fta.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fta.a(wx.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.x.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aD_() {
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
