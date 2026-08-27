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
   private final eni f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "24w11a";
      this.e = false;
      this.f = new eni(3823, "main");
      this.g = aa.c();
      this.h = 29;
      this.i = 35;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = axm.i($$0, "id");
      this.d = axm.i($$0, "name");
      this.e = axm.k($$0, "stable");
      this.f = new eni(axm.o($$0, "world_version"), axm.a($$0, "series_id", eni.a));
      this.g = axm.o($$0, "protocol_version");
      JsonObject $$1 = axm.u($$0, "pack_version");
      this.h = axm.o($$1, "resource");
      this.i = axm.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(axm.i($$0, "build_time")).toInstant());
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
               var2 = new t(axm.a($$1));
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
   public eni d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(asc $$0) {
      return $$0 == asc.b ? this.i : this.h;
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
