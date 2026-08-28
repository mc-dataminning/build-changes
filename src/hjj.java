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

public class hjj extends hiv implements hiw, hjn {
   private static final Logger e = LogUtils.getLogger();
   @Deprecated
   public static final alg c = alg.b("textures/atlas/blocks.png");
   @Deprecated
   public static final alg d = alg.b("textures/atlas/particles.png");
   private List<hje> f = List.of();
   private List<hjk.a> g = List.of();
   private Map<alg, hjk> h = Map.of();
   @Nullable
   private hjk i;
   private final alg j;
   private final int k;
   private int l;
   private int m;
   private int n;

   public hjj(alg $$0) {
      this.j = $$0;
      this.k = RenderSystem.maxSupportedTextureSize();
   }

   public void a(hjf.a $$0) {
      e.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.j});
      this.a = new fjr(this.j::toString, fjs.a, $$0.b(), $$0.c(), $$0.d() + 1);
      this.l = $$0.b();
      this.m = $$0.c();
      this.n = $$0.d();
      this.g();
      this.a(false, this.n > 1);
      this.h = Map.copyOf($$0.f());
      this.i = this.h.get(hiz.c());
      if (this.i == null) {
         throw new IllegalStateException("Atlas '" + this.j + "' (" + this.h.size() + " sprites) has no missing texture sprite");
      } else {
         List<hje> $$1 = new ArrayList<>();
         List<hjk.a> $$2 = new ArrayList<>();

         for (hjk $$3 : $$0.f().values()) {
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

            hjk.a $$7 = $$3.f();
            if ($$7 != null) {
               $$2.add($$7);
            }
         }

         this.f = List.copyOf($$1);
         this.g = List.copyOf($$2);
      }
   }

   @Override
   public void a(alg $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.n, this.l, this.m);
      a($$1, $$2, this.h);
   }

   private static void a(Path $$0, String $$1, Map<alg, hjk> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<alg, hjk> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            hjk $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         e.warn("Failed to write file {}", $$3, var10);
      }
   }

   public void e() {
      if (this.a != null) {
         for (hjk.a $$0 : this.g) {
            $$0.a(this.a);
         }
      }
   }

   @Override
   public void f() {
      this.e();
   }

   public hjk a(alg $$0) {
      hjk $$1 = this.h.getOrDefault($$0, this.i);
      if ($$1 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         return $$1;
      }
   }

   public void g() {
      this.f.forEach(hje::close);
      this.g.forEach(hjk.a::close);
      this.f = List.of();
      this.g = List.of();
      this.h = Map.of();
      this.i = null;
   }

   public alg h() {
      return this.j;
   }

   public int i() {
      return this.k;
   }

   int j() {
      return this.l;
   }

   int k() {
      return this.m;
   }
}
