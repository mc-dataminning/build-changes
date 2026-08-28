import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ghf(String a, @Nullable ghf.a b) {
   public static ghf a() {
      return a(null);
   }

   public static ghf a(String $$0) {
      return a(new ghf.a.b($$0));
   }

   public static ghf a(fhl $$0) {
      return a(new ghf.a.a($$0));
   }

   public static ghf a(@Nullable ghf.a $$0) {
      return new ghf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ghf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ghf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.4-rc1");
      if (flj.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ghf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ghf.a {
         public a(fhl $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ghf.a {
      }
   }
}
