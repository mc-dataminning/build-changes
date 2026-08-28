import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbf extends fyn {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final glc v = new glc();
   private final fyn w;
   protected gbj s;
   private glb x;
   private fsv y;
   private fsv z;
   private fsv A;
   private gla B;
   private hnx.b C;
   @Nullable
   private hnx.a D;
   private boolean E;

   public gbf(fyn $$0) {
      super(wy.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aO_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new glb(this.m);
         this.x.a();
         this.C = new hnx.b();

         try {
            this.D = new hnx.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gbj(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fsv.a(wy.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fsv $$1 = this.c(fsv.a(wy.c("selectServer.direct"), $$0 -> {
         this.B = new gla(hkr.a("selectServer.defaultName"), "", gla.c.c);
         this.m.a(new fxt(this, this::h, this.B));
      }).a(100).a());
      fsv $$2 = this.c(fsv.a(wy.c("selectServer.add"), $$0 -> {
         this.B = new gla(hkr.a("selectServer.defaultName"), "", gla.c.c);
         this.m.a(new fxv(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fsv.a(wy.c("selectServer.edit"), $$0 -> {
         gbj.a $$1x = this.s.p();
         if ($$1x instanceof gbj.d) {
            gla $$2x = ((gbj.d)$$1x).c();
            this.B = new gla($$2x.a, $$2x.b, gla.c.c);
            this.B.b($$2x);
            this.m.a(new fxv(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fsv.a(wy.c("selectServer.delete"), $$0 -> {
         gbj.a $$1x = this.s.p();
         if ($$1x instanceof gbj.d) {
            String $$2x = ((gbj.d)$$1x).c().a;
            if ($$2x != null) {
               wy $$3x = wy.c("selectServer.deleteQuestion");
               wy $$4x = wy.a("selectServer.deleteWarning", $$2x);
               wy $$5x = wy.c("selectServer.deleteButton");
               wy $$6x = wx.e;
               this.m.a(new fxl(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fsv $$3 = this.c(fsv.a(wy.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fsv $$4 = this.c(fsv.a(wx.k, $$0 -> this.aL_()).a(74).a());
      fwn $$5 = fwn.d();
      fwg $$6 = $$5.a(new fwg(308, 20, fwg.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fwo.b(4));
      fwg $$7 = $$5.a(new fwg(308, 20, fwg.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fwh.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hnw> $$0 = this.C.a();
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
      this.m.a(new gbf(this.w));
   }

   private void c(boolean $$0) {
      gbj.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gbj.d) {
         this.x.a(((gbj.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gbj.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gbj.d) {
         gla $$2 = ((gbj.d)$$1).c();
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
         gla $$1 = this.x.b(this.B.b);
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
         gla $$1 = this.x.a(this.B.b);
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
         if (fwx.a($$0)) {
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
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gbj.a $$0 = this.s.p();
      if ($$0 instanceof gbj.d) {
         this.a(((gbj.d)$$0).c());
      } else if ($$0 instanceof gbj.c) {
         hnw $$1 = ((gbj.c)$$0).b();
         this.a(new gla($$1.a(), $$1.b(), gla.c.a));
      }
   }

   private void a(gla $$0) {
      fxm.a(this, this.m, gmd.a($$0.b), $$0, false, null);
   }

   public void a(gbj.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gbj.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gbj.b)) {
         this.z.j = true;
         if ($$0 instanceof gbj.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public glc F() {
      return this.v;
   }

   public glb G() {
      return this.x;
   }
}
