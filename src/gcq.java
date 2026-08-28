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

public class gcq extends gcl {
   final Supplier<gyc> g;

   gcq(UUID $$0, Instant $$1, UUID $$2, Supplier<gyc> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<gyc> a() {
      return this.g;
   }

   public gcq c() {
      gcq $$0 = new gcq(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fqd a(fqd $$0, gcp $$1) {
      return new fup($$0, $$1, this);
   }

   public static class a extends gcl.a<gcq> {
      public a(gcq $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gyc> $$1, AbuseReportLimits $$2) {
         super(new gcq(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gcl.b c() {
         if (this.a.e == null) {
            return gcl.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gcl.b.d : super.c();
         }
      }

      @Override
      public Either<gcl.c, gcl.b> a(gcp $$0) {
         gcl.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gyc $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gcl.c(this.a.a, gco.b, $$6));
         }
      }
   }
}
