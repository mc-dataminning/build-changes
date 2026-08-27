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

public class fzm {
   private static final String a = "textures";
   private final LoadingCache<fzm.a, CompletableFuture<fzl>> b;
   private final fzm.b c;
   private final fzm.b d;
   private final fzm.b e;

   public fzm(fym $$0, Path $$1, final MinecraftSessionService $$2, final Executor $$3) {
      this.c = new fzm.b($$0, $$1, Type.SKIN);
      this.d = new fzm.b($$0, $$1, Type.CAPE);
      this.e = new fzm.b($$0, $$1, Type.ELYTRA);
      this.b = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new CacheLoader<fzm.a, CompletableFuture<fzl>>() {
         public CompletableFuture<fzl> a(fzm.a $$0) {
            GameProfile $$1 = $$0.a();
            return CompletableFuture.<fzm.c>supplyAsync(() -> {
               try {
                  try {
                     return fzm.c.a($$2.getTextures($$1, true), true);
                  } catch (InsecurePublicKeyException var3) {
                     return fzm.c.a($$2.getTextures($$1, false), false);
                  }
               } catch (Throwable var4) {
                  return fzm.c.a;
               }
            }, ac.f()).thenComposeAsync($$1x -> fzm.this.a($$1, $$1x), $$3);
         }
      });
   }

   public Supplier<fzl> a(GameProfile $$0) {
      CompletableFuture<fzl> $$1 = this.c($$0);
      fzl $$2 = fzd.a($$0);
      return () -> $$1.getNow($$2);
   }

   public fzl b(GameProfile $$0) {
      fzl $$1 = this.c($$0).getNow(null);
      return $$1 != null ? $$1 : fzd.a($$0);
   }

   public CompletableFuture<fzl> c(GameProfile $$0) {
      return (CompletableFuture<fzl>)this.b.getUnchecked(new fzm.a($$0));
   }

   CompletableFuture<fzl> a(GameProfile $$0, fzm.c $$1) {
      MinecraftProfileTexture $$2 = $$1.a();
      CompletableFuture<aer> $$3;
      fzl.a $$4;
      if ($$2 != null) {
         $$3 = this.c.a($$2);
         $$4 = fzl.a.a($$2.getMetadata("model"));
      } else {
         fzl $$5 = fzd.a($$0);
         $$3 = CompletableFuture.completedFuture($$5.a());
         $$4 = $$5.d();
      }

      MinecraftProfileTexture $$8 = $$1.b();
      CompletableFuture<aer> $$9 = $$8 != null ? this.d.a($$8) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture $$10 = $$1.c();
      CompletableFuture<aer> $$11 = $$10 != null ? this.e.a($$10) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf($$3, $$9, $$11).thenApply($$5 -> new fzl($$3.join(), $$9.join(), $$11.join(), $$4, $$1.d()));
   }

   @Nullable
   static Property d(GameProfile $$0) {
      return (Property)Iterables.getFirst($$0.getProperties().get("textures"), null);
   }

   static record a(GameProfile a) {
      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof fzm.a $$1) ? false : this.a.getId().equals($$1.a.getId()) && Objects.equals(this.b(), $$1.b());
      }

      @Override
      public int hashCode() {
         return this.a.getId().hashCode() + Objects.hashCode(this.b()) * 31;
      }

      @Nullable
      private String b() {
         Property $$0 = fzm.d(this.a);
         return $$0 != null ? $$0.value() : null;
      }
   }

   static class b {
      private final fym a;
      private final Path b;
      private final Type c;
      private final Map<String, CompletableFuture<aer>> d = new Object2ObjectOpenHashMap();

      b(fym $$0, Path $$1, Type $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public CompletableFuture<aer> a(MinecraftProfileTexture $$0) {
         String $$1 = $$0.getHash();
         CompletableFuture<aer> $$2 = this.d.get($$1);
         if ($$2 == null) {
            $$2 = this.b($$0);
            this.d.put($$1, $$2);
         }

         return $$2;
      }

      private CompletableFuture<aer> b(MinecraftProfileTexture $$0) {
         String $$1 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
         aer $$2 = this.a($$1);
         Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
         CompletableFuture<aer> $$4 = new CompletableFuture<>();
         fxz $$5 = new fxz($$3.toFile(), $$0.getUrl(), fzd.a(), this.c == Type.SKIN, () -> $$4.complete($$2));
         this.a.a($$2, $$5);
         return $$4;
      }

      private aer a(String $$0) {
         String $$1 = switch (this.c) {
            case SKIN -> "skins";
            case CAPE -> "capes";
            case ELYTRA -> "elytra";
            default -> throw new IncompatibleClassChangeError();
         };
         return new aer($$1 + "/" + $$0);
      }
   }

   static record c(@Nullable MinecraftProfileTexture b, @Nullable MinecraftProfileTexture c, @Nullable MinecraftProfileTexture d, boolean e) {
      public static final fzm.c a = new fzm.c(null, null, null, true);

      public static fzm.c a(Map<Type, MinecraftProfileTexture> $$0, boolean $$1) {
         return $$0.isEmpty() ? a : new fzm.c($$0.get(Type.SKIN), $$0.get(Type.CAPE), $$0.get(Type.ELYTRA), $$1);
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
