import javax.annotation.Nullable;

public abstract class fuj extends frp {
   private static final int b = 100;
   private final xl c;
   @Nullable
   private final xl d;
   private final xl s;
   @Nullable
   protected fly a;
   @Nullable
   private fmh u;
   private final fpj v;

   protected fuj(xl $$0, xl $$1, xl $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fuj(xl $$0, xl $$1, @Nullable xl $$2, xl $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fpj(0, 0, this.n, this.o);
   }

   protected abstract fpm m();

   @Override
   protected void aS_() {
      fpp $$0 = this.v.a(fpp.d().a(8));
      $$0.c().b();
      $$0.a(new fnd(this.n(), this.p));
      this.u = $$0.a(new fmh(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fpp $$1 = $$0.a(fpp.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fly.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fpj.a(this.v, this.H());
   }

   @Override
   public xl i() {
      return this.s;
   }
}
