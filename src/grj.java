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

public class grj {
   private static final grj a = new grj("") {
      @Override
      public void a(frf $$0) {
      }

      @Override
      public void a(grj.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private grj.b e;

   grj(String $$0) {
      this.d = frf.Q().q.toPath().resolve($$0);
   }

   public static grj a(@Nullable String $$0) {
      return $$0 == null ? a : new grj($$0);
   }

   public void a(grj.c $$0, String $$1, String $$2) {
      this.e = new grj.b($$0, $$1, $$2);
   }

   public void a(frf $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            grj.a $$2 = new grj.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(grj.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(grj.b b, Instant c, djw d) {
      public static final Codec<grj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(grj.b.a.forGetter(grj.a::a), ayy.q.fieldOf("lastPlayedTime").forGetter(grj.a::b), djw.f.fieldOf("gamemode").forGetter(grj.a::c))
               .apply($$0, grj.a::new)
      );

      public grj.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public djw c() {
         return this.d;
      }
   }

   static record b(grj.c b, String c, String d) {
      public static final MapCodec<grj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  grj.c.d.fieldOf("type").forGetter(grj.b::a), ayy.s.fieldOf("id").forGetter(grj.b::b), Codec.STRING.fieldOf("name").forGetter(grj.b::c)
               )
               .apply($$0, grj.b::new)
      );

      public grj.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bao {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<grj.c> d = bao.a(grj.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
