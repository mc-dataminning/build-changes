import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyx extends fwf {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final giq v = new giq();
   private final fwf w;
   protected fzb s;
   private gip x;
   private fqn y;
   private fqn z;
   private fqn A;
   private gio B;
   private hlf.b C;
   @Nullable
   private hlf.a D;
   private boolean E;

   public fyx(fwf $$0) {
      super(wv.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aN_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gip(this.m);
         this.x.a();
         this.C = new hlf.b();

         try {
            this.D = new hlf.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fzb(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fqn.a(wv.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fqn $$1 = this.c(fqn.a(wv.c("selectServer.direct"), $$0 -> {
         this.B = new gio(hia.a("selectServer.defaultName"), "", gio.c.c);
         this.m.a(new fvl(this, this::h, this.B));
      }).a(100).a());
      fqn $$2 = this.c(fqn.a(wv.c("selectServer.add"), $$0 -> {
         this.B = new gio(hia.a("selectServer.defaultName"), "", gio.c.c);
         this.m.a(new fvn(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fqn.a(wv.c("selectServer.edit"), $$0 -> {
         fzb.a $$1x = this.s.p();
         if ($$1x instanceof fzb.d) {
            gio $$2x = ((fzb.d)$$1x).c();
            this.B = new gio($$2x.a, $$2x.b, gio.c.c);
            this.B.b($$2x);
            this.m.a(new fvn(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fqn.a(wv.c("selectServer.delete"), $$0 -> {
         fzb.a $$1x = this.s.p();
         if ($$1x instanceof fzb.d) {
            String $$2x = ((fzb.d)$$1x).c().a;
            if ($$2x != null) {
               wv $$3x = wv.c("selectServer.deleteQuestion");
               wv $$4x = wv.a("selectServer.deleteWarning", $$2x);
               wv $$5x = wv.c("selectServer.deleteButton");
               wv $$6x = wu.e;
               this.m.a(new fvd(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fqn $$3 = this.c(fqn.a(wv.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fqn $$4 = this.c(fqn.a(wu.k, $$0 -> this.aK_()).a(74).a());
      fuf $$5 = fuf.d();
      fty $$6 = $$5.a(new fty(308, 20, fty.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fug.b(4));
      fty $$7 = $$5.a(new fty(308, 20, fty.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      ftz.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aK_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hle> $$0 = this.C.a();
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
      this.m.a(new fyx(this.w));
   }

   private void c(boolean $$0) {
      fzb.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fzb.d) {
         this.x.a(((fzb.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fzb.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fzb.d) {
         gio $$2 = ((fzb.d)$$1).c();
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
         gio $$1 = this.x.b(this.B.b);
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
         gio $$1 = this.x.a(this.B.b);
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
         if (fup.a($$0)) {
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fzb.a $$0 = this.s.p();
      if ($$0 instanceof fzb.d) {
         this.a(((fzb.d)$$0).c());
      } else if ($$0 instanceof fzb.c) {
         hle $$1 = ((fzb.c)$$0).b();
         this.a(new gio($$1.a(), $$1.b(), gio.c.a));
      }
   }

   private void a(gio $$0) {
      fve.a(this, this.m, gjr.a($$0.b), $$0, false, null);
   }

   public void a(fzb.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fzb.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof fzb.b)) {
         this.z.j = true;
         if ($$0 instanceof fzb.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public giq F() {
      return this.v;
   }

   public gip G() {
      return this.x;
   }
}
