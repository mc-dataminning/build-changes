import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ggm extends ggn {
   private final String g;

   ggm(UUID $$0, Instant $$1, UUID $$2, String $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public String a() {
      return this.g;
   }

   public ggm c() {
      ggm $$0 = new ggm(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ftw a(ftw $$0, ggr $$1) {
      return new fyg($$0, $$1, this);
   }

   public static class a extends ggn.a<ggm> {
      public a(ggm $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, String $$1, AbuseReportLimits $$2) {
         super(new ggm(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g());
      }

      @Nullable
      @Override
      public ggn.b c() {
         return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggn.b.d : super.c();
      }

      @Override
      public Either<ggn.c, ggn.b> a(ggr $$0) {
         ggn.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            ReportedEntity $$2 = new ReportedEntity(this.a.c);
            AbuseReport $$3 = AbuseReport.name(this.a.d, $$2, this.a.b);
            return Either.left(new ggn.c(this.a.a, ggq.c, $$3));
         }
      }
   }
}
