import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gaa extends fxi {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gju v = new gju();
   private final fxi w;
   protected gae s;
   private gjt x;
   private frq y;
   private frq z;
   private frq A;
   private gjs B;
   private hmm.b C;
   @Nullable
   private hmm.a D;
   private boolean E;

   public gaa(fxi $$0) {
      super(ww.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aN_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gjt(this.m);
         this.x.a();
         this.C = new hmm.b();

         try {
            this.D = new hmm.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gae(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(frq.a(ww.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      frq $$1 = this.c(frq.a(ww.c("selectServer.direct"), $$0 -> {
         this.B = new gjs(hjg.a("selectServer.defaultName"), "", gjs.c.c);
         this.m.a(new fwo(this, this::h, this.B));
      }).a(100).a());
      frq $$2 = this.c(frq.a(ww.c("selectServer.add"), $$0 -> {
         this.B = new gjs(hjg.a("selectServer.defaultName"), "", gjs.c.c);
         this.m.a(new fwq(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(frq.a(ww.c("selectServer.edit"), $$0 -> {
         gae.a $$1x = this.s.p();
         if ($$1x instanceof gae.d) {
            gjs $$2x = ((gae.d)$$1x).c();
            this.B = new gjs($$2x.a, $$2x.b, gjs.c.c);
            this.B.b($$2x);
            this.m.a(new fwq(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(frq.a(ww.c("selectServer.delete"), $$0 -> {
         gae.a $$1x = this.s.p();
         if ($$1x instanceof gae.d) {
            String $$2x = ((gae.d)$$1x).c().a;
            if ($$2x != null) {
               ww $$3x = ww.c("selectServer.deleteQuestion");
               ww $$4x = ww.a("selectServer.deleteWarning", $$2x);
               ww $$5x = ww.c("selectServer.deleteButton");
               ww $$6x = wv.e;
               this.m.a(new fwg(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      frq $$3 = this.c(frq.a(ww.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      frq $$4 = this.c(frq.a(wv.k, $$0 -> this.aK_()).a(74).a());
      fvi $$5 = fvi.d();
      fvb $$6 = $$5.a(new fvb(308, 20, fvb.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fvj.b(4));
      fvb $$7 = $$5.a(new fvb(308, 20, fvb.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fvc.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aK_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hml> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aE_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gaa(this.w));
   }

   private void c(boolean $$0) {
      gae.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gae.d) {
         this.x.a(((gae.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gae.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gae.d) {
         gjs $$2 = ((gae.d)$$1).c();
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
         gjs $$1 = this.x.b(this.B.b);
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
         gjs $$1 = this.x.a(this.B.b);
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
         if (fvs.a($$0)) {
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
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gae.a $$0 = this.s.p();
      if ($$0 instanceof gae.d) {
         this.a(((gae.d)$$0).c());
      } else if ($$0 instanceof gae.c) {
         hml $$1 = ((gae.c)$$0).b();
         this.a(new gjs($$1.a(), $$1.b(), gjs.c.a));
      }
   }

   private void a(gjs $$0) {
      fwh.a(this, this.m, gkv.a($$0.b), $$0, false, null);
   }

   public void a(gae.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gae.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gae.b)) {
         this.z.j = true;
         if ($$0 instanceof gae.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gju F() {
      return this.v;
   }

   public gjt G() {
      return this.x;
   }
}
