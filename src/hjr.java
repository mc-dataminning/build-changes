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
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hjr {
   static final Logger a = LogUtils.getLogger();
   private final MinecraftSessionService b;
   private final LoadingCache<hjr.a, CompletableFuture<Optional<hjq>>> c;
   private final hjr.b d;
   private final hjr.b e;
   private final hjr.b f;

   public hjr(Path $$0, final MinecraftSessionService $$1, final Executor $$2) {
      this.b = $$1;
      this.d = new hjr.b($$0, Type.SKIN);
      this.e = new hjr.b($$0, Type.CAPE);
      this.f = new hjr.b($$0, Type.ELYTRA);
      this.c = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<hjr.a, CompletableFuture<Optional<hjq>>>() {
         public CompletableFuture<Optional<hjq>> a(hjr.a $$0) {
            return CompletableFuture.<MinecraftProfileTextures>supplyAsync(() -> {
               Property $$2xx = $$0.b();
               if ($$2xx == null) {
                  return MinecraftProfileTextures.EMPTY;
               } else {
                  MinecraftProfileTextures $$3 = $$1.unpackTextures($$2xx);
                  if ($$3.signatureState() == SignatureState.INVALID) {
                     hjr.a.warn("Profile contained invalid signature for textures property (profile id: {})", $$0.a());
                  }

                  return $$3;
               }
            }, af.h().a("unpackSkinTextures")).thenComposeAsync($$1xx -> hjr.this.a($$0.a(), $$1xx), $$2).handle(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  hjr.a.warn("Failed to load texture for profile {}", $$0.a, $$2xx);
               }

               return Optional.ofNullable($$1xx);
            });
         }
      });
   }

   public Supplier<hjq> a(GameProfile $$0) {
      CompletableFuture<Optional<hjq>> $$1 = this.c($$0);
      hjq $$2 = hjh.a($$0);
      return () -> $$1.getNow(Optional.empty()).orElse($$2);
   }

   public hjq b(GameProfile $$0) {
      hjq $$1 = this.c($$0).getNow(Optional.empty()).orElse(null);
      return $$1 != null ? $$1 : hjh.a($$0);
   }

   public CompletableFuture<Optional<hjq>> c(GameProfile $$0) {
      Property $$1 = this.b.getPackedTextures($$0);
      return (CompletableFuture<Optional<hjq>>)this.c.getUnchecked(new hjr.a($$0.getId(), $$1));
   }

   CompletableFuture<hjq> a(UUID $$0, MinecraftProfileTextures $$1) {
      MinecraftProfileTexture $$2 = $$1.skin();
      CompletableFuture<alg> $$3;
      hjq.a $$4;
      if ($$2 != null) {
         $$3 = this.d.a($$2);
         $$4 = hjq.a.a($$2.getMetadata("model"));
      } else {
         hjq $$5 = hjh.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.e();
      }

      String $$8 = x.a($$2, MinecraftProfileTexture::getUrl);
      MinecraftProfileTexture $$9 = $$1.cape();
      CompletableFuture<alg> $$10 = $$9 != null ? this.e.a($$9) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$11 = $$1.elytra();
      CompletableFuture<alg> $$12 = $$11 != null ? this.f.a($$11) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$10, $$12)
         .thenApply($$6x -> new hjq($$3.join(), $$8, $$10.join(), $$12.join(), $$4, $$1.signatureState() == SignatureState.SIGNED));
   }

   static record a(UUID a, @Nullable Property b) {
   }

   static class b {
      private final Path a;
      private final Type b;
      private final Map<String, CompletableFuture<alg>> c = new Object2ObjectOpenHashMap();

      b(Path $$0, Type $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public CompletableFuture<alg> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<alg> $$2 = this.c.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.c.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<alg> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         alg $$2 = this.a($$1);
         Path $$3 = this.a.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         return hii.a($$2, $$3, $$0.getUrl(), this.b == Type.SKIN);
      }

      private alg a(String $$0) {
         String $$1 = switch (this.b) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new MatchException(null, null);
         };
         return alg.b($$1 + "/" + $$0);
      }
   }
}
