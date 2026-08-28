import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fyu {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fyw e;

   public fyu(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fyu b();

   public abstract fmy a(fmy var1, fyy var2);

   public abstract static class a<R extends fyu> {
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

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fyw h() {
         return this.a.e;
      }

      public void a(fyw $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fyu.b c();

      public abstract Either<fyu.c, fyu.b> a(fyy var1);
   }

   public static record b(xl e) {
      public static final fyu.b a = new fyu.b(xl.c("gui.abuseReport.send.no_reason"));
      public static final fyu.b b = new fyu.b(xl.c("gui.chatReport.send.no_reported_messages"));
      public static final fyu.b c = new fyu.b(xl.c("gui.chatReport.send.too_many_messages"));
      public static final fyu.b d = new fyu.b(xl.c("gui.abuseReport.send.comment_too_long"));

      public fik a() {
         return fik.a(this.e);
      }

      public xl b() {
         return this.e;
      }
   }

   public static record c(UUID a, fyx b, AbuseReport c) {
   }
}
