import javax.annotation.Nullable;

public abstract class fxf extends fuk {
   private static final int b = 100;
   private final wp c;
   @Nullable
   private final wp d;
   private final wp s;
   @Nullable
   protected fou a;
   @Nullable
   private fpd u;
   private final fse v;

   protected fxf(wp $$0, wp $$1, wp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fxf(wp $$0, wp $$1, @Nullable wp $$2, wp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fse(0, 0, this.n, this.o);
   }

   protected abstract fsh m();

   @Override
   protected void aR_() {
      fsk $$0 = this.v.a(fsk.d().a(8));
      $$0.c().b();
      $$0.a(new fpz(this.n(), this.p));
      this.u = $$0.a(new fpd(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fsk $$1 = $$0.a(fsk.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fou.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fop var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fse.a(this.v, this.J());
   }

   @Override
   public wp i() {
      return this.s;
   }
}
