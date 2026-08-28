import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gbq<B extends gki.a<?>> extends fxi {
   private static final ww C = ww.c("gui.abuseReport.report_sent_msg");
   private static final ww D = ww.c("gui.abuseReport.sending.title").a(n.r);
   private static final ww E = ww.c("gui.abuseReport.sent.title").a(n.r);
   private static final ww F = ww.c("gui.abuseReport.error.title").a(n.r);
   private static final ww G = ww.c("gui.abuseReport.send.generic_error");
   protected static final ww a = ww.c("gui.abuseReport.send");
   protected static final ww b = ww.c("gui.abuseReport.observed_what");
   protected static final ww c = ww.c("gui.abuseReport.select_reason");
   private static final ww H = ww.c("gui.abuseReport.describe");
   protected static final ww d = ww.c("gui.abuseReport.more_comments");
   private static final ww I = ww.c("gui.abuseReport.comments");
   private static final ww J = ww.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fxi x;
   protected final gkm y;
   protected final fvi z = fvi.d().a(8);
   protected B A;
   private frs L;
   protected frq B;

   protected gbq(ww $$0, fxi $$1, gkm $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fsi a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fsi $$4 = new fsi(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aN_() {
      this.z.c().b();
      this.m();
      this.E();
      this.F();
      this.G();
      this.z.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fsx(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(frs.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fvi $$0 = this.z.a(fvi.e().a(8));
      $$0.a(frq.a(wv.k, $$0x -> this.aK_()).a(120).a());
      this.B = $$0.a(frq.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gki.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gki.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fvc.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fwu.a(D, wv.e, () -> {
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
      this.m.a(fwu.a(E, C, wv.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      ww $$2;
      if ($$0.getCause() instanceof xw $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(ww $$0) {
      ww $$1 = $$0.f().a(n.m);
      this.m.a(fwu.a(F, $$1, wv.k, () -> this.m.a(this)));
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
   public void aK_() {
      if (this.A.b()) {
         this.m.a(new gbq.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aE_() {
      this.L();
      super.aE_();
   }

   class a extends gaf {
      private static final ww c = ww.c("gui.abuseReport.discard.title").a(n.r);
      private static final ww d = ww.c("gui.abuseReport.discard.content");
      private static final ww s = ww.c("gui.abuseReport.discard.return");
      private static final ww u = ww.c("gui.abuseReport.discard.draft");
      private static final ww v = ww.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fvf m() {
         fvi $$0 = fvi.d().a(8);
         $$0.c().b();
         fvi $$1 = $$0.a(fvi.e().a(8));
         $$1.a(frq.a(s, $$0x -> this.aK_()).a());
         $$1.a(frq.a(u, $$0x -> {
            gbq.this.L();
            this.m.a(gbq.this.x);
         }).a());
         $$0.a(frq.a(v, $$0x -> {
            gbq.this.M();
            this.m.a(gbq.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aK_() {
         this.m.a(gbq.this);
      }

      @Override
      public boolean aC_() {
         return false;
      }
   }
}
