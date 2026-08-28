import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gae {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gag e;

   public gae(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gae b();

   public abstract fnx a(fnx var1, gai var2);

   public abstract static class a<R extends gae> {
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
      public gag h() {
         return this.a.e;
      }

      public void a(gag $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract gae.b c();

      public abstract Either<gae.c, gae.b> a(gai var1);
   }

   public static record b(wy e) {
      public static final gae.b a = new gae.b(wy.c("gui.abuseReport.send.no_reason"));
      public static final gae.b b = new gae.b(wy.c("gui.chatReport.send.no_reported_messages"));
      public static final gae.b c = new gae.b(wy.c("gui.chatReport.send.too_many_messages"));
      public static final gae.b d = new gae.b(wy.c("gui.abuseReport.send.comment_too_long"));

      public fjr a() {
         return fjr.a(this.e);
      }

      public wy b() {
         return this.e;
      }
   }

   public static record c(UUID a, gah b, AbuseReport c) {
   }
}
