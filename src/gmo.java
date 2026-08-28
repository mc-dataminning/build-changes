import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public interface gmo {
   static gmo a(gmu $$0, UserApiService $$1) {
      return new gmo.b($$0, $$1);
   }

   CompletableFuture<Unit> a(UUID var1, gmw var2, AbuseReport var3);

   boolean a();

   default AbuseReportLimits b() {
      return AbuseReportLimits.DEFAULTS;
   }

   public static class a extends yg {
      public a(xg $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }

   public static record b(gmu a, UserApiService b) implements gmo {
      private static final xg c = xg.c("gui.abuseReport.send.service_unavailable");
      private static final xg d = xg.c("gui.abuseReport.send.http_error");
      private static final xg e = xg.c("gui.abuseReport.send.json_error");

      @Override
      public CompletableFuture<Unit> a(UUID $$0, gmw $$1, AbuseReport $$2) {
         return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest $$3 = new AbuseReportRequest(1, $$0, $$2, this.a.b(), this.a.c(), this.a.d(), $$1.a());

            try {
               this.b.reportAbuse($$3);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException var7) {
               xg $$5 = this.a(var7);
               throw new CompletionException(new gmo.a($$5, var7));
            } catch (MinecraftClientException var8) {
               xg $$7 = this.a(var8);
               throw new CompletionException(new gmo.a($$7, var8));
            }
         }, ag.i());
      }

      @Override
      public boolean a() {
         return this.b.canSendReports();
      }

      private xg a(MinecraftClientHttpException $$0) {
         return xg.a("gui.abuseReport.send.error_message", $$0.getMessage());
      }

      private xg a(MinecraftClientException $$0) {
         return switch ($$0.getType()) {
            case SERVICE_UNAVAILABLE -> c;
            case HTTP_ERROR -> d;
            case JSON_ERROR -> e;
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public AbuseReportLimits b() {
         return this.b.getAbuseReportLimits();
      }

      public gmu c() {
         return this.a;
      }

      public UserApiService d() {
         return this.b;
      }
   }
}
