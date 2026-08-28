import javax.annotation.Nullable;

public abstract class fyd extends fvi {
   private static final int b = 100;
   private final wp c;
   @Nullable
   private final wp d;
   private final wp s;
   @Nullable
   protected fps a;
   @Nullable
   private fqb u;
   private final ftc v;

   protected fyd(wp $$0, wp $$1, wp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fyd(wp $$0, wp $$1, @Nullable wp $$2, wp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new ftc(0, 0, this.n, this.o);
   }

   protected abstract ftf m();

   @Override
   protected void aR_() {
      fti $$0 = this.v.a(fti.d().a(8));
      $$0.c().b();
      $$0.a(new fqx(this.n(), this.p));
      this.u = $$0.a(new fqb(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fti $$1 = $$0.a(fti.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fps.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fpo var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      ftc.a(this.v, this.J());
   }

   @Override
   public wp i() {
      return this.s;
   }
}
