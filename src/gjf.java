import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gjf(String a, @Nullable gjf.a b) {
   public static gjf a() {
      return a(null);
   }

   public static gjf a(String $$0) {
      return a(new gjf.a.b($$0));
   }

   public static gjf a(fjf $$0) {
      return a(new gjf.a.a($$0));
   }

   public static gjf a(@Nullable gjf.a $$0) {
      return new gjf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gjf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gjf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w03a");
      if (fnd.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gjf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gjf.a {
         public a(fjf $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gjf.a {
      }
   }
}
