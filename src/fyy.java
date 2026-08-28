import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fyy {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fza e;

   public fyy(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fyy b();

   public abstract fnc a(fnc var1, fzc var2);

   public abstract static class a<R extends fyy> {
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
      public fza h() {
         return this.a.e;
      }

      public void a(fza $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fyy.b c();

      public abstract Either<fyy.c, fyy.b> a(fzc var1);
   }

   public static record b(xo e) {
      public static final fyy.b a = new fyy.b(xo.c("gui.abuseReport.send.no_reason"));
      public static final fyy.b b = new fyy.b(xo.c("gui.chatReport.send.no_reported_messages"));
      public static final fyy.b c = new fyy.b(xo.c("gui.chatReport.send.too_many_messages"));
      public static final fyy.b d = new fyy.b(xo.c("gui.abuseReport.send.comment_too_long"));

      public fio a() {
         return fio.a(this.e);
      }

      public xo b() {
         return this.e;
      }
   }

   public static record c(UUID a, fzb b, AbuseReport c) {
   }
}
