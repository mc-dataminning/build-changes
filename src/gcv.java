import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcv extends gad {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gms v = new gms();
   private final gad w;
   protected gcz s;
   private gmr x;
   private ful y;
   private ful z;
   private ful A;
   private gmq B;
   private hpn.b C;
   @Nullable
   private hpn.a D;
   private boolean E;

   public gcv(gad $$0) {
      super(xa.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aS_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gmr(this.m);
         this.x.a();
         this.C = new hpn.b();

         try {
            this.D = new hpn.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gcz(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(ful.a(xa.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      ful $$1 = this.c(ful.a(xa.c("selectServer.direct"), $$0 -> {
         this.B = new gmq(hmi.a("selectServer.defaultName"), "", gmq.c.c);
         this.m.a(new fzj(this, this::h, this.B));
      }).a(100).a());
      ful $$2 = this.c(ful.a(xa.c("selectServer.add"), $$0 -> {
         this.B = new gmq(hmi.a("selectServer.defaultName"), "", gmq.c.c);
         this.m.a(new fzl(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(ful.a(xa.c("selectServer.edit"), $$0 -> {
         gcz.a $$1x = this.s.p();
         if ($$1x instanceof gcz.d) {
            gmq $$2x = ((gcz.d)$$1x).c();
            this.B = new gmq($$2x.a, $$2x.b, gmq.c.c);
            this.B.b($$2x);
            this.m.a(new fzl(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(ful.a(xa.c("selectServer.delete"), $$0 -> {
         gcz.a $$1x = this.s.p();
         if ($$1x instanceof gcz.d) {
            String $$2x = ((gcz.d)$$1x).c().a;
            if ($$2x != null) {
               xa $$3x = xa.c("selectServer.deleteQuestion");
               xa $$4x = xa.a("selectServer.deleteWarning", $$2x);
               xa $$5x = xa.c("selectServer.deleteButton");
               xa $$6x = wz.e;
               this.m.a(new fzb(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ful $$3 = this.c(ful.a(xa.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      ful $$4 = this.c(ful.a(wz.k, $$0 -> this.aP_()).a(74).a());
      fyd $$5 = fyd.d();
      fxw $$6 = $$5.a(new fxw(308, 20, fxw.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fye.b(4));
      fxw $$7 = $$5.a(new fxw(308, 20, fxw.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fxx.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hpm> $$0 = this.C.a();
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

   private void H() {
      this.m.a(new gcv(this.w));
   }

   private void c(boolean $$0) {
      gcz.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gcz.d) {
         this.x.a(((gcz.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gcz.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gcz.d) {
         gmq $$2 = ((gcz.d)$$1).c();
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
         gmq $$1 = this.x.b(this.B.b);
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
         gmq $$1 = this.x.a(this.B.b);
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
         if (fyn.a($$0)) {
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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gcz.a $$0 = this.s.p();
      if ($$0 instanceof gcz.d) {
         this.a(((gcz.d)$$0).c());
      } else if ($$0 instanceof gcz.c) {
         hpm $$1 = ((gcz.c)$$0).b();
         this.a(new gmq($$1.a(), $$1.b(), gmq.c.a));
      }
   }

   private void a(gmq $$0) {
      fzc.a(this, this.m, gnt.a($$0.b), $$0, false, null);
   }

   public void a(gcz.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gcz.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gcz.b)) {
         this.z.j = true;
         if ($$0 instanceof gcz.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gms F() {
      return this.v;
   }

   public gmr G() {
      return this.x;
   }
}
