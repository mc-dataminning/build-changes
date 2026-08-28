import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwh extends ftr {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gfw v = new gfw();
   private final ftr w;
   protected fwl s;
   private gfv x;
   private fny y;
   private fny z;
   private fny A;
   private gfu B;
   private hft.b C;
   @Nullable
   private hft.a D;
   private boolean E;

   public fwh(ftr $$0) {
      super(xk.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aT_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gfv(this.m);
         this.x.a();
         this.C = new hft.b();

         try {
            this.D = new hft.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fwl(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fny.a(xk.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      fny $$1 = this.c(fny.a(xk.c("selectServer.direct"), $$0 -> {
         this.B = new gfu(hcn.a("selectServer.defaultName"), "", gfu.c.c);
         this.m.a(new fsx(this, this::h, this.B));
      }).a(100).a());
      fny $$2 = this.c(fny.a(xk.c("selectServer.add"), $$0 -> {
         this.B = new gfu(hcn.a("selectServer.defaultName"), "", gfu.c.c);
         this.m.a(new fsz(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fny.a(xk.c("selectServer.edit"), $$0 -> {
         fwl.a $$1x = this.s.g();
         if ($$1x instanceof fwl.d) {
            gfu $$2x = ((fwl.d)$$1x).c();
            this.B = new gfu($$2x.a, $$2x.b, gfu.c.c);
            this.B.b($$2x);
            this.m.a(new fsz(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fny.a(xk.c("selectServer.delete"), $$0 -> {
         fwl.a $$1x = this.s.g();
         if ($$1x instanceof fwl.d) {
            String $$2x = ((fwl.d)$$1x).c().a;
            if ($$2x != null) {
               xk $$3x = xk.c("selectServer.deleteQuestion");
               xk $$4x = xk.a("selectServer.deleteWarning", $$2x);
               xk $$5x = xk.c("selectServer.deleteButton");
               xk $$6x = xj.e;
               this.m.a(new fsp(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fny $$3 = this.c(fny.a(xk.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fny $$4 = this.c(fny.a(xj.k, $$0 -> this.aP_()).a(74).a());
      frr $$5 = frr.d();
      frk $$6 = $$5.a(new frk(308, 20, frk.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(frs.b(4));
      frk $$7 = $$5.a(new frk(308, 20, frk.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      frl.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hfs> $$0 = this.C.a();
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
      this.m.a(new fwh(this.w));
   }

   private void c(boolean $$0) {
      fwl.a $$1 = this.s.g();
      if ($$0 && $$1 instanceof fwl.d) {
         this.x.a(((fwl.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fwl.a $$1 = this.s.g();
      if ($$0 && $$1 instanceof fwl.d) {
         gfu $$2 = ((fwl.d)$$1).c();
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
         gfu $$1 = this.x.b(this.B.b);
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
         gfu $$1 = this.x.a(this.B.b);
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
         if (fsb.a($$0)) {
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void l() {
      fwl.a $$0 = this.s.g();
      if ($$0 instanceof fwl.d) {
         this.a(((fwl.d)$$0).c());
      } else if ($$0 instanceof fwl.c) {
         hfs $$1 = ((fwl.c)$$0).b();
         this.a(new gfu($$1.a(), $$1.b(), gfu.c.a));
      }
   }

   private void a(gfu $$0) {
      fsq.a(this, this.m, ggx.a($$0.b), $$0, false, null);
   }

   public void a(fwl.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fwl.a $$0 = this.s.g();
      if ($$0 != null && !($$0 instanceof fwl.b)) {
         this.z.j = true;
         if ($$0 instanceof fwl.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gfw F() {
      return this.v;
   }

   public gfv G() {
      return this.x;
   }
}
