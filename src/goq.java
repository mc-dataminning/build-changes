import javax.annotation.Nullable;

public class goq implements dgb {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gop[] c;
   protected final dgz d;

   goq(dgz $$0, int $$1, int $$2, gop[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dxo a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0);
   }

   @Override
   public etq b_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public etf C_() {
      return this.d.C_();
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a($$0);
   }

   private gop a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jh $$0, dgj $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   @Override
   public int M_() {
      return this.d.M_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
