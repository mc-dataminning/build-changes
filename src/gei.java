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

public class gei implements AutoCloseable {
   private static final String a = "minecraft:main";
   private final eza b;
   private final atz c;
   private final String d;
   private final List<gej> e = Lists.newArrayList();
   private final Map<String, eza> f = Maps.newHashMap();
   private final List<eza> g = Lists.newArrayList();
   private Matrix4f h;
   private int i;
   private int j;
   private float k;
   private float l;

   public gei(gpr $$0, atz $$1, eza $$2, akk $$3) throws IOException, JsonSyntaxException {
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

   private void a(gpr $$0, akk $$1) throws IOException, JsonSyntaxException {
      atu $$2 = this.c.getResourceOrThrow($$1);

      try {
         try (Reader $$3 = $$2.e()) {
            JsonObject $$4 = axw.a($$3);
            if (axw.d($$4, "targets")) {
               JsonArray $$5 = $$4.getAsJsonArray("targets");
               int $$6 = 0;

               for (JsonElement $$7 : $$5) {
                  try {
                     this.a($$7);
                  } catch (Exception var14) {
                     akn $$9 = akn.a(var14);
                     $$9.a("targets[" + $$6 + "]");
                     throw $$9;
                  }

                  $$6++;
               }
            }

            if (axw.d($$4, "passes")) {
               JsonArray $$10 = $$4.getAsJsonArray("passes");
               int $$11 = 0;

               for (JsonElement $$12 : $$10) {
                  try {
                     this.a($$0, $$12);
                  } catch (Exception var13) {
                     akn $$14 = akn.a(var13);
                     $$14.a("passes[" + $$11 + "]");
                     throw $$14;
                  }

                  $$11++;
               }
            }
         }
      } catch (Exception var16) {
         akn $$16 = akn.a(var16);
         $$16.b($$1.a() + " (" + $$2.b() + ")");
         throw $$16;
      }
   }

   private void a(JsonElement $$0) throws akn {
      if (axw.a($$0)) {
         this.a($$0.getAsString(), this.i, this.j);
      } else {
         JsonObject $$1 = axw.m($$0, "target");
         String $$2 = axw.i($$1, "name");
         int $$3 = axw.a($$1, "width", this.i);
         int $$4 = axw.a($$1, "height", this.j);
         if (this.f.containsKey($$2)) {
            throw new akn($$2 + " is already defined");
         }

         this.a($$2, $$3, $$4);
      }
   }

   private void a(gpr $$0, JsonElement $$1) throws IOException {
      JsonObject $$2 = axw.m($$1, "pass");
      String $$3 = axw.i($$2, "name");
      String $$4 = axw.i($$2, "intarget");
      String $$5 = axw.i($$2, "outtarget");
      eza $$6 = this.b($$4);
      eza $$7 = this.b($$5);
      boolean $$8 = axw.a($$2, "use_linear_filter", false);
      if ($$6 == null) {
         throw new akn("Input target '" + $$4 + "' does not exist");
      } else if ($$7 == null) {
         throw new akn("Output target '" + $$5 + "' does not exist");
      } else {
         gej $$9 = this.a($$3, $$6, $$7, $$8);
         JsonArray $$10 = axw.a($$2, "auxtargets", null);
         if ($$10 != null) {
            int $$11 = 0;

            for (JsonElement $$12 : $$10) {
               try {
                  JsonObject $$13 = axw.m($$12, "auxtarget");
                  String $$14 = axw.i($$13, "name");
                  String $$15 = axw.i($$13, "id");
                  boolean $$16;
                  String $$17;
                  if ($$15.endsWith(":depth")) {
                     $$16 = true;
                     $$17 = $$15.substring(0, $$15.lastIndexOf(58));
                  } else {
                     $$16 = false;
                     $$17 = $$15;
                  }

                  eza $$20 = this.b($$17);
                  if ($$20 == null) {
                     if ($$16) {
                        throw new akn("Render target '" + $$17 + "' can't be used as depth buffer");
                     }

                     akk $$21 = new akk("textures/effect/" + $$17 + ".png");
                     this.c.getResource($$21).orElseThrow(() -> new akn("Render target or texture '" + $$17 + "' does not exist"));
                     RenderSystem.setShaderTexture(0, $$21);
                     $$0.a($$21);
                     gpb $$22 = $$0.b($$21);
                     int $$23 = axw.o($$13, "width");
                     int $$24 = axw.o($$13, "height");
                     boolean $$25 = axw.k($$13, "bilinear");
                     if ($$25) {
                        RenderSystem.texParameter(3553, 10241, 9729);
                        RenderSystem.texParameter(3553, 10240, 9729);
                     } else {
                        RenderSystem.texParameter(3553, 10241, 9728);
                        RenderSystem.texParameter(3553, 10240, 9728);
                     }

                     $$9.a($$14, $$22::a, $$23, $$24);
                  } else if ($$16) {
                     $$9.a($$14, $$20::g, $$20.c, $$20.d);
                  } else {
                     $$9.a($$14, $$20::f, $$20.c, $$20.d);
                  }
               } catch (Exception var27) {
                  akn $$27 = akn.a(var27);
                  $$27.a("auxtargets[" + $$11 + "]");
                  throw $$27;
               }

               $$11++;
            }
         }

         JsonArray $$28 = axw.a($$2, "uniforms", null);
         if ($$28 != null) {
            int $$29 = 0;

            for (JsonElement $$30 : $$28) {
               try {
                  this.b($$30);
               } catch (Exception var26) {
                  akn $$32 = akn.a(var26);
                  $$32.a("uniforms[" + $$29 + "]");
                  throw $$32;
               }

               $$29++;
            }
         }
      }
   }

   private void b(JsonElement $$0) throws akn {
      JsonObject $$1 = axw.m($$0, "uniform");
      String $$2 = axw.i($$1, "name");
      faf $$3 = this.e.get(this.e.size() - 1).b().a($$2);
      if ($$3 == null) {
         throw new akn("Uniform '" + $$2 + "' does not exist");
      } else {
         float[] $$4 = new float[4];
         int $$5 = 0;

         for (JsonElement $$7 : axw.v($$1, "values")) {
            try {
               $$4[$$5] = axw.e($$7, "value");
            } catch (Exception var12) {
               akn $$9 = akn.a(var12);
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

   public eza a(String $$0) {
      return this.f.get($$0);
   }

   public void a(String $$0, int $$1, int $$2) {
      eza $$3 = new ezb($$1, $$2, true, ffw.a);
      $$3.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.f.put($$0, $$3);
      if ($$1 == this.i && $$2 == this.j) {
         this.g.add($$3);
      }
   }

   @Override
   public void close() {
      for (eza $$0 : this.f.values()) {
         $$0.a();
      }

      for (gej $$1 : this.e) {
         $$1.close();
      }

      this.e.clear();
   }

   public gej a(String $$0, eza $$1, eza $$2, boolean $$3) throws IOException {
      gej $$4 = new gej(this.c, $$0, $$1, $$2, $$3);
      this.e.add(this.e.size(), $$4);
      return $$4;
   }

   private void b() {
      this.h = new Matrix4f().setOrtho(0.0F, (float)this.b.c, 0.0F, (float)this.b.d, 0.1F, 1000.0F);
   }

   public void a(int $$0, int $$1) {
      this.i = this.b.c;
      this.j = this.b.d;
      this.b();

      for (gej $$2 : this.e) {
         $$2.a(this.h);
      }

      for (eza $$3 : this.g) {
         $$3.a($$0, $$1, ffw.a);
      }
   }

   private void a(int $$0) {
      this.b.a($$0);

      for (eza $$1 : this.f.values()) {
         $$1.a($$0);
      }
   }

   public void a(float $$0) {
      this.k += $$0;

      while (this.k > 20.0F) {
         this.k -= 20.0F;
      }

      int $$1 = 9728;

      for (gej $$2 : this.e) {
         int $$3 = $$2.c();
         if ($$1 != $$3) {
            this.a($$3);
            $$1 = $$3;
         }

         $$2.a(this.k / 20.0F);
      }

      this.a(9728);
   }

   public void a(String $$0, float $$1) {
      for (gej $$2 : this.e) {
         $$2.b().b($$0).a($$1);
      }
   }

   public final String a() {
      return this.d;
   }

   @Nullable
   private eza b(@Nullable String $$0) {
      if ($$0 == null) {
         return null;
      } else {
         return $$0.equals("minecraft:main") ? this.b : this.f.get($$0);
      }
   }
}
