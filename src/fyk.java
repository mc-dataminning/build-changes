public class fyk extends fzq {
   private static final xg s = xg.c("selectWorld.backupJoinSkipButton");
   public static final xg a = xg.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fyk.a b;
   private final xg v;
   private final boolean w;
   private fur x = fur.a;
   final xg c;
   protected int d;
   private fua y;

   public fyk(Runnable $$0, fyk.a $$1, xg $$2, xg $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fyk(Runnable $$0, fyk.a $$1, xg $$2, xg $$3, xg $$4, boolean $$5) {
      super($$2);
      this.u = $$0;
      this.b = $$1;
      this.v = $$3;
      this.w = $$5;
      this.c = $$4;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.x = fur.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = fua.a(xg.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fty.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fty.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fty.a(xf.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.x.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aI_() {
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
