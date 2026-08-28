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

public class t implements ad {
   private static final Logger b = LogUtils.getLogger();
   public static final ad a = new t();
   private final String c;
   private final String d;
   private final boolean e;
   private final epp f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "1.20.5-rc3";
      this.e = false;
      this.f = new epp(3836, "main");
      this.g = aa.c();
      this.h = 32;
      this.i = 41;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = ayp.i($$0, "id");
      this.d = ayp.i($$0, "name");
      this.e = ayp.k($$0, "stable");
      this.f = new epp(ayp.o($$0, "world_version"), ayp.a($$0, "series_id", epp.a));
      this.g = ayp.o($$0, "protocol_version");
      JsonObject $$1 = ayp.u($$0, "pack_version");
      this.h = ayp.o($$1, "resource");
      this.i = ayp.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(ayp.i($$0, "build_time")).toInstant());
   }

   public static ad a() {
      try {
         t var2;
         try (InputStream $$0 = t.class.getResourceAsStream("/version.json")) {
            if ($$0 == null) {
               b.warn("Missing version information!");
               return a;
            }

            try (InputStreamReader $$1 = new InputStreamReader($$0)) {
               var2 = new t(ayp.a($$1));
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
   public epp d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(atd $$0) {
      return $$0 == atd.b ? this.i : this.h;
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
