import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import java.io.InvalidClassException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvj implements ers, AutoCloseable {
   private static final String a = "shaders/program/";
   private static final Logger b = LogUtils.getLogger();
   private static final erq c = new erq();
   private static final boolean d = true;
   private static fvj e;
   private static int f = -1;
   private final Map<String, IntSupplier> g = Maps.newHashMap();
   private final List<String> h = Lists.newArrayList();
   private final List<Integer> i = Lists.newArrayList();
   private final List<ery> j = Lists.newArrayList();
   private final List<Integer> k = Lists.newArrayList();
   private final Map<String, ery> l = Maps.newHashMap();
   private final int m;
   private final String n;
   private boolean o;
   private final err p;
   private final List<Integer> q;
   private final List<String> r;
   private final ert s;
   private final ert t;

   public fvj(asb $$0, String $$1) throws IOException {
      aiy $$2 = new aiy("shaders/program/" + $$1 + ".json");
      this.n = $$1;
      arz $$3 = $$0.getResourceOrThrow($$2);

      try (Reader $$4 = $$3.e()) {
         JsonObject $$5 = avy.a($$4);
         String $$6 = avy.i($$5, "vertex");
         String $$7 = avy.i($$5, "fragment");
         JsonArray $$8 = avy.a($$5, "samplers", null);
         if ($$8 != null) {
            int $$9 = 0;

            for (JsonElement $$10 : $$8) {
               try {
                  this.a($$10);
               } catch (Exception var20) {
                  ajb $$12 = ajb.a(var20);
                  $$12.a("samplers[" + $$9 + "]");
                  throw $$12;
               }

               $$9++;
            }
         }

         JsonArray $$13 = avy.a($$5, "attributes", null);
         if ($$13 != null) {
            int $$14 = 0;
            this.q = Lists.newArrayListWithCapacity($$13.size());
            this.r = Lists.newArrayListWithCapacity($$13.size());

            for (JsonElement $$15 : $$13) {
               try {
                  this.r.add(avy.a($$15, "attribute"));
               } catch (Exception var19) {
                  ajb $$17 = ajb.a(var19);
                  $$17.a("attributes[" + $$14 + "]");
                  throw $$17;
               }

               $$14++;
            }
         } else {
            this.q = null;
            this.r = null;
         }

         JsonArray $$18 = avy.a($$5, "uniforms", null);
         if ($$18 != null) {
            int $$19 = 0;

            for (JsonElement $$20 : $$18) {
               try {
                  this.b($$20);
               } catch (Exception var18) {
                  ajb $$22 = ajb.a(var18);
                  $$22.a("uniforms[" + $$19 + "]");
                  throw $$22;
               }

               $$19++;
            }
         }

         this.p = a(avy.a($$5, "blend", null));
         this.s = a($$0, erv.a.a, $$6);
         this.t = a($$0, erv.a.b, $$7);
         this.m = erw.a();
         erw.b(this);
         this.i();
         if (this.r != null) {
            for (String $$23 : this.r) {
               int $$24 = ery.b(this.m, $$23);
               this.q.add($$24);
            }
         }
      } catch (Exception var22) {
         ajb $$26 = ajb.a(var22);
         $$26.b($$2.a() + " (" + $$3.b() + ")");
         throw $$26;
      }

      this.b();
   }

   public static ert a(asb $$0, erv.a $$1, String $$2) throws IOException {
      erv $$3 = $$1.c().get($$2);
      if ($$3 != null && !($$3 instanceof ert)) {
         throw new InvalidClassException("Program is not of type EffectProgram");
      } else {
         ert $$7;
         if ($$3 == null) {
            aiy $$4 = new aiy("shaders/program/" + $$2 + $$1.b());
            arz $$5 = $$0.getResourceOrThrow($$4);

            try (InputStream $$6 = $$5.d()) {
               $$7 = ert.a($$1, $$2, $$6, $$5.b());
            }
         } else {
            $$7 = (ert)$$3;
         }

         return $$7;
      }
   }

   public static err a(@Nullable JsonObject $$0) {
      if ($$0 == null) {
         return new err();
      } else {
         int $$1 = 32774;
         int $$2 = 1;
         int $$3 = 0;
         int $$4 = 1;
         int $$5 = 0;
         boolean $$6 = true;
         boolean $$7 = false;
         if (avy.a($$0, "func")) {
            $$1 = err.a($$0.get("func").getAsString());
            if ($$1 != 32774) {
               $$6 = false;
            }
         }

         if (avy.a($$0, "srcrgb")) {
            $$2 = err.b($$0.get("srcrgb").getAsString());
            if ($$2 != 1) {
               $$6 = false;
            }
         }

         if (avy.a($$0, "dstrgb")) {
            $$3 = err.b($$0.get("dstrgb").getAsString());
            if ($$3 != 0) {
               $$6 = false;
            }
         }

         if (avy.a($$0, "srcalpha")) {
            $$4 = err.b($$0.get("srcalpha").getAsString());
            if ($$4 != 1) {
               $$6 = false;
            }

            $$7 = true;
         }

         if (avy.a($$0, "dstalpha")) {
            $$5 = err.b($$0.get("dstalpha").getAsString());
            if ($$5 != 0) {
               $$6 = false;
            }

            $$7 = true;
         }

         if ($$6) {
            return new err();
         } else {
            return $$7 ? new err($$2, $$3, $$4, $$5, $$1) : new err($$2, $$3, $$1);
         }
      }
   }

   @Override
   public void close() {
      for (ery $$0 : this.j) {
         $$0.close();
      }

      erw.a(this);
   }

   public void f() {
      RenderSystem.assertOnRenderThread();
      erw.a(0);
      f = -1;
      e = null;

      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.g.get(this.h.get($$0)) != null) {
            GlStateManager._activeTexture(33984 + $$0);
            GlStateManager._bindTexture(0);
         }
      }
   }

   public void g() {
      RenderSystem.assertOnGameThread();
      this.o = false;
      e = this;
      this.p.a();
      if (this.m != f) {
         erw.a(this.m);
         f = this.m;
      }

      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         String $$1 = this.h.get($$0);
         IntSupplier $$2 = this.g.get($$1);
         if ($$2 != null) {
            RenderSystem.activeTexture(33984 + $$0);
            int $$3 = $$2.getAsInt();
            if ($$3 != -1) {
               RenderSystem.bindTexture($$3);
               ery.b(this.i.get($$0), $$0);
            }
         }
      }

      for (ery $$4 : this.j) {
         $$4.b();
      }
   }

   @Override
   public void b() {
      this.o = true;
   }

   @Nullable
   public ery a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.l.get($$0);
   }

   public erq b(String $$0) {
      RenderSystem.assertOnGameThread();
      ery $$1 = this.a($$0);
      return (erq)($$1 == null ? c : $$1);
   }

   private void i() {
      RenderSystem.assertOnRenderThread();
      IntList $$0 = new IntArrayList();

      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         String $$2 = this.h.get($$1);
         int $$3 = ery.a(this.m, $$2);
         if ($$3 == -1) {
            b.warn("Shader {} could not find sampler named {} in the specified shader program.", this.n, $$2);
            this.g.remove($$2);
            $$0.add($$1);
         } else {
            this.i.add($$3);
         }
      }

      for (int $$4 = $$0.size() - 1; $$4 >= 0; $$4--) {
         this.h.remove($$0.getInt($$4));
      }

      for (ery $$5 : this.j) {
         String $$6 = $$5.a();
         int $$7 = ery.a(this.m, $$6);
         if ($$7 == -1) {
            b.warn("Shader {} could not find uniform named {} in the specified shader program.", this.n, $$6);
         } else {
            this.k.add($$7);
            $$5.b($$7);
            this.l.put($$6, $$5);
         }
      }
   }

   private void a(JsonElement $$0) {
      JsonObject $$1 = avy.m($$0, "sampler");
      String $$2 = avy.i($$1, "name");
      if (!avy.a($$1, "file")) {
         this.g.put($$2, null);
         this.h.add($$2);
      } else {
         this.h.add($$2);
      }
   }

   public void a(String $$0, IntSupplier $$1) {
      if (this.g.containsKey($$0)) {
         this.g.remove($$0);
      }

      this.g.put($$0, $$1);
      this.b();
   }

   private void b(JsonElement $$0) throws ajb {
      JsonObject $$1 = avy.m($$0, "uniform");
      String $$2 = avy.i($$1, "name");
      int $$3 = ery.a(avy.i($$1, "type"));
      int $$4 = avy.o($$1, "count");
      float[] $$5 = new float[Math.max($$4, 16)];
      JsonArray $$6 = avy.v($$1, "values");
      if ($$6.size() != $$4 && $$6.size() > 1) {
         throw new ajb("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
      } else {
         int $$7 = 0;

         for (JsonElement $$8 : $$6) {
            try {
               $$5[$$7] = avy.e($$8, "value");
            } catch (Exception var13) {
               ajb $$10 = ajb.a(var13);
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
         ery $$12 = new ery($$2, $$3 + $$11, $$4, this);
         if ($$3 <= 3) {
            $$12.a((int)$$5[0], (int)$$5[1], (int)$$5[2], (int)$$5[3]);
         } else if ($$3 <= 7) {
            $$12.b($$5[0], $$5[1], $$5[2], $$5[3]);
         } else {
            $$12.a($$5);
         }

         this.j.add($$12);
      }
   }

   @Override
   public erv c() {
      return this.s;
   }

   @Override
   public erv d() {
      return this.t;
   }

   @Override
   public void e() {
      this.t.a(this);
      this.s.a(this);
   }

   public String h() {
      return this.n;
   }

   @Override
   public int a() {
      return this.m;
   }
}
