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

public class gnn extends gni {
   final Supplier<hme> g;

   gnn(UUID $$0, Instant $$1, UUID $$2, Supplier<hme> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hme> a() {
      return this.g;
   }

   public gnn c() {
      gnn $$0 = new gnn(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public gaf a(gaf $$0, gnm $$1) {
      return new geu($$0, $$1, this);
   }

   public static class a extends gni.a<gnn> {
      public a(gnn $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hme> $$1, AbuseReportLimits $$2) {
         super(new gnn(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gni.b c() {
         if (this.a.e == null) {
            return gni.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gni.b.d : super.c();
         }
      }

      @Override
      public Either<gni.c, gni.b> a(gnm $$0) {
         gni.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hme $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gni.c(this.a.a, gnl.b, $$6));
         }
      }
   }
}
