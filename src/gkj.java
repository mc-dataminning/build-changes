import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gkj(String a, @Nullable gkj.a b) {
   public static gkj a() {
      return a(null);
   }

   public static gkj a(String $$0) {
      return a(new gkj.a.b($$0));
   }

   public static gkj a(fkh $$0) {
      return a(new gkj.a.a($$0));
   }

   public static gkj a(@Nullable gkj.a $$0) {
      return new gkj(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gkj.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gkj.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w04a");
      if (fof.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gkj.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gkj.a {
         public a(fkh $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gkj.a {
      }
   }
}
