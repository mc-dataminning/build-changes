import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gcr(String a, @Nullable gcr.a b) {
   public static gcr a() {
      return a(null);
   }

   public static gcr a(String $$0) {
      return a(new gcr.a.b($$0));
   }

   public static gcr a(fep $$0) {
      return a(new gcr.a.a($$0));
   }

   public static gcr a(@Nullable gcr.a $$0) {
      return new gcr(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gcr.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gcr.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w35a");
      if (fip.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gcr.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gcr.a {
         public a(fep $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gcr.a {
      }
   }
}
