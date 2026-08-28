import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ghc extends ghd {
   private final String g;

   ghc(UUID $$0, Instant $$1, UUID $$2, String $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public String a() {
      return this.g;
   }

   public ghc c() {
      ghc $$0 = new ghc(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fuk a(fuk $$0, ghh $$1) {
      return new fyu($$0, $$1, this);
   }

   public static class a extends ghd.a<ghc> {
      public a(ghc $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, String $$1, AbuseReportLimits $$2) {
         super(new ghc(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g());
      }

      @Nullable
      @Override
      public ghd.b c() {
         return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ghd.b.d : super.c();
      }

      @Override
      public Either<ghd.c, ghd.b> a(ghh $$0) {
         ghd.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            ReportedEntity $$2 = new ReportedEntity(this.a.c);
            AbuseReport $$3 = AbuseReport.name(this.a.d, $$2, this.a.b);
            return Either.left(new ghd.c(this.a.a, ghg.c, $$3));
         }
      }
   }
}
