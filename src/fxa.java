import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxa extends fuk {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final ggp v = new ggp();
   private final fuk w;
   protected fxe s;
   private ggo x;
   private fos y;
   private fos z;
   private fos A;
   private ggn B;
   private hiy.b C;
   @Nullable
   private hiy.a D;
   private boolean E;

   public fxa(fuk $$0) {
      super(wo.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new ggo(this.m);
         this.x.a();
         this.C = new hiy.b();

         try {
            this.D = new hiy.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fxe(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fos.a(wo.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fos $$1 = this.c(fos.a(wo.c("selectServer.direct"), $$0 -> {
         this.B = new ggn(hfq.a("selectServer.defaultName"), "", ggn.c.c);
         this.m.a(new ftq(this, this::h, this.B));
      }).a(100).a());
      fos $$2 = this.c(fos.a(wo.c("selectServer.add"), $$0 -> {
         this.B = new ggn(hfq.a("selectServer.defaultName"), "", ggn.c.c);
         this.m.a(new fts(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fos.a(wo.c("selectServer.edit"), $$0 -> {
         fxe.a $$1x = this.s.p();
         if ($$1x instanceof fxe.d) {
            ggn $$2x = ((fxe.d)$$1x).c();
            this.B = new ggn($$2x.a, $$2x.b, ggn.c.c);
            this.B.b($$2x);
            this.m.a(new fts(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fos.a(wo.c("selectServer.delete"), $$0 -> {
         fxe.a $$1x = this.s.p();
         if ($$1x instanceof fxe.d) {
            String $$2x = ((fxe.d)$$1x).c().a;
            if ($$2x != null) {
               wo $$3x = wo.c("selectServer.deleteQuestion");
               wo $$4x = wo.a("selectServer.deleteWarning", $$2x);
               wo $$5x = wo.c("selectServer.deleteButton");
               wo $$6x = wn.e;
               this.m.a(new fti(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fos $$3 = this.c(fos.a(wo.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fos $$4 = this.c(fos.a(wn.k, $$0 -> this.aO_()).a(74).a());
      fsk $$5 = fsk.d();
      fsd $$6 = $$5.a(new fsd(308, 20, fsd.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fsl.b(4));
      fsd $$7 = $$5.a(new fsd(308, 20, fsd.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fse.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hix> $$0 = this.C.a();
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
      this.m.a(new fxa(this.w));
   }

   private void c(boolean $$0) {
      fxe.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxe.d) {
         this.x.a(((fxe.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fxe.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxe.d) {
         ggn $$2 = ((fxe.d)$$1).c();
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
         ggn $$1 = this.x.b(this.B.b);
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
         ggn $$1 = this.x.a(this.B.b);
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
         if (fsu.a($$0)) {
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fxe.a $$0 = this.s.p();
      if ($$0 instanceof fxe.d) {
         this.a(((fxe.d)$$0).c());
      } else if ($$0 instanceof fxe.c) {
         hix $$1 = ((fxe.c)$$0).b();
         this.a(new ggn($$1.a(), $$1.b(), ggn.c.a));
      }
   }

   private void a(ggn $$0) {
      ftj.a(this, this.m, ghq.a($$0.b), $$0, false, null);
   }

   public void a(fxe.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fxe.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof fxe.b)) {
         this.z.j = true;
         if ($$0 instanceof fxe.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public ggp F() {
      return this.v;
   }

   public ggo G() {
      return this.x;
   }
}
