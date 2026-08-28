import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fzr(String a, @Nullable fzr.a b) {
   public static fzr a() {
      return a(null);
   }

   public static fzr a(String $$0) {
      return a(new fzr.a.b($$0));
   }

   public static fzr a(fbv $$0) {
      return a(new fzr.a.a($$0));
   }

   public static fzr a(@Nullable fzr.a $$0) {
      return new fzr(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fzr.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fzr.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w20a");
      if (ffw.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fzr.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fzr.a {
         public a(fbv $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fzr.a {
      }
   }
}
