import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gdy<B extends gmt.a<?>> extends fzq {
   private static final xg C = xg.c("gui.abuseReport.report_sent_msg");
   private static final xg D = xg.c("gui.abuseReport.sending.title").a(o.r);
   private static final xg E = xg.c("gui.abuseReport.sent.title").a(o.r);
   private static final xg F = xg.c("gui.abuseReport.error.title").a(o.r);
   private static final xg G = xg.c("gui.abuseReport.send.generic_error");
   protected static final xg a = xg.c("gui.abuseReport.send");
   protected static final xg b = xg.c("gui.abuseReport.observed_what");
   protected static final xg c = xg.c("gui.abuseReport.select_reason");
   private static final xg H = xg.c("gui.abuseReport.describe");
   protected static final xg d = xg.c("gui.abuseReport.more_comments");
   private static final xg I = xg.c("gui.abuseReport.comments");
   private static final xg J = xg.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fzq x;
   protected final gmx y;
   protected final fxq z = fxq.d().a(8);
   protected B A;
   private fua L;
   protected fty B;

   protected gdy(xg $$0, fzq $$1, gmx $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fuq a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fuq $$4 = new fuq(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aO_() {
      this.z.c().b();
      this.m();
      this.E();
      this.F();
      this.G();
      this.z.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fvf(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fua.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fxq $$0 = this.z.a(fxq.e().a(8));
      $$0.a(fty.a(xf.k, $$0x -> this.aL_()).a(120).a());
      this.B = $$0.a(fty.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gmt.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(y.a($$0, gmt.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fxk.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fzc.a(D, xf.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.I();
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

   private void I() {
      this.M();
      this.m.a(fzc.a(E, C, xf.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xg $$2;
      if ($$0.getCause() instanceof yg $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xg $$0) {
      xg $$1 = $$0.f().a(o.m);
      this.m.a(fzc.a(F, $$1, xf.k, () -> this.m.a(this)));
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
   public void aL_() {
      if (this.A.b()) {
         this.m.a(new gdy.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aF_() {
      this.L();
      super.aF_();
   }

   class a extends gcn {
      private static final xg c = xg.c("gui.abuseReport.discard.title").a(o.r);
      private static final xg d = xg.c("gui.abuseReport.discard.content");
      private static final xg s = xg.c("gui.abuseReport.discard.return");
      private static final xg u = xg.c("gui.abuseReport.discard.draft");
      private static final xg v = xg.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fxn m() {
         fxq $$0 = fxq.d().a(8);
         $$0.c().b();
         fxq $$1 = $$0.a(fxq.e().a(8));
         $$1.a(fty.a(s, $$0x -> this.aL_()).a());
         $$1.a(fty.a(u, $$0x -> {
            gdy.this.L();
            this.m.a(gdy.this.x);
         }).a());
         $$0.a(fty.a(v, $$0x -> {
            gdy.this.M();
            this.m.a(gdy.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aL_() {
         this.m.a(gdy.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
