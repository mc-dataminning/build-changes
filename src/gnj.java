import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gnj(String a, @Nullable gnj.a b) {
   public static gnj a() {
      return a(null);
   }

   public static gnj a(String $$0) {
      return a(new gnj.a.b($$0));
   }

   public static gnj a(fng $$0) {
      return a(new gnj.a.a($$0));
   }

   public static gnj a(@Nullable gnj.a $$0) {
      return new gnj(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gnj.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gnj.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w10a");
      if (frf.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gnj.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gnj.a {
         public a(fng $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gnj.a {
      }
   }
}
