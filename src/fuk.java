import javax.annotation.Nullable;

public class fuk extends fud {
   private static final xi v = xi.c("controls.keybinds.title");
   @Nullable
   public fjg a;
   public long u;
   private fuj w;
   private flh x;

   public fuk(fra $$0, fjm $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void E() {
      this.w = this.s.c(new fuj(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.x = flh.a(xi.c("controls.resetAll"), $$0x -> {
         for (fjg $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fpa $$0 = this.s.b(fpa.e().a(8));
      $$0.a(this.x);
      $$0.a(flh.a(xh.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fcw.b.c.a($$2));
         this.a = null;
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(fcw.bv);
         } else {
            this.a.b(fcw.a($$0, $$1));
         }

         this.a = null;
         this.u = ae.c();
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fjg $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
