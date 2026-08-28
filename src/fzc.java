import javax.annotation.Nullable;

public abstract class fzc extends fwf {
   private static final int b = 100;
   private final wv c;
   @Nullable
   private final wv d;
   private final wv s;
   @Nullable
   protected fqp a;
   @Nullable
   private fqy u;
   private final ftz v;

   protected fzc(wv $$0, wv $$1, wv $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fzc(wv $$0, wv $$1, @Nullable wv $$2, wv $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new ftz(0, 0, this.n, this.o);
   }

   protected abstract fuc m();

   @Override
   protected void aN_() {
      fuf $$0 = this.v.a(fuf.d().a(8));
      $$0.c().b();
      $$0.a(new fru(this.n(), this.p));
      this.u = $$0.a(new fqy(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fuf $$1 = $$0.a(fuf.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fqp.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      ftz.a(this.v, this.J());
   }

   @Override
   public wv i() {
      return this.s;
   }
}
