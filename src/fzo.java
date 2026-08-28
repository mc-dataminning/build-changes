import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fzo {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fzq e;

   public fzo(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fzo b();

   public abstract fnj a(fnj var1, fzs var2);

   public abstract static class a<R extends fzo> {
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
      public fzq h() {
         return this.a.e;
      }

      public void a(fzq $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fzo.b c();

      public abstract Either<fzo.c, fzo.b> a(fzs var1);
   }

   public static record b(wu e) {
      public static final fzo.b a = new fzo.b(wu.c("gui.abuseReport.send.no_reason"));
      public static final fzo.b b = new fzo.b(wu.c("gui.chatReport.send.no_reported_messages"));
      public static final fzo.b c = new fzo.b(wu.c("gui.chatReport.send.too_many_messages"));
      public static final fzo.b d = new fzo.b(wu.c("gui.abuseReport.send.comment_too_long"));

      public fjd a() {
         return fjd.a(this.e);
      }

      public wu b() {
         return this.e;
      }
   }

   public static record c(UUID a, fzr b, AbuseReport c) {
   }
}
