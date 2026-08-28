import javax.annotation.Nullable;

public class ghx implements dbz {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final ghw[] c;
   protected final dcw d;

   ghx(dcw $$0, int $$1, int $$2, ghw[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dtc a_(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w())).b($$0);
   }

   @Override
   public epe b_(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w())).b($$0).u();
   }

   @Override
   public float a(ji $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public eot y_() {
      return this.d.y_();
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w())).a($$0);
   }

   private ghw a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jd $$0, dch $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public int J_() {
      return this.d.J_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
