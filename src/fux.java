import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fux<B extends gdb.a<?>> extends fqs {
   private static final xh C = xh.c("gui.abuseReport.report_sent_msg");
   private static final xh D = xh.c("gui.abuseReport.sending.title").a(n.r);
   private static final xh E = xh.c("gui.abuseReport.sent.title").a(n.r);
   private static final xh F = xh.c("gui.abuseReport.error.title").a(n.r);
   private static final xh G = xh.c("gui.abuseReport.send.generic_error");
   protected static final xh a = xh.c("gui.abuseReport.send");
   protected static final xh b = xh.c("gui.abuseReport.observed_what");
   protected static final xh c = xh.c("gui.abuseReport.select_reason");
   private static final xh H = xh.c("gui.abuseReport.describe");
   protected static final xh d = xh.c("gui.abuseReport.more_comments");
   private static final xh I = xh.c("gui.abuseReport.comments");
   private static final xh J = xh.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fqs x;
   protected final gdf y;
   protected final fos z = fos.d().a(8);
   protected B A;
   private flb L;
   protected fkz B;

   protected fux(xh $$0, fqs $$1, gdf $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected flr a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      flr $$4 = new flr(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aS_() {
      this.z.c().b();
      this.m();
      this.D();
      this.E();
      this.F();
      this.z.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fmg(this.l, this.p));
   }

   protected abstract void D();

   protected void E() {
      this.L = this.z.a(flb.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.F();
      }).a());
      fos $$0 = this.z.a(fos.e().a(8));
      $$0.a(fkz.a(xg.k, $$0x -> this.d()).a(120).a());
      this.B = $$0.a(fkz.a(a, $$0x -> this.G()).a(120).a());
   }

   protected void F() {
      gdb.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gdb.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fol.a(this.z, this.H());
   }

   protected void G() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fqe.a(D, xg.e, () -> {
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
      this.m.a(fqe.a(E, C, xg.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xh $$2;
      if ($$0.getCause() instanceof yh $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xh $$0) {
      xh $$1 = $$0.f().a(n.m);
      this.m.a(fqe.a(F, $$1, xg.k, () -> this.m.a(this)));
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
         this.m.a(new fux.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void j() {
      this.K();
      super.j();
   }

   class a extends ftm {
      private static final xh c = xh.c("gui.abuseReport.discard.title").a(n.r);
      private static final xh d = xh.c("gui.abuseReport.discard.content");
      private static final xh s = xh.c("gui.abuseReport.discard.return");
      private static final xh u = xh.c("gui.abuseReport.discard.draft");
      private static final xh v = xh.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected foo m() {
         fos $$0 = fos.d().a(8);
         $$0.c().b();
         fos $$1 = $$0.a(fos.e().a(8));
         $$1.a(fkz.a(s, $$0x -> this.d()).a());
         $$1.a(fkz.a(u, $$0x -> {
            fux.this.K();
            this.m.a(fux.this.x);
         }).a());
         $$0.a(fkz.a(v, $$0x -> {
            fux.this.L();
            this.m.a(fux.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fux.this);
      }

      @Override
      public boolean aI_() {
         return false;
      }
   }
}
