import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fyz(String a, @Nullable fyz.a b) {
   public static fyz a() {
      return a(null);
   }

   public static fyz a(String $$0) {
      return a(new fyz.a.b($$0));
   }

   public static fyz a(fbe $$0) {
      return a(new fyz.a.a($$0));
   }

   public static fyz a(@Nullable fyz.a $$0) {
      return new fyz(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fyz.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fyz.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.5-pre3");
      if (ffe.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fyz.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fyz.a {
         public a(fbe $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fyz.a {
      }
   }
}
