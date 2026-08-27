import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fxw(String a, @Nullable fxw.a b) {
   public static fxw a() {
      return a(null);
   }

   public static fxw a(String $$0) {
      return a(new fxw.a.b($$0));
   }

   public static fxw a(ezz $$0) {
      return a(new fxw.a.a($$0));
   }

   public static fxw a(@Nullable fxw.a $$0) {
      return new fxw(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fxw.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fxw.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w13a");
      if (fdz.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fxw.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fxw.a {
         public a(ezz $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fxw.a {
      }
   }
}
