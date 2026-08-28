import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gse {
   public static final ali a = ali.b("main");
   private final List<gsg> b;
   private final Map<ali, gsf.d> c;
   private final Set<ali> d;

   private gse(List<gsg> $$0, Map<ali, gsf.d> $$1, Set<ali> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gse a(gsf $$0, hlc $$1, Set<ali> $$2, ali $$3) throws gss.b {
      Stream<ali> $$4 = $$0.b().stream().flatMap(gsf.e::a);
      Set<ali> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<ali> $$6 = Sets.difference($$5, $$2);
      if (!$$6.isEmpty()) {
         throw new gss.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<gsg> $$7 = ImmutableList.builder();

         for (int $$8 = 0; $$8 < $$0.b().size(); $$8++) {
            gsf.e $$9 = $$0.b().get($$8);
            $$7.add(a($$1, $$9, $$3.g("/" + $$8)));
         }

         return new gse($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gsg a(hlc $$0, gsf.e $$1, ali $$2) throws gss.b {
      fjp.a $$3 = fjp.a(gsj.a).b($$1.c()).c($$1.b()).a($$2);

      for (gsf.c $$4 : $$1.d()) {
         $$3.e($$4.a() + "Sampler");
         $$3.a($$4.a() + "Size", fkx.d);
      }

      for (gsf.h $$5 : $$1.f()) {
         $$3.a($$5.a(), Objects.requireNonNull(fkx.h.a($$5.b())));
      }

      fjp $$6 = $$3.c();
      fjm $$7 = RenderSystem.getDevice().b($$6);

      for (gsf.h $$8 : $$1.f()) {
         String $$9 = $$8.a();
         if (!$$7.a($$9)) {
            throw new gss.b("Uniform '" + $$9 + "' does not exist for " + $$2);
         }
      }

      gsg $$10 = new gsg($$6, $$1.e(), $$1.f());

      for (gsf.c $$11 : $$1.d()) {
         Objects.requireNonNull($$11);
         Throwable var49;
         switch ($$11) {
            case gsf.g var11:
               gsf.g var57 = var11;

               try {
                  var58 = var57.a();
               } catch (Throwable var31) {
                  var49 = var31;
                  boolean var70 = false;
                  break;
               }

               String var40 = var58;
               gsf.g var59 = var11;

               try {
                  var60 = var59.c();
               } catch (Throwable var30) {
                  var49 = var30;
                  boolean var71 = false;
                  break;
               }

               ali var41 = var60;
               gsf.g var61 = var11;

               try {
                  var62 = var61.d();
               } catch (Throwable var29) {
                  var49 = var29;
                  boolean var72 = false;
                  break;
               }

               int var42 = var62;
               gsf.g var63 = var11;

               try {
                  var64 = var63.e();
               } catch (Throwable var28) {
                  var49 = var28;
                  boolean var73 = false;
                  break;
               }

               int var43 = var64;
               gsf.g var65 = var11;

               try {
                  var66 = var65.f();
               } catch (Throwable var27) {
                  var49 = var27;
                  boolean var74 = false;
                  break;
               }

               boolean var44 = var66;
               hkl $$17x = $$0.b(var41.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$17x.a(var44, false);
               $$10.a(new gsg.c(var40, $$17x, var42, var43));
               continue;
            case gsf.f $$17:
               gsf.f var10000 = $$17;

               try {
                  var50 = var10000.a();
               } catch (Throwable var26) {
                  var49 = var26;
                  boolean var10001 = false;
                  break;
               }

               String var22 = var50;
               gsf.f var51 = $$17;

               try {
                  var52 = var51.c();
               } catch (Throwable var25) {
                  var49 = var25;
                  boolean var67 = false;
                  break;
               }

               ali var46 = var52;
               gsf.f var53 = $$17;

               try {
                  var54 = var53.d();
               } catch (Throwable var24) {
                  var49 = var24;
                  boolean var68 = false;
                  break;
               }

               boolean var47 = var54;
               gsf.f var55 = $$17;

               try {
                  var56 = var55.e();
               } catch (Throwable var23) {
                  var49 = var23;
                  boolean var69 = false;
                  break;
               }

               boolean var48 = var56;
               $$10.a(new gsg.b(var22, var46, var47, var48));
               continue;
            default:
               throw new MatchException(null, null);
         }

         Throwable var38 = var49;
         throw new MatchException(var38.toString(), var38);
      }

      return $$10;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(fip $$0, int $$1, int $$2, gse.a $$3, @Nullable Consumer<flb> $$4) {
      Matrix4f $$5 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<ali, fkt<fjq>> $$6 = new HashMap<>(this.c.size() + this.d.size());

      for (ali $$7 : this.d) {
         $$6.put($$7, $$3.b($$7));
      }

      for (Entry<ali, gsf.d> $$8 : this.c.entrySet()) {
         ali $$9 = $$8.getKey();
         gsf.d var36;
         Objects.requireNonNull(var36);
         Object var12 = var36;

         var36 = $$8.getValue();
         fkr $$12 = switch (var12) {
            case gsf.a var14 -> {
               gsf.a var30 = var14;

               int var27;
               label56: {
                  label76: {
                     try {
                        var32 = var30.a();
                     } catch (Throwable var19) {
                        var31 = var19;
                        boolean var10001 = false;
                        break label76;
                     }

                     var27 = var32;
                     gsf.a var33 = var14;

                     try {
                        var34 = var33.b();
                        break label56;
                     } catch (Throwable var18) {
                        var31 = var18;
                        boolean var35 = false;
                     }
                  }

                  Throwable var21 = var31;
                  throw new MatchException(var21.toString(), var21);
               }

               int var28 = var34;
               yield new fkr(var27, var28, true, 0);
            }
            case gsf.b var17 -> new fkr($$1, $$2, true, 0);
            default -> throw new MatchException(null, null);
         };
         $$6.put($$9, $$0.a($$9.toString(), $$12));
      }

      for (gsg $$13 : this.b) {
         $$13.a($$0, $$6, $$5, $$4);
      }

      for (ali $$14 : this.d) {
         $$3.a($$14, $$6.get($$14));
      }
   }

   @Deprecated
   public void a(fjq $$0, fkq $$1, @Nullable Consumer<flb> $$2) {
      fip $$3 = new fip();
      gse.a $$4 = gse.a.b(a, $$3.a("main", $$0));
      this.a($$3, $$0.c, $$0.d, $$4, $$2);
      $$3.a($$1);
   }

   public interface a {
      static gse.a b(final ali $$0, final fkt<fjq> $$1) {
         return new gse.a() {
            private fkt<fjq> c = $$1;

            @Override
            public void a(ali $$0x, fkt<fjq> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fkt<fjq> a(ali $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(ali var1, fkt<fjq> var2);

      @Nullable
      fkt<fjq> a(ali var1);

      default fkt<fjq> b(ali $$0) {
         fkt<fjq> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
