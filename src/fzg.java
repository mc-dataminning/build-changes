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

public class fzg extends fzb {
   final Supplier<gqb> f;

   fzg(UUID $$0, Instant $$1, UUID $$2, Supplier<gqb> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gqb> a() {
      return this.f;
   }

   public fzg c() {
      fzg $$0 = new fzg(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnf a(fnf $$0, fzf $$1) {
      return new frj($$0, $$1, this);
   }

   public static class a extends fzb.a<fzg> {
      public a(fzg $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gqb> $$1, AbuseReportLimits $$2) {
         super(new fzg(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fzb.b c() {
         if (this.a.e == null) {
            return fzb.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fzb.b.d : null;
         }
      }

      @Override
      public Either<fzb.c, fzb.b> a(fzf $$0) {
         fzb.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gqb $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fzb.c(this.a.a, fze.b, $$6));
         }
      }
   }
}
