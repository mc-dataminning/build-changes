import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.joml.Matrix4f;

public class gqa implements AutoCloseable {
   private static final fjn p = new fjn();
   private final List<String> q = new ArrayList<>();
   private final Object2ObjectMap<String, fjw> r = new Object2ObjectOpenHashMap();
   private final IntList s = new IntArrayList();
   private final List<fjq> t = new ArrayList<>();
   private final Map<String, fjq> u = new HashMap<>();
   private final int v;
   private final String w;
   @Nullable
   public fjq a;
   @Nullable
   public fjq b;
   @Nullable
   public fjq c;
   @Nullable
   public fjq d;
   @Nullable
   public fjq e;
   @Nullable
   public fjq f;
   @Nullable
   public fjq g;
   @Nullable
   public fjq h;
   @Nullable
   public fjq i;
   @Nullable
   public fjq j;
   @Nullable
   public fjq k;
   @Nullable
   public fjq l;
   @Nullable
   public fjq m;
   @Nullable
   public fjq n;
   @Nullable
   public fjq o;

   private gqa(int $$0, String $$1) {
      this.v = $$0;
      this.w = $$1;
   }

   public static gqa a(fjo $$0, fjo $$1, fki $$2, String $$3) throws grj.b {
      int $$4 = GlStateManager.glCreateProgram();
      if ($$4 <= 0) {
         throw new grj.b("Could not create shader program (returned program ID " + $$4 + ")");
      } else {
         $$2.a($$4);
         GlStateManager.glAttachShader($$4, $$0.b());
         GlStateManager.glAttachShader($$4, $$1.b());
         GlStateManager.glLinkProgram($$4);
         int $$5 = GlStateManager.glGetProgrami($$4, 35714);
         if ($$5 == 0) {
            String $$6 = GlStateManager.glGetProgramInfoLog($$4, 32768);
            throw new grj.b("Error encountered when linking program containing VS " + $$0.a() + " and FS " + $$1.a() + ". Log output: " + $$6);
         } else {
            return new gqa($$4, $$3);
         }
      }
   }

   public void a(List<fii.c> $$0, List<String> $$1) {
      RenderSystem.assertOnRenderThread();

      for (fii.c $$2 : $$0) {
         String $$3 = $$2.a();
         int $$4 = fjq.a(this.v, $$3);
         if ($$4 != -1) {
            fjq $$5 = this.a($$2);
            $$5.b($$4);
            this.t.add($$5);
            this.u.put($$3, $$5);
         }
      }

      for (String $$6 : $$1) {
         int $$7 = fjq.a(this.v, $$6);
         if ($$7 != -1) {
            this.q.add($$6);
            this.s.add($$7);
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

   private fjq a(fii.c $$0) {
      return new fjq($$0.a(), $$0.b());
   }

   @Override
   public void close() {
      this.t.forEach(fjq::close);
      GlStateManager.glDeleteProgram(this.v);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(0);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.s.size(); $$1++) {
         String $$2 = this.q.get($$1);
         if (!this.r.containsKey($$2)) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(this.v);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.s.size(); $$1++) {
         String $$2 = this.q.get($$1);
         fjw $$3 = (fjw)this.r.get($$2);
         if ($$3 != null) {
            int $$4 = this.s.getInt($$1);
            fjq.b($$4, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            $$3.c();
         }
      }

      GlStateManager._activeTexture($$0);

      for (fjq $$5 : this.t) {
         $$5.c();
      }
   }

   @Nullable
   public fjq a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.u.get($$0);
   }

   public fjn b(String $$0) {
      fjq $$1 = this.a($$0);
      return (fjn)($$1 == null ? p : $$1);
   }

   public void a(String $$0, @Nullable fjw $$1) {
      this.r.put($$0, $$1);
   }

   public void a(fki.c $$0, Matrix4f $$1, Matrix4f $$2, fjc $$3) {
      for (int $$4 = 0; $$4 < 12; $$4++) {
         fjw $$5 = RenderSystem.getShaderTexture($$4);
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

      gqf $$6 = RenderSystem.getShaderFog();
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

      if (this.o != null) {
         this.o.a(RenderSystem.getModelOffset());
      }

      if (this.d != null) {
         this.d.a((float)$$3.k(), (float)$$3.l());
      }

      if (this.m != null && ($$0 == fki.c.a || $$0 == fki.c.b)) {
         this.m.a(RenderSystem.getShaderLineWidth());
      }

      RenderSystem.setupShaderLights(this);
   }

   @VisibleForTesting
   public void a(fjq $$0) {
      this.t.add($$0);
      this.u.put($$0.a(), $$0);
   }

   @VisibleForTesting
   public int c() {
      return this.v;
   }

   @Override
   public String toString() {
      return this.w;
   }
}
