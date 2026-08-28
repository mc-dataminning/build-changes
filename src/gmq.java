import javax.annotation.Nullable;

public class gmq implements deo {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gmp[] c;
   protected final dfm d;

   gmq(dfm $$0, int $$1, int $$2, gmp[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dvv a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0);
   }

   @Override
   public erv b_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public erk B_() {
      return this.d.B_();
   }

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a($$0);
   }

   private gmp a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jh $$0, dew $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int K_() {
      return this.d.K_();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
