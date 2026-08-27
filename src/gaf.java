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

public class gaf {
   private static final String a = "textures";
   private final LoadingCache<gaf.a, CompletableFuture<gae>> b;
   private final gaf.b c;
   private final gaf.b d;
   private final gaf.b e;

   public gaf(fzf $$0, Path $$1, final MinecraftSessionService $$2, final Executor $$3) {
      this.c = new gaf.b($$0, $$1, Type.SKIN);
      this.d = new gaf.b($$0, $$1, Type.CAPE);
      this.e = new gaf.b($$0, $$1, Type.ELYTRA);
      this.b = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<gaf.a, CompletableFuture<gae>>() {
         public CompletableFuture<gae> a(gaf.a $$0) {
            GameProfile $$1 = $$0.a();
            return CompletableFuture.<gaf.c>supplyAsync(() -> {
               try {
                  try {
                     return gaf.c.a($$2.getTextures($$1, true), true);
                  } catch (InsecurePublicKeyException var3) {
                     return gaf.c.a($$2.getTextures($$1, false), false);
                  }
               } catch (Throwable var4) {
                  return gaf.c.a;
               }
            }, ac.f()).thenComposeAsync($$1x -> gaf.this.a($$1, $$1x), $$3);
         }
      });
   }

   public Supplier<gae> a(GameProfile $$0) {
      CompletableFuture<gae> $$1 = this.c($$0);
      gae $$2 = fzw.a($$0);
      return () -> $$1.getNow($$2);
   }

   public gae b(GameProfile $$0) {
      gae $$1 = this.c($$0).getNow(null);
      return $$1 != null ? $$1 : fzw.a($$0);
   }

   public CompletableFuture<gae> c(GameProfile $$0) {
      return (CompletableFuture<gae>)this.b.getUnchecked(new gaf.a($$0));
   }

   CompletableFuture<gae> a(GameProfile $$0, gaf.c $$1) {
      MinecraftProfileTexture $$2 = $$1.a();
      CompletableFuture<aex> $$3;
      gae.a $$4;
      if ($$2 != null) {
         $$3 = this.c.a($$2);
         $$4 = gae.a.a($$2.getMetadata("model"));
      } else {
         gae $$5 = fzw.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.e();
      }

      String $$8 = x.a($$2, MinecraftProfileTexture::getUrl);
      MinecraftProfileTexture $$9 = $$1.b();
      CompletableFuture<aex> $$10 = $$9 != null ? this.d.a($$9) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$11 = $$1.c();
      CompletableFuture<aex> $$12 = $$11 != null ? this.e.a($$11) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$10, $$12).thenApply($$6x -> new gae($$3.join(), $$8, $$10.join(), $$12.join(), $$4, $$1.d()));
   }

   @Nullable
   static Property d(GameProfile $$0) {
      return (Property)Iterables.getFirst($$0.getProperties().get("textures"), null);
   }

   static record a(GameProfile a) {
      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof gaf.a $$1) ? false : this.a.getId().equals($$1.a.getId()) && Objects.equals(this.b(), $$1.b());
      }

      @Override
      public int hashCode() {
         return this.a.getId().hashCode() + Objects.hashCode(this.b()) * 31;
      }

      @Nullable
      private String b() {
         Property $$0 = gaf.d(this.a);
         return $$0 != null ? $$0.value() : null;
      }
   }

   static class b {
      private final fzf a;
      private final Path b;
      private final Type c;
      private final Map<String, CompletableFuture<aex>> d = new Object2ObjectOpenHashMap();

      b(fzf $$0, Path $$1, Type $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public CompletableFuture<aex> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<aex> $$2 = this.d.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.d.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<aex> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         aex $$2 = this.a($$1);
         Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         CompletableFuture<aex> $$4 = new CompletableFuture<>();
         fys $$5 = new fys($$3.toFile(), $$0.getUrl(), fzw.a(), this.c == Type.SKIN, () -> $$4.complete($$2));
         this.a.a($$2, $$5);
         return $$4;
      }

      private aex a(String $$0) {
         String $$1 = switch (this.c) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new IncompatibleClassChangeError();
         };
         return new aex($$1 + "/" + $$0);
      }
   }

   static record c(@Nullable MinecraftProfileTexture b, @Nullable MinecraftProfileTexture c, @Nullable MinecraftProfileTexture d, boolean e) {
      public static final gaf.c a = new gaf.c(null, null, null, true);

      public static gaf.c a(Map<Type, MinecraftProfileTexture> $$0, boolean $$1) {
         return $$0.isEmpty() ? a : new gaf.c($$0.get(Type.SKIN), $$0.get(Type.CAPE), $$0.get(Type.ELYTRA), $$1);
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
