import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ggm extends ggp {
   final IntSet g = new IntOpenHashSet();

   ggm(UUID $$0, Instant $$1, UUID $$2) {
      super($$0, $$1, $$2);
   }

   public void a(int $$0, AbuseReportLimits $$1) {
      if (this.g.contains($$0)) {
         this.g.remove($$0);
      } else if (this.g.size() < $$1.maxReportedMessageCount()) {
         this.g.add($$0);
      }
   }

   public ggm a() {
      ggm $$0 = new ggm(this.a, this.b, this.c);
      $$0.g.addAll(this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fty a(fty $$0, ggt $$1) {
      return new fyf($$0, $$1, this);
   }

   public static class a extends ggp.a<ggm> {
      public a(ggm $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, AbuseReportLimits $$1) {
         super(new ggm(UUID.randomUUID(), Instant.now(), $$0), $$1);
      }

      public IntSet a() {
         return this.a.g;
      }

      public void a(int $$0) {
         this.a.a($$0, this.b);
      }

      public boolean b(int $$0) {
         return this.a.g.contains($$0);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || !this.a().isEmpty() || this.i() != null;
      }

      @Nullable
      @Override
      public ggp.b c() {
         if (this.a.g.isEmpty()) {
            return ggp.b.b;
         } else if (this.a.g.size() > this.b.maxReportedMessageCount()) {
            return ggp.b.c;
         } else if (this.a.e == null) {
            return ggp.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggp.b.d : super.c();
         }
      }

      @Override
      public Either<ggp.c, ggp.b> a(ggt $$0) {
         ggp.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportEvidence $$3 = this.b($$0);
            ReportedEntity $$4 = new ReportedEntity(this.a.c);
            AbuseReport $$5 = AbuseReport.chat(this.a.d, $$2, $$3, $$4, this.a.b);
            return Either.left(new ggp.c(this.a.a, ggs.a, $$5));
         }
      }

      private ReportEvidence b(ggt $$0) {
         List<ReportChatMessage> $$1 = new ArrayList<>();
         ggn $$2 = new ggn(this.b.leadingContextMessageCount());
         $$2.a($$0.b(), this.a.g, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
         return new ReportEvidence(Lists.reverse($$1));
      }

      private ReportChatMessage a(ggi.a $$0, boolean $$1) {
         yq $$2 = $$0.g().k();
         yo $$3 = $$0.g().m();
         List<ByteBuffer> $$4 = $$3.d().a().stream().map(yh::a).toList();
         ByteBuffer $$5 = x.a($$0.g().l(), yh::a);
         return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
      }

      public ggm.a d() {
         return new ggm.a(this.a.a(), this.b);
      }
   }
}
