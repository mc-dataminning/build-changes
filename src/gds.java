import javax.annotation.Nullable;

public class gds extends gdl {
   private static final xc v = xc.c("controls.keybinds.title");
   @Nullable
   public frd a;
   public long u;
   private gdr w;
   private fun x;

   public gds(gaf $$0, frj $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new gdr(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fun.a(xc.c("controls.resetAll"), $$0x -> {
         for (frd $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fyf $$0 = this.s.b(fyf.e().a(8));
      $$0.a(this.x);
      $$0.a(fun.a(xb.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fkc.b.c.a($$2));
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
            this.a.b(fkc.bv);
         } else {
            this.a.b(fkc.a($$0, $$1));
         }

         this.a = null;
         this.u = ag.c();
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (frd $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
