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

public class her extends hed implements hee, hev {
   private static final Logger f = LogUtils.getLogger();
   @Deprecated
   public static final akv d = akv.b("textures/atlas/blocks.png");
   @Deprecated
   public static final akv e = akv.b("textures/atlas/particles.png");
   private List<hem> g = List.of();
   private List<hes.a> h = List.of();
   private Map<akv, hes> i = Map.of();
   @Nullable
   private hes j;
   private final akv k;
   private final int l;
   private int m;
   private int n;
   private int o;

   public her(akv $$0) {
      this.k = $$0;
      this.l = RenderSystem.maxSupportedTextureSize();
   }

   public void a(hen.a $$0) {
      f.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.k});
      TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
      this.m = $$0.b();
      this.n = $$0.c();
      this.o = $$0.d();
      this.f();
      this.a(false, this.o > 1);
      this.i = Map.copyOf($$0.f());
      this.j = this.i.get(heh.c());
      if (this.j == null) {
         throw new IllegalStateException("Atlas '" + this.k + "' (" + this.i.size() + " sprites) has no missing texture sprite");
      } else {
         List<hem> $$1 = new ArrayList<>();
         List<hes.a> $$2 = new ArrayList<>();

         for (hes $$3 : $$0.f().values()) {
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

            hes.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.g = List.copyOf($$1);
         this.h = List.copyOf($$2);
      }
   }

   @Override
   public void a(akv $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.o, this.m, this.n);
      a($$1, $$2, this.i);
   }

   private static void a(Path $$0, String $$1, Map<akv, hes> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<akv, hes> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            hes $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         f.warn("Failed to write file {}", $$3, var10);
      }
   }

   @Override
   public void d() {
      this.c();

      for (hes.a $$0 : this.h) {
         $$0.a();
      }
   }

   @Override
   public void e() {
      this.d();
   }

   public hes a(akv $$0) {
      hes $$1 = this.i.getOrDefault($$0, this.j);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void f() {
      this.g.forEach(hem::close);
      this.h.forEach(hes.a::close);
      this.g = List.of();
      this.h = List.of();
      this.i = Map.of();
      this.j = null;
   }

   public akv g() {
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
