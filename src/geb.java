import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
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
import org.slf4j.Logger;

public class geb implements ezn, AutoCloseable {
   public static final String a = "shaders";
   private static final String q = "shaders/core/";
   private static final String r = "shaders/include/";
   static final Logger s = LogUtils.getLogger();
   private static final ezg t = new ezg();
   private static final boolean u = true;
   private static geb v;
   private static int w = -1;
   private final Map<String, Object> x = Maps.newHashMap();
   private final List<String> y = Lists.newArrayList();
   private final List<Integer> z = Lists.newArrayList();
   private final List<ezo> A = Lists.newArrayList();
   private final List<Integer> B = Lists.newArrayList();
   private final Map<String, ezo> C = Maps.newHashMap();
   private final int D;
   private final String E;
   private boolean F;
   private final ezh G;
   private final ezl H;
   private final ezl I;
   private final fac J;
   @Nullable
   public final ezo b;
   @Nullable
   public final ezo c;
   @Nullable
   public final ezo d;
   @Nullable
   public final ezo e;
   @Nullable
   public final ezo f;
   @Nullable
   public final ezo g;
   @Nullable
   public final ezo h;
   @Nullable
   public final ezo i;
   @Nullable
   public final ezo j;
   @Nullable
   public final ezo k;
   @Nullable
   public final ezo l;
   @Nullable
   public final ezo m;
   @Nullable
   public final ezo n;
   @Nullable
   public final ezo o;
   @Nullable
   public final ezo p;

