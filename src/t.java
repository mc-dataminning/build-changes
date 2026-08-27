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
   private final ege f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;

   private t() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "1.20.3-pre1";
      this.e = false;
      this.f = new ege(3693, "main");
      this.g = aa.c();
      this.h = 22;
      this.i = 26;
      this.j = new Date();
   }

   private t(JsonObject $$0) {
      this.c = aud.i($$0, "id");
      this.d = aud.i($$0, "name");
      this.e = aud.k($$0, "stable");
      this.f = new ege(aud.o($$0, "world_version"), aud.a($$0, "series_id", ege.a));
      this.g = aud.o($$0, "protocol_version");
      JsonObject $$1 = aud.u($$0, "pack_version");
      this.h = aud.o($$1, "resource");
      this.i = aud.o($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(aud.i($$0, "build_time")).toInstant());
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
               var2 = new t(aud.a($$1));
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
   public ege d() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int a(aow $$0) {
      return $$0 == aow.b ? this.i : this.h;
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
