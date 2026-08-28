import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gel {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gen e;
   protected boolean f;

   public gel(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gel b();

   public abstract frw a(frw var1, gep var2);

   public abstract static class a<R extends gel> {
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
      public gen i() {
         return this.a.e;
      }

      public void a(gen $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gel.b c() {
         return !this.e().f ? gel.b.e : null;
      }

      public abstract Either<gel.c, gel.b> a(gep var1);
   }

   public static record b(xj f) {
      public static final gel.b a = new gel.b(xj.c("gui.abuseReport.send.no_reason"));
      public static final gel.b b = new gel.b(xj.c("gui.chatReport.send.no_reported_messages"));
      public static final gel.b c = new gel.b(xj.c("gui.chatReport.send.too_many_messages"));
      public static final gel.b d = new gel.b(xj.c("gui.abuseReport.send.comment_too_long"));
      public static final gel.b e = new gel.b(xj.c("gui.abuseReport.send.not_attested"));

      public fno a() {
         return fno.a(this.f);
      }

      public xj b() {
         return this.f;
      }
   }

   public static record c(UUID a, geo b, AbuseReport c) {
   }
}
