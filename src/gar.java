import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gar {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gat e;

   public gar(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gar b();

   public abstract fon a(fon var1, gav var2);

   public abstract static class a<R extends gar> {
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
      public gat h() {
         return this.a.e;
      }

      public void a(gat $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract gar.b c();

      public abstract Either<gar.c, gar.b> a(gav var1);
   }

   public static record b(xe e) {
      public static final gar.b a = new gar.b(xe.c("gui.abuseReport.send.no_reason"));
      public static final gar.b b = new gar.b(xe.c("gui.chatReport.send.no_reported_messages"));
      public static final gar.b c = new gar.b(xe.c("gui.chatReport.send.too_many_messages"));
      public static final gar.b d = new gar.b(xe.c("gui.abuseReport.send.comment_too_long"));

      public fjy a() {
         return fjy.a(this.e);
      }

      public xe b() {
         return this.e;
      }
   }

   public static record c(UUID a, gau b, AbuseReport c) {
   }
}
