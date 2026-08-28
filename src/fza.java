import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fza(String a, @Nullable fza.a b) {
   public static fza a() {
      return a(null);
   }

   public static fza a(String $$0) {
      return a(new fza.a.b($$0));
   }

   public static fza a(fbf $$0) {
      return a(new fza.a.a($$0));
   }

   public static fza a(@Nullable fza.a $$0) {
      return new fza(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fza.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fza.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.5-pre4");
      if (fff.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fza.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fza.a {
         public a(fbf $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fza.a {
      }
   }
}
