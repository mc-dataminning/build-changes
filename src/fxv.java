import javax.annotation.Nullable;

public class fxv extends fxo {
   private static final wo v = wo.c("controls.keybinds.title");
   @Nullable
   public flh a;
   public long u;
   private fxu w;
   private fos x;

   public fxv(fuk $$0, fln $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxu(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fos.a(wo.c("controls.resetAll"), $$0x -> {
         for (flh $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fsk $$0 = this.s.b(fsk.e().a(8));
      $$0.a(this.x);
      $$0.a(fos.a(wn.d, $$0x -> this.aO_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fep.b.c.a($$2));
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
            this.a.b(fep.bv);
         } else {
            this.a.b(fep.a($$0, $$1));
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (flh $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
