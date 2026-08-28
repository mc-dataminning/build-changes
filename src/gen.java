import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gen<B extends gni.a<?>> extends gaf {
   private static final xc C = xc.c("gui.abuseReport.report_sent_msg");
   private static final xc D = xc.c("gui.abuseReport.sending.title").a(o.r);
   private static final xc E = xc.c("gui.abuseReport.sent.title").a(o.r);
   private static final xc F = xc.c("gui.abuseReport.error.title").a(o.r);
   private static final xc G = xc.c("gui.abuseReport.send.generic_error");
   protected static final xc a = xc.c("gui.abuseReport.send");
   protected static final xc b = xc.c("gui.abuseReport.observed_what");
   protected static final xc c = xc.c("gui.abuseReport.select_reason");
   private static final xc H = xc.c("gui.abuseReport.describe");
   protected static final xc d = xc.c("gui.abuseReport.more_comments");
   private static final xc I = xc.c("gui.abuseReport.comments");
   private static final xc J = xc.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final gaf x;
   protected final gnm y;
   protected final fyf z = fyf.d().a(8);
   protected B A;
   private fup L;
   protected fun B;

   protected gen(xc $$0, gaf $$1, gnm $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fvf a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fvf $$4 = new fvf(this.p, 0, 0, $$0, $$1, H, I);
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
         ful var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fvu(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fup.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fyf $$0 = this.z.a(fyf.e().a(8));
      $$0.a(fun.a(xb.k, $$0x -> this.aP_()).a(120).a());
      this.B = $$0.a(fun.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gni.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(y.a($$0, gni.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fxz.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fzr.a(D, xb.e, () -> {
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
      this.m.a(fzr.a(E, C, xb.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xc $$2;
      if ($$0.getCause() instanceof yc $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xc $$0) {
      xc $$1 = $$0.f().a(o.m);
      this.m.a(fzr.a(F, $$1, xb.k, () -> this.m.a(this)));
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
         this.m.a(new gen.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aJ_() {
      this.L();
      super.aJ_();
   }

   class a extends gdc {
      private static final xc c = xc.c("gui.abuseReport.discard.title").a(o.r);
      private static final xc d = xc.c("gui.abuseReport.discard.content");
      private static final xc s = xc.c("gui.abuseReport.discard.return");
      private static final xc u = xc.c("gui.abuseReport.discard.draft");
      private static final xc v = xc.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fyc m() {
         fyf $$0 = fyf.d().a(8);
         $$0.c().b();
         fyf $$1 = $$0.a(fyf.e().a(8));
         $$1.a(fun.a(s, $$0x -> this.aP_()).a());
         $$1.a(fun.a(u, $$0x -> {
            gen.this.L();
            this.m.a(gen.this.x);
         }).a());
         $$0.a(fun.a(v, $$0x -> {
            gen.this.M();
            this.m.a(gen.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aP_() {
         this.m.a(gen.this);
      }

      @Override
      public boolean aH_() {
         return false;
      }
   }
}
