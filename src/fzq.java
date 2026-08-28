import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fzq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fzs e;

   public fzq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fzq b();

   public abstract fnl a(fnl var1, fzu var2);

   public abstract static class a<R extends fzq> {
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
      public fzs h() {
         return this.a.e;
      }

      public void a(fzs $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fzq.b c();

      public abstract Either<fzq.c, fzq.b> a(fzu var1);
   }

   public static record b(wu e) {
      public static final fzq.b a = new fzq.b(wu.c("gui.abuseReport.send.no_reason"));
      public static final fzq.b b = new fzq.b(wu.c("gui.chatReport.send.no_reported_messages"));
      public static final fzq.b c = new fzq.b(wu.c("gui.chatReport.send.too_many_messages"));
      public static final fzq.b d = new fzq.b(wu.c("gui.abuseReport.send.comment_too_long"));

      public fjf a() {
         return fjf.a(this.e);
      }

      public wu b() {
         return this.e;
      }
   }

   public static record c(UUID a, fzt b, AbuseReport c) {
   }
}
