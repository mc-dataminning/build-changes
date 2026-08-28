import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gan<B extends gje.a<?>> extends fwf {
   private static final wv C = wv.c("gui.abuseReport.report_sent_msg");
   private static final wv D = wv.c("gui.abuseReport.sending.title").a(n.r);
   private static final wv E = wv.c("gui.abuseReport.sent.title").a(n.r);
   private static final wv F = wv.c("gui.abuseReport.error.title").a(n.r);
   private static final wv G = wv.c("gui.abuseReport.send.generic_error");
   protected static final wv a = wv.c("gui.abuseReport.send");
   protected static final wv b = wv.c("gui.abuseReport.observed_what");
   protected static final wv c = wv.c("gui.abuseReport.select_reason");
   private static final wv H = wv.c("gui.abuseReport.describe");
   protected static final wv d = wv.c("gui.abuseReport.more_comments");
   private static final wv I = wv.c("gui.abuseReport.comments");
   private static final wv J = wv.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fwf x;
   protected final gji y;
   protected final fuf z = fuf.d().a(8);
   protected B A;
   private fqp L;
   protected fqn B;

   protected gan(wv $$0, fwf $$1, gji $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected frf a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      frf $$4 = new frf(this.p, 0, 0, $$0, $$1, H, I);
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
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fru(this.l, this.p));
   }

   protected abstract void E();

   protected void F() {
      this.L = this.z.a(fqp.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.G();
      }).a());
      fuf $$0 = this.z.a(fuf.e().a(8));
      $$0.a(fqn.a(wu.k, $$0x -> this.aK_()).a(120).a());
      this.B = $$0.a(fqn.a(a, $$0x -> this.H()).a(120).a());
   }

   protected void G() {
      gje.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gje.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      ftz.a(this.z, this.J());
   }

   protected void H() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fvr.a(D, wu.e, () -> {
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
      this.m.a(fvr.a(E, C, wu.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      wv $$2;
      if ($$0.getCause() instanceof xv $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(wv $$0) {
      wv $$1 = $$0.f().a(n.m);
      this.m.a(fvr.a(F, $$1, wu.k, () -> this.m.a(this)));
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
         this.m.a(new gan.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void aE_() {
      this.L();
      super.aE_();
   }

   class a extends fzc {
      private static final wv c = wv.c("gui.abuseReport.discard.title").a(n.r);
      private static final wv d = wv.c("gui.abuseReport.discard.content");
      private static final wv s = wv.c("gui.abuseReport.discard.return");
      private static final wv u = wv.c("gui.abuseReport.discard.draft");
      private static final wv v = wv.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fuc m() {
         fuf $$0 = fuf.d().a(8);
         $$0.c().b();
         fuf $$1 = $$0.a(fuf.e().a(8));
         $$1.a(fqn.a(s, $$0x -> this.aK_()).a());
         $$1.a(fqn.a(u, $$0x -> {
            gan.this.L();
            this.m.a(gan.this.x);
         }).a());
         $$0.a(fqn.a(v, $$0x -> {
            gan.this.M();
            this.m.a(gan.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void aK_() {
         this.m.a(gan.this);
      }

      @Override
      public boolean aC_() {
         return false;
      }
   }
}
