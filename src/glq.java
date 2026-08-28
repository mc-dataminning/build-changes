import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class glq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gls e;
   protected boolean f;

   public glq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract glq b();

   public abstract fyn a(fyn var1, glu var2);

   public abstract static class a<R extends glq> {
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
      public gls i() {
         return this.a.e;
      }

      public void a(gls $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public glq.b c() {
         return !this.e().f ? glq.b.e : null;
      }

      public abstract Either<glq.c, glq.b> a(glu var1);
   }

   public static record b(wy f) {
      public static final glq.b a = new glq.b(wy.c("gui.abuseReport.send.no_reason"));
      public static final glq.b b = new glq.b(wy.c("gui.chatReport.send.no_reported_messages"));
      public static final glq.b c = new glq.b(wy.c("gui.chatReport.send.too_many_messages"));
      public static final glq.b d = new glq.b(wy.c("gui.abuseReport.send.comment_too_long"));
      public static final glq.b e = new glq.b(wy.c("gui.abuseReport.send.not_attested"));

      public fug a() {
         return fug.a(this.f);
      }

      public wy b() {
         return this.f;
      }
   }

   public static record c(UUID a, glt b, AbuseReport c) {
   }
}
