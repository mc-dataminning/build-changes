import javax.annotation.Nullable;

public abstract class fwt extends fty {
   private static final int b = 100;
   private final xv c;
   @Nullable
   private final xv d;
   private final xv s;
   @Nullable
   protected foh a;
   @Nullable
   private foq u;
   private final frs v;

   protected fwt(xv $$0, xv $$1, xv $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fwt(xv $$0, xv $$1, @Nullable xv $$2, xv $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new frs(0, 0, this.n, this.o);
   }

   protected abstract frv l();

   @Override
   protected void aT_() {
      fry $$0 = this.v.a(fry.d().a(8));
      $$0.c().b();
      $$0.a(new fpn(this.m(), this.p));
      this.u = $$0.a(new foq(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fry $$1 = $$0.a(fry.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(foh.a(this.d, this.p).a());
      }

      $$1.a(this.l());
      this.v.a($$1x -> {
         fod var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      frs.a(this.v, this.H());
   }

   @Override
   public xv i() {
      return this.s;
   }
}
