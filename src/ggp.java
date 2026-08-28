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

public class ggp extends ggk {
   final Supplier<hch> g;

   ggp(UUID $$0, Instant $$1, UUID $$2, Supplier<hch> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hch> a() {
      return this.g;
   }

   public ggp c() {
      ggp $$0 = new ggp(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ftr a(ftr $$0, ggo $$1) {
      return new fye($$0, $$1, this);
   }

   public static class a extends ggk.a<ggp> {
      public a(ggp $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hch> $$1, AbuseReportLimits $$2) {
         super(new ggp(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ggk.b c() {
         if (this.a.e == null) {
            return ggk.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggk.b.d : super.c();
         }
      }

      @Override
      public Either<ggk.c, ggk.b> a(ggo $$0) {
         ggk.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hch $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ggk.c(this.a.a, ggn.b, $$6));
         }
      }
   }
}
