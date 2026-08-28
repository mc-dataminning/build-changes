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

public class ggs extends ggn {
   final Supplier<hck> g;

   ggs(UUID $$0, Instant $$1, UUID $$2, Supplier<hck> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hck> a() {
      return this.g;
   }

   public ggs c() {
      ggs $$0 = new ggs(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ftw a(ftw $$0, ggr $$1) {
      return new fyj($$0, $$1, this);
   }

   public static class a extends ggn.a<ggs> {
      public a(ggs $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hck> $$1, AbuseReportLimits $$2) {
         super(new ggs(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ggn.b c() {
         if (this.a.e == null) {
            return ggn.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggn.b.d : super.c();
         }
      }

      @Override
      public Either<ggn.c, ggn.b> a(ggr $$0) {
         ggn.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hck $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ggn.c(this.a.a, ggq.b, $$6));
         }
      }
   }
}
