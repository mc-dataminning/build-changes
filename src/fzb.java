import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fzb(String a, @Nullable fzb.a b) {
   public static fzb a() {
      return a(null);
   }

   public static fzb a(String $$0) {
      return a(new fzb.a.b($$0));
   }

   public static fzb a(fbg $$0) {
      return a(new fzb.a.a($$0));
   }

   public static fzb a(@Nullable fzb.a $$0) {
      return new fzb(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fzb.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fzb.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.5-rc1");
      if (ffg.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fzb.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fzb.a {
         public a(fbg $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fzb.a {
      }
   }
}
