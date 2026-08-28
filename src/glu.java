import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class glu extends glv {
   private final String g;

   glu(UUID $$0, Instant $$1, UUID $$2, String $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public String a() {
      return this.g;
   }

   public glu c() {
      glu $$0 = new glu(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fys a(fys $$0, glz $$1) {
      return new gde($$0, $$1, this);
   }

   public static class a extends glv.a<glu> {
      public a(glu $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, String $$1, AbuseReportLimits $$2) {
         super(new glu(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g());
      }

      @Nullable
      @Override
      public glv.b c() {
         return this.a.d.length() > this.b.maxOpinionCommentsLength() ? glv.b.d : super.c();
      }

      @Override
      public Either<glv.c, glv.b> a(glz $$0) {
         glv.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            ReportedEntity $$2 = new ReportedEntity(this.a.c);
            AbuseReport $$3 = AbuseReport.name(this.a.d, $$2, this.a.b);
            return Either.left(new glv.c(this.a.a, gly.c, $$3));
         }
      }
   }
}
