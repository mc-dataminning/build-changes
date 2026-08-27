import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fwr(String a, @Nullable fwr.a b) {
   public static fwr a() {
      return a(null);
   }

   public static fwr a(String $$0) {
      return a(new fwr.a.b($$0));
   }

   public static fwr a(eyu $$0) {
      return a(new fwr.a.a($$0));
   }

   public static fwr a(@Nullable fwr.a $$0) {
      return new fwr(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fwr.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fwr.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w11a");
      if (fcu.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fwr.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fwr.a {
         public a(eyu $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fwr.a {
      }
   }
}
