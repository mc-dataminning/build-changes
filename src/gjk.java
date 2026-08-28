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

public class gjk {
   public static final alj a = alj.b("main");
   private final List<gjm> b;
   private final Map<alj, gjl.d> c;
   private final Set<alj> d;

   private gjk(List<gjm> $$0, Map<alj, gjl.d> $$1, Set<alj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gjk a(gjl $$0, gzf $$1, gjx $$2, Set<alj> $$3) throws gjx.b {
      Stream<alj> $$4 = $$0.b().stream().flatMap($$0x -> $$0x.b().stream()).flatMap($$0x -> $$0x.b().stream());
      Set<alj> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<alj> $$6 = Sets.difference($$5, $$3);
      if (!$$6.isEmpty()) {
         throw new gjx.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<gjm> $$7 = ImmutableList.builder();

         for (gjl.e $$8 : $$0.b()) {
            $$7.add(a($$1, $$2, $$8));
         }

         return new gjk($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gjm a(gzf $$0, gjx $$1, gjl.e $$2) throws gjx.b {
      alj $$3 = $$2.a();
      gip $$4 = $$1.b(new gjy($$3, fep.e, gjw.a));

      for (gjl.h $$5 : $$2.d()) {
         String $$6 = $$5.a();
         if ($$4.a($$6) == null) {
            throw new gjx.b("Uniform '" + $$6 + "' does not exist for " + $$3);
         }
      }

      String $$7 = $$3.toString();
      gjm $$8 = new gjm($$7, $$4, $$2.c(), $$2.d());

      for (gjl.c $$9 : $$2.b()) {
         Objects.requireNonNull($$9);
         Throwable var45;
         switch ($$9) {
            case gjl.g var11:
               gjl.g var53 = var11;

               try {
                  var54 = var53.a();
               } catch (Throwable var31) {
                  var45 = var31;
                  boolean var66 = false;
                  break;
               }

               String var36 = var54;
               gjl.g var55 = var11;

               try {
                  var56 = var55.c();
               } catch (Throwable var30) {
                  var45 = var30;
                  boolean var67 = false;
                  break;
               }

               alj var37 = var56;
               gjl.g var57 = var11;

               try {
                  var58 = var57.d();
               } catch (Throwable var29) {
                  var45 = var29;
                  boolean var68 = false;
                  break;
               }

               int var38 = var58;
               gjl.g var59 = var11;

               try {
                  var60 = var59.e();
               } catch (Throwable var28) {
                  var45 = var28;
                  boolean var69 = false;
                  break;
               }

               int var39 = var60;
               gjl.g var61 = var11;

               try {
                  var62 = var61.f();
               } catch (Throwable var27) {
                  var45 = var27;
                  boolean var70 = false;
                  break;
               }

               boolean var40 = var62;
               gyp $$15x = $$0.a(var37.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$15x.a(var40, false);
               $$8.a(new gjm.c(var36, $$15x, var38, var39));
               continue;
            case gjl.f $$15:
               gjl.f var10000 = $$15;

               try {
                  var46 = var10000.a();
               } catch (Throwable var26) {
                  var45 = var26;
                  boolean var10001 = false;
                  break;
               }

               String var22 = var46;
               gjl.f var47 = $$15;

               try {
                  var48 = var47.c();
               } catch (Throwable var25) {
                  var45 = var25;
                  boolean var63 = false;
                  break;
               }

               alj var42 = var48;
               gjl.f var49 = $$15;

               try {
                  var50 = var49.d();
               } catch (Throwable var24) {
                  var45 = var24;
                  boolean var64 = false;
                  break;
               }

               boolean var43 = var50;
               gjl.f var51 = $$15;

               try {
                  var52 = var51.e();
               } catch (Throwable var23) {
                  var45 = var23;
                  boolean var65 = false;
                  break;
               }

               boolean var44 = var52;
               $$8.a(new gjm.b(var22, var42, var43, var44));
               continue;
            default:
               throw new MatchException(null, null);
         }

         Throwable var35 = var45;
         throw new MatchException(var35.toString(), var35);
      }

      return $$8;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(fcv $$0, int $$1, int $$2, gjk.a $$3) {
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<alj, fed<fdb>> $$5 = new HashMap<>(this.c.size() + this.d.size());

      for (alj $$6 : this.d) {
         $$5.put($$6, $$3.b($$6));
      }

      for (Entry<alj, gjl.d> $$7 : this.c.entrySet()) {
         alj $$8 = $$7.getKey();
         gjl.d var35;
         Objects.requireNonNull(var35);
         Object var11 = var35;

         var35 = $$7.getValue();
         feb $$11 = switch (var11) {
            case gjl.a var13 -> {
               gjl.a var29 = var13;

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
                     gjl.a var32 = var13;

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
               yield new feb(var26, var27, true);
            }
            case gjl.b var16 -> new feb($$1, $$2, true);
            default -> throw new MatchException(null, null);
         };
         $$5.put($$8, $$0.a($$8.toString(), $$11));
      }

      for (gjm $$12 : this.b) {
         $$12.a($$0, $$5, $$4);
      }

      for (alj $$13 : this.d) {
         $$3.a($$13, $$5.get($$13));
      }
   }

   @Deprecated
   public void a(fdb $$0, fea $$1) {
      fcv $$2 = new fcv();
      gjk.a $$3 = gjk.a.b(a, $$2.a("main", $$0));
      this.a($$2, $$0.c, $$0.d, $$3);
      $$2.a($$1);
   }

   public void a(String $$0, float $$1) {
      for (gjm $$2 : this.b) {
         $$2.a().b($$0).a($$1);
      }
   }

   public interface a {
      static gjk.a b(final alj $$0, final fed<fdb> $$1) {
         return new gjk.a() {
            private fed<fdb> c = $$1;

            @Override
            public void a(alj $$0x, fed<fdb> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fed<fdb> a(alj $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alj var1, fed<fdb> var2);

      @Nullable
      fed<fdb> a(alj var1);

      default fed<fdb> b(alj $$0) {
         fed<fdb> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
