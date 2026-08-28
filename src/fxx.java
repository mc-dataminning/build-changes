import javax.annotation.Nullable;

public class fxx extends fxq {
   private static final wp v = wp.c("controls.keybinds.title");
   @Nullable
   public fli a;
   public long u;
   private fxw w;
   private fou x;

   public fxx(fum $$0, flo $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxw(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fou.a(wp.c("controls.resetAll"), $$0x -> {
         for (fli $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fsm $$0 = this.s.b(fsm.e().a(8));
      $$0.a(this.x);
      $$0.a(fou.a(wo.d, $$0x -> this.aO_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(feq.b.c.a($$2));
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
            this.a.b(feq.bv);
         } else {
            this.a.b(feq.a($$0, $$1));
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
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fli $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
