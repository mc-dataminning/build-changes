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

public class fzl extends fzo {
   final IntSet f = new IntOpenHashSet();

   fzl(UUID $$0, Instant $$1, UUID $$2) {
      super($$0, $$1, $$2);
   }

   public void a(int $$0, AbuseReportLimits $$1) {
      if (this.f.contains($$0)) {
         this.f.remove($$0);
      } else if (this.f.size() < $$1.maxReportedMessageCount()) {
         this.f.add($$0);
      }
   }

   public fzl a() {
      fzl $$0 = new fzl(this.a, this.b, this.c);
      $$0.f.addAll(this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnj a(fnj $$0, fzs $$1) {
      return new frp($$0, $$1, this);
   }

   public static class a extends fzo.a<fzl> {
      public a(fzl $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, AbuseReportLimits $$1) {
         super(new fzl(UUID.randomUUID(), Instant.now(), $$0), $$1);
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
      public fzo.b c() {
         if (this.a.f.isEmpty()) {
            return fzo.b.b;
         } else if (this.a.f.size() > this.b.maxReportedMessageCount()) {
            return fzo.b.c;
         } else if (this.a.e == null) {
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
            ReportEvidence $$3 = this.b($$0);
            ReportedEntity $$4 = new ReportedEntity(this.a.c);
            AbuseReport $$5 = AbuseReport.chat(this.a.d, $$2, $$3, $$4, this.a.b);
            return Either.left(new fzo.c(this.a.a, fzr.a, $$5));
         }
      }

      private ReportEvidence b(fzs $$0) {
         List<ReportChatMessage> $$1 = new ArrayList<>();
         fzm $$2 = new fzm(this.b.leadingContextMessageCount());
         $$2.a($$0.b(), this.a.f, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
         return new ReportEvidence(Lists.reverse($$1));
      }

      private ReportChatMessage a(fzh.a $$0, boolean $$1) {
         xp $$2 = $$0.g().k();
         xn $$3 = $$0.g().m();
         List<ByteBuffer> $$4 = $$3.d().a().stream().map(xg::a).toList();
         ByteBuffer $$5 = x.a($$0.g().l(), xg::a);
         return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
      }

      public fzl.a d() {
         return new fzl.a(this.a.a(), this.b);
      }
   }
}
