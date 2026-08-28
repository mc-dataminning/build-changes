import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fzc(String a, @Nullable fzc.a b) {
   public static fzc a() {
      return a(null);
   }

   public static fzc a(String $$0) {
      return a(new fzc.a.b($$0));
   }

   public static fzc a(fbh $$0) {
      return a(new fzc.a.a($$0));
   }

   public static fzc a(@Nullable fzc.a $$0) {
      return new fzc(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fzc.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fzc.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.6");
      if (ffh.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fzc.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fzc.a {
         public a(fbh $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fzc.a {
      }
   }
}
