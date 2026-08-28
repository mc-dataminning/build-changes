import javax.annotation.Nullable;

public class fxh extends fxa {
   private static final xv v = xv.c("controls.keybinds.title");
   @Nullable
   public fmc a;
   public long u;
   private fxg w;
   private fod x;

   public fxh(ftw $$0, fmi $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new fxg(this, this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      this.x = fod.a(xv.c("controls.resetAll"), $$0x -> {
         for (fmc $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      frw $$0 = this.s.b(frw.e().a(8));
      $$0.a(this.x);
      $$0.a(fod.a(xu.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(ffl.b.c.a($$2));
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
            this.a.b(ffl.bv);
         } else {
            this.a.b(ffl.a($$0, $$1));
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
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fmc $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
