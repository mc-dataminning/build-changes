import javax.annotation.Nullable;

public class fxc extends fwv {
   private static final xk v = xk.c("controls.keybinds.title");
   @Nullable
   public flx a;
   public long u;
   private fxb w;
   private fny x;

   public fxc(ftr $$0, fmd $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxb(this, this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      this.x = fny.a(xk.c("controls.resetAll"), $$0x -> {
         for (flx $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      frr $$0 = this.s.b(frr.e().a(8));
      $$0.a(this.x);
      $$0.a(fny.a(xj.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(ffg.b.c.a($$2));
         this.a = null;
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(ffg.bv);
         } else {
            this.a.b(ffg.a($$0, $$1));
         }

         this.a = null;
         this.u = ae.c();
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (flx $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
