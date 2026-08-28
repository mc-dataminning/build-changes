import javax.annotation.Nullable;

public abstract class fxh extends fum {
   private static final int b = 100;
   private final wp c;
   @Nullable
   private final wp d;
   private final wp s;
   @Nullable
   protected fow a;
   @Nullable
   private fpf u;
   private final fsg v;

   protected fxh(wp $$0, wp $$1, wp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fxh(wp $$0, wp $$1, @Nullable wp $$2, wp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fsg(0, 0, this.n, this.o);
   }

   protected abstract fsj m();

   @Override
   protected void aR_() {
      fsm $$0 = this.v.a(fsm.d().a(8));
      $$0.c().b();
      $$0.a(new fqb(this.n(), this.p));
      this.u = $$0.a(new fpf(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fsm $$1 = $$0.a(fsm.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fow.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fos var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fsg.a(this.v, this.J());
   }

   @Override
   public wp i() {
      return this.s;
   }
}
