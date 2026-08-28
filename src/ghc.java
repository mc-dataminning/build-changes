import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ghc(String a, @Nullable ghc.a b) {
   public static ghc a() {
      return a(null);
   }

   public static ghc a(String $$0) {
      return a(new ghc.a.b($$0));
   }

   public static ghc a(fhj $$0) {
      return a(new ghc.a.a($$0));
   }

   public static ghc a(@Nullable ghc.a $$0) {
      return new ghc(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ghc.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ghc.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w45a");
      if (flh.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ghc.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ghc.a {
         public a(fhj $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements ghc.a {
      }
   }
}
