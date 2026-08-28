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
   private final esr f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "24w35a";
      this.e = false;
      this.f = new esr(4062, "main");
      this.g = ab.c();
      this.h = 36;
      this.i = 51;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = ayv.i($$0, "id");
      this.d = ayv.i($$0, "name");
      this.e = ayv.k($$0, "stable");
      this.f = new esr(ayv.o($$0, "world_version"), ayv.a($$0, "series_id", esr.a));
      this.g = ayv.o($$0, "protocol_version");
      JsonObject $$1 = ayv.u($$0, "pack_version");
      this.h = ayv.o($$1, "resource");
      this.i = ayv.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(ayv.i($$0, "build_time")).toInstant());
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
               var2 = new t(ayv.a($$1));
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
   public esr d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(atj $$0) {
      return $$0 == atj.b ? this.i : this.h;
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
