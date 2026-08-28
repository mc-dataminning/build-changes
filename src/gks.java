import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.joml.Matrix4f;

public class gks implements AutoCloseable {
   private static final fge p = new fge();
   private static final int q = -1;
   private final List<gmc.a> r = new ArrayList<>();
   private final Object2IntMap<String> s = new Object2IntArrayMap();
   private final IntList t = new IntArrayList();
   private final List<fgh> u = new ArrayList<>();
   private final Map<String, fgh> v = new HashMap<>();
   private final Map<String, gmc.b> w = new HashMap<>();
   private final int x;
   @Nullable
   public fgh a;
   @Nullable
   public fgh b;
   @Nullable
   public fgh c;
   @Nullable
   public fgh d;
   @Nullable
   public fgh e;
   @Nullable
   public fgh f;
   @Nullable
   public fgh g;
   @Nullable
   public fgh h;
   @Nullable
   public fgh i;
   @Nullable
   public fgh j;
   @Nullable
   public fgh k;
   @Nullable
   public fgh l;
   @Nullable
   public fgh m;
   @Nullable
   public fgh n;
   @Nullable
   public fgh o;

   private gks(int $$0) {
      this.x = $$0;
      this.s.defaultReturnValue(-1);
   }

   public static gks a(fgf $$0, fgf $$1, fgv $$2) throws gma.b {
      int $$3 = GlStateManager.glCreateProgram();
      if ($$3 <= 0) {
         throw new gma.b("Could not create shader program (returned program ID " + $$3 + ")");
      } else {
         $$2.a($$3);
         GlStateManager.glAttachShader($$3, $$0.b());
         GlStateManager.glAttachShader($$3, $$1.b());
         GlStateManager.glLinkProgram($$3);
         int $$4 = GlStateManager.glGetProgrami($$3, 35714);
         if ($$4 == 0) {
            String $$5 = GlStateManager.glGetProgramInfoLog($$3, 32768);
            throw new gma.b("Error encountered when linking program containing VS " + $$0.a() + " and FS " + $$1.a() + ". Log output: " + $$5);
         } else {
            return new gks($$3);
         }
      }
   }

   public void a(List<gmc.b> $$0, List<gmc.a> $$1) {
      RenderSystem.assertOnRenderThread();

      for (gmc.b $$2 : $$0) {
         String $$3 = $$2.a();
         int $$4 = fgh.a(this.x, $$3);
         if ($$4 != -1) {
            fgh $$5 = this.a($$2);
            $$5.b($$4);
            this.u.add($$5);
            this.v.put($$3, $$5);
            this.w.put($$3, $$2);
         }
      }

      for (gmc.a $$6 : $$1) {
         int $$7 = fgh.a(this.x, $$6.a());
         if ($$7 != -1) {
            this.r.add($$6);
            this.t.add($$7);
         }
      }

      this.a = this.a("ModelViewMat");
      this.b = this.a("ProjMat");
      this.c = this.a("TextureMat");
      this.d = this.a("ScreenSize");
      this.e = this.a("ColorModulator");
      this.f = this.a("Light0_Direction");
      this.g = this.a("Light1_Direction");
      this.h = this.a("GlintAlpha");
      this.i = this.a("FogStart");
      this.j = this.a("FogEnd");
      this.k = this.a("FogColor");
      this.l = this.a("FogShape");
      this.m = this.a("LineWidth");
      this.n = this.a("GameTime");
      this.o = this.a("ModelOffset");
   }

   @Override
   public void close() {
      this.u.forEach(fgh::close);
      GlStateManager.glDeleteProgram(this.x);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(0);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.t.size(); $$1++) {
         gmc.a $$2 = this.r.get($$1);
         if (!this.s.containsKey($$2.a())) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(this.x);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.t.size(); $$1++) {
         String $$2 = this.r.get($$1).a();
         int $$3 = this.s.getInt($$2);
         if ($$3 != -1) {
            int $$4 = this.t.getInt($$1);
            fgh.b($$4, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            RenderSystem.bindTexture($$3);
         }
      }

      GlStateManager._activeTexture($$0);

      for (fgh $$5 : this.u) {
         $$5.b();
      }
   }

   @Nullable
   public fgh a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.v.get($$0);
   }

   @Nullable
   public gmc.b b(String $$0) {
      return this.w.get($$0);
   }

   public fge c(String $$0) {
      fgh $$1 = this.a($$0);
      return (fge)($$1 == null ? p : $$1);
   }

   public void a(String $$0, int $$1) {
      this.s.put($$0, $$1);
   }

   private fgh a(gmc.b $$0) {
      int $$1 = fgh.a($$0.b());
      int $$2 = $$0.c();
      int $$3 = $$2 > 1 && $$2 <= 4 && $$1 < 8 ? $$2 - 1 : 0;
      fgh $$4 = new fgh($$0.a(), $$1 + $$3, $$2);
      $$4.a($$0);
      return $$4;
   }

   public void a(fgv.c $$0, Matrix4f $$1, Matrix4f $$2, fft $$3) {
      for (int $$4 = 0; $$4 < 12; $$4++) {
         int $$5 = RenderSystem.getShaderTexture($$4);
         this.a("Sampler" + $$4, $$5);
      }

      if (this.a != null) {
         this.a.a($$1);
      }

      if (this.b != null) {
         this.b.a($$2);
      }

      if (this.e != null) {
         this.e.a(RenderSystem.getShaderColor());
      }

      if (this.h != null) {
         this.h.a(RenderSystem.getShaderGlintAlpha());
      }

      gkx $$6 = RenderSystem.getShaderFog();
      if (this.i != null) {
         this.i.a($$6.a());
      }

      if (this.j != null) {
         this.j.a($$6.b());
      }

      if (this.k != null) {
         this.k.a($$6.d(), $$6.e(), $$6.f(), $$6.g());
      }

      if (this.l != null) {
         this.l.a($$6.c().a());
      }

      if (this.c != null) {
         this.c.a(RenderSystem.getTextureMatrix());
      }

      if (this.n != null) {
         this.n.a(RenderSystem.getShaderGameTime());
      }

      if (this.d != null) {
         this.d.a((float)$$3.k(), (float)$$3.l());
      }

      if (this.m != null && ($$0 == fgv.c.a || $$0 == fgv.c.b)) {
         this.m.a(RenderSystem.getShaderLineWidth());
      }

      RenderSystem.setupShaderLights(this);
   }

   @VisibleForTesting
   public void a(fgh $$0) {
      this.u.add($$0);
      this.v.put($$0.a(), $$0);
   }

   @VisibleForTesting
   public int c() {
      return this.x;
   }
}
