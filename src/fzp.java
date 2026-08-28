import javax.annotation.Nullable;

public class fzp extends gad {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xa d;
   private final xa s;
   private final Runnable u;
   @Nullable
   private fve v;
   private ful w;
   private int x;

   public static fzp a(xa $$0, xa $$1, Runnable $$2) {
      return new fzp($$0, null, $$1, $$2, 0);
   }

   public static fzp a(xa $$0, xa $$1, xa $$2, Runnable $$3) {
      return new fzp($$0, $$1, $$2, $$3, 20);
   }

   protected fzp(xa $$0, @Nullable xa $$1, xa $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.s = $$2;
      this.u = $$3;
      this.x = $$4;
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.d != null) {
         this.v = fve.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.v != null ? this.v.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.w = this.c(ful.a(this.s, $$0x -> this.aP_()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.x > 0) {
         this.x--;
      }

      this.w.j = this.x == 0;
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.v == null) {
         String $$4 = fzs.a(ag.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.v.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aH_() {
      return this.v != null && this.w.j;
   }

   @Override
   public void aP_() {
      this.u.run();
   }

   @Override
   public xa i() {
      return wz.a(this.l, this.d != null ? this.d : wz.a);
   }
}
