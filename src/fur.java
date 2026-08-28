import javax.annotation.Nullable;

public abstract class fur extends frw {
   private static final int b = 100;
   private final xj c;
   @Nullable
   private final xj d;
   private final xj s;
   @Nullable
   protected fmf a;
   @Nullable
   private fmo u;
   private final fpq v;

   protected fur(xj $$0, xj $$1, xj $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fur(xj $$0, xj $$1, @Nullable xj $$2, xj $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fpq(0, 0, this.n, this.o);
   }

   protected abstract fpt m();

   @Override
   protected void aR_() {
      fpw $$0 = this.v.a(fpw.d().a(8));
      $$0.c().b();
      $$0.a(new fnk(this.n(), this.p));
      this.u = $$0.a(new fmo(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fpw $$1 = $$0.a(fpw.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fmf.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fpq.a(this.v, this.H());
   }

   @Override
   public xj i() {
      return this.s;
   }
}
