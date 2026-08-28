import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
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

public class grr {
   public static final alr a = alr.b("main");
   private final List<grt> b;
   private final Map<alr, grs.d> c;
   private final Set<alr> d;

   private grr(List<grt> $$0, Map<alr, grs.d> $$1, Set<alr> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static grr a(grs $$0, hks $$1, Set<alr> $$2, alr $$3) throws gsf.b {
      Stream<alr> $$4 = $$0.b().stream().flatMap(grs.e::a);
      Set<alr> $$5 = $$4.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<alr> $$6 = Sets.difference($$5, $$2);
      if (!$$6.isEmpty()) {
         throw new gsf.b("Referenced external targets are not available in this context: " + $$6);
      } else {
         Builder<grt> $$7 = ImmutableList.builder();

         for (int $$8 = 0; $$8 < $$0.b().size(); $$8++) {
            grs.e $$9 = $$0.b().get($$8);
            $$7.add(a($$1, $$9, $$3.g("/" + $$8)));
         }

         return new grr($$7.build(), $$0.a(), $$5);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static grt a(hks $$0, grs.e $$1, alr $$2) throws gsf.b {
      RenderPipeline.Builder $$3 = RenderPipeline.builder(grw.a).withFragmentShader($$1.c()).withVertexShader($$1.b()).withLocation($$2);

      for (grs.c $$4 : $$1.d()) {
         $$3.withSampler($$4.a() + "Sampler");
         $$3.withUniform($$4.a() + "Size", fku.d);
      }

      for (grs.h $$5 : $$1.f()) {
         $$3.withUniform($$5.a(), Objects.requireNonNull(fku.h.a($$5.b())));
      }

      RenderPipeline $$6 = $$3.build();
      CompiledRenderPipeline $$7 = RenderSystem.getDevice().precompilePipeline($$6);

      for (grs.h $$8 : $$1.f()) {
         String $$9 = $$8.a();
         if (!$$7.containsUniform($$9)) {
            throw new gsf.b("Uniform '" + $$9 + "' does not exist for " + $$2);
         }
      }

      grt $$10 = new grt($$6, $$1.e(), $$1.f());

      for (grs.c $$11 : $$1.d()) {
         Objects.requireNonNull($$11);
         Throwable var49;
         switch ($$11) {
            case grs.g var11:
               grs.g var57 = var11;

               try {
                  var58 = var57.a();
               } catch (Throwable var31) {
                  var49 = var31;
                  boolean var70 = false;
                  break;
               }

               String var40 = var58;
               grs.g var59 = var11;

               try {
                  var60 = var59.c();
               } catch (Throwable var30) {
                  var49 = var30;
                  boolean var71 = false;
                  break;
               }

               alr var41 = var60;
               grs.g var61 = var11;

               try {
                  var62 = var61.d();
               } catch (Throwable var29) {
                  var49 = var29;
                  boolean var72 = false;
                  break;
               }

               int var42 = var62;
               grs.g var63 = var11;

               try {
                  var64 = var63.e();
               } catch (Throwable var28) {
                  var49 = var28;
                  boolean var73 = false;
                  break;
               }

               int var43 = var64;
               grs.g var65 = var11;

               try {
                  var66 = var65.f();
               } catch (Throwable var27) {
                  var49 = var27;
                  boolean var74 = false;
                  break;
               }

               boolean var44 = var66;
               hkb $$17x = $$0.b(var41.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$17x.a(var44, false);
               $$10.a(new grt.c(var40, $$17x, var42, var43));
               continue;
            case grs.f $$17:
               grs.f var10000 = $$17;

               try {
                  var50 = var10000.a();
               } catch (Throwable var26) {
                  var49 = var26;
                  boolean var10001 = false;
                  break;
               }

               String var22 = var50;
               grs.f var51 = $$17;

               try {
                  var52 = var51.c();
               } catch (Throwable var25) {
                  var49 = var25;
                  boolean var67 = false;
                  break;
               }

               alr var46 = var52;
               grs.f var53 = $$17;

               try {
                  var54 = var53.d();
               } catch (Throwable var24) {
                  var49 = var24;
                  boolean var68 = false;
                  break;
               }

               boolean var47 = var54;
               grs.f var55 = $$17;

               try {
                  var56 = var55.e();
               } catch (Throwable var23) {
                  var49 = var23;
                  boolean var69 = false;
                  break;
               }

               boolean var48 = var56;
               $$10.a(new grt.b(var22, var46, var47, var48));
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
   public void a(fix $$0, int $$1, int $$2, grr.a $$3, @Nullable Consumer<RenderPass> $$4) {
      Matrix4f $$5 = new Matrix4f().setOrtho(0.0F, (float)$$1, 0.0F, (float)$$2, 0.1F, 1000.0F);
      Map<alr, fkr<fjr>> $$6 = new HashMap<>(this.c.size() + this.d.size());

      for (alr $$7 : this.d) {
         $$6.put($$7, $$3.b($$7));
      }

      for (Entry<alr, grs.d> $$8 : this.c.entrySet()) {
         alr $$9 = $$8.getKey();
         grs.d var36;
         Objects.requireNonNull(var36);
         Object var12 = var36;

         var36 = $$8.getValue();
         fkp $$12 = switch (var12) {
            case grs.a var14 -> {
               grs.a var30 = var14;

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
                     grs.a var33 = var14;

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
               yield new fkp(var27, var28, true, 0);
            }
            case grs.b var17 -> new fkp($$1, $$2, true, 0);
            default -> throw new MatchException(null, null);
         };
         $$6.put($$9, $$0.a($$9.toString(), $$12));
      }

      for (grt $$13 : this.b) {
         $$13.a($$0, $$6, $$5, $$4);
      }

      for (alr $$14 : this.d) {
         $$3.a($$14, $$6.get($$14));
      }
   }

   @Deprecated
   public void a(fjr $$0, fko $$1, @Nullable Consumer<RenderPass> $$2) {
      fix $$3 = new fix();
      grr.a $$4 = grr.a.b(a, $$3.a("main", $$0));
      this.a($$3, $$0.c, $$0.d, $$4, $$2);
      $$3.a($$1);
   }

   public interface a {
      static grr.a b(final alr $$0, final fkr<fjr> $$1) {
         return new grr.a() {
            private fkr<fjr> c = $$1;

            @Override
            public void a(alr $$0x, fkr<fjr> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fkr<fjr> a(alr $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(alr var1, fkr<fjr> var2);

      @Nullable
      fkr<fjr> a(alr var1);

      default fkr<fjr> b(alr $$0) {
         fkr<fjr> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
