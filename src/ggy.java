import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class ggy implements AutoCloseable {
   public static final alb a = alb.b("main");
   private final alb b;
   private final List<gha> c;
   private final Map<alb, ggz.d> d;
   private final Set<alb> e;
   private float f;

   private ggy(alb $$0, List<gha> $$1, Map<alb, ggz.d> $$2, Set<alb> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static ggy a(auv $$0, gwl $$1, alb $$2, Set<alb> $$3) throws IOException, JsonSyntaxException {
      auq $$4 = $$0.getResourceOrThrow($$2);

      try {
         ggy var18;
         try (Reader $$5 = $$4.e()) {
            JsonObject $$6 = ays.a($$5);
            ggz $$7 = (ggz)ggz.a.parse(JsonOps.INSTANCE, $$6).getOrThrow(JsonSyntaxException::new);
            Stream<alb> $$8 = $$7.b().stream().flatMap($$0x -> $$0x.b().stream()).flatMap($$0x -> $$0x.b().stream());
            Set<alb> $$9 = $$8.filter($$1x -> !$$7.a().containsKey($$1x)).collect(Collectors.toSet());
            Set<alb> $$10 = Sets.difference($$9, $$3);
            if (!$$10.isEmpty()) {
               throw new ale("Referenced external targets are not available in this context: " + $$10);
            }

            Builder<gha> $$11 = ImmutableList.builder();

            for (ggz.e $$12 : $$7.b()) {
               $$11.add(a($$0, $$1, $$12));
            }

            var18 = new ggy($$2, $$11.build(), $$7.a(), $$9);
         }

         return var18;
      } catch (Exception var16) {
         ale $$14 = ale.a(var16);
         $$14.b($$2.a() + " (" + $$4.b() + ")");
         throw $$14;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gha a(auv $$0, gwl $$1, ggz.e $$2) throws IOException {
      gha $$3 = new gha($$0, $$2.a(), $$2.c());

      for (ggz.c $$4 : $$2.b()) {
         Objects.requireNonNull($$4);
         Throwable var43;
         switch ($$4) {
            case ggz.g var8:
               ggz.g var51 = var8;

               try {
                  var52 = var51.a();
               } catch (Throwable var28) {
                  var43 = var28;
                  boolean var64 = false;
                  break;
               }

               String var33 = var52;
               ggz.g var53 = var8;

               try {
                  var54 = var53.c();
               } catch (Throwable var27) {
                  var43 = var27;
                  boolean var65 = false;
                  break;
               }

               alb var34 = var54;
               alb $$6 = var34;
               ggz.g var55 = var8;

               try {
                  var56 = var55.d();
               } catch (Throwable var26) {
                  var43 = var26;
                  boolean var66 = false;
                  break;
               }

               int var35 = var56;
               ggz.g var57 = var8;

               try {
                  var58 = var57.e();
               } catch (Throwable var25) {
                  var43 = var25;
                  boolean var67 = false;
                  break;
               }

               int var36 = var58;
               ggz.g var59 = var8;

               try {
                  var60 = var59.f();
               } catch (Throwable var24) {
                  var43 = var24;
                  boolean var68 = false;
                  break;
               }

               boolean var37 = var60;
               alb $$10x = $$6.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png"));
               $$0.getResource($$10x).orElseThrow(() -> new ale("Texture '" + $$6 + "' does not exist"));
               RenderSystem.setShaderTexture(0, $$10x);
               $$1.a($$10x);
               gvv $$11 = $$1.b($$10x);
               if (var37) {
                  RenderSystem.texParameter(3553, 10241, 9729);
                  RenderSystem.texParameter(3553, 10240, 9729);
               } else {
                  RenderSystem.texParameter(3553, 10241, 9728);
                  RenderSystem.texParameter(3553, 10240, 9728);
               }

               $$3.a(new gha.c(var33, $$11, var35, var36));
               continue;
            case ggz.f $$10:
               ggz.f var10000 = $$10;

               try {
                  var44 = var10000.a();
               } catch (Throwable var23) {
                  var43 = var23;
                  boolean var10001 = false;
                  break;
               }

               String var19 = var44;
               ggz.f var45 = $$10;

               try {
                  var46 = var45.c();
               } catch (Throwable var22) {
                  var43 = var22;
                  boolean var61 = false;
                  break;
               }

               alb var40 = var46;
               ggz.f var47 = $$10;

               try {
                  var48 = var47.d();
               } catch (Throwable var21) {
                  var43 = var21;
                  boolean var62 = false;
                  break;
               }

               boolean var41 = var48;
               ggz.f var49 = $$10;

               try {
                  var50 = var49.e();
               } catch (Throwable var20) {
                  var43 = var20;
                  boolean var63 = false;
                  break;
               }

               boolean var42 = var50;
               $$3.a(new gha.b(var19, var40, var41, var42));
               continue;
            default:
               throw new MatchException(null, null);
         }

         Throwable var29 = var43;
         throw new MatchException(var29.toString(), var29);
      }

      for (ggz.h $$16 : $$2.d()) {
         String $$17 = $$16.a();
         fcl $$18 = $$3.b().a($$17);
         if ($$18 == null) {
            throw new ale("Uniform '" + $$17 + "' does not exist");
         }

         a($$18, $$16.b());
      }

      return $$3;
   }

   private static void a(fcl $$0, List<Float> $$1) {
      switch ($$1.size()) {
         case 0:
         default:
            break;
         case 1:
            $$0.a($$1.getFirst());
            break;
         case 2:
            $$0.a($$1.get(0), $$1.get(1));
            break;
         case 3:
            $$0.a($$1.get(0), $$1.get(1), $$1.get(2));
            break;
         case 4:
            $$0.a($$1.get(0), $$1.get(1), $$1.get(2), $$1.get(3));
      }
   }

   @Override
   public void close() {
      for (gha $$0 : this.c) {
         $$0.close();
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(fat $$0, fhr $$1, int $$2, int $$3, ggy.a $$4) {
      Matrix4f $$5 = new Matrix4f().setOrtho(0.0F, (float)$$2, 0.0F, (float)$$3, 0.1F, 1000.0F);
      this.f = this.f + $$1.b();

      while (this.f > 20.0F) {
         this.f -= 20.0F;
      }

      Map<alb, fcb<faz>> $$6 = new HashMap<>(this.d.size() + this.e.size());

      for (alb $$7 : this.e) {
         $$6.put($$7, $$4.b($$7));
      }

      for (Entry<alb, ggz.d> $$8 : this.d.entrySet()) {
         alb $$9 = $$8.getKey();
         ggz.d var36;
         Objects.requireNonNull(var36);
         Object var12 = var36;

         var36 = $$8.getValue();
         fbz $$12 = switch (var12) {
            case ggz.a var14 -> {
               ggz.a var30 = var14;

               int var27;
               label59: {
                  label85: {
                     try {
                        var32 = var30.a();
                     } catch (Throwable var19) {
                        var31 = var19;
                        boolean var10001 = false;
                        break label85;
                     }

                     var27 = var32;
                     ggz.a var33 = var14;

                     try {
                        var34 = var33.b();
                        break label59;
                     } catch (Throwable var18) {
                        var31 = var18;
                        boolean var35 = false;
                     }
                  }

                  Throwable var21 = var31;
                  throw new MatchException(var21.toString(), var21);
               }

               int var28 = var34;
               yield new fbz(var27, var28, true);
            }
            case ggz.b var17 -> new fbz($$2, $$3, true);
            default -> throw new MatchException(null, null);
         };
         $$6.put($$9, $$0.a($$9.toString(), $$12));
      }

      for (gha $$13 : this.c) {
         $$13.a($$0, $$6, $$5, this.f / 20.0F);
      }

      for (alb $$14 : this.e) {
         $$4.a($$14, $$6.get($$14));
      }
   }

   @Deprecated
   public void a(faz $$0, fby $$1, fhr $$2) {
      fat $$3 = new fat();
      ggy.a $$4 = ggy.a.b(a, $$3.a("main", $$0));
      this.a($$3, $$2, $$0.c, $$0.d, $$4);
      $$3.a($$1);
   }

   public void a(String $$0, float $$1) {
      for (gha $$2 : this.c) {
         $$2.b().b($$0).a($$1);
      }
   }

   public final alb a() {
      return this.b;
   }

   public interface a {
      static ggy.a b(final alb $$0, final fcb<faz> $$1) {
         return new ggy.a() {
            private fcb<faz> c = $$1;

            @Override
            public void a(alb $$0x, fcb<faz> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fcb<faz> a(alb $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alb var1, fcb<faz> var2);

      @Nullable
      fcb<faz> a(alb var1);

      default fcb<faz> b(alb $$0) {
         fcb<faz> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