   public geb(aur $$0, String $$1, fac $$2) throws IOException {
      this.E = $$1;
      this.J = $$2;
      ale $$3 = new ale("shaders/core/" + $$1 + ".json");

      try (Reader $$4 = $$0.openAsReader($$3)) {
         JsonObject $$5 = ayo.a($$4);
         String $$6 = ayo.i($$5, "vertex");
         String $$7 = ayo.i($$5, "fragment");
         JsonArray $$8 = ayo.a($$5, "samplers", null);
         if ($$8 != null) {
            int $$9 = 0;

            for (JsonElement $$10 : $$8) {
               try {
                  this.a($$10);
               } catch (Exception var18) {
                  alh $$12 = alh.a(var18);
                  $$12.a("samplers[" + $$9 + "]");
                  throw $$12;
               }

               $$9++;
            }
         }

         JsonArray $$13 = ayo.a($$5, "uniforms", null);
         if ($$13 != null) {
            int $$14 = 0;

            for (JsonElement $$15 : $$13) {
               try {
                  this.b($$15);
               } catch (Exception var17) {
                  alh $$17 = alh.a(var17);
                  $$17.a("uniforms[" + $$14 + "]");
                  throw $$17;
               }

               $$14++;
            }
         }

         this.G = a(ayo.a($$5, "blend", null));
         this.H = a($$0, ezl.a.a, $$6);
         this.I = a($$0, ezl.a.b, $$7);
         this.D = ezm.a();
         int $$18 = 0;

         for (UnmodifiableIterator var26 = $$2.d().iterator(); var26.hasNext(); $$18++) {
            String $$19 = (String)var26.next();
            ezo.a(this.D, $$18, $$19);
         }

         ezm.b(this);
         this.j();
      } catch (Exception var20) {
         alh $$22 = alh.a(var20);
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

   private static ezl a(final aur $$0, ezl.a $$1, String $$2) throws IOException {
      ezl $$3 = $$1.c().get($$2);
      ezl $$8;
      if ($$3 == null) {
         String $$4 = "shaders/core/" + $$2 + $$1.b();
         aum $$5 = $$0.getResourceOrThrow(new ale($$4));

         try (InputStream $$6 = $$5.d()) {
            final String $$7 = v.a($$4);
            $$8 = ezl.a($$1, $$2, $$6, $$5.b(), new eze() {
               private final Set<String> c = Sets.newHashSet();

               @Override
               public String a(boolean $$0x, String $$1) {
                  $$1 = v.b(($$0 ? $$7 : "shaders/include/") + $$1);
                  if (!this.c.add($$1)) {
                     return null;
                  } else {
                     ale $$2 = new ale($$1);

                     try {
                        String var5;
                        try (Reader $$3 = $$0.openAsReader($$2)) {
                           var5 = IOUtils.toString($$3);
                        }

                        return var5;
                     } catch (IOException var9) {
                        geb.s.error("Could not open GLSL import {}: {}", $$1, var9.getMessage());
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

   public static ezh a(JsonObject $$0) {
      if ($$0 == null) {
         return new ezh();
      } else {
         int $$1 = 32774;
         int $$2 = 1;
         int $$3 = 0;
         int $$4 = 1;
         int $$5 = 0;
         boolean $$6 = true;
         boolean $$7 = false;
         if (ayo.a($$0, "func")) {
            $$1 = ezh.a($$0.get("func").getAsString());
            if ($$1 != 32774) {
               $$6 = false;
            }
         }

         if (ayo.a($$0, "srcrgb")) {
            $$2 = ezh.b($$0.get("srcrgb").getAsString());
            if ($$2 != 1) {
               $$6 = false;
            }
         }

         if (ayo.a($$0, "dstrgb")) {
            $$3 = ezh.b($$0.get("dstrgb").getAsString());
            if ($$3 != 0) {
               $$6 = false;
            }
         }

         if (ayo.a($$0, "srcalpha")) {
            $$4 = ezh.b($$0.get("srcalpha").getAsString());
            if ($$4 != 1) {
               $$6 = false;
            }

            $$7 = true;
         }

         if (ayo.a($$0, "dstalpha")) {
            $$5 = ezh.b($$0.get("dstalpha").getAsString());
            if ($$5 != 0) {
               $$6 = false;
            }

            $$7 = true;
         }

         if ($$6) {
            return new ezh();
         } else {
            return $$7 ? new ezh($$2, $$3, $$4, $$5, $$1) : new ezh($$2, $$3, $$1);
         }
      }
   }

   @Override
   public void close() {
      for (ezo $$0 : this.A) {
         $$0.close();
      }

      ezm.a(this);
   }

   public void f() {
      RenderSystem.assertOnRenderThread();
      ezm.a(0);
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
      this.G.a();
      if (this.D != w) {
         ezm.a(this.D);
         w = this.D;
      }

      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.z.size(); $$1++) {
         String $$2 = this.y.get($$1);
         if (this.x.get($$2) != null) {
            int $$3 = ezo.a(this.D, $$2);
            ezo.b($$3, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            Object $$4 = this.x.get($$2);
            int $$5 = -1;
            if ($$4 instanceof eyj) {
               $$5 = ((eyj)$$4).f();
            } else if ($$4 instanceof goj) {
               $$5 = ((goj)$$4).a();
            } else if ($$4 instanceof Integer) {
               $$5 = (Integer)$$4;
            }

            if ($$5 != -1) {
               RenderSystem.bindTexture($$5);
            }
         }
      }

      GlStateManager._activeTexture($$0);

      for (ezo $$6 : this.A) {
         $$6.b();
      }
   }

   @Override
   public void b() {
      this.F = true;
   }

   @Nullable
   public ezo a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.C.get($$0);
   }

   public ezg b(String $$0) {
      RenderSystem.assertOnGameThread();
      ezo $$1 = this.a($$0);
      return (ezg)($$1 == null ? t : $$1);
   }

   private void j() {
      RenderSystem.assertOnRenderThread();
      IntList $$0 = new IntArrayList();

      for (int $$1 = 0; $$1 < this.y.size(); $$1++) {
         String $$2 = this.y.get($$1);
         int $$3 = ezo.a(this.D, $$2);
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

      for (ezo $$6 : this.A) {
         String $$7 = $$6.a();
         int $$8 = ezo.a(this.D, $$7);
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
      JsonObject $$1 = ayo.m($$0, "sampler");
      String $$2 = ayo.i($$1, "name");
      if (!ayo.a($$1, "file")) {
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

   private void b(JsonElement $$0) throws alh {
      JsonObject $$1 = ayo.m($$0, "uniform");
      String $$2 = ayo.i($$1, "name");
      int $$3 = ezo.a(ayo.i($$1, "type"));
      int $$4 = ayo.o($$1, "count");
      float[] $$5 = new float[Math.max($$4, 16)];
      JsonArray $$6 = ayo.v($$1, "values");
      if ($$6.size() != $$4 && $$6.size() > 1) {
         throw new alh("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
      } else {
         int $$7 = 0;

         for (JsonElement $$8 : $$6) {
            try {
               $$5[$$7] = ayo.e($$8, "value");
            } catch (Exception var13) {
               alh $$10 = alh.a(var13);
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
         ezo $$12 = new ezo($$2, $$3 + $$11, $$4, this);
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
   public ezl c() {
      return this.H;
   }

   @Override
   public ezl d() {
      return this.I;
   }

   @Override
   public void e() {
      this.I.a(this);
      this.H.a(this);
   }

   public fac h() {
      return this.J;
   }

   public String i() {
      return this.E;
   }

   @Override
   public int a() {
      return this.D;
   }
}
