import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
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

public class hiw extends hii implements hij, hja {
   private static final Logger f = LogUtils.getLogger();
   @Deprecated
   public static final alg d = alg.b("textures/atlas/blocks.png");
   @Deprecated
   public static final alg e = alg.b("textures/atlas/particles.png");
   private List<hir> g = List.of();
   private List<hix.a> h = List.of();
   private Map<alg, hix> i = Map.of();
   @Nullable
   private hix j;
   private final alg k;
   private final int l;
   private int m;
   private int n;
   private int o;

   public hiw(alg $$0) {
      this.k = $$0;
      this.l = RenderSystem.maxSupportedTextureSize();
   }

   public void a(his.a $$0) {
      f.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.k});
      TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
      this.m = $$0.b();
      this.n = $$0.c();
      this.o = $$0.d();
      this.f();
      this.a(false, this.o > 1);
      this.i = Map.copyOf($$0.f());
      this.j = this.i.get(him.c());
      if (this.j == null) {
         throw new IllegalStateException("Atlas '" + this.k + "' (" + this.i.size() + " sprites) has no missing texture sprite");
      } else {
         List<hir> $$1 = new ArrayList<>();
         List<hix.a> $$2 = new ArrayList<>();

         for (hix $$3 : $$0.f().values()) {
            $$1.add($$3.e());

            try {
               $$3.j();
            } catch (Throwable var9) {
               o $$5 = o.a(var9, "Stitching texture atlas");
               p $$6 = $$5.a("Texture being stitched together");
               $$6.a("Atlas path", this.k);
               $$6.a("Sprite", $$3);
               throw new z($$5);
            }

            hix.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.g = List.copyOf($$1);
         this.h = List.copyOf($$2);
      }
   }

   @Override
   public void a(alg $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.o, this.m, this.n);
      a($$1, $$2, this.i);
   }

   private static void a(Path $$0, String $$1, Map<alg, hix> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<alg, hix> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            hix $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         f.warn("Failed to write file {}", $$3, var10);
      }
   }

   @Override
   public void d() {
      this.c();

      for (hix.a $$0 : this.h) {
         $$0.a();
      }
   }

   @Override
   public void e() {
      this.d();
   }

   public hix a(alg $$0) {
      hix $$1 = this.i.getOrDefault($$0, this.j);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void f() {
      this.g.forEach(hir::close);
      this.h.forEach(hix.a::close);
      this.g = List.of();
      this.h = List.of();
      this.i = Map.of();
      this.j = null;
   }

   public alg g() {
      return this.k;
   }

   public int h() {
      return this.l;
   }

   int i() {
      return this.m;
   }

   int j() {
      return this.n;
   }
}
