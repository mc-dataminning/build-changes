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

public class grh {
   private static final grh a = new grh("") {
      @Override
      public void a(frd $$0) {
      }

      @Override
      public void a(grh.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private grh.b e;

   grh(String $$0) {
      this.d = frd.Q().q.toPath().resolve($$0);
   }

   public static grh a(@Nullable String $$0) {
      return $$0 == null ? a : new grh($$0);
   }

   public void a(grh.c $$0, String $$1, String $$2) {
      this.e = new grh.b($$0, $$1, $$2);
   }

   public void a(frd $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            grh.a $$2 = new grh.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(grh.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(grh.b b, Instant c, dju d) {
      public static final Codec<grh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(grh.b.a.forGetter(grh.a::a), ayw.q.fieldOf("lastPlayedTime").forGetter(grh.a::b), dju.f.fieldOf("gamemode").forGetter(grh.a::c))
               .apply($$0, grh.a::new)
      );

      public grh.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dju c() {
         return this.d;
      }
   }

   static record b(grh.c b, String c, String d) {
      public static final MapCodec<grh.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  grh.c.d.fieldOf("type").forGetter(grh.b::a), ayw.s.fieldOf("id").forGetter(grh.b::b), Codec.STRING.fieldOf("name").forGetter(grh.b::c)
               )
               .apply($$0, grh.b::new)
      );

      public grh.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bam {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<grh.c> d = bam.a(grh.c::values);
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
