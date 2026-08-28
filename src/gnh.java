import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gnh(String a, @Nullable gnh.a b) {
   public static gnh a() {
      return a(null);
   }

   public static gnh a(String $$0) {
      return a(new gnh.a.b($$0));
   }

   public static gnh a(fne $$0) {
      return a(new gnh.a.a($$0));
   }

   public static gnh a(@Nullable gnh.a $$0) {
      return new gnh(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gnh.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gnh.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("25w09a");
      if (frd.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gnh.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements gnh.a {
         public a(fne $$0) {
            this($$0.a, $$0.p);
         }
      }

      public static record b(String a) implements gnh.a {
      }
   }
}
