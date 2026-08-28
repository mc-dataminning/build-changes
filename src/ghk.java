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

public class ghk extends ghf {
   final Supplier<hfv> g;

   ghk(UUID $$0, Instant $$1, UUID $$2, Supplier<hfv> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hfv> a() {
      return this.g;
   }

   public ghk c() {
      ghk $$0 = new ghk(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fum a(fum $$0, ghj $$1) {
      return new fyz($$0, $$1, this);
   }

   public static class a extends ghf.a<ghk> {
      public a(ghk $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hfv> $$1, AbuseReportLimits $$2) {
         super(new ghk(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ghf.b c() {
         if (this.a.e == null) {
            return ghf.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ghf.b.d : super.c();
         }
      }

      @Override
      public Either<ghf.c, ghf.b> a(ghj $$0) {
         ghf.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hfv $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ghf.c(this.a.a, ghi.b, $$6));
         }
      }
   }
}
