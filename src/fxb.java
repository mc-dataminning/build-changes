import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fxb(String a, @Nullable fxb.a b) {
   public static fxb a() {
      return a(null);
   }

   public static fxb a(String $$0) {
      return a(new fxb.a.b($$0));
   }

   public static fxb a(eze $$0) {
      return a(new fxb.a.a($$0));
   }

   public static fxb a(@Nullable fxb.a $$0) {
      return new fxb(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fxb.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fxb.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w12a");
      if (fde.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fxb.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fxb.a {
         public a(eze $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fxb.a {
      }
   }
}
