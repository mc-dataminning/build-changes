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

public class gem extends gdy implements gdz, gep {
   private static final Logger g = LogUtils.getLogger();
   @Deprecated
   public static final ahg e = cjc.v;
   @Deprecated
   public static final ahg f = new ahg("textures/atlas/particles.png");
   private List<geh> h = List.of();
   private List<gen.a> i = List.of();
   private Map<ahg, gen> j = Map.of();
   @Nullable
   private gen k;
   private final ahg l;
   private final int m;
   private int n;
   private int o;
   private int p;

   public gem(ahg $$0) {
      this.l = $$0;
      this.m = RenderSystem.maxSupportedTextureSize();
   }

   @Override
   public void a(aqi $$0) {
   }

   public void a(gei.a $$0) {
      g.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.l});
      TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
      this.n = $$0.b();
      this.o = $$0.c();
      this.p = $$0.d();
      this.f();
      this.j = Map.copyOf($$0.f());
      this.k = this.j.get(ged.b());
      if (this.k == null) {
         throw new IllegalStateException("Atlas '" + this.l + "' (" + this.j.size() + " sprites) has no missing texture sprite");
      } else {
         List<geh> $$1 = new ArrayList<>();
         List<gen.a> $$2 = new ArrayList<>();

         for (gen $$3 : $$0.f().values()) {
            $$1.add($$3.e());

            try {
               $$3.j();
            } catch (Throwable var9) {
               o $$5 = o.a(var9, "Stitching texture atlas");
               p $$6 = $$5.a("Texture being stitched together");
               $$6.a("Atlas path", this.l);
               $$6.a("Sprite", $$3);
               throw new y($$5);
            }

            gen.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.h = List.copyOf($$1);
         this.i = List.copyOf($$2);
      }
   }

   @Override
   public void a(ahg $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.p, this.n, this.o);
      a($$1, $$2, this.j);
   }

   private static void a(Path $$0, String $$1, Map<ahg, gen> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<ahg, gen> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            gen $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         g.warn("Failed to write file {}", $$3, var10);
      }
   }

   @Override
   public void d() {
      this.c();

      for (gen.a $$0 : this.i) {
         $$0.a();
      }
   }

   @Override
   public void e() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::d);
      } else {
         this.d();
      }
   }

   public gen a(ahg $$0) {
      gen $$1 = this.j.getOrDefault($$0, this.k);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void f() {
      this.h.forEach(geh::close);
      this.i.forEach(gen.a::close);
      this.h = List.of();
      this.i = List.of();
      this.j = Map.of();
      this.k = null;
   }

   public ahg g() {
      return this.l;
   }

   public int h() {
      return this.m;
   }

   int i() {
      return this.n;
   }

   int j() {
      return this.o;
   }

   public void b(gei.a $$0) {
      this.a(false, $$0.d() > 0);
   }
}
