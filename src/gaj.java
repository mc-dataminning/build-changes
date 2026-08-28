import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gaj(String a, @Nullable gaj.a b) {
   public static gaj a() {
      return a(null);
   }

   public static gaj a(String $$0) {
      return a(new gaj.a.b($$0));
   }

   public static gaj a(fcn $$0) {
      return a(new gaj.a.a($$0));
   }

   public static gaj a(@Nullable gaj.a $$0) {
      return new gaj(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gaj.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gaj.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21-pre1");
      if (fgm.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gaj.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gaj.a {
         public a(fcn $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gaj.a {
      }
   }
}
