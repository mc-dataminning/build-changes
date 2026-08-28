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

public class geq extends gel {
   final Supplier<haf> g;

   geq(UUID $$0, Instant $$1, UUID $$2, Supplier<haf> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<haf> a() {
      return this.g;
   }

   public geq c() {
      geq $$0 = new geq(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public frw a(frw $$0, gep $$1) {
      return new fwj($$0, $$1, this);
   }

   public static class a extends gel.a<geq> {
      public a(geq $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<haf> $$1, AbuseReportLimits $$2) {
         super(new geq(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gel.b c() {
         if (this.a.e == null) {
            return gel.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gel.b.d : super.c();
         }
      }

      @Override
      public Either<gel.c, gel.b> a(gep $$0) {
         gel.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            haf $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gel.c(this.a.a, geo.b, $$6));
         }
      }
   }
}
