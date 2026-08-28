import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.slf4j.Logger;

public class gfn implements fay, AutoCloseable {
   public static final String a = "shaders";
   private static final String q = "shaders/core/";
   private static final String r = "shaders/include/";
   static final Logger s = LogUtils.getLogger();
   private static final far t = new far();
   private static final boolean u = true;
   private static gfn v;
   private static int w = -1;
   private final Map<String, Object> x = Maps.newHashMap();
   private final List<String> y = Lists.newArrayList();
   private final List<Integer> z = Lists.newArrayList();
   private final List<faz> A = Lists.newArrayList();
   private final List<Integer> B = Lists.newArrayList();
   private final Map<String, faz> C = Maps.newHashMap();
   private final int D;
   private final String E;
   private boolean F;
   private final faw G;
   private final faw H;
   private final fbn I;
   @Nullable
   public final faz b;
   @Nullable
   public final faz c;
   @Nullable
   public final faz d;
   @Nullable
   public final faz e;
   @Nullable
   public final faz f;
   @Nullable
   public final faz g;
   @Nullable
   public final faz h;
   @Nullable
   public final faz i;
   @Nullable
   public final faz j;
   @Nullable
   public final faz k;
   @Nullable
   public final faz l;
   @Nullable
   public final faz m;
   @Nullable
   public final faz n;
   @Nullable
   public final faz o;
   @Nullable
   public final faz p;

   public gfn(auh $$0, String $$1, fbn $$2) throws IOException {
      this.E = $$1;
      this.I = $$2;
      akr $$3 = akr.b("shaders/core/" + $$1 + ".json");

      try (Reader $$4 = $$0.openAsReader($$3)) {
         JsonObject $$5 = aye.a($$4);
         String $$6 = aye.i($$5, "vertex");
         String $$7 = aye.i($$5, "fragment");
         JsonArray $$8 = aye.a($$5, "samplers", null);
         if ($$8 != null) {
            int $$9 = 0;

            for (JsonElement $$10 : $$8) {
               try {
                  this.a($$10);
               } catch (Exception var18) {
                  aku $$12 = aku.a(var18);
                  $$12.a("samplers[" + $$9 + "]");
                  throw $$12;
               }

               $$9++;
            }
         }

         JsonArray $$13 = aye.a($$5, "uniforms", null);
         if ($$13 != null) {
            int $$14 = 0;

            for (JsonElement $$15 : $$13) {
               try {
                  this.b($$15);
               } catch (Exception var17) {
                  aku $$17 = aku.a(var17);
                  $$17.a("uniforms[" + $$14 + "]");
                  throw $$17;
               }

               $$14++;
            }
         }

         this.G = a($$0, faw.a.a, $$6);
         this.H = a($$0, faw.a.b, $$7);
         this.D = fax.a();
         int $$18 = 0;

         for (String $$19 : $$2.d()) {
            faz.a(this.D, $$18, $$19);
            $$18++;
         }

         fax.b(this);
         this.j();
      } catch (Exception var20) {
         aku $$22 = aku.a(var20);
         $$22.b($$3.a());
         throw $$22;
      }

      this.b();
      this.b = this.a("ModelViewMat");
      this.c = this.a("ProjMat");
      this.d = this.a("TextureMat");
      this.e = this.a("ScreenSize");
      this.f = this.a("ColorModulator");
      this.g = this.a("Light0_Direction");
      this.h = this.a("Light1_Direction");
      this.i = this.a("GlintAlpha");
      this.j = this.a("FogStart");
      this.k = this.a("FogEnd");
      this.l = this.a("FogColor");
      this.m = this.a("FogShape");
      this.n = this.a("LineWidth");
      this.o = this.a("GameTime");
      this.p = this.a("ChunkOffset");
   }

   private static faw a(final auh $$0, faw.a $$1, String $$2) throws IOException {
      faw $$3 = $$1.c().get($$2);
      faw $$8;
      if ($$3 == null) {
         String $$4 = "shaders/core/" + $$2 + $$1.b();
         auc $$5 = $$0.getResourceOrThrow(akr.b($$4));

         try (InputStream $$6 = $$5.d()) {
            final String $$7 = v.b($$4);
            $$8 = faw.a($$1, $$2, $$6, $$5.b(), new fap() {
               private final Set<String> c = Sets.newHashSet();

               @Override
               public String a(boolean $$0x, String $$1) {
                  $$1 = v.c(($$0 ? $$7 : "shaders/include/") + $$1);
                  if (!this.c.add($$1)) {
                     return null;
                  } else {
                     akr $$2 = akr.a($$1);

                     try {
                        String var5;
                        try (Reader $$3 = $$0.openAsReader($$2)) {
                           var5 = IOUtils.toString($$3);
                        }

                        return var5;
                     } catch (IOException var9) {
                        gfn.s.error("Could not open GLSL import {}: {}", $$1, var9.getMessage());
                        return "#error " + var9.getMessage();
                     }
                  }
               }
            });
         }
      } else {
         $$8 = $$3;
      }

      return $$8;
   }

   @Override
   public void close() {
      for (faz $$0 : this.A) {
         $$0.close();
      }

      fax.a(this);
   }

