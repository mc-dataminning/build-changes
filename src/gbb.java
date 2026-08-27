import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Iterables;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbb {
   private static final String a = "textures";
   private final LoadingCache<gbb.a, CompletableFuture<gba>> b;
   private final gbb.b c;
   private final gbb.b d;
   private final gbb.b e;

   public gbb(gab $$0, Path $$1, final MinecraftSessionService $$2, final Executor $$3) {
      this.c = new gbb.b($$0, $$1, Type.SKIN);
      this.d = new gbb.b($$0, $$1, Type.CAPE);
      this.e = new gbb.b($$0, $$1, Type.ELYTRA);
      this.b = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<gbb.a, CompletableFuture<gba>>() {
         public CompletableFuture<gba> a(gbb.a $$0) {
            GameProfile $$1 = $$0.a();
            return CompletableFuture.<gbb.c>supplyAsync(() -> {
               try {
                  try {
                     return gbb.c.a($$2.getTextures($$1, true), true);
                  } catch (InsecurePublicKeyException var3) {
                     return gbb.c.a($$2.getTextures($$1, false), false);
                  }
               } catch (Throwable var4) {
                  return gbb.c.a;
               }
            }, ac.f()).thenComposeAsync($$1x -> gbb.this.a($$1, $$1x), $$3);
         }
      });
   }

   public Supplier<gba> a(GameProfile $$0) {
      CompletableFuture<gba> $$1 = this.c($$0);
      gba $$2 = gas.a($$0);
      return () -> $$1.getNow($$2);
   }

   public gba b(GameProfile $$0) {
      gba $$1 = this.c($$0).getNow(null);
      return $$1 != null ? $$1 : gas.a($$0);
   }

   public CompletableFuture<gba> c(GameProfile $$0) {
      return (CompletableFuture<gba>)this.b.getUnchecked(new gbb.a($$0));
   }

   CompletableFuture<gba> a(GameProfile $$0, gbb.c $$1) {
      MinecraftProfileTexture $$2 = $$1.a();
      CompletableFuture<afw> $$3;
      gba.a $$4;
      if ($$2 != null) {
         $$3 = this.c.a($$2);
         $$4 = gba.a.a($$2.getMetadata("model"));
      } else {
         gba $$5 = gas.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.e();
      }

      String $$8 = x.a($$2, MinecraftProfileTexture::getUrl);
      MinecraftProfileTexture $$9 = $$1.b();
      CompletableFuture<afw> $$10 = $$9 != null ? this.d.a($$9) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$11 = $$1.c();
      CompletableFuture<afw> $$12 = $$11 != null ? this.e.a($$11) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$10, $$12).thenApply($$6x -> new gba($$3.join(), $$8, $$10.join(), $$12.join(), $$4, $$1.d()));
   }

   @Nullable
   static Property d(GameProfile $$0) {
      return (Property)Iterables.getFirst($$0.getProperties().get("textures"), null);
   }

   static record a(GameProfile a) {
      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof gbb.a $$1) ? false : this.a.getId().equals($$1.a.getId()) && Objects.equals(this.b(), $$1.b());
      }

      @Override
      public int hashCode() {
         return this.a.getId().hashCode() + Objects.hashCode(this.b()) * 31;
      }

      @Nullable
      private String b() {
         Property $$0 = gbb.d(this.a);
         return $$0 != null ? $$0.value() : null;
      }
   }

   static class b {
      private final gab a;
      private final Path b;
      private final Type c;
      private final Map<String, CompletableFuture<afw>> d = new Object2ObjectOpenHashMap();

      b(gab $$0, Path $$1, Type $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public CompletableFuture<afw> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<afw> $$2 = this.d.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.d.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<afw> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         afw $$2 = this.a($$1);
         Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         CompletableFuture<afw> $$4 = new CompletableFuture<>();
         fzo $$5 = new fzo($$3.toFile(), $$0.getUrl(), gas.a(), this.c == Type.SKIN, () -> $$4.complete($$2));
         this.a.a($$2, $$5);
         return $$4;
      }

      private afw a(String $$0) {
         String $$1 = switch (this.c) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new IncompatibleClassChangeError();
         };
         return new afw($$1 + "/" + $$0);
      }
   }

   static record c(@Nullable MinecraftProfileTexture b, @Nullable MinecraftProfileTexture c, @Nullable MinecraftProfileTexture d, boolean e) {
      public static final gbb.c a = new gbb.c(null, null, null, true);

      public static gbb.c a(Map<Type, MinecraftProfileTexture> $$0, boolean $$1) {
         return $$0.isEmpty() ? a : new gbb.c($$0.get(Type.SKIN), $$0.get(Type.CAPE), $$0.get(Type.ELYTRA), $$1);
      }

      @Nullable
      public MinecraftProfileTexture a() {
         return this.b;
      }

      @Nullable
      public MinecraftProfileTexture b() {
         return this.c;
      }

      @Nullable
      public MinecraftProfileTexture c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }
}
