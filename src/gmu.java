import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gmu(String a, @Nullable gmu.a b) {
   public static gmu a() {
      return a(null);
   }

   public static gmu a(String $$0) {
      return a(new gmu.a.b($$0));
   }

   public static gmu a(fmr $$0) {
      return a(new gmu.a.a($$0));
   }

   public static gmu a(@Nullable gmu.a $$0) {
      return new gmu(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gmu.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gmu.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.5-pre1");
      if (fqq.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gmu.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gmu.a {
         public a(fmr $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gmu.a {
      }
   }
}
