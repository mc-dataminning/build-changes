import javax.annotation.Nullable;

public class gty implements dik {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gtx[] c;
   protected final djh d;

   gty(djh $$0, int $$1, int $$2, gtx[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public eao a_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).b($$0);
   }

   @Override
   public ewv b_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jb $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public ewk x_() {
      return this.d.x_();
   }

   @Nullable
   @Override
   public dxm c_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).a($$0);
   }

   private gtx a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(iv $$0, dis $$1) {
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
