import javax.annotation.Nullable;

public abstract class gdc extends gaf {
   private static final int b = 100;
   private final xc c;
   @Nullable
   private final xc d;
   private final xc s;
   @Nullable
   protected fup a;
   @Nullable
   private fuy u;
   private final fxz v;

   protected gdc(xc $$0, xc $$1, xc $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gdc(xc $$0, xc $$1, @Nullable xc $$2, xc $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fxz(0, 0, this.n, this.o);
   }

   protected abstract fyc m();

   @Override
   protected void aS_() {
      fyf $$0 = this.v.a(fyf.d().a(8));
      $$0.c().b();
      $$0.a(new fvu(this.n(), this.p));
      this.u = $$0.a(new fuy(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fyf $$1 = $$0.a(fyf.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fup.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fxz.a(this.v, this.J());
   }

   @Override
   public xc i() {
      return this.s;
   }
}
