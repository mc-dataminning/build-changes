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

public interface fzj {
   static fzj a(fzp $$0, UserApiService $$1) {
      return new fzj.b($$0, $$1);
   }

   CompletableFuture<Unit> a(UUID var1, fzr var2, AbuseReport var3);

   boolean a();

   default AbuseReportLimits b() {
      return AbuseReportLimits.DEFAULTS;
   }

   public static class a extends xu {
      public a(wu $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }

   public static record b(fzp a, UserApiService b) implements fzj {
      private static final wu c = wu.c("gui.abuseReport.send.service_unavailable");
      private static final wu d = wu.c("gui.abuseReport.send.http_error");
      private static final wu e = wu.c("gui.abuseReport.send.json_error");

      @Override
      public CompletableFuture<Unit> a(UUID $$0, fzr $$1, AbuseReport $$2) {
         return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest $$3 = new AbuseReportRequest(1, $$0, $$2, this.a.b(), this.a.c(), this.a.d(), $$1.a());

            try {
               this.b.reportAbuse($$3);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException var7) {
               wu $$5 = this.a(var7);
               throw new CompletionException(new fzj.a($$5, var7));
            } catch (MinecraftClientException var8) {
               wu $$7 = this.a(var8);
               throw new CompletionException(new fzj.a($$7, var8));
            }
         }, ac.h());
      }

      @Override
      public boolean a() {
         return this.b.canSendReports();
      }

      private wu a(MinecraftClientHttpException $$0) {
         return wu.a("gui.abuseReport.send.error_message", $$0.getMessage());
      }

      private wu a(MinecraftClientException $$0) {
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

      public fzp c() {
         return this.a;
      }

      public UserApiService d() {
         return this.b;
      }
   }
}
