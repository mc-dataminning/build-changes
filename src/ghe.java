import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ghe(String a, @Nullable ghe.a b) {
   public static ghe a() {
      return a(null);
   }

   public static ghe a(String $$0) {
      return a(new ghe.a.b($$0));
   }

   public static ghe a(fhk $$0) {
      return a(new ghe.a.a($$0));
   }

   public static ghe a(@Nullable ghe.a $$0) {
      return new ghe(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ghe.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ghe.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.4-pre1");
      if (fli.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ghe.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ghe.a {
         public a(fhk $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ghe.a {
      }
   }
}
