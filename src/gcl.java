import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gcl {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gcn e;
   protected boolean f;

   public gcl(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gcl b();

   public abstract fqd a(fqd var1, gcp var2);

   public abstract static class a<R extends gcl> {
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
      public gcn i() {
         return this.a.e;
      }

      public void a(gcn $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gcl.b c() {
         return !this.e().f ? gcl.b.e : null;
      }

      public abstract Either<gcl.c, gcl.b> a(gcp var1);
   }

   public static record b(xd f) {
      public static final gcl.b a = new gcl.b(xd.c("gui.abuseReport.send.no_reason"));
      public static final gcl.b b = new gcl.b(xd.c("gui.chatReport.send.no_reported_messages"));
      public static final gcl.b c = new gcl.b(xd.c("gui.chatReport.send.too_many_messages"));
      public static final gcl.b d = new gcl.b(xd.c("gui.abuseReport.send.comment_too_long"));
      public static final gcl.b e = new gcl.b(xd.c("gui.abuseReport.send.not_attested"));

      public flv a() {
         return flv.a(this.f);
      }

      public xd b() {
         return this.f;
      }
   }

   public static record c(UUID a, gco b, AbuseReport c) {
   }
}
