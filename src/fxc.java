import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxc extends fum {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final ggr v = new ggr();
   private final fum w;
   protected fxg s;
   private ggq x;
   private fou y;
   private fou z;
   private fou A;
   private ggp B;
   private hjg.b C;
   @Nullable
   private hjg.a D;
   private boolean E;

   public fxc(fum $$0) {
      super(wp.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new ggq(this.m);
         this.x.a();
         this.C = new hjg.b();

         try {
            this.D = new hjg.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fxg(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fou.a(wp.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fou $$1 = this.c(fou.a(wp.c("selectServer.direct"), $$0 -> {
         this.B = new ggp(hgb.a("selectServer.defaultName"), "", ggp.c.c);
         this.m.a(new fts(this, this::h, this.B));
      }).a(100).a());
      fou $$2 = this.c(fou.a(wp.c("selectServer.add"), $$0 -> {
         this.B = new ggp(hgb.a("selectServer.defaultName"), "", ggp.c.c);
         this.m.a(new ftu(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fou.a(wp.c("selectServer.edit"), $$0 -> {
         fxg.a $$1x = this.s.p();
         if ($$1x instanceof fxg.d) {
            ggp $$2x = ((fxg.d)$$1x).c();
            this.B = new ggp($$2x.a, $$2x.b, ggp.c.c);
            this.B.b($$2x);
            this.m.a(new ftu(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fou.a(wp.c("selectServer.delete"), $$0 -> {
         fxg.a $$1x = this.s.p();
         if ($$1x instanceof fxg.d) {
            String $$2x = ((fxg.d)$$1x).c().a;
            if ($$2x != null) {
               wp $$3x = wp.c("selectServer.deleteQuestion");
               wp $$4x = wp.a("selectServer.deleteWarning", $$2x);
               wp $$5x = wp.c("selectServer.deleteButton");
               wp $$6x = wo.e;
               this.m.a(new ftk(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fou $$3 = this.c(fou.a(wp.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fou $$4 = this.c(fou.a(wo.k, $$0 -> this.aO_()).a(74).a());
      fsm $$5 = fsm.d();
      fsf $$6 = $$5.a(new fsf(308, 20, fsf.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fsn.b(4));
      fsf $$7 = $$5.a(new fsf(308, 20, fsf.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fsg.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hjf> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aI_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new fxc(this.w));
   }

   private void c(boolean $$0) {
      fxg.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxg.d) {
         this.x.a(((fxg.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fxg.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxg.d) {
         ggp $$2 = ((fxg.d)$$1).c();
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
         ggp $$1 = this.x.b(this.B.b);
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
         ggp $$1 = this.x.a(this.B.b);
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
         if (fsw.a($$0)) {
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
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fxg.a $$0 = this.s.p();
      if ($$0 instanceof fxg.d) {
         this.a(((fxg.d)$$0).c());
      } else if ($$0 instanceof fxg.c) {
         hjf $$1 = ((fxg.c)$$0).b();
         this.a(new ggp($$1.a(), $$1.b(), ggp.c.a));
      }
   }

   private void a(ggp $$0) {
      ftl.a(this, this.m, ghs.a($$0.b), $$0, false, null);
   }

   public void a(fxg.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fxg.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof fxg.b)) {
         this.z.j = true;
         if ($$0 instanceof fxg.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public ggr F() {
      return this.v;
   }

   public ggq G() {
      return this.x;
   }
}
