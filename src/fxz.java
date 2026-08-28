import javax.annotation.Nullable;

public class fxz extends fyn {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wy d;
   private final wy s;
   private final Runnable u;
   @Nullable
   private fto v;
   private fsv w;
   private int x;

   public static fxz a(wy $$0, wy $$1, Runnable $$2) {
      return new fxz($$0, null, $$1, $$2, 0);
   }

   public static fxz a(wy $$0, wy $$1, wy $$2, Runnable $$3) {
      return new fxz($$0, $$1, $$2, $$3, 20);
   }

   protected fxz(wy $$0, @Nullable wy $$1, wy $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.s = $$2;
      this.u = $$3;
      this.x = $$4;
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.d != null) {
         this.v = fto.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.v != null ? this.v.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.w = this.c(fsv.a(this.s, $$0x -> this.aL_()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.x > 0) {
         this.x--;
      }

      this.w.j = this.x == 0;
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.v == null) {
         String $$4 = fyc.a(ag.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.v.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aD_() {
      return this.v != null && this.w.j;
   }

   @Override
   public void aL_() {
      this.u.run();
   }

   @Override
   public wy i() {
      return wx.a(this.l, this.d != null ? this.d : wx.a);
   }
}
