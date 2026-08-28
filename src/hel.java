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

public class hel extends hdx implements hdy, hep {
   private static final Logger f = LogUtils.getLogger();
   @Deprecated
   public static final aku d = aku.b("textures/atlas/blocks.png");
   @Deprecated
   public static final aku e = aku.b("textures/atlas/particles.png");
   private List<heg> g = List.of();
   private List<hem.a> h = List.of();
   private Map<aku, hem> i = Map.of();
   @Nullable
   private hem j;
   private final aku k;
   private final int l;
   private int m;
   private int n;
   private int o;

   public hel(aku $$0) {
      this.k = $$0;
      this.l = RenderSystem.maxSupportedTextureSize();
   }

   public void a(heh.a $$0) {
      f.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.k});
      TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
      this.m = $$0.b();
      this.n = $$0.c();
      this.o = $$0.d();
      this.g();
      this.i = Map.copyOf($$0.f());
      this.j = this.i.get(heb.c());
      if (this.j == null) {
         throw new IllegalStateException("Atlas '" + this.k + "' (" + this.i.size() + " sprites) has no missing texture sprite");
      } else {
         List<heg> $$1 = new ArrayList<>();
         List<hem.a> $$2 = new ArrayList<>();

         for (hem $$3 : $$0.f().values()) {
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

            hem.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.g = List.copyOf($$1);
         this.h = List.copyOf($$2);
      }
   }

   @Override
   public void a(aku $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.o, this.m, this.n);
      a($$1, $$2, this.i);
   }

   private static void a(Path $$0, String $$1, Map<aku, hem> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<aku, hem> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            hem $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         f.warn("Failed to write file {}", $$3, var10);
      }
   }

   @Override
   public void e() {
      this.d();

      for (hem.a $$0 : this.h) {
         $$0.a();
      }
   }

   @Override
   public void f() {
      this.e();
   }

   public hem a(aku $$0) {
      hem $$1 = this.i.getOrDefault($$0, this.j);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void g() {
      this.g.forEach(heg::close);
      this.h.forEach(hem.a::close);
      this.g = List.of();
      this.h = List.of();
      this.i = Map.of();
      this.j = null;
   }

   public aku h() {
      return this.k;
   }

   public int i() {
      return this.l;
   }

   int j() {
      return this.m;
   }

   int k() {
      return this.n;
   }

   public void b(heh.a $$0) {
      this.a(false, $$0.d() > 0);
   }
}
