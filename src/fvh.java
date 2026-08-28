import javax.annotation.Nullable;

public class fvh extends fva {
   private static final xj v = xj.c("controls.keybinds.title");
   @Nullable
   public fkc a;
   public long u;
   private fvg w;
   private fmd x;

   public fvh(frw $$0, fki $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void G() {
      this.w = this.s.c(new fvg(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void F() {
      this.x = fmd.a(xj.c("controls.resetAll"), $$0x -> {
         for (fkc $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fpw $$0 = this.s.b(fpw.e().a(8));
      $$0.a(this.x);
      $$0.a(fmd.a(xi.d, $$0x -> this.aO_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fdm.b.c.a($$2));
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
            this.a.b(fdm.bv);
         } else {
            this.a.b(fdm.a($$0, $$1));
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
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fkc $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
