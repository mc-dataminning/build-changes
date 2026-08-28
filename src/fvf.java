import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fvf<B extends gdm.a<?>> extends fra {
   private static final xi C = xi.c("gui.abuseReport.report_sent_msg");
   private static final xi D = xi.c("gui.abuseReport.sending.title").a(n.r);
   private static final xi E = xi.c("gui.abuseReport.sent.title").a(n.r);
   private static final xi F = xi.c("gui.abuseReport.error.title").a(n.r);
   private static final xi G = xi.c("gui.abuseReport.send.generic_error");
   protected static final xi a = xi.c("gui.abuseReport.send");
   protected static final xi b = xi.c("gui.abuseReport.observed_what");
   protected static final xi c = xi.c("gui.abuseReport.select_reason");
   private static final xi H = xi.c("gui.abuseReport.describe");
   protected static final xi d = xi.c("gui.abuseReport.more_comments");
   private static final xi I = xi.c("gui.abuseReport.comments");
   private static final xi J = xi.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fra x;
   protected final gdq y;
   protected final fpa z = fpa.d().a(8);
   protected B A;
   private flj L;
   protected flh B;

   protected fvf(xi $$0, fra $$1, gdq $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected flz a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      flz $$4 = new flz(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aR_() {
      this.z.c().b();
      this.m();
      this.D();
      this.E();
      this.F();
      this.z.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fmo(this.l, this.p));
   }

   protected abstract void D();

   protected void E() {
      this.L = this.z.a(flj.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.F();
      }).a());
      fpa $$0 = this.z.a(fpa.e().a(8));
      $$0.a(flh.a(xh.k, $$0x -> this.d()).a(120).a());
      this.B = $$0.a(flh.a(a, $$0x -> this.G()).a(120).a());
   }

   protected void F() {
      gdm.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gdm.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fou.a(this.z, this.H());
   }

   protected void G() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fqm.a(D, xh.e, () -> {
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
      this.m.a(fqm.a(E, C, xh.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xi $$2;
      if ($$0.getCause() instanceof yi $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xi $$0) {
      xi $$1 = $$0.f().a(n.m);
      this.m.a(fqm.a(F, $$1, xh.k, () -> this.m.a(this)));
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
   public void d() {
      if (this.A.b()) {
         this.m.a(new fvf.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void j() {
      this.K();
      super.j();
   }

   class a extends ftu {
      private static final xi c = xi.c("gui.abuseReport.discard.title").a(n.r);
      private static final xi d = xi.c("gui.abuseReport.discard.content");
      private static final xi s = xi.c("gui.abuseReport.discard.return");
      private static final xi u = xi.c("gui.abuseReport.discard.draft");
      private static final xi v = xi.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fox m() {
         fpa $$0 = fpa.d().a(8);
         $$0.c().b();
         fpa $$1 = $$0.a(fpa.e().a(8));
         $$1.a(flh.a(s, $$0x -> this.d()).a());
         $$1.a(flh.a(u, $$0x -> {
            fvf.this.K();
            this.m.a(fvf.this.x);
         }).a());
         $$0.a(flh.a(v, $$0x -> {
            fvf.this.L();
            this.m.a(fvf.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fvf.this);
      }

      @Override
      public boolean aH_() {
         return false;
      }
   }
}
