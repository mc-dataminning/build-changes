import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fvu<B extends gec.a<?>> extends frp {
   private static final xl C = xl.c("gui.abuseReport.report_sent_msg");
   private static final xl D = xl.c("gui.abuseReport.sending.title").a(n.r);
   private static final xl E = xl.c("gui.abuseReport.sent.title").a(n.r);
   private static final xl F = xl.c("gui.abuseReport.error.title").a(n.r);
   private static final xl G = xl.c("gui.abuseReport.send.generic_error");
   protected static final xl a = xl.c("gui.abuseReport.send");
   protected static final xl b = xl.c("gui.abuseReport.observed_what");
   protected static final xl c = xl.c("gui.abuseReport.select_reason");
   private static final xl H = xl.c("gui.abuseReport.describe");
   protected static final xl d = xl.c("gui.abuseReport.more_comments");
   private static final xl I = xl.c("gui.abuseReport.comments");
   private static final xl J = xl.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final frp x;
   protected final geg y;
   protected final fpp z = fpp.d().a(8);
   protected B A;
   private fly L;
   protected flw B;

   protected fvu(xl $$0, frp $$1, geg $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fmo a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fmo $$4 = new fmo(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aS_() {
      this.z.c().b();
      this.m();
      this.D();
      this.E();
      this.F();
      this.z.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fnd(this.l, this.p));
   }

   protected abstract void D();

   protected void E() {
      this.L = this.z.a(fly.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.F();
      }).a());
      fpp $$0 = this.z.a(fpp.e().a(8));
      $$0.a(flw.a(xk.k, $$0x -> this.aP_()).a(120).a());
      this.B = $$0.a(flw.a(a, $$0x -> this.G()).a(120).a());
   }

   protected void F() {
      gec.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gec.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fpj.a(this.z, this.H());
   }

   protected void G() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(frb.a(D, xk.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.J();
            } else {
               if ($$1x instanceof CancellationException) {
                  return null;
               }

               this.a($$1x);
            }

            return null;
         }, this.m);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void J() {
      this.L();
      this.m.a(frb.a(E, C, xk.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xl $$2;
      if ($$0.getCause() instanceof yl $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xl $$0) {
      xl $$1 = $$0.f().a(n.m);
      this.m.a(frb.a(F, $$1, xk.k, () -> this.m.a(this)));
   }

   void K() {
      if (this.A.b()) {
         this.y.a(this.A.e().b());
      }
   }

   void L() {
      this.y.a(null);
   }

   @Override
   public void aP_() {
      if (this.A.b()) {
         this.m.a(new fvu.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void j() {
      this.K();
      super.j();
   }

   class a extends fuj {
      private static final xl c = xl.c("gui.abuseReport.discard.title").a(n.r);
      private static final xl d = xl.c("gui.abuseReport.discard.content");
      private static final xl s = xl.c("gui.abuseReport.discard.return");
      private static final xl u = xl.c("gui.abuseReport.discard.draft");
      private static final xl v = xl.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fpm m() {
         fpp $$0 = fpp.d().a(8);
         $$0.c().b();
         fpp $$1 = $$0.a(fpp.e().a(8));
         $$1.a(flw.a(s, $$0x -> this.aP_()).a());
         $$1.a(flw.a(u, $$0x -> {
            fvu.this.K();
            this.m.a(fvu.this.x);
         }).a());
         $$0.a(flw.a(v, $$0x -> {
            fvu.this.L();
            this.m.a(fvu.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aP_() {
         this.m.a(fvu.this);
      }

      @Override
      public boolean aH_() {
         return false;
      }
   }
}
