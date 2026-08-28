import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
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

public class gmc {
   public static final akv a = akv.b("main");
   private final List<gme> b;
   private final Map<akv, gmd.d> c;
   private final Set<akv> d;

   private gmc(List<gme> $$0, Map<akv, gmd.d> $$1, Set<akv> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gmc a(gmd $$0, heu $$1, gmp $$2, Set<akv> $$3) throws gmp.b {
      Stream<akv> $$4 = $$0.b().stream().flatMap($$0x -> $$0x.c().stream()).flatMap($$0x -> $$0x.b().stream());
      Set<akv> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<akv> $$6 = Sets.difference($$5, $$3);
      if (!$$6.isEmpty()) {
         throw new gmp.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<gme> $$7 = ImmutableList.builder();

         for (gmd.e $$8 : $$0.b()) {
            $$7.add(a($$1, $$2, $$8));
         }

         return new gmc($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gme a(heu $$0, gmp $$1, gmd.e $$2) throws gmp.b {
      gli $$3 = $$1.b($$2.a());

      for (gmd.h $$4 : $$2.e()) {
         String $$5 = $$4.a();
         if ($$3.a($$5) == null) {
            throw new gmp.b("Uniform '" + $$5 + "' does not exist for " + $$2.b());
         }
      }

      String $$6 = $$2.b().toString();
      gme $$7 = new gme($$6, $$3, $$2.d(), $$2.e());

      for (gmd.c $$8 : $$2.c()) {
         Objects.requireNonNull($$8);
         Throwable var44;
         switch ($$8) {
            case gmd.g var10:
               gmd.g var52 = var10;

               try {
                  var53 = var52.a();
               } catch (Throwable var30) {
                  var44 = var30;
                  boolean var65 = false;
                  break;
               }

               String var35 = var53;
               gmd.g var54 = var10;

               try {
                  var55 = var54.c();
               } catch (Throwable var29) {
                  var44 = var29;
                  boolean var66 = false;
                  break;
               }

               akv var36 = var55;
               gmd.g var56 = var10;

               try {
                  var57 = var56.d();
               } catch (Throwable var28) {
                  var44 = var28;
                  boolean var67 = false;
                  break;
               }

               int var37 = var57;
               gmd.g var58 = var10;

               try {
                  var59 = var58.e();
               } catch (Throwable var27) {
                  var44 = var27;
                  boolean var68 = false;
                  break;
               }

               int var38 = var59;
               gmd.g var60 = var10;

               try {
                  var61 = var60.f();
               } catch (Throwable var26) {
                  var44 = var26;
                  boolean var69 = false;
                  break;
               }

               boolean var39 = var61;
               hed $$14x = $$0.b(var36.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$14x.a(var39, false);
               $$7.a(new gme.c(var35, $$14x, var37, var38));
               continue;
            case gmd.f $$14:
               gmd.f var10000 = $$14;

               try {
                  var45 = var10000.a();
               } catch (Throwable var25) {
                  var44 = var25;
                  boolean var10001 = false;
                  break;
               }

               String var21 = var45;
               gmd.f var46 = $$14;

               try {
                  var47 = var46.c();
               } catch (Throwable var24) {
                  var44 = var24;
                  boolean var62 = false;
                  break;
               }

               akv var41 = var47;
               gmd.f var48 = $$14;

               try {
                  var49 = var48.d();
               } catch (Throwable var23) {
                  var44 = var23;
                  boolean var63 = false;
                  break;
               }

               boolean var42 = var49;
               gmd.f var50 = $$14;

               try {
                  var51 = var50.e();
               } catch (Throwable var22) {
                  var44 = var22;
                  boolean var64 = false;
                  break;
               }

               boolean var43 = var51;
               $$7.a(new gme.b(var21, var41, var42, var43));
               continue;
            default:
               throw new MatchException(null, null);
         }

         Throwable var34 = var44;
         throw new MatchException(var34.toString(), var34);
      }

      return $$7;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(fdy $$0, int $$1, int $$2, gmc.a $$3) {
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<akv, ffg<fee>> $$5 = new HashMap<>(this.c.size() + this.d.size());

      for (akv $$6 : this.d) {
         $$5.put($$6, $$3.b($$6));
      }

      for (Entry<akv, gmd.d> $$7 : this.c.entrySet()) {
         akv $$8 = $$7.getKey();
         gmd.d var35;
         Objects.requireNonNull(var35);
         Object var11 = var35;

         var35 = $$7.getValue();
         ffe $$11 = switch (var11) {
            case gmd.a var13 -> {
               gmd.a var29 = var13;

               int var26;
               label56: {
                  label76: {
                     try {
                        var31 = var29.a();
                     } catch (Throwable var18) {
                        var30 = var18;
                        boolean var10001 = false;
                        break label76;
                     }

                     var26 = var31;
                     gmd.a var32 = var13;

                     try {
                        var33 = var32.b();
                        break label56;
                     } catch (Throwable var17) {
                        var30 = var17;
                        boolean var34 = false;
                     }
                  }

                  Throwable var20 = var30;
                  throw new MatchException(var20.toString(), var20);
               }

               int var27 = var33;
               yield new ffe(var26, var27, true);
            }
            case gmd.b var16 -> new ffe($$1, $$2, true);
            default -> throw new MatchException(null, null);
         };
         $$5.put($$8, $$0.a($$8.toString(), $$11));
      }

      for (gme $$12 : this.b) {
         $$12.a($$0, $$5, $$4);
      }

      for (akv $$13 : this.d) {
         $$3.a($$13, $$5.get($$13));
      }
   }

   @Deprecated
   public void a(fee $$0, ffd $$1) {
      fdy $$2 = new fdy();
      gmc.a $$3 = gmc.a.b(a, $$2.a("main", $$0));
      this.a($$2, $$0.c, $$0.d, $$3);
      $$2.a($$1);
   }

   public void a(String $$0, float $$1) {
      for (gme $$2 : this.b) {
         $$2.a().c($$0).a($$1);
      }
   }

   public interface a {
      static gmc.a b(final akv $$0, final ffg<fee> $$1) {
         return new gmc.a() {
            private ffg<fee> c = $$1;

            @Override
            public void a(akv $$0x, ffg<fee> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public ffg<fee> a(akv $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(akv var1, ffg<fee> var2);

      @Nullable
      ffg<fee> a(akv var1);

      default ffg<fee> b(akv $$0) {
         ffg<fee> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
