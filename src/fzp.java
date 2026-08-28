import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fzp(String a, @Nullable fzp.a b) {
   public static fzp a() {
      return a(null);
   }

   public static fzp a(String $$0) {
      return a(new fzp.a.b($$0));
   }

   public static fzp a(fbt $$0) {
      return a(new fzp.a.a($$0));
   }

   public static fzp a(@Nullable fzp.a $$0) {
      return new fzp(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fzp.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fzp.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w19b");
      if (fft.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fzp.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fzp.a {
         public a(fbt $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fzp.a {
      }
   }
}
