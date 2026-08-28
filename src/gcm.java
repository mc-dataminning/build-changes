import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gcm(String a, @Nullable gcm.a b) {
   public static gcm a() {
      return a(null);
   }

   public static gcm a(String $$0) {
      return a(new gcm.a.b($$0));
   }

   public static gcm a(fel $$0) {
      return a(new gcm.a.a($$0));
   }

   public static gcm a(@Nullable gcm.a $$0) {
      return new gcm(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gcm.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gcm.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w34a");
      if (fil.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gcm.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gcm.a {
         public a(fel $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gcm.a {
      }
   }
}
