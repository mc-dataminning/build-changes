import javax.annotation.Nullable;

public class gpk implements dfl {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gpj[] c;
   protected final dgj d;

   gpk(dgj $$0, int $$1, int $$2, gpj[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dwy a_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0);
   }

   @Override
   public eta b_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public esp C_() {
      return this.d.C_();
   }

   @Nullable
   @Override
   public dua c_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).a($$0);
   }

   private gpj a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(ji $$0, dft $$1) {
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
