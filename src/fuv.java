import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuv {
   private static final fuv a = new fuv("") {
      @Override
      public void a(exh $$0) {
      }

      @Override
      public void a(fuv.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fuv.b e;

   fuv(String $$0) {
      this.d = exh.O().p.toPath().resolve($$0);
   }

   public static fuv a(@Nullable String $$0) {
      return $$0 == null ? a : new fuv($$0);
   }

   public void a(fuv.c $$0, String $$1, String $$2) {
      this.e = new fuv.b($$0, $$1, $$2);
   }

   public void a(exh $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fuv.a $$2 = new fuv.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fuv.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   static record a(fuv.b b, Instant c, cvk d) {
      public static final Codec<fuv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fuv.b.a.forGetter(fuv.a::a), avp.m.fieldOf("lastPlayedTime").forGetter(fuv.a::b), cvk.f.fieldOf("gamemode").forGetter(fuv.a::c))
               .apply($$0, fuv.a::new)
      );

      public fuv.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cvk c() {
         return this.d;
      }
   }

   static record b(fuv.c b, String c, String d) {
      public static final MapCodec<fuv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fuv.c.d.fieldOf("type").forGetter(fuv.b::a), avp.o.fieldOf("id").forGetter(fuv.b::b), Codec.STRING.fieldOf("name").forGetter(fuv.b::c)
               )
               .apply($$0, fuv.b::new)
      );

      public fuv.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements axc {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fuv.c> d = axc.a(fuv.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
