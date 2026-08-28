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

public class gsg {
   public static final alk a = alk.b("main");
   private final List<gsi> b;
   private final Map<alk, gsh.d> c;
   private final Set<alk> d;

   private gsg(List<gsi> $$0, Map<alk, gsh.d> $$1, Set<alk> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gsg a(gsh $$0, hle $$1, Set<alk> $$2, alk $$3) throws gsu.b {
      Stream<alk> $$4 = $$0.b().stream().flatMap(gsh.e::a);
      Set<alk> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<alk> $$6 = Sets.difference($$5, $$2);
      if (!$$6.isEmpty()) {
         throw new gsu.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<gsi> $$7 = ImmutableList.builder();

         for (int $$8 = 0; $$8 < $$0.b().size(); $$8++) {
            gsh.e $$9 = $$0.b().get($$8);
            $$7.add(a($$1, $$9, $$3.g("/" + $$8)));
         }

         return new gsg($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static gsi a(hle $$0, gsh.e $$1, alk $$2) throws gsu.b {
      fjr.a $$3 = fjr.a(gsl.a).b($$1.c()).c($$1.b()).a($$2);

      for (gsh.c $$4 : $$1.d()) {
         $$3.e($$4.a() + "Sampler");
         $$3.a($$4.a() + "Size", fkz.d);
      }

      for (gsh.h $$5 : $$1.f()) {
         $$3.a($$5.a(), Objects.requireNonNull(fkz.h.a($$5.b())));
      }

      fjr $$6 = $$3.c();
      fjo $$7 = RenderSystem.getDevice().b($$6);

      for (gsh.h $$8 : $$1.f()) {
         String $$9 = $$8.a();
         if (!$$7.a($$9)) {
            throw new gsu.b("Uniform '" + $$9 + "' does not exist for " + $$2);
         }
      }

      gsi $$10 = new gsi($$6, $$1.e(), $$1.f());

      for (gsh.c $$11 : $$1.d()) {
         Objects.requireNonNull($$11);
         Throwable var49;
         switch ($$11) {
            case gsh.g var11:
               gsh.g var57 = var11;

               try {
                  var58 = var57.a();
               } catch (Throwable var31) {
                  var49 = var31;
                  boolean var70 = false;
                  break;
               }

               String var40 = var58;
               gsh.g var59 = var11;

               try {
                  var60 = var59.c();
               } catch (Throwable var30) {
                  var49 = var30;
                  boolean var71 = false;
                  break;
               }

               alk var41 = var60;
               gsh.g var61 = var11;

               try {
                  var62 = var61.d();
               } catch (Throwable var29) {
                  var49 = var29;
                  boolean var72 = false;
                  break;
               }

               int var42 = var62;
               gsh.g var63 = var11;

               try {
                  var64 = var63.e();
               } catch (Throwable var28) {
                  var49 = var28;
                  boolean var73 = false;
                  break;
               }

               int var43 = var64;
               gsh.g var65 = var11;

               try {
                  var66 = var65.f();
               } catch (Throwable var27) {
                  var49 = var27;
                  boolean var74 = false;
                  break;
               }

               boolean var44 = var66;
               hkn $$17x = $$0.b(var41.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$17x.a(var44, false);
               $$10.a(new gsi.c(var40, $$17x, var42, var43));
               continue;
            case gsh.f $$17:
               gsh.f var10000 = $$17;

               try {
                  var50 = var10000.a();
               } catch (Throwable var26) {
                  var49 = var26;
                  boolean var10001 = false;
                  break;
               }

               String var22 = var50;
               gsh.f var51 = $$17;

               try {
                  var52 = var51.c();
               } catch (Throwable var25) {
                  var49 = var25;
                  boolean var67 = false;
                  break;
               }

               alk var46 = var52;
               gsh.f var53 = $$17;

               try {
                  var54 = var53.d();
               } catch (Throwable var24) {
                  var49 = var24;
                  boolean var68 = false;
                  break;
               }

               boolean var47 = var54;
               gsh.f var55 = $$17;

               try {
                  var56 = var55.e();
               } catch (Throwable var23) {
                  var49 = var23;
                  boolean var69 = false;
                  break;
               }

               boolean var48 = var56;
               $$10.a(new gsi.b(var22, var46, var47, var48));
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
   public void a(fir $$0, int $$1, int $$2, gsg.a $$3, @Nullable Consumer<fld> $$4) {
      Matrix4f $$5 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<alk, fkv<fjs>> $$6 = new HashMap<>(this.c.size() + this.d.size());

      for (alk $$7 : this.d) {
         $$6.put($$7, $$3.b($$7));
      }

      for (Entry<alk, gsh.d> $$8 : this.c.entrySet()) {
         alk $$9 = $$8.getKey();
         gsh.d var36;
         Objects.requireNonNull(var36);
         Object var12 = var36;

         var36 = $$8.getValue();
         fkt $$12 = switch (var12) {
            case gsh.a var14 -> {
               gsh.a var30 = var14;

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
                     gsh.a var33 = var14;

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
               yield new fkt(var27, var28, true, 0);
            }
            case gsh.b var17 -> new fkt($$1, $$2, true, 0);
            default -> throw new MatchException(null, null);
         };
         $$6.put($$9, $$0.a($$9.toString(), $$12));
      }

      for (gsi $$13 : this.b) {
         $$13.a($$0, $$6, $$5, $$4);
      }

      for (alk $$14 : this.d) {
         $$3.a($$14, $$6.get($$14));
      }
   }

   @Deprecated
   public void a(fjs $$0, fks $$1, @Nullable Consumer<fld> $$2) {
      fir $$3 = new fir();
      gsg.a $$4 = gsg.a.b(a, $$3.a("main", $$0));
      this.a($$3, $$0.c, $$0.d, $$4, $$2);
      $$3.a($$1);
   }

   public interface a {
      static gsg.a b(final alk $$0, final fkv<fjs> $$1) {
         return new gsg.a() {
            private fkv<fjs> c = $$1;

            @Override
            public void a(alk $$0x, fkv<fjs> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fkv<fjs> a(alk $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alk var1, fkv<fjs> var2);

      @Nullable
      fkv<fjs> a(alk var1);

      default fkv<fjs> b(alk $$0) {
         fkv<fjs> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
