import javax.annotation.Nullable;

public abstract class fwm extends ftr {
   private static final int b = 100;
   private final xk c;
   @Nullable
   private final xk d;
   private final xk s;
   @Nullable
   protected foa a;
   @Nullable
   private foj u;
   private final frl v;

   protected fwm(xk $$0, xk $$1, xk $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fwm(xk $$0, xk $$1, @Nullable xk $$2, xk $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new frl(0, 0, this.n, this.o);
   }

   protected abstract fro l();

   @Override
   protected void aT_() {
      frr $$0 = this.v.a(frr.d().a(8));
      $$0.c().b();
      $$0.a(new fpg(this.m(), this.p));
      this.u = $$0.a(new foj(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      frr $$1 = $$0.a(frr.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(foa.a(this.d, this.p).a());
      }

      $$1.a(this.l());
      this.v.a($$1x -> {
         fnw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      frl.a(this.v, this.H());
   }

   @Override
   public xk i() {
      return this.s;
   }
}
