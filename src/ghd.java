import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ghd {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ghf e;
   protected boolean f;

   public ghd(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ghd b();

   public abstract fuk a(fuk var1, ghh var2);

   public abstract static class a<R extends ghd> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public boolean h() {
         return this.e().f;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public ghf i() {
         return this.a.e;
      }

      public void a(ghf $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ghd.b c() {
         return !this.e().f ? ghd.b.e : null;
      }

      public abstract Either<ghd.c, ghd.b> a(ghh var1);
   }

   public static record b(wo f) {
      public static final ghd.b a = new ghd.b(wo.c("gui.abuseReport.send.no_reason"));
      public static final ghd.b b = new ghd.b(wo.c("gui.chatReport.send.no_reported_messages"));
      public static final ghd.b c = new ghd.b(wo.c("gui.chatReport.send.too_many_messages"));
      public static final ghd.b d = new ghd.b(wo.c("gui.abuseReport.send.comment_too_long"));
      public static final ghd.b e = new ghd.b(wo.c("gui.abuseReport.send.not_attested"));

      public fqd a() {
         return fqd.a(this.f);
      }

      public wo b() {
         return this.f;
      }
   }

   public static record c(UUID a, ghg b, AbuseReport c) {
   }
}
