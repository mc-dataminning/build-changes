public class fuz extends fwf {
   private static final wv s = wv.c("selectWorld.backupJoinSkipButton");
   public static final wv a = wv.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fuz.a b;
   private final wv v;
   private final boolean w;
   private frg x = frg.a;
   final wv c;
   protected int d;
   private fqp y;

   public fuz(Runnable $$0, fuz.a $$1, wv $$2, wv $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fuz(Runnable $$0, fuz.a $$1, wv $$2, wv $$3, wv $$4, boolean $$5) {
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
      this.x = frg.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = fqp.a(wv.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fqn.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fqn.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fqn.a(wu.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
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
