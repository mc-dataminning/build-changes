import javax.annotation.Nullable;

public class gvn implements diy {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gvm[] c;
   protected final djx d;

   gvn(djx $$0, int $$1, int $$2, gvm[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public ebe a_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).b($$0);
   }

   @Override
   public exo b_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jb $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public exd B_() {
      return this.d.B_();
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).a($$0);
   }

   private gvm a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(iv $$0, djh $$1) {
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
