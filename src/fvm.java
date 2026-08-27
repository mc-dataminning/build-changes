import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fvm(String a, @Nullable fvm.a b) {
   public static fvm a() {
      return a(null);
   }

   public static fvm a(String $$0) {
      return a(new fvm.a.b($$0));
   }

   public static fvm a(exp $$0) {
      return a(new fvm.a.a($$0));
   }

   public static fvm a(@Nullable fvm.a $$0) {
      return new fvm(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fvm.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fvm.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w09a");
      if (fbp.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fvm.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fvm.a {
         public a(exp $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fvm.a {
      }
   }
}
