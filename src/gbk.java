import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbk extends fys {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final glh v = new glh();
   private final fys w;
   protected gbo s;
   private glg x;
   private fta y;
   private fta z;
   private fta A;
   private glf B;
   private hoe.b C;
   @Nullable
   private hoe.a D;
   private boolean E;

   public gbk(fys $$0) {
      super(wy.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aO_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new glg(this.m);
         this.x.a();
         this.C = new hoe.b();

         try {
            this.D = new hoe.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gbo(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fta.a(wy.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fta $$1 = this.c(fta.a(wy.c("selectServer.direct"), $$0 -> {
         this.B = new glf(hky.a("selectServer.defaultName"), "", glf.c.c);
         this.m.a(new fxy(this, this::h, this.B));
      }).a(100).a());
      fta $$2 = this.c(fta.a(wy.c("selectServer.add"), $$0 -> {
         this.B = new glf(hky.a("selectServer.defaultName"), "", glf.c.c);
         this.m.a(new fya(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fta.a(wy.c("selectServer.edit"), $$0 -> {
         gbo.a $$1x = this.s.p();
         if ($$1x instanceof gbo.d) {
            glf $$2x = ((gbo.d)$$1x).c();
            this.B = new glf($$2x.a, $$2x.b, glf.c.c);
            this.B.b($$2x);
            this.m.a(new fya(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fta.a(wy.c("selectServer.delete"), $$0 -> {
         gbo.a $$1x = this.s.p();
         if ($$1x instanceof gbo.d) {
            String $$2x = ((gbo.d)$$1x).c().a;
            if ($$2x != null) {
               wy $$3x = wy.c("selectServer.deleteQuestion");
               wy $$4x = wy.a("selectServer.deleteWarning", $$2x);
               wy $$5x = wy.c("selectServer.deleteButton");
               wy $$6x = wx.e;
               this.m.a(new fxq(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fta $$3 = this.c(fta.a(wy.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fta $$4 = this.c(fta.a(wx.k, $$0 -> this.aL_()).a(74).a());
      fws $$5 = fws.d();
      fwl $$6 = $$5.a(new fwl(308, 20, fwl.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fwt.b(4));
      fwl $$7 = $$5.a(new fwl(308, 20, fwl.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fwm.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hod> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aF_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gbk(this.w));
   }

   private void c(boolean $$0) {
      gbo.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gbo.d) {
         this.x.a(((gbo.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gbo.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gbo.d) {
         glf $$2 = ((gbo.d)$$1).c();
         $$2.a = this.B.a;
         $$2.b = this.B.b;
         $$2.b(this.B);
         this.x.b();
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         glf $$1 = this.x.b(this.B.b);
         if ($$1 != null) {
            $$1.a(this.B);
            this.x.b();
         } else {
            this.x.a(this.B, false);
            this.x.b();
         }

         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void h(boolean $$0) {
      if ($$0) {
         glf $$1 = this.x.a(this.B.b);
         if ($$1 == null) {
            this.x.a(this.B, true);
            this.x.b();
            this.a(this.B);
         } else {
            this.a($$1);
         }
      } else {
         this.m.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.H();
         return true;
      } else if (this.s.p() != null) {
         if (fxc.a($$0)) {
            this.m();
            return true;
         } else {
            return this.s.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gbo.a $$0 = this.s.p();
      if ($$0 instanceof gbo.d) {
         this.a(((gbo.d)$$0).c());
      } else if ($$0 instanceof gbo.c) {
         hod $$1 = ((gbo.c)$$0).b();
         this.a(new glf($$1.a(), $$1.b(), glf.c.a));
      }
   }

   private void a(glf $$0) {
      fxr.a(this, this.m, gmi.a($$0.b), $$0, false, null);
   }

   public void a(gbo.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gbo.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gbo.b)) {
         this.z.j = true;
         if ($$0 instanceof gbo.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public glh F() {
      return this.v;
   }

   public glg G() {
      return this.x;
   }
}
