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

public class gqq {
   public static final alg a = alg.b("main");
   private final List<gqs> b;
   private final Map<alg, gqr.d> c;
   private final Set<alg> d;

   private gqq(List<gqs> $$0, Map<alg, gqr.d> $$1, Set<alg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gqq a(gqr $$0, hjm $$1, gre $$2, Set<alg> $$3, alg $$4) throws gre.b {
      Stream<alg> $$5 = $$0.b().stream().flatMap(gqr.e::a);
      Set<alg> $$6 = $$5.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<alg> $$7 = Sets.difference($$6, $$3);
      if (!$$7.isEmpty()) {
         throw new gre.b("Referenced external targets are not available in this context: " + $$7);
      } else {
         Builder<gqs> $$8 = ImmutableList.builder();

         for (int $$9 = 0; $$9 < $$0.b().size(); $$9++) {
            gqr.e $$10 = $$0.b().get($$9);
            $$8.add(a($$1, $$2, $$10, $$4.g("/" + $$9)));
         }

         return new gqq($$8.build(), $$0.a(), $$6);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gqs a(hjm $$0, gre $$1, gqr.e $$2, alg $$3) throws gre.b {
      fid.a $$4 = fid.a(gqv.a).b($$2.c()).c($$2.b()).a($$3);

      for (gqr.c $$5 : $$2.d()) {
         $$4.e($$5.a() + "Sampler");
         $$4.a($$5.a() + "Size", fjl.a.d);
      }

      for (gqr.h $$6 : $$2.f()) {
         $$4.a($$6.a(), Objects.requireNonNull(fjl.a.h.a($$6.b())));
      }

      fid $$7 = $$4.c();
      gpv $$8 = $$1.b($$7);

      for (gqr.h $$9 : $$2.f()) {
         String $$10 = $$9.a();
         if ($$8.a($$10) == null) {
            throw new gre.b("Uniform '" + $$10 + "' does not exist for " + $$3);
         }
      }

      gqs $$11 = new gqs($$7, $$8, $$2.e(), $$2.f());

      for (gqr.c $$12 : $$2.d()) {
         Objects.requireNonNull($$12);
         Throwable var50;
         switch ($$12) {
            case gqr.g var12:
               gqr.g var58 = var12;

               try {
                  var59 = var58.a();
               } catch (Throwable var32) {
                  var50 = var32;
                  boolean var71 = false;
                  break;
               }

               String var41 = var59;
               gqr.g var60 = var12;

               try {
                  var61 = var60.c();
               } catch (Throwable var31) {
                  var50 = var31;
                  boolean var72 = false;
                  break;
               }

               alg var42 = var61;
               gqr.g var62 = var12;

               try {
                  var63 = var62.d();
               } catch (Throwable var30) {
                  var50 = var30;
                  boolean var73 = false;
                  break;
               }

               int var43 = var63;
               gqr.g var64 = var12;

               try {
                  var65 = var64.e();
               } catch (Throwable var29) {
                  var50 = var29;
                  boolean var74 = false;
                  break;
               }

               int var44 = var65;
               gqr.g var66 = var12;

               try {
                  var67 = var66.f();
               } catch (Throwable var28) {
                  var50 = var28;
                  boolean var75 = false;
                  break;
               }

               boolean var45 = var67;
               hiv $$18x = $$0.b(var42.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$18x.a(var45, false);
               $$11.a(new gqs.c(var41, $$18x, var43, var44));
               continue;
            case gqr.f $$18:
               gqr.f var10000 = $$18;

               try {
                  var51 = var10000.a();
               } catch (Throwable var27) {
                  var50 = var27;
                  boolean var10001 = false;
                  break;
               }

               String var23 = var51;
               gqr.f var52 = $$18;

               try {
                  var53 = var52.c();
               } catch (Throwable var26) {
                  var50 = var26;
                  boolean var68 = false;
                  break;
               }

               alg var47 = var53;
               gqr.f var54 = $$18;

               try {
                  var55 = var54.d();
               } catch (Throwable var25) {
                  var50 = var25;
                  boolean var69 = false;
                  break;
               }

               boolean var48 = var55;
               gqr.f var56 = $$18;

               try {
                  var57 = var56.e();
               } catch (Throwable var24) {
                  var50 = var24;
                  boolean var70 = false;
                  break;
               }

               boolean var49 = var57;
               $$11.a(new gqs.b(var23, var47, var48, var49));
               continue;
            default:
               throw new MatchException(null, null);
         }

         Throwable var39 = var50;
         throw new MatchException(var39.toString(), var39);
      }

      return $$11;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(fhw $$0, int $$1, int $$2, gqq.a $$3) {
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<alg, fjg<fie>> $$5 = new HashMap<>(this.c.size() + this.d.size());

      for (alg $$6 : this.d) {
         $$5.put($$6, $$3.b($$6));
      }

      for (Entry<alg, gqr.d> $$7 : this.c.entrySet()) {
         alg $$8 = $$7.getKey();
         gqr.d var35;
         Objects.requireNonNull(var35);
         Object var11 = var35;

         var35 = $$7.getValue();
         fje $$11 = switch (var11) {
            case gqr.a var13 -> {
               gqr.a var29 = var13;

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
                     gqr.a var32 = var13;

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
               yield new fje(var26, var27, true, 0);
            }
            case gqr.b var16 -> new fje($$1, $$2, true, 0);
            default -> throw new MatchException(null, null);
         };
         $$5.put($$8, $$0.a($$8.toString(), $$11));
      }

      for (gqs $$12 : this.b) {
         $$12.a($$0, $$5, $$4);
      }

      for (alg $$13 : this.d) {
         $$3.a($$13, $$5.get($$13));
      }
   }

   @Deprecated
   public void a(fie $$0, fjd $$1) {
      fhw $$2 = new fhw();
      gqq.a $$3 = gqq.a.b(a, $$2.a("main", $$0));
      this.a($$2, $$0.c, $$0.d, $$3);
      $$2.a($$1);
   }

   public void a(String $$0, float $$1) {
      for (gqs $$2 : this.b) {
         $$2.a().b($$0).a($$1);
      }
   }

   public interface a {
      static gqq.a b(final alg $$0, final fjg<fie> $$1) {
         return new gqq.a() {
            private fjg<fie> c = $$1;

            @Override
            public void a(alg $$0x, fjg<fie> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fjg<fie> a(alg $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alg var1, fjg<fie> var2);

      @Nullable
      fjg<fie> a(alg var1);

      default fjg<fie> b(alg $$0) {
         fjg<fie> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
