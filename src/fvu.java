import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fvu {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fvw e;

   public fvu(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fvu b();

   public abstract fjx a(fjx var1, fvy var2);

   public abstract static class a<R extends fvu> {
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
      public fvw h() {
         return this.a.e;
      }

      public void a(fvw $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fvu.b c();

      public abstract Either<fvu.c, fvu.b> a(fvy var1);
   }

   public static record b(wi e) {
      public static final fvu.b a = new fvu.b(wi.c("gui.abuseReport.send.no_reason"));
      public static final fvu.b b = new fvu.b(wi.c("gui.chatReport.send.no_reported_messages"));
      public static final fvu.b c = new fvu.b(wi.c("gui.chatReport.send.too_many_messages"));
      public static final fvu.b d = new fvu.b(wi.c("gui.abuseReport.send.comment_too_long"));

      public ffj a() {
         return ffj.a(this.e);
      }

      public wi b() {
         return this.e;
      }
   }

   public static record c(UUID a, fvx b, AbuseReport c) {
   }
}
