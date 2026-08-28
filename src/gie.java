import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gie(String a, @Nullable gie.a b) {
   public static gie a() {
      return a(null);
   }

   public static gie a(String $$0) {
      return a(new gie.a.b($$0));
   }

   public static gie a(fii $$0) {
      return a(new gie.a.a($$0));
   }

   public static gie a(@Nullable gie.a $$0) {
      return new gie(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gie.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gie.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w02a");
      if (fmg.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gie.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gie.a {
         public a(fii $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gie.a {
      }
   }
}
