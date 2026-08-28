import javax.annotation.Nullable;

public class fvr extends fwf {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wv d;
   private final wv s;
   private final Runnable u;
   @Nullable
   private frg v;
   private fqn w;
   private int x;

   public static fvr a(wv $$0, wv $$1, Runnable $$2) {
      return new fvr($$0, null, $$1, $$2, 0);
   }

   public static fvr a(wv $$0, wv $$1, wv $$2, Runnable $$3) {
      return new fvr($$0, $$1, $$2, $$3, 20);
   }

   protected fvr(wv $$0, @Nullable wv $$1, wv $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.s = $$2;
      this.u = $$3;
      this.x = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.d != null) {
         this.v = frg.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.v != null ? this.v.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.w = this.c(fqn.a(this.s, $$0x -> this.aK_()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.x > 0) {
         this.x--;
      }

      this.w.j = this.x == 0;
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.v == null) {
         String $$4 = fvu.a(af.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.v.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aC_() {
      return this.v != null && this.w.j;
   }

   @Override
   public void aK_() {
      this.u.run();
   }

   @Override
   public wv i() {
      return wu.a(this.l, this.d != null ? this.d : wu.a);
   }
}
