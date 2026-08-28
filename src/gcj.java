import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gcj<B extends gle.a<?>> extends fyb {
   private static final wy C = wy.c("gui.abuseReport.report_sent_msg");
   private static final wy D = wy.c("gui.abuseReport.sending.title").a(n.r);
   private static final wy E = wy.c("gui.abuseReport.sent.title").a(n.r);
   private static final wy F = wy.c("gui.abuseReport.error.title").a(n.r);
   private static final wy G = wy.c("gui.abuseReport.send.generic_error");
   protected static final wy a = wy.c("gui.abuseReport.send");
   protected static final wy b = wy.c("gui.abuseReport.observed_what");
   protected static final wy c = wy.c("gui.abuseReport.select_reason");
   private static final wy H = wy.c("gui.abuseReport.describe");
   protected static final wy d = wy.c("gui.abuseReport.more_comments");
   private static final wy I = wy.c("gui.abuseReport.comments");
   private static final wy J = wy.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fyb x;
   protected final gli y;
   protected final fwb z = fwb.d().a(8);
   protected B A;
   private fsl L;
   protected fsj B;

   protected gcj(wy $$0, fyb $$1, gli $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected ftb a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      ftb $$4 = new ftb(this.p, 0, 0, $$0, $$1, H, I);
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
         fsh var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new ftq(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fsl.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fwb $$0 = this.z.a(fwb.e().a(8));
      $$0.a(fsj.a(wx.k, $$0x -> this.aL_()).a(120).a());
      this.B = $$0.a(fsj.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gle.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gle.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fvv.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fxn.a(D, wx.e, () -> {
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
      this.m.a(fxn.a(E, C, wx.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      wy $$2;
      if ($$0.getCause() instanceof xy $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(wy $$0) {
      wy $$1 = $$0.f().a(n.m);
      this.m.a(fxn.a(F, $$1, wx.k, () -> this.m.a(this)));
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
         this.m.a(new gcj.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aF_() {
      this.L();
      super.aF_();
   }

   class a extends gay {
      private static final wy c = wy.c("gui.abuseReport.discard.title").a(n.r);
      private static final wy d = wy.c("gui.abuseReport.discard.content");
      private static final wy s = wy.c("gui.abuseReport.discard.return");
      private static final wy u = wy.c("gui.abuseReport.discard.draft");
      private static final wy v = wy.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fvy m() {
         fwb $$0 = fwb.d().a(8);
         $$0.c().b();
         fwb $$1 = $$0.a(fwb.e().a(8));
         $$1.a(fsj.a(s, $$0x -> this.aL_()).a());
         $$1.a(fsj.a(u, $$0x -> {
            gcj.this.L();
            this.m.a(gcj.this.x);
         }).a());
         $$0.a(fsj.a(v, $$0x -> {
            gcj.this.M();
            this.m.a(gcj.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aL_() {
         this.m.a(gcj.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
