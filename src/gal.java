import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gal(String a, @Nullable gal.a b) {
   public static gal a() {
      return a(null);
   }

   public static gal a(String $$0) {
      return a(new gal.a.b($$0));
   }

   public static gal a(fcp $$0) {
      return a(new gal.a.a($$0));
   }

   public static gal a(@Nullable gal.a $$0) {
      return new gal(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gal.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gal.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21-pre2");
      if (fgo.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gal.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gal.a {
         public a(fcp $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gal.a {
      }
   }
}
