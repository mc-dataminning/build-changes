import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gcb {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gcd e;
   protected boolean f;

   public gcb(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gcb b();

   public abstract fpt a(fpt var1, gcf var2);

   public abstract static class a<R extends gcb> {
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
      public gcd i() {
         return this.a.e;
      }

      public void a(gcd $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gcb.b c() {
         return !this.e().f ? gcb.b.e : null;
      }

      public abstract Either<gcb.c, gcb.b> a(gcf var1);
   }

   public static record b(xd f) {
      public static final gcb.b a = new gcb.b(xd.c("gui.abuseReport.send.no_reason"));
      public static final gcb.b b = new gcb.b(xd.c("gui.chatReport.send.no_reported_messages"));
      public static final gcb.b c = new gcb.b(xd.c("gui.chatReport.send.too_many_messages"));
      public static final gcb.b d = new gcb.b(xd.c("gui.abuseReport.send.comment_too_long"));
      public static final gcb.b e = new gcb.b(xd.c("gui.abuseReport.send.not_attested"));

      public fll a() {
         return fll.a(this.f);
      }

      public xd b() {
         return this.f;
      }
   }

   public static record c(UUID a, gce b, AbuseReport c) {
   }
}
