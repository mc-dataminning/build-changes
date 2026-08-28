import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record glf(String a, @Nullable glf.a b) {
   public static glf a() {
      return a(null);
   }

   public static glf a(String $$0) {
      return a(new glf.a.b($$0));
   }

   public static glf a(fla $$0) {
      return a(new glf.a.a($$0));
   }

   public static glf a(@Nullable glf.a $$0) {
      return new glf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof glf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof glf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w06a");
      if (foz.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public glf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements glf.a {
         public a(fla $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements glf.a {
      }
   }
}
