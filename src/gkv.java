import javax.annotation.Nullable;

public class gkv implements ddl {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gku[] c;
   protected final dej d;

   gkv(dej $$0, int $$1, int $$2, gku[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dus a_(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w())).b($$0);
   }

   @Override
   public eqt b_(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jk $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public eqi y_() {
      return this.d.y_();
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w())).a($$0);
   }

   private gku a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jf $$0, ddt $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int H_() {
      return this.d.H_();
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
