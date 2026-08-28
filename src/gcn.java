import javax.annotation.Nullable;

public abstract class gcn extends fzq {
   private static final int b = 100;
   private final xg c;
   @Nullable
   private final xg d;
   private final xg s;
   @Nullable
   protected fua a;
   @Nullable
   private fuj u;
   private final fxk v;

   protected gcn(xg $$0, xg $$1, xg $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gcn(xg $$0, xg $$1, @Nullable xg $$2, xg $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fxk(0, 0, this.n, this.o);
   }

   protected abstract fxn m();

   @Override
   protected void aO_() {
      fxq $$0 = this.v.a(fxq.d().a(8));
      $$0.c().b();
      $$0.a(new fvf(this.n(), this.p));
      this.u = $$0.a(new fuj(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fxq $$1 = $$0.a(fxq.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fua.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fxk.a(this.v, this.J());
   }

   @Override
   public xg i() {
      return this.s;
   }
}
