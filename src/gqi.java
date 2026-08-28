import javax.annotation.Nullable;

public class gqi implements dgc {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gqh[] c;
   protected final dgz d;

   gqi(dgz $$0, int $$1, int $$2, gqh[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dxq a_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0);
   }

   @Override
   public etw b_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public etl x_() {
      return this.d.x_();
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).a($$0);
   }

   private gqh a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(ji $$0, dgk $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int G_() {
      return this.d.G_();
   }

   @Override
   public int H_() {
      return this.d.H_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
