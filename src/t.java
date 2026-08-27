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
   private final ebp f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "23w31a";
      this.e = false;
      this.f = new ebp(3567, "main");
      this.g = aa.c();
      this.h = 16;
      this.i = 16;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = arf.i($$0, "id");
      this.d = arf.i($$0, "name");
      this.e = arf.k($$0, "stable");
      this.f = new ebp(arf.o($$0, "world_version"), arf.a($$0, "series_id", ebp.a));
      this.g = arf.o($$0, "protocol_version");
      JsonObject $$1 = arf.u($$0, "pack_version");
      this.h = arf.o($$1, "resource");
      this.i = arf.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(arf.i($$0, "build_time")).toInstant());
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
               var2 = new t(arf.a($$1));
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
   public ebp d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(alz $$0) {
      return $$0 == alz.b ? this.i : this.h;
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
