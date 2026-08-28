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

public class gii extends gid {
   final Supplier<hgt> g;

   gii(UUID $$0, Instant $$1, UUID $$2, Supplier<hgt> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hgt> a() {
      return this.g;
   }

   public gii c() {
      gii $$0 = new gii(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fvi a(fvi $$0, gih $$1) {
      return new fzv($$0, $$1, this);
   }

   public static class a extends gid.a<gii> {
      public a(gii $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hgt> $$1, AbuseReportLimits $$2) {
         super(new gii(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gid.b c() {
         if (this.a.e == null) {
            return gid.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gid.b.d : super.c();
         }
      }

      @Override
      public Either<gid.c, gid.b> a(gih $$0) {
         gid.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hgt $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gid.c(this.a.a, gig.b, $$6));
         }
      }
   }
}
