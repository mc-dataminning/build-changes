import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ged(String a, @Nullable ged.a b) {
   public static ged a() {
      return a(null);
   }

   public static ged a(String $$0) {
      return a(new ged.a.b($$0));
   }

   public static ged a(fgb $$0) {
      return a(new ged.a.a($$0));
   }

   public static ged a(@Nullable ged.a $$0) {
      return new ged(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ged.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ged.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w38a");
      if (fjx.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ged.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ged.a {
         public a(fgb $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements ged.a {
      }
   }
}
