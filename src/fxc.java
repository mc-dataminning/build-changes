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

public class fxc {
   private static final fxc a = new fxc("") {
      @Override
      public void a(ezi $$0) {
      }

      @Override
      public void a(fxc.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fxc.b e;

   fxc(String $$0) {
      this.d = ezi.Q().p.toPath().resolve($$0);
   }

   public static fxc a(@Nullable String $$0) {
      return $$0 == null ? a : new fxc($$0);
   }

   public void a(fxc.c $$0, String $$1, String $$2) {
      this.e = new fxc.b($$0, $$1, $$2);
   }

   public void a(ezi $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fxc.a $$2 = new fxc.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(fxc.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fxc.b b, Instant c, cwy d) {
      public static final Codec<fxc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxc.b.a.forGetter(fxc.a::a), awe.n.fieldOf("lastPlayedTime").forGetter(fxc.a::b), cwy.f.fieldOf("gamemode").forGetter(fxc.a::c))
               .apply($$0, fxc.a::new)
      );

      public fxc.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cwy c() {
         return this.d;
      }
   }

   static record b(fxc.c b, String c, String d) {
      public static final MapCodec<fxc.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fxc.c.d.fieldOf("type").forGetter(fxc.b::a), awe.p.fieldOf("id").forGetter(fxc.b::b), Codec.STRING.fieldOf("name").forGetter(fxc.b::c)
               )
               .apply($$0, fxc.b::new)
      );

      public fxc.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements axq {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fxc.c> d = axq.a(fxc.c::values);
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
