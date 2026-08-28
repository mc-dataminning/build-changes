import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwy extends fui {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final ggn v = new ggn();
   private final fui w;
   protected fxc s;
   private ggm x;
   private fop y;
   private fop z;
   private fop A;
   private ggl B;
   private hiz.b C;
   @Nullable
   private hiz.a D;
   private boolean E;

   public fwy(fui $$0) {
      super(wo.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new ggm(this.m);
         this.x.a();
         this.C = new hiz.b();

         try {
            this.D = new hiz.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fxc(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fop.a(wo.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fop $$1 = this.c(fop.a(wo.c("selectServer.direct"), $$0 -> {
         this.B = new ggl(hfu.a("selectServer.defaultName"), "", ggl.c.c);
         this.m.a(new fto(this, this::h, this.B));
      }).a(100).a());
      fop $$2 = this.c(fop.a(wo.c("selectServer.add"), $$0 -> {
         this.B = new ggl(hfu.a("selectServer.defaultName"), "", ggl.c.c);
         this.m.a(new ftq(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fop.a(wo.c("selectServer.edit"), $$0 -> {
         fxc.a $$1x = this.s.p();
         if ($$1x instanceof fxc.d) {
            ggl $$2x = ((fxc.d)$$1x).c();
            this.B = new ggl($$2x.a, $$2x.b, ggl.c.c);
            this.B.b($$2x);
            this.m.a(new ftq(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fop.a(wo.c("selectServer.delete"), $$0 -> {
         fxc.a $$1x = this.s.p();
         if ($$1x instanceof fxc.d) {
            String $$2x = ((fxc.d)$$1x).c().a;
            if ($$2x != null) {
               wo $$3x = wo.c("selectServer.deleteQuestion");
               wo $$4x = wo.a("selectServer.deleteWarning", $$2x);
               wo $$5x = wo.c("selectServer.deleteButton");
               wo $$6x = wn.e;
               this.m.a(new ftg(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fop $$3 = this.c(fop.a(wo.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fop $$4 = this.c(fop.a(wn.k, $$0 -> this.aO_()).a(74).a());
      fsi $$5 = fsi.d();
      fsb $$6 = $$5.a(new fsb(308, 20, fsb.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fsj.b(4));
      fsb $$7 = $$5.a(new fsb(308, 20, fsb.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fsc.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hiy> $$0 = this.C.a();
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
      this.m.a(new fwy(this.w));
   }

   private void c(boolean $$0) {
      fxc.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxc.d) {
         this.x.a(((fxc.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fxc.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxc.d) {
         ggl $$2 = ((fxc.d)$$1).c();
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
         ggl $$1 = this.x.b(this.B.b);
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
         ggl $$1 = this.x.a(this.B.b);
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
         if (fss.a($$0)) {
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
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fxc.a $$0 = this.s.p();
      if ($$0 instanceof fxc.d) {
         this.a(((fxc.d)$$0).c());
      } else if ($$0 instanceof fxc.c) {
         hiy $$1 = ((fxc.c)$$0).b();
         this.a(new ggl($$1.a(), $$1.b(), ggl.c.a));
      }
   }

   private void a(ggl $$0) {
      fth.a(this, this.m, gho.a($$0.b), $$0, false, null);
   }

   public void a(fxc.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fxc.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof fxc.b)) {
         this.z.j = true;
         if ($$0 instanceof fxc.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public ggn F() {
      return this.v;
   }

   public ggm G() {
      return this.x;
   }
}
