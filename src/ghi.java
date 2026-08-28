import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ghi extends ghd {
   final Supplier<hft> g;

   ghi(UUID $$0, Instant $$1, UUID $$2, Supplier<hft> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hft> a() {
      return this.g;
   }

   public ghi c() {
      ghi $$0 = new ghi(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fuk a(fuk $$0, ghh $$1) {
      return new fyx($$0, $$1, this);
   }

   public static class a extends ghd.a<ghi> {
      public a(ghi $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hft> $$1, AbuseReportLimits $$2) {
         super(new ghi(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ghd.b c() {
         if (this.a.e == null) {
            return ghd.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ghd.b.d : super.c();
         }
      }

      @Override
      public Either<ghd.c, ghd.b> a(ghh $$0) {
         ghd.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hft $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ghd.c(this.a.a, ghg.b, $$6));
         }
      }
   }
}
