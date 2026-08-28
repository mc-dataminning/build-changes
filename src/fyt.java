import javax.annotation.Nullable;

public class fyt extends fym {
   private static final wp v = wp.c("controls.keybinds.title");
   @Nullable
   public fme a;
   public long u;
   private fys w;
   private fpq x;

   public fyt(fvi $$0, fmk $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fys(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fpq.a(wp.c("controls.resetAll"), $$0x -> {
         for (fme $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fti $$0 = this.s.b(fti.e().a(8));
      $$0.a(this.x);
      $$0.a(fpq.a(wo.d, $$0x -> this.aO_()).a());
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
         this.u = af.c();
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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
