import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class fvu {
   public static final String a = "textures";
   private final fuw b;
   private final File c;
   private final MinecraftSessionService d;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> e;

   public fvu(fuw $$0, File $$1, final MinecraftSessionService $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader<String, Map<Type, MinecraftProfileTexture>>() {
         public Map<Type, MinecraftProfileTexture> a(String $$0) {
            GameProfile $$1 = new GameProfile(null, "dummy_mcdummyface");
            $$1.getProperties().put("textures", new Property("textures", $$0, ""));

            try {
               return $$2.getTextures($$1, false);
            } catch (Throwable var4) {
               return ImmutableMap.of();
            }
         }
      });
   }

   public acq a(MinecraftProfileTexture $$0, Type $$1) {
      return this.a($$0, $$1, null);
   }

   private acq a(MinecraftProfileTexture $$0, Type $$1, @Nullable fvu.a $$2) {
      String $$3 = Hashing.sha1().hashUnencodedChars($$0.getHash()).toString();
      acq $$4 = a($$1, $$3);
      fug $$5 = this.b.b($$4, ful.c());
      if ($$5 == ful.c()) {
         File $$6 = new File(this.c, $$3.length() > 2 ? $$3.substring(0, 2) : "xx");
         File $$7 = new File($$6, $$3);
         fuj $$8 = new fuj($$7, $$0.getUrl(), fvm.a(), $$1 == Type.SKIN, () -> {
            if ($$2 != null) {
               $$2.onSkinTextureAvailable($$1, $$4, $$0);
            }
         });
         this.b.a($$4, $$8);
      } else if ($$2 != null) {
         $$2.onSkinTextureAvailable($$1, $$4, $$0);
      }

      return $$4;
   }

   private static acq a(Type $$0, String $$1) {
      String $$2 = switch ($$0) {
         case SKIN -> "skins";
         case CAPE -> "capes";
         case ELYTRA -> "elytra";
         default -> throw new IncompatibleClassChangeError();
      };
      return new acq($$2 + "/" + $$1);
   }

   public void a(GameProfile $$0, fvu.a $$1, boolean $$2) {
      Runnable $$3 = () -> {
         Map<Type, MinecraftProfileTexture> $$3x = Maps.newHashMap();

         try {
            $$3x.putAll(this.d.getTextures($$0, $$2));
         } catch (InsecurePublicKeyException var7) {
         }

         if ($$3x.isEmpty()) {
            $$0.getProperties().clear();
            if ($$0.getId().equals(enn.N().U().h().getId())) {
               $$0.getProperties().putAll(enn.N().V());
               $$3x.putAll(this.d.getTextures($$0, false));
            } else {
               this.d.fillProfileProperties($$0, $$2);

               try {
                  $$3x.putAll(this.d.getTextures($$0, $$2));
               } catch (InsecurePublicKeyException var6) {
               }
            }
         }

         enn.N().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach($$2xx -> {
                  if ($$3x.containsKey($$2xx)) {
                     this.a($$3x.get($$2xx), $$2xx, $$1);
                  }
               })));
      };
      ac.f().execute($$3);
   }

   public Map<Type, MinecraftProfileTexture> a(GameProfile $$0) {
      Property $$1 = (Property)Iterables.getFirst($$0.getProperties().get("textures"), null);
      return (Map<Type, MinecraftProfileTexture>)($$1 == null ? ImmutableMap.of() : (Map)this.e.getUnchecked($$1.getValue()));
   }

   public acq b(GameProfile $$0) {
      MinecraftProfileTexture $$1 = this.a($$0).get(Type.SKIN);
      return $$1 != null ? this.a($$1, Type.SKIN) : fvm.a(hy.a($$0));
   }

   public interface a {
      void onSkinTextureAvailable(Type var1, acq var2, MinecraftProfileTexture var3);
   }
}
