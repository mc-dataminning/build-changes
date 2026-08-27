import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gal implements AutoCloseable {
   private static final String a = "minecraft:main";
   private final evd b;
   private final ath c;
   private final String d;
   private final List<gam> e = Lists.newArrayList();
   private final Map<String, evd> f = Maps.newHashMap();
   private final List<evd> g = Lists.newArrayList();
   private Matrix4f h;
   private int i;
   private int j;
   private float k;
   private float l;

   public gal(glt $$0, ath $$1, evd $$2, ajv $$3) throws IOException, JsonSyntaxException {
      this.c = $$1;
      this.b = $$2;
      this.k = 0.0F;
      this.l = 0.0F;
      this.i = $$2.e;
      this.j = $$2.f;
      this.d = $$3.toString();
      this.b();
      this.a($$0, $$3);
   }

   private void a(glt $$0, ajv $$1) throws IOException, JsonSyntaxException {
      atc $$2 = this.c.getResourceOrThrow($$1);

      try {
         try (Reader $$3 = $$2.e()) {
            JsonObject $$4 = axc.a($$3);
            if (axc.d($$4, "targets")) {
               JsonArray $$5 = $$4.getAsJsonArray("targets");
               int $$6 = 0;

               for (JsonElement $$7 : $$5) {
                  try {
                     this.a($$7);
                  } catch (Exception var14) {
                     ajy $$9 = ajy.a(var14);
                     $$9.a("targets[" + $$6 + "]");
                     throw $$9;
                  }

                  $$6++;
               }
            }

            if (axc.d($$4, "passes")) {
               JsonArray $$10 = $$4.getAsJsonArray("passes");
               int $$11 = 0;

               for (JsonElement $$12 : $$10) {
                  try {
                     this.a($$0, $$12);
                  } catch (Exception var13) {
                     ajy $$14 = ajy.a(var13);
                     $$14.a("passes[" + $$11 + "]");
                     throw $$14;
                  }

                  $$11++;
               }
            }
         }
      } catch (Exception var16) {
         ajy $$16 = ajy.a(var16);
         $$16.b($$1.a() + " (" + $$2.b() + ")");
         throw $$16;
      }
   }

   private void a(JsonElement $$0) throws ajy {
      if (axc.a($$0)) {
         this.a($$0.getAsString(), this.i, this.j);
      } else {
         JsonObject $$1 = axc.m($$0, "target");
         String $$2 = axc.i($$1, "name");
         int $$3 = axc.a($$1, "width", this.i);
         int $$4 = axc.a($$1, "height", this.j);
         if (this.f.containsKey($$2)) {
            throw new ajy($$2 + " is already defined");
         }

         this.a($$2, $$3, $$4);
      }
   }

   private void a(glt $$0, JsonElement $$1) throws IOException {
      JsonObject $$2 = axc.m($$1, "pass");
      String $$3 = axc.i($$2, "name");
      String $$4 = axc.i($$2, "intarget");
      String $$5 = axc.i($$2, "outtarget");
      evd $$6 = this.b($$4);
      evd $$7 = this.b($$5);
      if ($$6 == null) {
         throw new ajy("Input target '" + $$4 + "' does not exist");
      } else if ($$7 == null) {
         throw new ajy("Output target '" + $$5 + "' does not exist");
      } else {
         gam $$8 = this.a($$3, $$6, $$7);
         JsonArray $$9 = axc.a($$2, "auxtargets", null);
         if ($$9 != null) {
            int $$10 = 0;

            for (JsonElement $$11 : $$9) {
               try {
                  JsonObject $$12 = axc.m($$11, "auxtarget");
                  String $$13 = axc.i($$12, "name");
                  String $$14 = axc.i($$12, "id");
                  boolean $$15;
                  String $$16;
                  if ($$14.endsWith(":depth")) {
                     $$15 = true;
                     $$16 = $$14.substring(0, $$14.lastIndexOf(58));
                  } else {
                     $$15 = false;
                     $$16 = $$14;
                  }

                  evd $$19 = this.b($$16);
                  if ($$19 == null) {
                     if ($$15) {
                        throw new ajy("Render target '" + $$16 + "' can't be used as depth buffer");
                     }

                     ajv $$20 = new ajv("textures/effect/" + $$16 + ".png");
                     this.c.getResource($$20).orElseThrow(() -> new ajy("Render target or texture '" + $$16 + "' does not exist"));
                     RenderSystem.setShaderTexture(0, $$20);
                     $$0.a($$20);
                     gld $$21 = $$0.b($$20);
                     int $$22 = axc.o($$12, "width");
                     int $$23 = axc.o($$12, "height");
                     boolean $$24 = axc.k($$12, "bilinear");
                     if ($$24) {
                        RenderSystem.texParameter(3553, 10241, 9729);
                        RenderSystem.texParameter(3553, 10240, 9729);
                     } else {
                        RenderSystem.texParameter(3553, 10241, 9728);
                        RenderSystem.texParameter(3553, 10240, 9728);
                     }

                     $$8.a($$13, $$21::a, $$22, $$23);
                  } else if ($$15) {
                     $$8.a($$13, $$19::g, $$19.c, $$19.d);
                  } else {
                     $$8.a($$13, $$19::f, $$19.c, $$19.d);
                  }
               } catch (Exception var26) {
                  ajy $$26 = ajy.a(var26);
                  $$26.a("auxtargets[" + $$10 + "]");
                  throw $$26;
               }

               $$10++;
            }
         }

         JsonArray $$27 = axc.a($$2, "uniforms", null);
         if ($$27 != null) {
            int $$28 = 0;

            for (JsonElement $$29 : $$27) {
               try {
                  this.b($$29);
               } catch (Exception var25) {
                  ajy $$31 = ajy.a(var25);
                  $$31.a("uniforms[" + $$28 + "]");
                  throw $$31;
               }

               $$28++;
            }
         }
      }
   }

   private void b(JsonElement $$0) throws ajy {
      JsonObject $$1 = axc.m($$0, "uniform");
      String $$2 = axc.i($$1, "name");
      ewi $$3 = this.e.get(this.e.size() - 1).b().a($$2);
      if ($$3 == null) {
         throw new ajy("Uniform '" + $$2 + "' does not exist");
      } else {
         float[] $$4 = new float[4];
         int $$5 = 0;

         for (JsonElement $$7 : axc.v($$1, "values")) {
            try {
               $$4[$$5] = axc.e($$7, "value");
            } catch (Exception var12) {
               ajy $$9 = ajy.a(var12);
               $$9.a("values[" + $$5 + "]");
               throw $$9;
            }

            $$5++;
         }

         switch ($$5) {
            case 0:
            default:
               break;
            case 1:
               $$3.a($$4[0]);
               break;
            case 2:
               $$3.a($$4[0], $$4[1]);
               break;
            case 3:
               $$3.a($$4[0], $$4[1], $$4[2]);
               break;
            case 4:
               $$3.a($$4[0], $$4[1], $$4[2], $$4[3]);
         }
      }
   }

   public evd a(String $$0) {
      return this.f.get($$0);
   }

   public void a(String $$0, int $$1, int $$2) {
      evd $$3 = new eve($$1, $$2, true, fby.a);
      $$3.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.f.put($$0, $$3);
      if ($$1 == this.i && $$2 == this.j) {
         this.g.add($$3);
      }
   }

   @Override
   public void close() {
      for (evd $$0 : this.f.values()) {
         $$0.a();
      }

      for (gam $$1 : this.e) {
         $$1.close();
      }

      this.e.clear();
   }

   public gam a(String $$0, evd $$1, evd $$2) throws IOException {
      gam $$3 = new gam(this.c, $$0, $$1, $$2);
      this.e.add(this.e.size(), $$3);
      return $$3;
   }

   private void b() {
      this.h = new Matrix4f().setOrtho(0.0F, (float)this.b.c, 0.0F, (float)this.b.d, 0.1F, 1000.0F);
   }

   public void a(int $$0, int $$1) {
      this.i = this.b.c;
      this.j = this.b.d;
      this.b();

      for (gam $$2 : this.e) {
         $$2.a(this.h);
      }

      for (evd $$3 : this.g) {
         $$3.a($$0, $$1, fby.a);
      }
   }

   public void a(float $$0) {
      if ($$0 < this.l) {
         this.k = this.k + (1.0F - this.l);
         this.k += $$0;
      } else {
         this.k = this.k + ($$0 - this.l);
      }

      this.l = $$0;

      while (this.k > 20.0F) {
         this.k -= 20.0F;
      }

      for (gam $$1 : this.e) {
         $$1.a(this.k / 20.0F);
      }
   }

   public void a(String $$0, float $$1) {
      for (gam $$2 : this.e) {
         $$2.b().b($$0).a($$1);
      }
   }

   public final String a() {
      return this.d;
   }

   @Nullable
   private evd b(@Nullable String $$0) {
      if ($$0 == null) {
         return null;
      } else {
         return $$0.equals("minecraft:main") ? this.b : this.f.get($$0);
      }
   }
}
