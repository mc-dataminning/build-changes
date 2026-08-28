import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record glw(String a, @Nullable glw.a b) {
   public static glw a() {
      return a(null);
   }

   public static glw a(String $$0) {
      return a(new glw.a.b($$0));
   }

   public static glw a(flu $$0) {
      return a(new glw.a.a($$0));
   }

   public static glw a(@Nullable glw.a $$0) {
      return new glw(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof glw.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof glw.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w08a");
      if (fpt.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public glw.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements glw.a {
         public a(flu $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements glw.a {
      }
   }
}
