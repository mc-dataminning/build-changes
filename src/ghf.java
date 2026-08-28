import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ghf {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ghh e;
   protected boolean f;

   public ghf(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ghf b();

   public abstract fum a(fum var1, ghj var2);

   public abstract static class a<R extends ghf> {
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
      public ghh i() {
         return this.a.e;
      }

      public void a(ghh $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ghf.b c() {
         return !this.e().f ? ghf.b.e : null;
      }

      public abstract Either<ghf.c, ghf.b> a(ghj var1);
   }

   public static record b(wp f) {
      public static final ghf.b a = new ghf.b(wp.c("gui.abuseReport.send.no_reason"));
      public static final ghf.b b = new ghf.b(wp.c("gui.chatReport.send.no_reported_messages"));
      public static final ghf.b c = new ghf.b(wp.c("gui.chatReport.send.too_many_messages"));
      public static final ghf.b d = new ghf.b(wp.c("gui.abuseReport.send.comment_too_long"));
      public static final ghf.b e = new ghf.b(wp.c("gui.abuseReport.send.not_attested"));

      public fqf a() {
         return fqf.a(this.f);
      }

      public wp b() {
         return this.f;
      }
   }

   public static record c(UUID a, ghi b, AbuseReport c) {
   }
}
