import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gci extends fzq {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gmf v = new gmf();
   private final fzq w;
   protected gcm s;
   private gme x;
   private fty y;
   private fty z;
   private fty A;
   private gmd B;
   private hpd.b C;
   @Nullable
   private hpd.a D;
   private boolean E;

   public gci(fzq $$0) {
      super(xg.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aT_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gme(this.m);
         this.x.a();
         this.C = new hpd.b();

         try {
            this.D = new hpd.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gcm(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fty.a(xg.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fty $$1 = this.c(fty.a(xg.c("selectServer.direct"), $$0 -> {
         this.B = new gmd(hly.a("selectServer.defaultName"), "", gmd.c.c);
         this.m.a(new fyw(this, this::h, this.B));
      }).a(100).a());
      fty $$2 = this.c(fty.a(xg.c("selectServer.add"), $$0 -> {
         this.B = new gmd(hly.a("selectServer.defaultName"), "", gmd.c.c);
         this.m.a(new fyy(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fty.a(xg.c("selectServer.edit"), $$0 -> {
         gcm.a $$1x = this.s.p();
         if ($$1x instanceof gcm.d) {
            gmd $$2x = ((gcm.d)$$1x).c();
            this.B = new gmd($$2x.a, $$2x.b, gmd.c.c);
            this.B.b($$2x);
            this.m.a(new fyy(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fty.a(xg.c("selectServer.delete"), $$0 -> {
         gcm.a $$1x = this.s.p();
         if ($$1x instanceof gcm.d) {
            String $$2x = ((gcm.d)$$1x).c().a;
            if ($$2x != null) {
               xg $$3x = xg.c("selectServer.deleteQuestion");
               xg $$4x = xg.a("selectServer.deleteWarning", $$2x);
               xg $$5x = xg.c("selectServer.deleteButton");
               xg $$6x = xf.e;
               this.m.a(new fyo(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fty $$3 = this.c(fty.a(xg.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fty $$4 = this.c(fty.a(xf.k, $$0 -> this.aQ_()).a(74).a());
      fxq $$5 = fxq.d();
      fxj $$6 = $$5.a(new fxj(308, 20, fxj.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fxr.b(4));
      fxj $$7 = $$5.a(new fxj(308, 20, fxj.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fxk.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aQ_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hpc> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aK_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gci(this.w));
   }

   private void c(boolean $$0) {
      gcm.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gcm.d) {
         this.x.a(((gcm.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gcm.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gcm.d) {
         gmd $$2 = ((gcm.d)$$1).c();
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
         gmd $$1 = this.x.b(this.B.b);
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
         gmd $$1 = this.x.a(this.B.b);
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
         if (fya.a($$0)) {
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
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gcm.a $$0 = this.s.p();
      if ($$0 instanceof gcm.d) {
         this.a(((gcm.d)$$0).c());
      } else if ($$0 instanceof gcm.c) {
         hpc $$1 = ((gcm.c)$$0).b();
         this.a(new gmd($$1.a(), $$1.b(), gmd.c.a));
      }
   }

   private void a(gmd $$0) {
      fyp.a(this, this.m, gng.a($$0.b), $$0, false, null);
   }

   public void a(gcm.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gcm.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gcm.b)) {
         this.z.j = true;
         if ($$0 instanceof gcm.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gmf F() {
      return this.v;
   }

   public gme G() {
      return this.x;
   }
}
