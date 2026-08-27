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

public class fvi extends fvl {
   final IntSet f = new IntOpenHashSet();

   fvi(UUID $$0, Instant $$1, UUID $$2) {
      super($$0, $$1, $$2);
   }

   public void a(int $$0, AbuseReportLimits $$1) {
      if (this.f.contains($$0)) {
         this.f.remove($$0);
      } else if (this.f.size() < $$1.maxReportedMessageCount()) {
         this.f.add($$0);
      }
   }

   public fvi a() {
      fvi $$0 = new fvi(this.a, this.b, this.c);
      $$0.f.addAll(this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fjo a(fjo $$0, fvp $$1) {
      return new fnm($$0, $$1, this);
   }

   public static class a extends fvl.a<fvi> {
      public a(fvi $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, AbuseReportLimits $$1) {
         super(new fvi(UUID.randomUUID(), Instant.now(), $$0), $$1);
      }

      public IntSet a() {
         return this.a.f;
      }

      public void a(int $$0) {
         this.a.a($$0, this.b);
      }

      public boolean b(int $$0) {
         return this.a.f.contains($$0);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || !this.a().isEmpty() || this.h() != null;
      }

      @Nullable
      @Override
      public fvl.b c() {
         if (this.a.f.isEmpty()) {
            return fvl.b.b;
         } else if (this.a.f.size() > this.b.maxReportedMessageCount()) {
            return fvl.b.c;
         } else if (this.a.e == null) {
            return fvl.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fvl.b.d : null;
         }
      }

      @Override
      public Either<fvl.c, fvl.b> a(fvp $$0) {
         fvl.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportEvidence $$3 = this.b($$0);
            ReportedEntity $$4 = new ReportedEntity(this.a.c);
            AbuseReport $$5 = AbuseReport.chat(this.a.d, $$2, $$3, $$4, this.a.b);
            return Either.left(new fvl.c(this.a.a, fvo.a, $$5));
         }
      }

      private ReportEvidence b(fvp $$0) {
         List<ReportChatMessage> $$1 = new ArrayList<>();
         fvj $$2 = new fvj(this.b.leadingContextMessageCount());
         $$2.a($$0.b(), this.a.f, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
         return new ReportEvidence(Lists.reverse($$1));
      }

      private ReportChatMessage a(fve.a $$0, boolean $$1) {
         xb $$2 = $$0.g().k();
         wz $$3 = $$0.g().m();
         List<ByteBuffer> $$4 = $$3.d().a().stream().map(ws::a).toList();
         ByteBuffer $$5 = x.a($$0.g().l(), ws::a);
         return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
      }

      public fvi.a d() {
         return new fvi.a(this.a.a(), this.b);
      }
   }
}
