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

public class gdv implements ezz, AutoCloseable {
   private static final String a = "shaders/program/";
   private static final Logger b = LogUtils.getLogger();
   private static final ezx c = new ezx();
   private static final boolean d = true;
   private static gdv e;
   private static int f = -1;
   private final Map<String, IntSupplier> g = Maps.newHashMap();
   private final List<String> h = Lists.newArrayList();
   private final List<Integer> i = Lists.newArrayList();
   private final List<faf> j = Lists.newArrayList();
   private final List<Integer> k = Lists.newArrayList();
   private final Map<String, faf> l = Maps.newHashMap();
   private final int m;
   private final String n;
   private boolean o;
   private final ezy p;
   private final List<Integer> q;
   private final List<String> r;
   private final faa s;
   private final faa t;

   public gdv(atz $$0, String $$1) throws IOException {
      akk $$2 = new akk("shaders/program/" + $$1 + ".json");
      this.n = $$1;
      atu $$3 = $$0.getResourceOrThrow($$2);

      try (Reader $$4 = $$3.e()) {
         JsonObject $$5 = axw.a($$4);
         String $$6 = axw.i($$5, "vertex");
         String $$7 = axw.i($$5, "fragment");
         JsonArray $$8 = axw.a($$5, "samplers", null);
         if ($$8 != null) {
            int $$9 = 0;

            for (JsonElement $$10 : $$8) {
               try {
                  this.a($$10);
               } catch (Exception var20) {
                  akn $$12 = akn.a(var20);
                  $$12.a("samplers[" + $$9 + "]");
                  throw $$12;
               }

               $$9++;
            }
         }

         JsonArray $$13 = axw.a($$5, "attributes", null);
         if ($$13 != null) {
            int $$14 = 0;
            this.q = Lists.newArrayListWithCapacity($$13.size());
            this.r = Lists.newArrayListWithCapacity($$13.size());

            for (JsonElement $$15 : $$13) {
               try {
                  this.r.add(axw.a($$15, "attribute"));
               } catch (Exception var19) {
                  akn $$17 = akn.a(var19);
                  $$17.a("attributes[" + $$14 + "]");
                  throw $$17;
               }

               $$14++;
            }
         } else {
            this.q = null;
            this.r = null;
         }

         JsonArray $$18 = axw.a($$5, "uniforms", null);
         if ($$18 != null) {
            int $$19 = 0;

            for (JsonElement $$20 : $$18) {
               try {
                  this.b($$20);
               } catch (Exception var18) {
                  akn $$22 = akn.a(var18);
                  $$22.a("uniforms[" + $$19 + "]");
                  throw $$22;
               }

               $$19++;
            }
         }

         this.p = a(axw.a($$5, "blend", null));
         this.s = a($$0, fac.a.a, $$6);
         this.t = a($$0, fac.a.b, $$7);
         this.m = fad.a();
         fad.b(this);
         this.i();
         if (this.r != null) {
            for (String $$23 : this.r) {
               int $$24 = faf.b(this.m, $$23);
               this.q.add($$24);
            }
         }
      } catch (Exception var22) {
         akn $$26 = akn.a(var22);
         $$26.b($$2.a() + " (" + $$3.b() + ")");
         throw $$26;
      }

      this.b();
   }

   public static faa a(atz $$0, fac.a $$1, String $$2) throws IOException {
      fac $$3 = $$1.c().get($$2);
      if ($$3 != null && !($$3 instanceof faa)) {
         throw new InvalidClassException("Program is not of type EffectProgram");
      } else {
         faa $$7;
         if ($$3 == null) {
            akk $$4 = new akk("shaders/program/" + $$2 + $$1.b());
            atu $$5 = $$0.getResourceOrThrow($$4);

            try (InputStream $$6 = $$5.d()) {
               $$7 = faa.a($$1, $$2, $$6, $$5.b());
            }
         } else {
            $$7 = (faa)$$3;
         }

         return $$7;
      }
   }

   public static ezy a(@Nullable JsonObject $$0) {
      if ($$0 == null) {
         return new ezy();
      } else {
         int $$1 = 32774;
         int $$2 = 1;
         int $$3 = 0;
         int $$4 = 1;
         int $$5 = 0;
         boolean $$6 = true;
         boolean $$7 = false;
         if (axw.a($$0, "func")) {
            $$1 = ezy.a($$0.get("func").getAsString());
            if ($$1 != 32774) {
               $$6 = false;
            }
         }

         if (axw.a($$0, "srcrgb")) {
            $$2 = ezy.b($$0.get("srcrgb").getAsString());
            if ($$2 != 1) {
               $$6 = false;
            }
         }

         if (axw.a($$0, "dstrgb")) {
            $$3 = ezy.b($$0.get("dstrgb").getAsString());
            if ($$3 != 0) {
               $$6 = false;
            }
         }

         if (axw.a($$0, "srcalpha")) {
            $$4 = ezy.b($$0.get("srcalpha").getAsString());
            if ($$4 != 1) {
               $$6 = false;
            }

            $$7 = true;
         }

         if (axw.a($$0, "dstalpha")) {
            $$5 = ezy.b($$0.get("dstalpha").getAsString());
            if ($$5 != 0) {
               $$6 = false;
            }

            $$7 = true;
         }

         if ($$6) {
            return new ezy();
         } else {
            return $$7 ? new ezy($$2, $$3, $$4, $$5, $$1) : new ezy($$2, $$3, $$1);
         }
      }
   }

   @Override
   public void close() {
      for (faf $$0 : this.j) {
         $$0.close();
      }

      fad.a(this);
   }

   public void f() {
      RenderSystem.assertOnRenderThread();
      fad.a(0);
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
      this.o = false;
      e = this;
      this.p.a();
      if (this.m != f) {
         fad.a(this.m);
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
               faf.b(this.i.get($$0), $$0);
            }
         }
      }

      for (faf $$4 : this.j) {
         $$4.b();
      }
   }

   @Override
   public void b() {
      this.o = true;
   }

   @Nullable
   public faf a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.l.get($$0);
   }

   public ezx b(String $$0) {
      faf $$1 = this.a($$0);
      return (ezx)($$1 == null ? c : $$1);
   }

   private void i() {
      RenderSystem.assertOnRenderThread();
      IntList $$0 = new IntArrayList();

      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         String $$2 = this.h.get($$1);
         int $$3 = faf.a(this.m, $$2);
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

      for (faf $$5 : this.j) {
         String $$6 = $$5.a();
         int $$7 = faf.a(this.m, $$6);
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
      JsonObject $$1 = axw.m($$0, "sampler");
      String $$2 = axw.i($$1, "name");
      if (!axw.a($$1, "file")) {
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

   private void b(JsonElement $$0) throws akn {
      JsonObject $$1 = axw.m($$0, "uniform");
      String $$2 = axw.i($$1, "name");
      int $$3 = faf.a(axw.i($$1, "type"));
      int $$4 = axw.o($$1, "count");
      float[] $$5 = new float[Math.max($$4, 16)];
      JsonArray $$6 = axw.v($$1, "values");
      if ($$6.size() != $$4 && $$6.size() > 1) {
         throw new akn("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
      } else {
         int $$7 = 0;

         for (JsonElement $$8 : $$6) {
            try {
               $$5[$$7] = axw.e($$8, "value");
            } catch (Exception var13) {
               akn $$10 = akn.a(var13);
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
         faf $$12 = new faf($$2, $$3 + $$11, $$4, this);
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
   public fac c() {
      return this.s;
   }

   @Override
   public fac d() {
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
