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

public class fzt extends fzo {
   final Supplier<gqo> f;

   fzt(UUID $$0, Instant $$1, UUID $$2, Supplier<gqo> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gqo> a() {
      return this.f;
   }

   public fzt c() {
      fzt $$0 = new fzt(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnj a(fnj $$0, fzs $$1) {
      return new frv($$0, $$1, this);
   }

   public static class a extends fzo.a<fzt> {
      public a(fzt $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gqo> $$1, AbuseReportLimits $$2) {
         super(new fzt(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fzo.b c() {
         if (this.a.e == null) {
            return fzo.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fzo.b.d : null;
         }
      }

      @Override
      public Either<fzo.c, fzo.b> a(fzs $$0) {
         fzo.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gqo $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fzo.c(this.a.a, fzr.b, $$6));
         }
      }
   }
}
