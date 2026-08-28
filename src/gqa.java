import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gqa {
   static final Logger a = LogUtils.getLogger();
   private final MinecraftSessionService b;
   private final LoadingCache<gqa.a, CompletableFuture<gpz>> c;
   private final gqa.b d;
   private final gqa.b e;
   private final gqa.b f;

   public gqa(gpa $$0, Path $$1, final MinecraftSessionService $$2, final Executor $$3) {
      this.b = $$2;
      this.d = new gqa.b($$0, $$1, Type.SKIN);
      this.e = new gqa.b($$0, $$1, Type.CAPE);
      this.f = new gqa.b($$0, $$1, Type.ELYTRA);
      this.c = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<gqa.a, CompletableFuture<gpz>>() {
         public CompletableFuture<gpz> a(gqa.a $$0) {
            return CompletableFuture.<MinecraftProfileTextures>supplyAsync(() -> {
               Property $$2xx = $$0.b();
               if ($$2xx == null) {
                  return MinecraftProfileTextures.EMPTY;
               } else {
                  MinecraftProfileTextures $$3xx = $$2.unpackTextures($$2xx);
                  if ($$3xx.signatureState() == SignatureState.INVALID) {
                     gqa.a.warn("Profile contained invalid signature for textures property (profile id: {})", $$0.a());
                  }

                  return $$3xx;
               }
            }, ac.g()).thenComposeAsync($$1 -> gqa.this.a($$0.a(), $$1), $$3);
         }
      });
   }

   public Supplier<gpz> a(GameProfile $$0) {
      CompletableFuture<gpz> $$1 = this.c($$0);
      gpz $$2 = gpr.a($$0);
      return () -> $$1.getNow($$2);
   }

   public gpz b(GameProfile $$0) {
      gpz $$1 = this.c($$0).getNow(null);
      return $$1 != null ? $$1 : gpr.a($$0);
   }

   public CompletableFuture<gpz> c(GameProfile $$0) {
      Property $$1 = this.b.getPackedTextures($$0);
      return (CompletableFuture<gpz>)this.c.getUnchecked(new gqa.a($$0.getId(), $$1));
   }

   CompletableFuture<gpz> a(UUID $$0, MinecraftProfileTextures $$1) {
      MinecraftProfileTexture $$2 = $$1.skin();
      CompletableFuture<alf> $$3;
      gpz.a $$4;
      if ($$2 != null) {
         $$3 = this.d.a($$2);
         $$4 = gpz.a.a($$2.getMetadata("model"));
      } else {
         gpz $$5 = gpr.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.e();
      }

      String $$8 = x.a($$2, MinecraftProfileTexture::getUrl);
      MinecraftProfileTexture $$9 = $$1.cape();
      CompletableFuture<alf> $$10 = $$9 != null ? this.e.a($$9) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$11 = $$1.elytra();
      CompletableFuture<alf> $$12 = $$11 != null ? this.f.a($$11) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$10, $$12)
         .thenApply($$6x -> new gpz($$3.join(), $$8, $$10.join(), $$12.join(), $$4, $$1.signatureState() == SignatureState.SIGNED));
   }

   static record a(UUID a, @Nullable Property b) {
   }

   static class b {
      private final gpa a;
      private final Path b;
      private final Type c;
      private final Map<String, CompletableFuture<alf>> d = new Object2ObjectOpenHashMap();

      b(gpa $$0, Path $$1, Type $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public CompletableFuture<alf> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<alf> $$2 = this.d.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.d.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<alf> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         alf $$2 = this.a($$1);
         Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         CompletableFuture<alf> $$4 = new CompletableFuture<>();
         gon $$5 = new gon($$3.toFile(), $$0.getUrl(), gpr.a(), this.c == Type.SKIN, () -> $$4.complete($$2));
         this.a.a($$2, $$5);
         return $$4;
      }

      private alf a(String $$0) {
         String $$1 = switch (this.c) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new MatchException(null, null);
         };
         return new alf($$1 + "/" + $$0);
      }
   }
}
