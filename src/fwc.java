import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fwc<B extends gel.a<?>> extends frw {
   private static final xj C = xj.c("gui.abuseReport.report_sent_msg");
   private static final xj D = xj.c("gui.abuseReport.sending.title").a(n.r);
   private static final xj E = xj.c("gui.abuseReport.sent.title").a(n.r);
   private static final xj F = xj.c("gui.abuseReport.error.title").a(n.r);
   private static final xj G = xj.c("gui.abuseReport.send.generic_error");
   protected static final xj a = xj.c("gui.abuseReport.send");
   protected static final xj b = xj.c("gui.abuseReport.observed_what");
   protected static final xj c = xj.c("gui.abuseReport.select_reason");
   private static final xj H = xj.c("gui.abuseReport.describe");
   protected static final xj d = xj.c("gui.abuseReport.more_comments");
   private static final xj I = xj.c("gui.abuseReport.comments");
   private static final xj J = xj.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final frw x;
   protected final gep y;
   protected final fpw z = fpw.d().a(8);
   protected B A;
   private fmf L;
   protected fmd B;

   protected fwc(xj $$0, frw $$1, gep $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fmv a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fmv $$4 = new fmv(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aR_() {
      this.z.c().b();
      this.m();
      this.F();
      this.G();
      this.J();
      this.z.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fnk(this.l, this.p));
   }

   protected abstract void F();

   protected void G() {
      this.L = this.z.a(fmf.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.J();
      }).a());
      fpw $$0 = this.z.a(fpw.e().a(8));
      $$0.a(fmd.a(xi.k, $$0x -> this.aO_()).a(120).a());
      this.B = $$0.a(fmd.a(a, $$0x -> this.K()).a(120).a());
   }

   protected void J() {
      gel.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gel.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fpq.a(this.z, this.H());
   }

   protected void K() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fri.a(D, xi.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.L();
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

   private void L() {
      this.N();
      this.m.a(fri.a(E, C, xi.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xj $$2;
      if ($$0.getCause() instanceof yj $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xj $$0) {
      xj $$1 = $$0.f().a(n.m);
      this.m.a(fri.a(F, $$1, xi.k, () -> this.m.a(this)));
   }

   void M() {
      if (this.A.b()) {
         this.y.a(this.A.e().b());
      }
   }

   void N() {
      this.y.a(null);
   }

   @Override
   public void aO_() {
      if (this.A.b()) {
         this.m.a(new fwc.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void j() {
      this.M();
      super.j();
   }

   class a extends fur {
      private static final xj c = xj.c("gui.abuseReport.discard.title").a(n.r);
      private static final xj d = xj.c("gui.abuseReport.discard.content");
      private static final xj s = xj.c("gui.abuseReport.discard.return");
      private static final xj u = xj.c("gui.abuseReport.discard.draft");
      private static final xj v = xj.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fpt m() {
         fpw $$0 = fpw.d().a(8);
         $$0.c().b();
         fpw $$1 = $$0.a(fpw.e().a(8));
         $$1.a(fmd.a(s, $$0x -> this.aO_()).a());
         $$1.a(fmd.a(u, $$0x -> {
            fwc.this.M();
            this.m.a(fwc.this.x);
         }).a());
         $$0.a(fmd.a(v, $$0x -> {
            fwc.this.N();
            this.m.a(fwc.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aO_() {
         this.m.a(fwc.this);
      }

      @Override
      public boolean aG_() {
         return false;
      }
   }
}
