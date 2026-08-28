import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record glr(String a, @Nullable glr.a b) {
   public static glr a() {
      return a(null);
   }

   public static glr a(String $$0) {
      return a(new glr.a.b($$0));
   }

   public static glr a(flp $$0) {
      return a(new glr.a.a($$0));
   }

   public static glr a(@Nullable glr.a $$0) {
      return new glr(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof glr.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof glr.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w07a");
      if (fpo.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public glr.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements glr.a {
         public a(flp $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements glr.a {
      }
   }
}
