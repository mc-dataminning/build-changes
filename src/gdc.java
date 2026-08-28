import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gdc(String a, @Nullable gdc.a b) {
   public static gdc a() {
      return a(null);
   }

   public static gdc a(String $$0) {
      return a(new gdc.a.b($$0));
   }

   public static gdc a(ffa $$0) {
      return a(new gdc.a.a($$0));
   }

   public static gdc a(@Nullable gdc.a $$0) {
      return new gdc(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gdc.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gdc.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w36a");
      if (fja.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gdc.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gdc.a {
         public a(ffa $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements gdc.a {
      }
   }
}
