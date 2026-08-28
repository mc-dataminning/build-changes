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
   private final ezp f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private u() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "25w10a";
      this.e = false;
      this.f = new ezp(4319, "main");
      this.g = ac.c();
      this.h = 54;
      this.i = 70;
      this.j = new Date();
   }

   private u(JsonObject $$0) {
      this.c = azg.i($$0, "id");
      this.d = azg.i($$0, "name");
      this.e = azg.k($$0, "stable");
      this.f = new ezp(azg.o($$0, "world_version"), azg.a($$0, "series_id", ezp.a));
      this.g = azg.o($$0, "protocol_version");
      JsonObject $$1 = azg.u($$0, "pack_version");
      this.h = azg.o($$1, "resource");
      this.i = azg.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(azg.i($$0, "build_time")).toInstant());
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
               var2 = new u(azg.a($$1));
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
   public ezp d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(atv $$0) {
      return $$0 == atv.b ? this.i : this.h;
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
