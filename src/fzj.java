import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fzj(String a, @Nullable fzj.a b) {
   public static fzj a() {
      return a(null);
   }

   public static fzj a(String $$0) {
      return a(new fzj.a.b($$0));
   }

   public static fzj a(fbn $$0) {
      return a(new fzj.a.a($$0));
   }

   public static fzj a(@Nullable fzj.a $$0) {
      return new fzj(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fzj.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fzj.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w18a");
      if (ffn.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fzj.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fzj.a {
         public a(fbn $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fzj.a {
      }
   }
}