   public void f() {
      RenderSystem.assertOnRenderThread();
      fax.a(0);
      w = -1;
      v = null;
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.z.size(); $$1++) {
         if (this.x.get(this.y.get($$1)) != null) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   public void g() {
      RenderSystem.assertOnRenderThread();
      this.F = false;
      v = this;
      if (this.D != w) {
         fax.a(this.D);
         w = this.D;
      }

      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.z.size(); $$1++) {
         String $$2 = this.y.get($$1);
         if (this.x.get($$2) != null) {
            int $$3 = faz.a(this.D, $$2);
            faz.b($$3, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            Object $$4 = this.x.get($$2);
            int $$5 = -1;
            if ($$4 instanceof ezv) {
               $$5 = ((ezv)$$4).f();
            } else if ($$4 instanceof gpw) {
               $$5 = ((gpw)$$4).a();
            } else if ($$4 instanceof Integer) {
               $$5 = (Integer)$$4;
            }

            if ($$5 != -1) {
               RenderSystem.bindTexture($$5);
            }
         }
      }

      GlStateManager._activeTexture($$0);

      for (faz $$6 : this.A) {
         $$6.b();
      }
   }

   @Override
   public void b() {
      this.F = true;
   }

   @Nullable
   public faz a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.C.get($$0);
   }

   public far b(String $$0) {
      faz $$1 = this.a($$0);
      return (far)($$1 == null ? t : $$1);
   }

   private void j() {
      RenderSystem.assertOnRenderThread();
      IntList $$0 = new IntArrayList();

      for (int $$1 = 0; $$1 < this.y.size(); $$1++) {
         String $$2 = this.y.get($$1);
         int $$3 = faz.a(this.D, $$2);
         if ($$3 == -1) {
            s.warn("Shader {} could not find sampler named {} in the specified shader program.", this.E, $$2);
            this.x.remove($$2);
            $$0.add($$1);
         } else {
            this.z.add($$3);
         }
      }

      for (int $$4 = $$0.size() - 1; $$4 >= 0; $$4--) {
         int $$5 = $$0.getInt($$4);
         this.y.remove($$5);
      }

      for (faz $$6 : this.A) {
         String $$7 = $$6.a();
         int $$8 = faz.a(this.D, $$7);
         if ($$8 == -1) {
            s.warn("Shader {} could not find uniform named {} in the specified shader program.", this.E, $$7);
         } else {
            this.B.add($$8);
            $$6.b($$8);
            this.C.put($$7, $$6);
         }
      }
   }

   private void a(JsonElement $$0) {
      JsonObject $$1 = aye.m($$0, "sampler");
      String $$2 = aye.i($$1, "name");
      if (!aye.a($$1, "file")) {
         this.x.put($$2, null);
         this.y.add($$2);
      } else {
         this.y.add($$2);
      }
   }

   public void a(String $$0, Object $$1) {
      this.x.put($$0, $$1);
      this.b();
   }

   private void b(JsonElement $$0) throws aku {
      JsonObject $$1 = aye.m($$0, "uniform");
      String $$2 = aye.i($$1, "name");
      int $$3 = faz.a(aye.i($$1, "type"));
      int $$4 = aye.o($$1, "count");
      float[] $$5 = new float[Math.max($$4, 16)];
      JsonArray $$6 = aye.v($$1, "values");
      if ($$6.size() != $$4 && $$6.size() > 1) {
         throw new aku("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
      } else {
         int $$7 = 0;

         for (JsonElement $$8 : $$6) {
            try {
               $$5[$$7] = aye.e($$8, "value");
            } catch (Exception var13) {
               aku $$10 = aku.a(var13);
               $$10.a("values[" + $$7 + "]");
               throw $$10;
            }

            $$7++;
         }

         if ($$4 > 1 && $$6.size() == 1) {
            while ($$7 < $$4) {
               $$5[$$7] = $$5[0];
               $$7++;
            }
         }

         int $$11 = $$4 > 1 && $$4 <= 4 && $$3 < 8 ? $$4 - 1 : 0;
         faz $$12 = new faz($$2, $$3 + $$11, $$4, this);
         if ($$3 <= 3) {
            $$12.a((int)$$5[0], (int)$$5[1], (int)$$5[2], (int)$$5[3]);
         } else if ($$3 <= 7) {
            $$12.b($$5[0], $$5[1], $$5[2], $$5[3]);
         } else {
            $$12.a(Arrays.copyOfRange($$5, 0, $$4));
         }

         this.A.add($$12);
      }
   }

   @Override
   public faw c() {
      return this.G;
   }

   @Override
   public faw d() {
      return this.H;
   }

   @Override
   public void e() {
      this.H.a(this);
      this.G.a(this);
   }

   public fbn h() {
      return this.I;
   }

   public String i() {
      return this.E;
   }

   @Override
   public int a() {
      return this.D;
   }

   public void a(fbn.c $$0, Matrix4f $$1, Matrix4f $$2, fam $$3) {
      for (int $$4 = 0; $$4 < 12; $$4++) {
         int $$5 = RenderSystem.getShaderTexture($$4);
         this.a("Sampler" + $$4, $$5);
      }

      if (this.b != null) {
         this.b.a($$1);
      }

      if (this.c != null) {
         this.c.a($$2);
      }

      if (this.f != null) {
         this.f.a(RenderSystem.getShaderColor());
      }

      if (this.i != null) {
         this.i.a(RenderSystem.getShaderGlintAlpha());
      }

      if (this.j != null) {
         this.j.a(RenderSystem.getShaderFogStart());
      }

      if (this.k != null) {
         this.k.a(RenderSystem.getShaderFogEnd());
      }

      if (this.l != null) {
         this.l.a(RenderSystem.getShaderFogColor());
      }

      if (this.m != null) {
         this.m.a(RenderSystem.getShaderFogShape().a());
      }

      if (this.d != null) {
         this.d.a(RenderSystem.getTextureMatrix());
      }

      if (this.o != null) {
         this.o.a(RenderSystem.getShaderGameTime());
      }

      if (this.e != null) {
         this.e.a((float)$$3.l(), (float)$$3.m());
      }

      if (this.n != null && ($$0 == fbn.c.a || $$0 == fbn.c.b)) {
         this.n.a(RenderSystem.getShaderLineWidth());
      }

      RenderSystem.setupShaderLights(this);
   }
}
