import javax.annotation.Nullable;

public class fuz extends fus {
   private static final xl v = xl.c("controls.keybinds.title");
   @Nullable
   public fjv a;
   public long u;
   private fuy w;
   private flw x;

   public fuz(frp $$0, fkb $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void E() {
      this.w = this.s.c(new fuy(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.x = flw.a(xl.c("controls.resetAll"), $$0x -> {
         for (fjv $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fpp $$0 = this.s.b(fpp.e().a(8));
      $$0.a(this.x);
      $$0.a(flw.a(xk.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fdf.b.c.a($$2));
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
            this.a.b(fdf.bv);
         } else {
            this.a.b(fdf.a($$0, $$1));
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
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fjv $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
