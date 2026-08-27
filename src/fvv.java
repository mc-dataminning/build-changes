import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fvv(String a, @Nullable fvv.a b) {
   public static fvv a() {
      return a(null);
   }

   public static fvv a(String $$0) {
      return a(new fvv.a.b($$0));
   }

   public static fvv a(exy $$0) {
      return a(new fvv.a.a($$0));
   }

   public static fvv a(@Nullable fvv.a $$0) {
      return new fvv(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fvv.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fvv.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w10a");
      if (fby.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fvv.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fvv.a {
         public a(exy $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fvv.a {
      }
   }
}
