import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class u implements ah {
   private static final Logger b = LogUtils.getLogger();
   public static final ah a = new u();
   private final String c;
   private final String d;
   private final boolean e;
   private final ezz f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private u() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "1.21.5-pre1";
      this.e = false;
      this.f = new ezz(4320, "main");
      this.g = ac.c();
      this.h = 55;
      this.i = 70;
      this.j = new Date();
   }

   private u(JsonObject $$0) {
      this.c = azo.i($$0, "id");
      this.d = azo.i($$0, "name");
      this.e = azo.k($$0, "stable");
      this.f = new ezz(azo.o($$0, "world_version"), azo.a($$0, "series_id", ezz.a));
      this.g = azo.o($$0, "protocol_version");
      JsonObject $$1 = azo.u($$0, "pack_version");
      this.h = azo.o($$1, "resource");
      this.i = azo.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(azo.i($$0, "build_time")).toInstant());
   }

   public static ah a() {
      try {
         u var2;
         try (InputStream $$0 = u.class.getResourceAsStream("/version.json")) {
            if ($$0 == null) {
               b.warn("Missing version information!");
               return a;
            }

            try (InputStreamReader $$1 = new InputStreamReader($$0)) {
               var2 = new u(azo.a($$1));
            }
         }

         return var2;
      } catch (JsonParseException | IOException var8) {
         throw new IllegalStateException("Game version information is corrupt", var8);
      }
   }

   @Override
   public String b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   @Override
   public ezz d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(auc $$0) {
      return $$0 == auc.b ? this.i : this.h;
   }

   @Override
   public Date f() {
      return this.j;
   }

   @Override
   public boolean g() {
      return this.e;
   }
}
