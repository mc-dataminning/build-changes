import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gdm {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gdo e;
   protected boolean f;

   public gdm(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gdm b();

   public abstract fra a(fra var1, gdq var2);

   public abstract static class a<R extends gdm> {
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
      public gdo i() {
         return this.a.e;
      }

      public void a(gdo $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gdm.b c() {
         return !this.e().f ? gdm.b.e : null;
      }

      public abstract Either<gdm.c, gdm.b> a(gdq var1);
   }

   public static record b(xi f) {
      public static final gdm.b a = new gdm.b(xi.c("gui.abuseReport.send.no_reason"));
      public static final gdm.b b = new gdm.b(xi.c("gui.chatReport.send.no_reported_messages"));
      public static final gdm.b c = new gdm.b(xi.c("gui.chatReport.send.too_many_messages"));
      public static final gdm.b d = new gdm.b(xi.c("gui.abuseReport.send.comment_too_long"));
      public static final gdm.b e = new gdm.b(xi.c("gui.abuseReport.send.not_attested"));

      public fms a() {
         return fms.a(this.f);
      }

      public xi b() {
         return this.f;
      }
   }

   public static record c(UUID a, gdp b, AbuseReport c) {
   }
}
