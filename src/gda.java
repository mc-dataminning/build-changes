import javax.annotation.Nullable;

public abstract class gda extends gad {
   private static final int b = 100;
   private final xa c;
   @Nullable
   private final xa d;
   private final xa s;
   @Nullable
   protected fun a;
   @Nullable
   private fuw u;
   private final fxx v;

   protected gda(xa $$0, xa $$1, xa $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gda(xa $$0, xa $$1, @Nullable xa $$2, xa $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fxx(0, 0, this.n, this.o);
   }

   protected abstract fya m();

   @Override
   protected void aS_() {
      fyd $$0 = this.v.a(fyd.d().a(8));
      $$0.c().b();
      $$0.a(new fvs(this.n(), this.p));
      this.u = $$0.a(new fuw(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fyd $$1 = $$0.a(fyd.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fun.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fuj var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fxx.a(this.v, this.J());
   }

   @Override
   public xa i() {
      return this.s;
   }
}
