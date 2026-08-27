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

public class fwv extends fwq {
   final Supplier<gnn> f;

   fwv(UUID $$0, Instant $$1, UUID $$2, Supplier<gnn> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gnn> a() {
      return this.f;
   }

   public fwv c() {
      fwv $$0 = new fwv(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fkt a(fkt $$0, fwu $$1) {
      return new foy($$0, $$1, this);
   }

   public static class a extends fwq.a<fwv> {
      public a(fwv $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gnn> $$1, AbuseReportLimits $$2) {
         super(new fwv(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fwq.b c() {
         if (this.a.e == null) {
            return fwq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fwq.b.d : null;
         }
      }

      @Override
      public Either<fwq.c, fwq.b> a(fwu $$0) {
         fwq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gnn $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fwq.c(this.a.a, fwt.b, $$6));
         }
      }
   }
}
