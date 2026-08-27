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

public class fzh {
   private static final String a = "textures";
   private final LoadingCache<fzh.a, CompletableFuture<fzg>> b;
   private final fzh.b c;
   private final fzh.b d;
   private final fzh.b e;

   public fzh(fyh $$0, Path $$1, final MinecraftSessionService $$2, final Executor $$3) {
      this.c = new fzh.b($$0, $$1, Type.SKIN);
      this.d = new fzh.b($$0, $$1, Type.CAPE);
      this.e = new fzh.b($$0, $$1, Type.ELYTRA);
      this.b = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<fzh.a, CompletableFuture<fzg>>() {
         public CompletableFuture<fzg> a(fzh.a $$0) {
            GameProfile $$1 = $$0.a();
            return CompletableFuture.<fzh.c>supplyAsync(() -> {
               try {
                  try {
                     return fzh.c.a($$2.getTextures($$1, true), true);
                  } catch (InsecurePublicKeyException var3) {
                     return fzh.c.a($$2.getTextures($$1, false), false);
                  }
               } catch (Throwable var4) {
                  return fzh.c.a;
               }
            }, ac.f()).thenComposeAsync($$1x -> fzh.this.a($$1, $$1x), $$3);
         }
      });
   }

   public Supplier<fzg> a(GameProfile $$0) {
      CompletableFuture<fzg> $$1 = this.c($$0);
      fzg $$2 = fyy.a($$0);
      return () -> $$1.getNow($$2);
   }

   public fzg b(GameProfile $$0) {
      fzg $$1 = this.c($$0).getNow(null);
      return $$1 != null ? $$1 : fyy.a($$0);
   }

   public CompletableFuture<fzg> c(GameProfile $$0) {
      return (CompletableFuture<fzg>)this.b.getUnchecked(new fzh.a($$0));
   }

   CompletableFuture<fzg> a(GameProfile $$0, fzh.c $$1) {
      MinecraftProfileTexture $$2 = $$1.a();
      CompletableFuture<aep> $$3;
      fzg.a $$4;
      if ($$2 != null) {
         $$3 = this.c.a($$2);
         $$4 = fzg.a.a($$2.getMetadata("model"));
      } else {
         fzg $$5 = fyy.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.d();
      }

      MinecraftProfileTexture $$8 = $$1.b();
      CompletableFuture<aep> $$9 = $$8 != null ? this.d.a($$8) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$10 = $$1.c();
      CompletableFuture<aep> $$11 = $$10 != null ? this.e.a($$10) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$9, $$11).thenApply($$5 -> new fzg($$3.join(), $$9.join(), $$11.join(), $$4, $$1.d()));
   }

   public boolean d(GameProfile $$0) {
      Property $$1 = e($$0);
      return $$1 != null && $$1.hasSignature();
   }

   @Nullable
   static Property e(GameProfile $$0) {
      return (Property)Iterables.getFirst($$0.getProperties().get("textures"), null);
   }

   static record a(GameProfile a) {
      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof fzh.a $$1) ? false : this.a.getId().equals($$1.a.getId()) && Objects.equals(this.b(), $$1.b());
      }

      @Override
      public int hashCode() {
         return this.a.getId().hashCode() + Objects.hashCode(this.b()) * 31;
      }

      @Nullable
      private String b() {
         Property $$0 = fzh.e(this.a);
         return $$0 != null ? $$0.value() : null;
      }
   }

   static class b {
      private final fyh a;
      private final Path b;
      private final Type c;
      private final Map<String, CompletableFuture<aep>> d = new Object2ObjectOpenHashMap();

      b(fyh $$0, Path $$1, Type $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public CompletableFuture<aep> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<aep> $$2 = this.d.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.d.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<aep> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         aep $$2 = this.a($$1);
         Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         CompletableFuture<aep> $$4 = new CompletableFuture<>();
         fxu $$5 = new fxu($$3.toFile(), $$0.getUrl(), fyy.a(), this.c == Type.SKIN, () -> $$4.complete($$2));
         this.a.a($$2, $$5);
         return $$4;
      }

      private aep a(String $$0) {
         String $$1 = switch (this.c) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new IncompatibleClassChangeError();
         };
         return new aep($$1 + "/" + $$0);
      }
   }

   static record c(@Nullable MinecraftProfileTexture b, @Nullable MinecraftProfileTexture c, @Nullable MinecraftProfileTexture d, boolean e) {
      public static final fzh.c a = new fzh.c(null, null, null, true);

      public static fzh.c a(Map<Type, MinecraftProfileTexture> $$0, boolean $$1) {
         return $$0.isEmpty() ? a : new fzh.c($$0.get(Type.SKIN), $$0.get(Type.CAPE), $$0.get(Type.ELYTRA), $$1);
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
