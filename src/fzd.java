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

public class fzd extends fyy {
   final Supplier<gpy> f;

   fzd(UUID $$0, Instant $$1, UUID $$2, Supplier<gpy> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gpy> a() {
      return this.f;
   }

   public fzd c() {
      fzd $$0 = new fzd(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnc a(fnc $$0, fzc $$1) {
      return new frg($$0, $$1, this);
   }

   public static class a extends fyy.a<fzd> {
      public a(fzd $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gpy> $$1, AbuseReportLimits $$2) {
         super(new fzd(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fyy.b c() {
         if (this.a.e == null) {
            return fyy.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fyy.b.d : null;
         }
      }

      @Override
      public Either<fyy.c, fyy.b> a(fzc $$0) {
         fyy.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gpy $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fyy.c(this.a.a, fzb.b, $$6));
         }
      }
   }
}
