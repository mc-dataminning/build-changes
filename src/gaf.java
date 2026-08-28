import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gaf(String a, @Nullable gaf.a b) {
   public static gaf a() {
      return a(null);
   }

   public static gaf a(String $$0) {
      return a(new gaf.a.b($$0));
   }

   public static gaf a(fcj $$0) {
      return a(new gaf.a.a($$0));
   }

   public static gaf a(@Nullable gaf.a $$0) {
      return new gaf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gaf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gaf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w21b");
      if (fgi.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gaf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gaf.a {
         public a(fcj $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gaf.a {
      }
   }
}
