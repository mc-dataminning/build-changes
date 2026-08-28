import javax.annotation.Nullable;

public class gph implements dfk {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gpg[] c;
   protected final dgi d;

   gph(dgi $$0, int $$1, int $$2, gpg[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dwx a_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0);
   }

   @Override
   public esz b_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public eso C_() {
      return this.d.C_();
   }

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).a($$0);
   }

   private gpg a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(ji $$0, dfs $$1) {
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
