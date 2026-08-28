import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fum extends frw {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gdx v = new gdx();
   private final frw w;
   protected fuq s;
   private gdw x;
   private fmd y;
   private fmd z;
   private fmd A;
   private gdv B;
   private hdr.b C;
   @Nullable
   private hdr.a D;
   private boolean E;

   public fum(frw $$0) {
      super(xj.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gdw(this.m);
         this.x.a();
         this.C = new hdr.b();

         try {
            this.D = new hdr.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fuq(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fmd.a(xj.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fmd $$1 = this.c(fmd.a(xj.c("selectServer.direct"), $$0 -> {
         this.B = new gdv(hal.a("selectServer.defaultName"), "", gdv.c.c);
         this.m.a(new frc(this, this::h, this.B));
      }).a(100).a());
      fmd $$2 = this.c(fmd.a(xj.c("selectServer.add"), $$0 -> {
         this.B = new gdv(hal.a("selectServer.defaultName"), "", gdv.c.c);
         this.m.a(new fre(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fmd.a(xj.c("selectServer.edit"), $$0 -> {
         fuq.a $$1x = this.s.h();
         if ($$1x instanceof fuq.d) {
            gdv $$2x = ((fuq.d)$$1x).c();
            this.B = new gdv($$2x.a, $$2x.b, gdv.c.c);
            this.B.b($$2x);
            this.m.a(new fre(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fmd.a(xj.c("selectServer.delete"), $$0 -> {
         fuq.a $$1x = this.s.h();
         if ($$1x instanceof fuq.d) {
            String $$2x = ((fuq.d)$$1x).c().a;
            if ($$2x != null) {
               xj $$3x = xj.c("selectServer.deleteQuestion");
               xj $$4x = xj.a("selectServer.deleteWarning", $$2x);
               xj $$5x = xj.c("selectServer.deleteButton");
               xj $$6x = xi.e;
               this.m.a(new fqu(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fmd $$3 = this.c(fmd.a(xj.c("selectServer.refresh"), $$0 -> this.K()).a(74).a());
      fmd $$4 = this.c(fmd.a(xi.k, $$0 -> this.aO_()).a(74).a());
      fpw $$5 = fpw.d();
      fpp $$6 = $$5.a(new fpp(308, 20, fpp.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fpx.b(4));
      fpp $$7 = $$5.a(new fpp(308, 20, fpp.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fpq.a($$5, 0, this.o - 64, this.n, 64);
      this.F();
   }

   @Override
   public void aO_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hdq> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void j() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.c();
   }

   private void K() {
      this.m.a(new fum(this.w));
   }

   private void c(boolean $$0) {
      fuq.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fuq.d) {
         this.x.a(((fuq.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fuq.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fuq.d) {
         gdv $$2 = ((fuq.d)$$1).c();
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
         gdv $$1 = this.x.b(this.B.b);
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
         gdv $$1 = this.x.a(this.B.b);
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
         this.K();
         return true;
      } else if (this.s.h() != null) {
         if (fqg.a($$0)) {
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
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fuq.a $$0 = this.s.h();
      if ($$0 instanceof fuq.d) {
         this.a(((fuq.d)$$0).c());
      } else if ($$0 instanceof fuq.c) {
         hdq $$1 = ((fuq.c)$$0).b();
         this.a(new gdv($$1.a(), $$1.b(), gdv.c.a));
      }
   }

   private void a(gdv $$0) {
      fqv.a(this, this.m, gey.a($$0.b), $$0, false, null);
   }

   public void a(fuq.a $$0) {
      this.s.a($$0);
      this.F();
   }

   protected void F() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fuq.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fuq.b)) {
         this.z.j = true;
         if ($$0 instanceof fuq.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gdx G() {
      return this.v;
   }

   public gdw J() {
      return this.x;
   }
}
