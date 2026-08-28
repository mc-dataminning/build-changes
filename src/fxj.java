import javax.annotation.Nullable;

public class fxj extends fxc {
   private static final xv v = xv.c("controls.keybinds.title");
   @Nullable
   public fme a;
   public long u;
   private fxi w;
   private fof x;

   public fxj(fty $$0, fmk $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxi(this, this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      this.x = fof.a(xv.c("controls.resetAll"), $$0x -> {
         for (fme $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fry $$0 = this.s.b(fry.e().a(8));
      $$0.a(this.x);
      $$0.a(fof.a(xu.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(ffn.b.c.a($$2));
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
            this.a.b(ffn.bv);
         } else {
            this.a.b(ffn.a($$0, $$1));
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
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fme $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
