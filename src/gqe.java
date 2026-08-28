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

public class gqe {
   public static final alg a = alg.b("main");
   private final List<gqg> b;
   private final Map<alg, gqf.d> c;
   private final Set<alg> d;

   private gqe(List<gqg> $$0, Map<alg, gqf.d> $$1, Set<alg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gqe a(gqf $$0, hiz $$1, gqr $$2, Set<alg> $$3) throws gqr.b {
      Stream<alg> $$4 = $$0.b().stream().flatMap(gqf.e::b);
      Set<alg> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<alg> $$6 = Sets.difference($$5, $$3);
      if (!$$6.isEmpty()) {
         throw new gqr.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<gqg> $$7 = ImmutableList.builder();

         for (gqf.e $$8 : $$0.b()) {
            $$7.add(a($$1, $$2, $$8));
         }

         return new gqe($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gqg a(hiz $$0, gqr $$1, gqf.e $$2) throws gqr.b {
      gpj $$3 = $$1.b($$2.a());

      for (gqf.h $$4 : $$2.f()) {
         String $$5 = $$4.a();
         if ($$3.a($$5) == null) {
            throw new gqr.b("Uniform '" + $$5 + "' does not exist for " + $$2.c());
         }
      }

      String $$6 = $$2.c().toString();
      gqg $$7 = new gqg($$6, $$3, $$2.e(), $$2.f());

      for (gqf.c $$8 : $$2.d()) {
         Objects.requireNonNull($$8);
         Throwable var44;
         switch ($$8) {
            case gqf.g var10:
               gqf.g var52 = var10;

               try {
                  var53 = var52.a();
               } catch (Throwable var30) {
                  var44 = var30;
                  boolean var65 = false;
                  break;
               }

               String var35 = var53;
               gqf.g var54 = var10;

               try {
                  var55 = var54.c();
               } catch (Throwable var29) {
                  var44 = var29;
                  boolean var66 = false;
                  break;
               }

               alg var36 = var55;
               gqf.g var56 = var10;

               try {
                  var57 = var56.d();
               } catch (Throwable var28) {
                  var44 = var28;
                  boolean var67 = false;
                  break;
               }

               int var37 = var57;
               gqf.g var58 = var10;

               try {
                  var59 = var58.e();
               } catch (Throwable var27) {
                  var44 = var27;
                  boolean var68 = false;
                  break;
               }

               int var38 = var59;
               gqf.g var60 = var10;

               try {
                  var61 = var60.f();
               } catch (Throwable var26) {
                  var44 = var26;
                  boolean var69 = false;
                  break;
               }

               boolean var39 = var61;
               hii $$14x = $$0.b(var36.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$14x.a(var39, false);
               $$7.a(new gqg.c(var35, $$14x, var37, var38));
               continue;
            case gqf.f $$14:
               gqf.f var10000 = $$14;

               try {
                  var45 = var10000.a();
               } catch (Throwable var25) {
                  var44 = var25;
                  boolean var10001 = false;
                  break;
               }

               String var21 = var45;
               gqf.f var46 = $$14;

               try {
                  var47 = var46.c();
               } catch (Throwable var24) {
                  var44 = var24;
                  boolean var62 = false;
                  break;
               }

               alg var41 = var47;
               gqf.f var48 = $$14;

               try {
                  var49 = var48.d();
               } catch (Throwable var23) {
                  var44 = var23;
                  boolean var63 = false;
                  break;
               }

               boolean var42 = var49;
               gqf.f var50 = $$14;

               try {
                  var51 = var50.e();
               } catch (Throwable var22) {
                  var44 = var22;
                  boolean var64 = false;
                  break;
               }

               boolean var43 = var51;
               $$7.a(new gqg.b(var21, var41, var42, var43));
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
   public void a(fho $$0, int $$1, int $$2, gqe.a $$3) {
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<alg, fiw<fhu>> $$5 = new HashMap<>(this.c.size() + this.d.size());

      for (alg $$6 : this.d) {
         $$5.put($$6, $$3.b($$6));
      }

      for (Entry<alg, gqf.d> $$7 : this.c.entrySet()) {
         alg $$8 = $$7.getKey();
         gqf.d var35;
         Objects.requireNonNull(var35);
         Object var11 = var35;

         var35 = $$7.getValue();
         fiu $$11 = switch (var11) {
            case gqf.a var13 -> {
               gqf.a var29 = var13;

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
                     gqf.a var32 = var13;

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
               yield new fiu(var26, var27, true, 0);
            }
            case gqf.b var16 -> new fiu($$1, $$2, true, 0);
            default -> throw new MatchException(null, null);
         };
         $$5.put($$8, $$0.a($$8.toString(), $$11));
      }

      for (gqg $$12 : this.b) {
         $$12.a($$0, $$5, $$4);
      }

      for (alg $$13 : this.d) {
         $$3.a($$13, $$5.get($$13));
      }
   }

   @Deprecated
   public void a(fhu $$0, fit $$1) {
      fho $$2 = new fho();
      gqe.a $$3 = gqe.a.b(a, $$2.a("main", $$0));
      this.a($$2, $$0.c, $$0.d, $$3);
      $$2.a($$1);
   }

   public void a(String $$0, float $$1) {
      for (gqg $$2 : this.b) {
         $$2.a().c($$0).a($$1);
      }
   }

   public interface a {
      static gqe.a b(final alg $$0, final fiw<fhu> $$1) {
         return new gqe.a() {
            private fiw<fhu> c = $$1;

            @Override
            public void a(alg $$0x, fiw<fhu> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fiw<fhu> a(alg $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alg var1, fiw<fhu> var2);

      @Nullable
      fiw<fhu> a(alg var1);

      default fiw<fhu> b(alg $$0) {
         fiw<fhu> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
