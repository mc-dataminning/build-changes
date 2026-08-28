import javax.annotation.Nullable;

public class gca extends gbt {
   private static final wy v = wy.c("controls.keybinds.title");
   @Nullable
   public fpm a;
   public long u;
   private gbz w;
   private fsv x;

   public gca(fyn $$0, fps $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new gbz(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fsv.a(wy.c("controls.resetAll"), $$0x -> {
         for (fpm $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fwn $$0 = this.s.b(fwn.e().a(8));
      $$0.a(this.x);
      $$0.a(fsv.a(wx.d, $$0x -> this.aL_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fip.b.c.a($$2));
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
            this.a.b(fip.bv);
         } else {
            this.a.b(fip.a($$0, $$1));
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
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fpm $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
