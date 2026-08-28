import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fyo<B extends ghb.a<?>> extends fui {
   private static final wo C = wo.c("gui.abuseReport.report_sent_msg");
   private static final wo D = wo.c("gui.abuseReport.sending.title").a(n.r);
   private static final wo E = wo.c("gui.abuseReport.sent.title").a(n.r);
   private static final wo F = wo.c("gui.abuseReport.error.title").a(n.r);
   private static final wo G = wo.c("gui.abuseReport.send.generic_error");
   protected static final wo a = wo.c("gui.abuseReport.send");
   protected static final wo b = wo.c("gui.abuseReport.observed_what");
   protected static final wo c = wo.c("gui.abuseReport.select_reason");
   private static final wo H = wo.c("gui.abuseReport.describe");
   protected static final wo d = wo.c("gui.abuseReport.more_comments");
   private static final wo I = wo.c("gui.abuseReport.comments");
   private static final wo J = wo.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fui x;
   protected final ghf y;
   protected final fsi z = fsi.d().a(8);
   protected B A;
   private fos L;
   protected fop B;

   protected fyo(wo $$0, fui $$1, ghf $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fpi a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fpi $$4 = new fpi(this.p, 0, 0, $$0, $$1, H, I);
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
         fon var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fpx(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fos.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fsi $$0 = this.z.a(fsi.e().a(8));
      $$0.a(fop.a(wn.k, $$0x -> this.aO_()).a(120).a());
      this.B = $$0.a(fop.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      ghb.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, ghb.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fsc.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(ftu.a(D, wn.e, () -> {
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
      this.m.a(ftu.a(E, C, wn.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      wo $$2;
      if ($$0.getCause() instanceof xo $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(wo $$0) {
      wo $$1 = $$0.f().a(n.m);
      this.m.a(ftu.a(F, $$1, wn.k, () -> this.m.a(this)));
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
         this.m.a(new fyo.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aI_() {
      this.L();
      super.aI_();
   }

   class a extends fxd {
      private static final wo c = wo.c("gui.abuseReport.discard.title").a(n.r);
      private static final wo d = wo.c("gui.abuseReport.discard.content");
      private static final wo s = wo.c("gui.abuseReport.discard.return");
      private static final wo u = wo.c("gui.abuseReport.discard.draft");
      private static final wo v = wo.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fsf m() {
         fsi $$0 = fsi.d().a(8);
         $$0.c().b();
         fsi $$1 = $$0.a(fsi.e().a(8));
         $$1.a(fop.a(s, $$0x -> this.aO_()).a());
         $$1.a(fop.a(u, $$0x -> {
            fyo.this.L();
            this.m.a(fyo.this.x);
         }).a());
         $$0.a(fop.a(v, $$0x -> {
            fyo.this.M();
            this.m.a(fyo.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aO_() {
         this.m.a(fyo.this);
      }

      @Override
      public boolean aG_() {
         return false;
      }
   }
}
