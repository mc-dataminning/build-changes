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

public class ghj extends ghe {
   final Supplier<hfu> g;

   ghj(UUID $$0, Instant $$1, UUID $$2, Supplier<hfu> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hfu> a() {
      return this.g;
   }

   public ghj c() {
      ghj $$0 = new ghj(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ful a(ful $$0, ghi $$1) {
      return new fyy($$0, $$1, this);
   }

   public static class a extends ghe.a<ghj> {
      public a(ghj $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hfu> $$1, AbuseReportLimits $$2) {
         super(new ghj(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ghe.b c() {
         if (this.a.e == null) {
            return ghe.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ghe.b.d : super.c();
         }
      }

      @Override
      public Either<ghe.c, ghe.b> a(ghi $$0) {
         ghe.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hfu $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ghe.c(this.a.a, ghh.b, $$6));
         }
      }
   }
}
