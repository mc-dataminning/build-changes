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

public class hgu {
   static final Logger a = LogUtils.getLogger();
   private final MinecraftSessionService b;
   private final LoadingCache<hgu.a, CompletableFuture<Optional<hgt>>> c;
   private final hgu.b d;
   private final hgu.b e;
   private final hgu.b f;

   public hgu(Path $$0, final MinecraftSessionService $$1, final Executor $$2) {
      this.b = $$1;
      this.d = new hgu.b($$0, Type.SKIN);
      this.e = new hgu.b($$0, Type.CAPE);
      this.f = new hgu.b($$0, Type.ELYTRA);
      this.c = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<hgu.a, CompletableFuture<Optional<hgt>>>() {
         public CompletableFuture<Optional<hgt>> a(hgu.a $$0) {
            return CompletableFuture.<MinecraftProfileTextures>supplyAsync(() -> {
               Property $$2xx = $$0.b();
               if ($$2xx == null) {
                  return MinecraftProfileTextures.EMPTY;
               } else {
                  MinecraftProfileTextures $$3 = $$1.unpackTextures($$2xx);
                  if ($$3.signatureState() == SignatureState.INVALID) {
                     hgu.a.warn("Profile contained invalid signature for textures property (profile id: {})", $$0.a());
                  }

                  return $$3;
               }
            }, af.h().a("unpackSkinTextures")).thenComposeAsync($$1xx -> hgu.this.a($$0.a(), $$1xx), $$2).handle(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  hgu.a.warn("Failed to load texture for profile {}", $$0.a, $$2xx);
               }

               return Optional.ofNullable($$1xx);
            });
         }
      });
   }

   public Supplier<hgt> a(GameProfile $$0) {
      CompletableFuture<Optional<hgt>> $$1 = this.c($$0);
      hgt $$2 = hgk.a($$0);
      return () -> $$1.getNow(Optional.empty()).orElse($$2);
   }

   public hgt b(GameProfile $$0) {
      hgt $$1 = this.c($$0).getNow(Optional.empty()).orElse(null);
      return $$1 != null ? $$1 : hgk.a($$0);
   }

   public CompletableFuture<Optional<hgt>> c(GameProfile $$0) {
      Property $$1 = this.b.getPackedTextures($$0);
      return (CompletableFuture<Optional<hgt>>)this.c.getUnchecked(new hgu.a($$0.getId(), $$1));
   }

   CompletableFuture<hgt> a(UUID $$0, MinecraftProfileTextures $$1) {
      MinecraftProfileTexture $$2 = $$1.skin();
      CompletableFuture<aku> $$3;
      hgt.a $$4;
      if ($$2 != null) {
         $$3 = this.d.a($$2);
         $$4 = hgt.a.a($$2.getMetadata("model"));
      } else {
         hgt $$5 = hgk.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.e();
      }

      String $$8 = x.a($$2, MinecraftProfileTexture::getUrl);
      MinecraftProfileTexture $$9 = $$1.cape();
      CompletableFuture<aku> $$10 = $$9 != null ? this.e.a($$9) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$11 = $$1.elytra();
      CompletableFuture<aku> $$12 = $$11 != null ? this.f.a($$11) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$10, $$12)
         .thenApply($$6x -> new hgt($$3.join(), $$8, $$10.join(), $$12.join(), $$4, $$1.signatureState() == SignatureState.SIGNED));
   }

   static record a(UUID a, @Nullable Property b) {
   }

   static class b {
      private final Path a;
      private final Type b;
      private final Map<String, CompletableFuture<aku>> c = new Object2ObjectOpenHashMap();

      b(Path $$0, Type $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public CompletableFuture<aku> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<aku> $$2 = this.c.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.c.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<aku> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         aku $$2 = this.a($$1);
         Path $$3 = this.a.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         return hfk.a($$2, $$3, $$0.getUrl(), this.b == Type.SKIN);
      }

      private aku a(String $$0) {
         String $$1 = switch (this.b) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new MatchException(null, null);
         };
         return aku.b($$1 + "/" + $$0);
      }
   }
}
