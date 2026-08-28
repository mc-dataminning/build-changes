import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gid {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gif e;
   protected boolean f;

   public gid(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gid b();

   public abstract fvi a(fvi var1, gih var2);

   public abstract static class a<R extends gid> {
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
      public gif i() {
         return this.a.e;
      }

      public void a(gif $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gid.b c() {
         return !this.e().f ? gid.b.e : null;
      }

      public abstract Either<gid.c, gid.b> a(gih var1);
   }

   public static record b(wp f) {
      public static final gid.b a = new gid.b(wp.c("gui.abuseReport.send.no_reason"));
      public static final gid.b b = new gid.b(wp.c("gui.chatReport.send.no_reported_messages"));
      public static final gid.b c = new gid.b(wp.c("gui.chatReport.send.too_many_messages"));
      public static final gid.b d = new gid.b(wp.c("gui.abuseReport.send.comment_too_long"));
      public static final gid.b e = new gid.b(wp.c("gui.abuseReport.send.not_attested"));

      public frb a() {
         return frb.a(this.f);
      }

      public wp b() {
         return this.f;
      }
   }

   public static record c(UUID a, gig b, AbuseReport c) {
   }
}
