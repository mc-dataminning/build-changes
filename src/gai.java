import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gai {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gak e;

   public gai(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gai b();

   public abstract fob a(fob var1, gam var2);

   public abstract static class a<R extends gai> {
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
      public gak h() {
         return this.a.e;
      }

      public void a(gak $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract gai.b c();

      public abstract Either<gai.c, gai.b> a(gam var1);
   }

   public static record b(wz e) {
      public static final gai.b a = new gai.b(wz.c("gui.abuseReport.send.no_reason"));
      public static final gai.b b = new gai.b(wz.c("gui.chatReport.send.no_reported_messages"));
      public static final gai.b c = new gai.b(wz.c("gui.chatReport.send.too_many_messages"));
      public static final gai.b d = new gai.b(wz.c("gui.abuseReport.send.comment_too_long"));

      public fjv a() {
         return fjv.a(this.e);
      }

      public wz b() {
         return this.e;
      }
   }

   public static record c(UUID a, gal b, AbuseReport c) {
   }
}
