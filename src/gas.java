import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gas(String a, @Nullable gas.a b) {
   public static gas a() {
      return a(null);
   }

   public static gas a(String $$0) {
      return a(new gas.a.b($$0));
   }

   public static gas a(fcj $$0) {
      return a(new gas.a.a($$0));
   }

   public static gas a(@Nullable gas.a $$0) {
      return new gas(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gas.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gas.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w14potato");
      if (fgj.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gas.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gas.a {
         public a(fcj $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gas.a {
      }
   }
}
