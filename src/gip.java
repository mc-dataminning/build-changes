import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.joml.Matrix4f;

public class gip implements AutoCloseable {
   private static final fef p = new fef();
   private static final int q = -1;
   private final List<gjz.a> r = new ArrayList<>();
   private final Object2IntMap<String> s = new Object2IntArrayMap();
   private final IntList t = new IntArrayList();
   private final List<fei> u = new ArrayList<>();
   private final Map<String, fei> v = new HashMap<>();
   private final int w;
   @Nullable
   public fei a;
   @Nullable
   public fei b;
   @Nullable
   public fei c;
   @Nullable
   public fei d;
   @Nullable
   public fei e;
   @Nullable
   public fei f;
   @Nullable
   public fei g;
   @Nullable
   public fei h;
   @Nullable
   public fei i;
   @Nullable
   public fei j;
   @Nullable
   public fei k;
   @Nullable
   public fei l;
   @Nullable
   public fei m;
   @Nullable
   public fei n;
   @Nullable
   public fei o;

   private gip(int $$0) {
      this.w = $$0;
      this.s.defaultReturnValue(-1);
   }

   public static gip a(feg $$0, feg $$1, few $$2) throws gjx.b {
      int $$3 = GlStateManager.glCreateProgram();
      if ($$3 <= 0) {
         throw new gjx.b("Could not create shader program (returned program ID " + $$3 + ")");
      } else {
         $$2.a($$3);
         GlStateManager.glAttachShader($$3, $$0.b());
         GlStateManager.glAttachShader($$3, $$1.b());
         GlStateManager.glLinkProgram($$3);
         int $$4 = GlStateManager.glGetProgrami($$3, 35714);
         if ($$4 == 0) {
            String $$5 = GlStateManager.glGetProgramInfoLog($$3, 32768);
            throw new gjx.b("Error encountered when linking program containing VS " + $$0.a() + " and FS " + $$1.a() + ". Log output: " + $$5);
         } else {
            return new gip($$3);
         }
      }
   }

   public void a(List<gjz.b> $$0, List<gjz.a> $$1) {
      RenderSystem.assertOnRenderThread();

      for (gjz.b $$2 : $$0) {
         String $$3 = $$2.a();
         int $$4 = fei.a(this.w, $$3);
         if ($$4 != -1) {
            fei $$5 = this.a($$2);
            $$5.b($$4);
            this.u.add($$5);
            this.v.put($$3, $$5);
         }
      }

      for (gjz.a $$6 : $$1) {
         int $$7 = fei.a(this.w, $$6.a());
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
      this.u.forEach(fei::close);
      GlStateManager.glDeleteProgram(this.w);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(0);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.t.size(); $$1++) {
         gjz.a $$2 = this.r.get($$1);
         if (!this.s.containsKey($$2.a())) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(this.w);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.t.size(); $$1++) {
         String $$2 = this.r.get($$1).a();
         int $$3 = this.s.getInt($$2);
         if ($$3 != -1) {
            int $$4 = this.t.getInt($$1);
            fei.b($$4, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            RenderSystem.bindTexture($$3);
         }
      }

      GlStateManager._activeTexture($$0);

      for (fei $$5 : this.u) {
         $$5.b();
      }
   }

   @Nullable
   public fei a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.v.get($$0);
   }

   public fef b(String $$0) {
      fei $$1 = this.a($$0);
      return (fef)($$1 == null ? p : $$1);
   }

   public void a(String $$0, int $$1) {
      this.s.put($$0, $$1);
   }

   private fei a(gjz.b $$0) {
      String $$1 = $$0.a();
      int $$2 = fei.a($$0.b());
      int $$3 = $$0.c();
      float[] $$4 = new float[Math.max($$3, 16)];
      int $$5 = 0;

      for (float $$6 : $$0.d()) {
         $$4[$$5++] = $$6;
      }

      if ($$3 > 1 && $$0.d().size() == 1) {
         while ($$5 < $$3) {
            $$4[$$5] = $$4[0];
            $$5++;
         }
      }

      int $$7 = $$3 > 1 && $$3 <= 4 && $$2 < 8 ? $$3 - 1 : 0;
      fei $$8 = new fei($$1, $$2 + $$7, $$3);
      if ($$2 <= 3) {
         $$8.a((int)$$4[0], (int)$$4[1], (int)$$4[2], (int)$$4[3]);
      } else if ($$2 <= 7) {
         $$8.b($$4[0], $$4[1], $$4[2], $$4[3]);
      } else {
         $$8.a(Arrays.copyOfRange($$4, 0, $$3));
      }

      return $$8;
   }

   public void a(few.c $$0, Matrix4f $$1, Matrix4f $$2, fdu $$3) {
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

      giu $$6 = RenderSystem.getShaderFog();
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

      if (this.m != null && ($$0 == few.c.a || $$0 == few.c.b)) {
         this.m.a(RenderSystem.getShaderLineWidth());
      }

      RenderSystem.setupShaderLights(this);
   }

   @VisibleForTesting
   public void a(fei $$0) {
      this.u.add($$0);
      this.v.put($$0.a(), $$0);
   }

   @VisibleForTesting
   public int c() {
      return this.w;
   }
}
