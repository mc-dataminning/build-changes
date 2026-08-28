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

public class t implements ae {
   private static final Logger b = LogUtils.getLogger();
   public static final ae a = new t();
   private final String c;
   private final String d;
   private final boolean e;
   private final erz f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "24w33a";
      this.e = false;
      this.f = new erz(4058, "main");
      this.g = ab.c();
      this.h = 35;
      this.i = 49;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = ays.i($$0, "id");
      this.d = ays.i($$0, "name");
      this.e = ays.k($$0, "stable");
      this.f = new erz(ays.o($$0, "world_version"), ays.a($$0, "series_id", erz.a));
      this.g = ays.o($$0, "protocol_version");
      JsonObject $$1 = ays.u($$0, "pack_version");
      this.h = ays.o($$1, "resource");
      this.i = ays.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(ays.i($$0, "build_time")).toInstant());
   }

   public static ae a() {
      try {
         t var2;
         try (InputStream $$0 = t.class.getResourceAsStream("/version.json")) {
            if ($$0 == null) {
               b.warn("Missing version information!");
               return a;
            }

            try (InputStreamReader $$1 = new InputStreamReader($$0)) {
               var2 = new t(ays.a($$1));
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
   public erz d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(atg $$0) {
      return $$0 == atg.b ? this.i : this.h;
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
