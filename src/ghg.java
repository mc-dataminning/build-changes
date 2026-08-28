import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ghg(String a, @Nullable ghg.a b) {
   public static ghg a() {
      return a(null);
   }

   public static ghg a(String $$0) {
      return a(new ghg.a.b($$0));
   }

   public static ghg a(fhm $$0) {
      return a(new ghg.a.a($$0));
   }

   public static ghg a(@Nullable ghg.a $$0) {
      return new ghg(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ghg.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ghg.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.4-rc3");
      if (flk.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ghg.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ghg.a {
         public a(fhm $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ghg.a {
      }
   }
}
