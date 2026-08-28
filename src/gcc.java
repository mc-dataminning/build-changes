import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gcc(String a, @Nullable gcc.a b) {
   public static gcc a() {
      return a(null);
   }

   public static gcc a(String $$0) {
      return a(new gcc.a.b($$0));
   }

   public static gcc a(feb $$0) {
      return a(new gcc.a.a($$0));
   }

   public static gcc a(@Nullable gcc.a $$0) {
      return new gcc(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gcc.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gcc.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w33a");
      if (fib.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gcc.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gcc.a {
         public a(feb $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gcc.a {
      }
   }
}
