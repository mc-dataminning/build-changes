import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ggp(String a, @Nullable ggp.a b) {
   public static ggp a() {
      return a(null);
   }

   public static ggp a(String $$0) {
      return a(new ggp.a.b($$0));
   }

   public static ggp a(fii $$0) {
      return a(new ggp.a.a($$0));
   }

   public static ggp a(@Nullable ggp.a $$0) {
      return new ggp(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ggp.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ggp.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.2-rc1");
      if (fmf.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ggp.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ggp.a {
         public a(fii $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ggp.a {
      }
   }
}
