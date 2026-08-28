import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fyr<B extends ghe.a<?>> extends ful {
   private static final wp C = wp.c("gui.abuseReport.report_sent_msg");
   private static final wp D = wp.c("gui.abuseReport.sending.title").a(n.r);
   private static final wp E = wp.c("gui.abuseReport.sent.title").a(n.r);
   private static final wp F = wp.c("gui.abuseReport.error.title").a(n.r);
   private static final wp G = wp.c("gui.abuseReport.send.generic_error");
   protected static final wp a = wp.c("gui.abuseReport.send");
   protected static final wp b = wp.c("gui.abuseReport.observed_what");
   protected static final wp c = wp.c("gui.abuseReport.select_reason");
   private static final wp H = wp.c("gui.abuseReport.describe");
   protected static final wp d = wp.c("gui.abuseReport.more_comments");
   private static final wp I = wp.c("gui.abuseReport.comments");
   private static final wp J = wp.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final ful x;
   protected final ghi y;
   protected final fsl z = fsl.d().a(8);
   protected B A;
   private fov L;
   protected fot B;

   protected fyr(wp $$0, ful $$1, ghi $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fpl a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fpl $$4 = new fpl(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aR_() {
      this.z.c().b();
      this.m();
      this.E();
      this.F();
      this.G();
      this.z.a($$1 -> {
         foq var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fqa(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fov.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fsl $$0 = this.z.a(fsl.e().a(8));
      $$0.a(fot.a(wo.k, $$0x -> this.aO_()).a(120).a());
      this.B = $$0.a(fot.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      ghe.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, ghe.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fsf.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(ftx.a(D, wo.e, () -> {
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
      this.m.a(ftx.a(E, C, wo.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      wp $$2;
      if ($$0.getCause() instanceof xp $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(wp $$0) {
      wp $$1 = $$0.f().a(n.m);
      this.m.a(ftx.a(F, $$1, wo.k, () -> this.m.a(this)));
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
   public void aO_() {
      if (this.A.b()) {
         this.m.a(new fyr.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aI_() {
      this.L();
      super.aI_();
   }

   class a extends fxg {
      private static final wp c = wp.c("gui.abuseReport.discard.title").a(n.r);
      private static final wp d = wp.c("gui.abuseReport.discard.content");
      private static final wp s = wp.c("gui.abuseReport.discard.return");
      private static final wp u = wp.c("gui.abuseReport.discard.draft");
      private static final wp v = wp.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fsi m() {
         fsl $$0 = fsl.d().a(8);
         $$0.c().b();
         fsl $$1 = $$0.a(fsl.e().a(8));
         $$1.a(fot.a(s, $$0x -> this.aO_()).a());
         $$1.a(fot.a(u, $$0x -> {
            fyr.this.L();
            this.m.a(fyr.this.x);
         }).a());
         $$0.a(fot.a(v, $$0x -> {
            fyr.this.M();
            this.m.a(fyr.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aO_() {
         this.m.a(fyr.this);
      }

      @Override
      public boolean aG_() {
         return false;
      }
   }
}
