import javax.annotation.Nullable;

public class goo implements dgc {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gon[] c;
   protected final dha d;

   goo(dha $$0, int $$1, int $$2, gon[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dxn a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0);
   }

   @Override
   public etp b_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public ete C_() {
      return this.d.C_();
   }

   @Nullable
   @Override
   public dup c_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a($$0);
   }

   private gon a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jh $$0, dgk $$1) {
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
