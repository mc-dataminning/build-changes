import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwm extends ftw {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gfz v = new gfz();
   private final ftw w;
   protected fwq s;
   private gfy x;
   private fod y;
   private fod z;
   private fod A;
   private gfx B;
   private hfw.b C;
   @Nullable
   private hfw.a D;
   private boolean E;

   public fwm(ftw $$0) {
      super(xv.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aT_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gfy(this.m);
         this.x.a();
         this.C = new hfw.b();

         try {
            this.D = new hfw.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fwq(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fod.a(xv.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      fod $$1 = this.c(fod.a(xv.c("selectServer.direct"), $$0 -> {
         this.B = new gfx(hcq.a("selectServer.defaultName"), "", gfx.c.c);
         this.m.a(new ftc(this, this::h, this.B));
      }).a(100).a());
      fod $$2 = this.c(fod.a(xv.c("selectServer.add"), $$0 -> {
         this.B = new gfx(hcq.a("selectServer.defaultName"), "", gfx.c.c);
         this.m.a(new fte(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fod.a(xv.c("selectServer.edit"), $$0 -> {
         fwq.a $$1x = this.s.g();
         if ($$1x instanceof fwq.d) {
            gfx $$2x = ((fwq.d)$$1x).c();
            this.B = new gfx($$2x.a, $$2x.b, gfx.c.c);
            this.B.b($$2x);
            this.m.a(new fte(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fod.a(xv.c("selectServer.delete"), $$0 -> {
         fwq.a $$1x = this.s.g();
         if ($$1x instanceof fwq.d) {
            String $$2x = ((fwq.d)$$1x).c().a;
            if ($$2x != null) {
               xv $$3x = xv.c("selectServer.deleteQuestion");
               xv $$4x = xv.a("selectServer.deleteWarning", $$2x);
               xv $$5x = xv.c("selectServer.deleteButton");
               xv $$6x = xu.e;
               this.m.a(new fsu(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fod $$3 = this.c(fod.a(xv.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fod $$4 = this.c(fod.a(xu.k, $$0 -> this.aP_()).a(74).a());
      frw $$5 = frw.d();
      frp $$6 = $$5.a(new frp(308, 20, frp.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(frx.b(4));
      frp $$7 = $$5.a(new frp(308, 20, frp.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      frq.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hfv> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aJ_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void J() {
      this.m.a(new fwm(this.w));
   }

   private void c(boolean $$0) {
      fwq.a $$1 = this.s.g();
      if ($$0 && $$1 instanceof fwq.d) {
         this.x.a(((fwq.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fwq.a $$1 = this.s.g();
      if ($$0 && $$1 instanceof fwq.d) {
         gfx $$2 = ((fwq.d)$$1).c();
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
         gfx $$1 = this.x.b(this.B.b);
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
         gfx $$1 = this.x.a(this.B.b);
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
         this.J();
         return true;
      } else if (this.s.g() != null) {
         if (fsg.a($$0)) {
            this.l();
            return true;
         } else {
            return this.s.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void l() {
      fwq.a $$0 = this.s.g();
      if ($$0 instanceof fwq.d) {
         this.a(((fwq.d)$$0).c());
      } else if ($$0 instanceof fwq.c) {
         hfv $$1 = ((fwq.c)$$0).b();
         this.a(new gfx($$1.a(), $$1.b(), gfx.c.a));
      }
   }

   private void a(gfx $$0) {
      fsv.a(this, this.m, gha.a($$0.b), $$0, false, null);
   }

   public void a(fwq.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fwq.a $$0 = this.s.g();
      if ($$0 != null && !($$0 instanceof fwq.b)) {
         this.z.j = true;
         if ($$0 instanceof fwq.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gfz F() {
      return this.v;
   }

   public gfy G() {
      return this.x;
   }
}
