import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ggq(String a, @Nullable ggq.a b) {
   public static ggq a() {
      return a(null);
   }

   public static ggq a(String $$0) {
      return a(new ggq.a.b($$0));
   }

   public static ggq a(fij $$0) {
      return a(new ggq.a.a($$0));
   }

   public static ggq a(@Nullable ggq.a $$0) {
      return new ggq(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ggq.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ggq.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.3");
      if (fmg.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ggq.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ggq.a {
         public a(fij $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ggq.a {
      }
   }
}
