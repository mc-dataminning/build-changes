import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ggo(String a, @Nullable ggo.a b) {
   public static ggo a() {
      return a(null);
   }

   public static ggo a(String $$0) {
      return a(new ggo.a.b($$0));
   }

   public static ggo a(fih $$0) {
      return a(new ggo.a.a($$0));
   }

   public static ggo a(@Nullable ggo.a $$0) {
      return new ggo(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ggo.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ggo.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.2-pre1");
      if (fme.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ggo.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ggo.a {
         public a(fih $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ggo.a {
      }
   }
}
