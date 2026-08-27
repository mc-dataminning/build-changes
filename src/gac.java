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

public class gac implements AutoCloseable {
   private static final String a = "minecraft:main";
   private final euu b;
   private final atf c;
   private final String d;
   private final List<gad> e = Lists.newArrayList();
   private final Map<String, euu> f = Maps.newHashMap();
   private final List<euu> g = Lists.newArrayList();
   private Matrix4f h;
   private int i;
   private int j;
   private float k;
   private float l;

   public gac(glk $$0, atf $$1, euu $$2, ajt $$3) throws IOException, JsonSyntaxException {
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

   private void a(glk $$0, ajt $$1) throws IOException, JsonSyntaxException {
      ata $$2 = this.c.getResourceOrThrow($$1);

      try {
         try (Reader $$3 = $$2.e()) {
            JsonObject $$4 = axa.a($$3);
            if (axa.d($$4, "targets")) {
               JsonArray $$5 = $$4.getAsJsonArray("targets");
               int $$6 = 0;

               for (JsonElement $$7 : $$5) {
                  try {
                     this.a($$7);
                  } catch (Exception var14) {
                     ajw $$9 = ajw.a(var14);
                     $$9.a("targets[" + $$6 + "]");
                     throw $$9;
                  }

                  $$6++;
               }
            }

            if (axa.d($$4, "passes")) {
               JsonArray $$10 = $$4.getAsJsonArray("passes");
               int $$11 = 0;

               for (JsonElement $$12 : $$10) {
                  try {
                     this.a($$0, $$12);
                  } catch (Exception var13) {
                     ajw $$14 = ajw.a(var13);
                     $$14.a("passes[" + $$11 + "]");
                     throw $$14;
                  }

                  $$11++;
               }
            }
         }
      } catch (Exception var16) {
         ajw $$16 = ajw.a(var16);
         $$16.b($$1.a() + " (" + $$2.b() + ")");
         throw $$16;
      }
   }

   private void a(JsonElement $$0) throws ajw {
      if (axa.a($$0)) {
         this.a($$0.getAsString(), this.i, this.j);
      } else {
         JsonObject $$1 = axa.m($$0, "target");
         String $$2 = axa.i($$1, "name");
         int $$3 = axa.a($$1, "width", this.i);
         int $$4 = axa.a($$1, "height", this.j);
         if (this.f.containsKey($$2)) {
            throw new ajw($$2 + " is already defined");
         }

         this.a($$2, $$3, $$4);
      }
   }

   private void a(glk $$0, JsonElement $$1) throws IOException {
      JsonObject $$2 = axa.m($$1, "pass");
      String $$3 = axa.i($$2, "name");
      String $$4 = axa.i($$2, "intarget");
      String $$5 = axa.i($$2, "outtarget");
      euu $$6 = this.b($$4);
      euu $$7 = this.b($$5);
      if ($$6 == null) {
         throw new ajw("Input target '" + $$4 + "' does not exist");
      } else if ($$7 == null) {
         throw new ajw("Output target '" + $$5 + "' does not exist");
      } else {
         gad $$8 = this.a($$3, $$6, $$7);
         JsonArray $$9 = axa.a($$2, "auxtargets", null);
         if ($$9 != null) {
            int $$10 = 0;

            for (JsonElement $$11 : $$9) {
               try {
                  JsonObject $$12 = axa.m($$11, "auxtarget");
                  String $$13 = axa.i($$12, "name");
                  String $$14 = axa.i($$12, "id");
                  boolean $$15;
                  String $$16;
                  if ($$14.endsWith(":depth")) {
                     $$15 = true;
                     $$16 = $$14.substring(0, $$14.lastIndexOf(58));
                  } else {
                     $$15 = false;
                     $$16 = $$14;
                  }

                  euu $$19 = this.b($$16);
                  if ($$19 == null) {
                     if ($$15) {
                        throw new ajw("Render target '" + $$16 + "' can't be used as depth buffer");
                     }

                     ajt $$20 = new ajt("textures/effect/" + $$16 + ".png");
                     this.c.getResource($$20).orElseThrow(() -> new ajw("Render target or texture '" + $$16 + "' does not exist"));
                     RenderSystem.setShaderTexture(0, $$20);
                     $$0.a($$20);
                     gku $$21 = $$0.b($$20);
                     int $$22 = axa.o($$12, "width");
                     int $$23 = axa.o($$12, "height");
                     boolean $$24 = axa.k($$12, "bilinear");
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
                  ajw $$26 = ajw.a(var26);
                  $$26.a("auxtargets[" + $$10 + "]");
                  throw $$26;
               }

               $$10++;
            }
         }

         JsonArray $$27 = axa.a($$2, "uniforms", null);
         if ($$27 != null) {
            int $$28 = 0;

            for (JsonElement $$29 : $$27) {
               try {
                  this.b($$29);
               } catch (Exception var25) {
                  ajw $$31 = ajw.a(var25);
                  $$31.a("uniforms[" + $$28 + "]");
                  throw $$31;
               }

               $$28++;
            }
         }
      }
   }

   private void b(JsonElement $$0) throws ajw {
      JsonObject $$1 = axa.m($$0, "uniform");
      String $$2 = axa.i($$1, "name");
      evz $$3 = this.e.get(this.e.size() - 1).b().a($$2);
      if ($$3 == null) {
         throw new ajw("Uniform '" + $$2 + "' does not exist");
      } else {
         float[] $$4 = new float[4];
         int $$5 = 0;

         for (JsonElement $$7 : axa.v($$1, "values")) {
            try {
               $$4[$$5] = axa.e($$7, "value");
            } catch (Exception var12) {
               ajw $$9 = ajw.a(var12);
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

   public euu a(String $$0) {
      return this.f.get($$0);
   }

   public void a(String $$0, int $$1, int $$2) {
      euu $$3 = new euv($$1, $$2, true, fbp.a);
      $$3.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.f.put($$0, $$3);
      if ($$1 == this.i && $$2 == this.j) {
         this.g.add($$3);
      }
   }

   @Override
   public void close() {
      for (euu $$0 : this.f.values()) {
         $$0.a();
      }

      for (gad $$1 : this.e) {
         $$1.close();
      }

      this.e.clear();
   }

   public gad a(String $$0, euu $$1, euu $$2) throws IOException {
      gad $$3 = new gad(this.c, $$0, $$1, $$2);
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

      for (gad $$2 : this.e) {
         $$2.a(this.h);
      }

      for (euu $$3 : this.g) {
         $$3.a($$0, $$1, fbp.a);
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

      for (gad $$1 : this.e) {
         $$1.a(this.k / 20.0F);
      }
   }

   public void a(String $$0, float $$1) {
      for (gad $$2 : this.e) {
         $$2.b().b($$0).a($$1);
      }
   }

   public final String a() {
      return this.d;
   }

   @Nullable
   private euu b(@Nullable String $$0) {
      if ($$0 == null) {
         return null;
      } else {
         return $$0.equals("minecraft:main") ? this.b : this.f.get($$0);
      }
   }
}
