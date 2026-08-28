import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gel<B extends gng.a<?>> extends gad {
   private static final xa C = xa.c("gui.abuseReport.report_sent_msg");
   private static final xa D = xa.c("gui.abuseReport.sending.title").a(o.r);
   private static final xa E = xa.c("gui.abuseReport.sent.title").a(o.r);
   private static final xa F = xa.c("gui.abuseReport.error.title").a(o.r);
   private static final xa G = xa.c("gui.abuseReport.send.generic_error");
   protected static final xa a = xa.c("gui.abuseReport.send");
   protected static final xa b = xa.c("gui.abuseReport.observed_what");
   protected static final xa c = xa.c("gui.abuseReport.select_reason");
   private static final xa H = xa.c("gui.abuseReport.describe");
   protected static final xa d = xa.c("gui.abuseReport.more_comments");
   private static final xa I = xa.c("gui.abuseReport.comments");
   private static final xa J = xa.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final gad x;
   protected final gnk y;
   protected final fyd z = fyd.d().a(8);
   protected B A;
   private fun L;
   protected ful B;

   protected gel(xa $$0, gad $$1, gnk $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fvd a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fvd $$4 = new fvd(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aS_() {
      this.z.c().b();
      this.m();
      this.E();
      this.F();
      this.G();
      this.z.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fvs(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fun.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fyd $$0 = this.z.a(fyd.e().a(8));
      $$0.a(ful.a(wz.k, $$0x -> this.aP_()).a(120).a());
      this.B = $$0.a(ful.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gng.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(y.a($$0, gng.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fxx.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fzp.a(D, wz.e, () -> {
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
      this.m.a(fzp.a(E, C, wz.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xa $$2;
      if ($$0.getCause() instanceof ya $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xa $$0) {
      xa $$1 = $$0.f().a(o.m);
      this.m.a(fzp.a(F, $$1, wz.k, () -> this.m.a(this)));
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
         this.m.a(new gel.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aJ_() {
      this.L();
      super.aJ_();
   }

   class a extends gda {
      private static final xa c = xa.c("gui.abuseReport.discard.title").a(o.r);
      private static final xa d = xa.c("gui.abuseReport.discard.content");
      private static final xa s = xa.c("gui.abuseReport.discard.return");
      private static final xa u = xa.c("gui.abuseReport.discard.draft");
      private static final xa v = xa.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fya m() {
         fyd $$0 = fyd.d().a(8);
         $$0.c().b();
         fyd $$1 = $$0.a(fyd.e().a(8));
         $$1.a(ful.a(s, $$0x -> this.aP_()).a());
         $$1.a(ful.a(u, $$0x -> {
            gel.this.L();
            this.m.a(gel.this.x);
         }).a());
         $$0.a(ful.a(v, $$0x -> {
            gel.this.M();
            this.m.a(gel.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aP_() {
         this.m.a(gel.this);
      }

      @Override
      public boolean aH_() {
         return false;
      }
   }
}
