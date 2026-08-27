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
import org.slf4j.Logger;

public class fyk extends fxw implements fxx, fyn {
   private static final Logger g = LogUtils.getLogger();
   @Deprecated
   public static final aer e = cfd.v;
   @Deprecated
   public static final aer f = new aer("textures/atlas/particles.png");
   private List<fyf> h = List.of();
   private List<fyl.a> i = List.of();
   private Map<aer, fyl> j = Map.of();
   private final aer k;
   private final int l;
   private int m;
   private int n;
   private int o;

   public fyk(aer $$0) {
      this.k = $$0;
      this.l = RenderSystem.maxSupportedTextureSize();
   }

   @Override
   public void a(anm $$0) {
   }

   public void a(fyg.a $$0) {
      g.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0.b(), $$0.c(), $$0.d(), this.k});
      TextureUtil.prepareImage(this.a(), $$0.d(), $$0.b(), $$0.c());
      this.m = $$0.b();
      this.n = $$0.c();
      this.o = $$0.d();
      this.f();
      this.j = Map.copyOf($$0.f());
      List<fyf> $$1 = new ArrayList<>();
      List<fyl.a> $$2 = new ArrayList<>();

      for (fyl $$3 : $$0.f().values()) {
         $$1.add($$3.e());

         try {
            $$3.j();
         } catch (Throwable var9) {
            o $$5 = o.a(var9, "Stitching texture atlas");
            p $$6 = $$5.a("Texture being stitched together");
            $$6.a("Atlas path", this.k);
            $$6.a("Sprite", $$3);
            throw new y($$5);
         }

         fyl.a $$7 = $$3.f();
         if ($$7 != null) {
            $$2.add($$7);
         }
      }

      this.h = List.copyOf($$1);
      this.i = List.copyOf($$2);
   }

   @Override
   public void a(aer $$0, Path $$1) throws IOException {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), this.o, this.m, this.n);
      a($$1, $$2, this.j);
   }

   private static void a(Path $$0, String $$1, Map<aer, fyl> $$2) {
      Path $$3 = $$0.resolve($$1 + ".txt");

      try (Writer $$4 = Files.newBufferedWriter($$3)) {
         for (Entry<aer, fyl> $$5 : $$2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            fyl $$6 = $$5.getValue();
            $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().a(), $$6.e().b()));
         }
      } catch (IOException var10) {
         g.warn("Failed to write file {}", $$3, var10);
      }
   }

   @Override
   public void d() {
      this.c();

      for (fyl.a $$0 : this.i) {
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

   public fyl a(aer $$0) {
      fyl $$1 = this.j.get($$0);
      return $$1 == null ? this.j.get(fyb.b()) : $$1;
   }

   public void f() {
      this.h.forEach(fyf::close);
      this.i.forEach(fyl.a::close);
      this.h = List.of();
      this.i = List.of();
      this.j = Map.of();
   }

   public aer g() {
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

   public void b(fyg.a $$0) {
      this.a(false, $$0.d() > 0);
   }
}
