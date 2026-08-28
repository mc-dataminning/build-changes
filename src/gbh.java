import javax.annotation.Nullable;

public class gbh extends gba {
   private static final wy v = wy.c("controls.keybinds.title");
   @Nullable
   public fop a;
   public long u;
   private gbg w;
   private fsc x;

   public gbh(fxu $$0, fow $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new gbg(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = fsc.a(wy.c("controls.resetAll"), $$0x -> {
         for (fop $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fvu $$0 = this.s.b(fvu.e().a(8));
      $$0.a(this.x);
      $$0.a(fsc.a(wx.d, $$0x -> this.aK_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fhx.b.c.a($$2));
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
            this.a.b(fhx.bv);
         } else {
            this.a.b(fhx.a($$0, $$1));
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
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fop $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
