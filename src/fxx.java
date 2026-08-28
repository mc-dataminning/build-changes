import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fxx<B extends ggk.a<?>> extends ftr {
   private static final xk C = xk.c("gui.abuseReport.report_sent_msg");
   private static final xk D = xk.c("gui.abuseReport.sending.title").a(n.r);
   private static final xk E = xk.c("gui.abuseReport.sent.title").a(n.r);
   private static final xk F = xk.c("gui.abuseReport.error.title").a(n.r);
   private static final xk G = xk.c("gui.abuseReport.send.generic_error");
   protected static final xk a = xk.c("gui.abuseReport.send");
   protected static final xk b = xk.c("gui.abuseReport.observed_what");
   protected static final xk c = xk.c("gui.abuseReport.select_reason");
   private static final xk H = xk.c("gui.abuseReport.describe");
   protected static final xk d = xk.c("gui.abuseReport.more_comments");
   private static final xk I = xk.c("gui.abuseReport.comments");
   private static final xk J = xk.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final ftr x;
   protected final ggo y;
   protected final frr z = frr.d().a(8);
   protected B A;
   private foa L;
   protected fny B;

   protected fxx(xk $$0, ftr $$1, ggo $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected foq a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      foq $$4 = new foq(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aT_() {
      this.z.c().b();
      this.l();
      this.E();
      this.F();
      this.G();
      this.z.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   protected void l() {
      this.z.a(new fpg(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(foa.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      frr $$0 = this.z.a(frr.e().a(8));
      $$0.a(fny.a(xj.k, $$0x -> this.aP_()).a(120).a());
      this.B = $$0.a(fny.a(a, $$0x -> this.J()).a(120).a());
   }

   protected void G() {
      ggk.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, ggk.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      frl.a(this.z, this.H());
   }

   protected void J() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(ftd.a(D, xj.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.K();
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

   private void K() {
      this.M();
      this.m.a(ftd.a(E, C, xj.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xk $$2;
      if ($$0.getCause() instanceof yk $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xk $$0) {
      xk $$1 = $$0.f().a(n.m);
      this.m.a(ftd.a(F, $$1, xj.k, () -> this.m.a(this)));
   }

   void L() {
      if (this.A.b()) {
         this.y.a(this.A.e().b());
      }
   }

   void M() {
      this.y.a(null);
   }

   @Override
   public void aP_() {
      if (this.A.b()) {
         this.m.a(new fxx.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aJ_() {
      this.L();
      super.aJ_();
   }

   class a extends fwm {
      private static final xk c = xk.c("gui.abuseReport.discard.title").a(n.r);
      private static final xk d = xk.c("gui.abuseReport.discard.content");
      private static final xk s = xk.c("gui.abuseReport.discard.return");
      private static final xk u = xk.c("gui.abuseReport.discard.draft");
      private static final xk v = xk.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fro l() {
         frr $$0 = frr.d().a(8);
         $$0.c().b();
         frr $$1 = $$0.a(frr.e().a(8));
         $$1.a(fny.a(s, $$0x -> this.aP_()).a());
         $$1.a(fny.a(u, $$0x -> {
            fxx.this.L();
            this.m.a(fxx.this.x);
         }).a());
         $$0.a(fny.a(v, $$0x -> {
            fxx.this.M();
            this.m.a(fxx.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aP_() {
         this.m.a(fxx.this);
      }

      @Override
      public boolean aH_() {
         return false;
      }
   }
}
