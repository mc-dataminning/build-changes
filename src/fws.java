import javax.annotation.Nullable;

public abstract class fws extends ftx {
   private static final int b = 100;
   private final xv c;
   @Nullable
   private final xv d;
   private final xv s;
   @Nullable
   protected fog a;
   @Nullable
   private fop u;
   private final frr v;

   protected fws(xv $$0, xv $$1, xv $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fws(xv $$0, xv $$1, @Nullable xv $$2, xv $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new frr(0, 0, this.n, this.o);
   }

   protected abstract fru l();

   @Override
   protected void aT_() {
      frx $$0 = this.v.a(frx.d().a(8));
      $$0.c().b();
      $$0.a(new fpm(this.m(), this.p));
      this.u = $$0.a(new fop(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      frx $$1 = $$0.a(frx.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fog.a(this.d, this.p).a());
      }

      $$1.a(this.l());
      this.v.a($$1x -> {
         foc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      frr.a(this.v, this.H());
   }

   @Override
   public xv i() {
      return this.s;
   }
}
