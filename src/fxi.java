import javax.annotation.Nullable;

public class fxi extends fxb {
   private static final xv v = xv.c("controls.keybinds.title");
   @Nullable
   public fmd a;
   public long u;
   private fxh w;
   private foe x;

   public fxi(ftx $$0, fmj $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxh(this, this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      this.x = foe.a(xv.c("controls.resetAll"), $$0x -> {
         for (fmd $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      frx $$0 = this.s.b(frx.e().a(8));
      $$0.a(this.x);
      $$0.a(foe.a(xu.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(ffm.b.c.a($$2));
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
            this.a.b(ffm.bv);
         } else {
            this.a.b(ffm.a($$0, $$1));
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
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fmd $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
