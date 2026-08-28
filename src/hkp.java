import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hkp extends hkb implements hkc, hkt {
   private static final Logger e = LogUtils.getLogger();
   @Deprecated
   public static final alr c = alr.b("textures/atlas/blocks.png");
   @Deprecated
   public static final alr d = alr.b("textures/atlas/particles.png");
   private List<hkk> f = List.of();
   private List<hkq.a> g = List.of();
   private Map<alr, hkq> h = Map.of();
   @Nullable
   private hkq i;
   private final alr j;
   private final int k;
   private int l;
   private int m;
   private int n;

   public hkp(alr $$0) {
      this.j = $$0;
      this.k = RenderSystem.getDevice().getMaxTextureSize();
   }

   public void a(hkl.a $$0) {
      e.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.j});
      this.a = RenderSystem.getDevice().createTexture(this.j::toString, TextureFormat.RGBA8, $$0.b(), $$0.c(), $$0.d() + 1);
      this.l = $$0.b();
      this.m = $$0.c();
      this.n = $$0.d();
      this.d();
      this.a(false, this.n > 1);
      this.h = Map.copyOf($$0.f());
      this.i = this.h.get(hkf.c());
      if (this.i == null) {
         throw new IllegalStateException("Atlas '" + this.j + "' (" + this.h.size() + " sprites) has no missing texture sprite");
      } else {
         List<hkk> $$1 = new ArrayList<>();
         List<hkq.a> $$2 = new ArrayList<>();

         for (hkq $$3 : $$0.f().values()) {
            $$1.add($$3.e());

            try {
               $$3.a(this.a);
            } catch (Throwable var9) {
               p $$5 = p.a(var9, "Stitching texture atlas");
               q $$6 = $$5.a("Texture being stitched together");
               $$6.a("Atlas path", this.j);
               $$6.a("Sprite", $$3);
               throw new aa($$5);
            }

            hkq.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.f = List.copyOf($$1);
         this.g = List.copyOf($$2);
      }
   }

   @Override
   public void a(alr $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.n, $$0x -> $$0x);
      a($$1, $$2, this.h);
   }

   private static void a(Path $$0, String $$1, Map<alr, hkq> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<alr, hkq> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            hkq $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         e.warn("Failed to write file {}", $$3, var10);
      }
   }

   public void b() {
      if (this.a != null) {
         for (hkq.a $$0 : this.g) {
            $$0.a(this.a);
         }
      }
   }

   @Override
   public void c() {
      this.b();
   }

   public hkq a(alr $$0) {
      hkq $$1 = this.h.getOrDefault($$0, this.i);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void d() {
      this.f.forEach(hkk::close);
      this.g.forEach(hkq.a::close);
      this.f = List.of();
      this.g = List.of();
      this.h = Map.of();
      this.i = null;
   }

   public alr e() {
      return this.j;
   }

   public int f() {
      return this.k;
   }

   int g() {
      return this.l;
   }

   int h() {
      return this.m;
   }
}
