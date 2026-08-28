import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gem(String a, @Nullable gem.a b) {
   public static gem a() {
      return a(null);
   }

   public static gem a(String $$0) {
      return a(new gem.a.b($$0));
   }

   public static gem a(fgi $$0) {
      return a(new gem.a.a($$0));
   }

   public static gem a(@Nullable gem.a $$0) {
      return new gem(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gem.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gem.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w39a");
      if (fke.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gem.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gem.a {
         public a(fgi $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gem.a {
      }
   }
}
