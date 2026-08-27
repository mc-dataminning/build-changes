import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class gbh implements AutoCloseable {
   private static final akh e = new akh("textures/misc/nausea.png");
   private static final akh f = new akh("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fde k;
   private final atr l;
   private final ayg m = ayg.a();
   private float n;
   public final gbk b;
   private final feu o;
   private final gbu p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ac.b();
   private final gbn A;
   private final gmp B = new gmp();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private csz G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gbr K;
   @Nullable
   private gbr L;
   private boolean M;
   private final fcp N = new fcp();
   public gcc d;
   private final Map<String, gcc> O = Maps.newHashMap();
   @Nullable
   private static gcc P;
   @Nullable
   private static gcc Q;
   @Nullable
   private static gcc R;
   @Nullable
   private static gcc S;
   @Nullable
   private static gcc T;
   @Nullable
   private static gcc U;
   @Nullable
   private static gcc V;
   @Nullable
   private static gcc W;
   @Nullable
   private static gcc X;
   @Nullable
   private static gcc Y;
   @Nullable
   private static gcc Z;
   @Nullable
   private static gcc aa;
   @Nullable
   private static gcc ab;
   @Nullable
   private static gcc ac;
   @Nullable
   private static gcc ad;
   @Nullable
   private static gcc ae;
   @Nullable
   private static gcc af;
   @Nullable
   private static gcc ag;
   @Nullable
   private static gcc ah;
   @Nullable
   private static gcc ai;
   @Nullable
   private static gcc aj;
   @Nullable
   private static gcc ak;
   @Nullable
   private static gcc al;
   @Nullable
   private static gcc am;
   @Nullable
   private static gcc an;
   @Nullable
   private static gcc ao;
   @Nullable
   private static gcc ap;
   @Nullable
   private static gcc aq;
   @Nullable
   private static gcc ar;
   @Nullable
   private static gcc as;
   @Nullable
   private static gcc at;
   @Nullable
   private static gcc au;
   @Nullable
   private static gcc av;
   @Nullable
   private static gcc aw;
   @Nullable
   private static gcc ax;
   @Nullable
   private static gcc ay;
   @Nullable
   private static gcc az;
   @Nullable
   private static gcc aA;
   @Nullable
   private static gcc aB;
   @Nullable
   private static gcc aC;
   @Nullable
   private static gcc aD;
   @Nullable
   private static gcc aE;
   @Nullable
   private static gcc aF;
   @Nullable
   private static gcc aG;
   @Nullable
   private static gcc aH;
   @Nullable
   private static gcc aI;
   @Nullable
   private static gcc aJ;
   @Nullable
   private static gcc aK;
   @Nullable
   private static gcc aL;
   @Nullable
   private static gcc aM;
   @Nullable
   private static gcc aN;
   @Nullable
   private static gcc aO;
   @Nullable
   private static gcc aP;
   @Nullable
   private static gcc aQ;
   @Nullable
   private static gcc aR;
   @Nullable
   private static gcc aS;
   @Nullable
   private static gcc aT;
   @Nullable
   private static gcc aU;

   public gbh(fde $$0, gbk $$1, atr $$2, gbu $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new feu($$0.aa(), $$0.aH());
      this.A = new gbn(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.av();
      if (this.d != null) {
         this.d.close();
      }
   }

   public void a(boolean $$0) {
      this.v = $$0;
   }

   public void b(boolean $$0) {
      this.w = $$0;
   }

   public void c(boolean $$0) {
      this.C = $$0;
   }

   public boolean a() {
      return this.C;
   }

   public void b() {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable brh $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof chz) {
         this.a(new akh("shaders/post/creeper.json"));
      } else if ($$0 instanceof ciy) {
         this.a(new akh("shaders/post/spider.json"));
      } else if ($$0 instanceof cid) {
         this.a(new akh("shaders/post/invert.json"));
      }
   }

   private void a(akh $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gbr(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aP().k(), this.k.aP().l());
         this.M = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.M = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.M = false;
      }
   }

   public void d() {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gbr(this.k.aa(), this.l, this.k.h(), f);
         this.L.a(this.k.aP().k(), this.k.aP().l());
      } catch (IOException var2) {
         h.warn("Failed to load shader: {}", f, var2);
      } catch (JsonSyntaxException var3) {
         h.warn("Failed to parse shader: {}", f, var3);
      }
   }

   public void a(float $$0) {
      float $$1 = (float)this.k.m.q();
      float $$2 = $$1 * 10.0F;
      if (this.L != null && $$2 >= 1.0F) {
         RenderSystem.enableBlend();
         this.L.a("Radius", $$2);
         this.L.a($$0);
         RenderSystem.disableBlend();
      }
   }

   public atl e() {
      return new atw<gbh.a>() {
         protected gbh.a a(atr $$0, bma $$1) {
            Map<akh, atp> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(exl.a.b.b()) || $$1x.endsWith(exl.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akh, atp> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atp($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gbh.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gbh.a($$0, $$3);
         }

         protected void a(gbh.a $$0, atr $$1, bma $$2) {
            gbh.this.b($$0);
            if (gbh.this.K != null) {
               gbh.this.K.close();
            }

            gbh.this.K = null;
            gbh.this.a(gbh.this.k.ao());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atu $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gcc($$0, "blit_screen", exv.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", exv.n);
         aS = this.a($$0, "rendertype_gui_overlay", exv.n);
         P = this.a($$0, "position", exv.m);
         Q = this.a($$0, "position_color", exv.n);
         R = this.a($$0, "position_color_tex", exv.r);
         S = this.a($$0, "position_tex", exv.q);
         T = this.a($$0, "position_tex_color", exv.s);
         aE = this.a($$0, "rendertype_text", exv.t);
      }
   }

   private gcc a(atu $$0, String $$1, eyc $$2) {
      try {
         gcc $$3 = new gcc($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(atu $$0) {
      RenderSystem.assertOnRenderThread();
      List<exl> $$1 = Lists.newArrayList();
      $$1.addAll(exl.a.b.c().values());
      $$1.addAll(exl.a.a.c().values());
      $$1.forEach(exl::a);
      List<Pair<gcc, Consumer<gcc>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gcc($$0, "particle", exv.l), (Consumer<gcc>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position", exv.m), (Consumer<gcc>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_color", exv.n), (Consumer<gcc>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_color_lightmap", exv.p), (Consumer<gcc>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_color_tex", exv.r), (Consumer<gcc>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_color_tex_lightmap", exv.t), (Consumer<gcc>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_tex", exv.q), (Consumer<gcc>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gcc($$0, "position_tex_color", exv.s), (Consumer<gcc>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_solid", exv.j), (Consumer<gcc>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_cutout_mipped", exv.j), (Consumer<gcc>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_cutout", exv.j), (Consumer<gcc>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_translucent", exv.j), (Consumer<gcc>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_translucent_moving_block", exv.j), (Consumer<gcc>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_armor_cutout_no_cull", exv.k), (Consumer<gcc>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_solid", exv.k), (Consumer<gcc>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_cutout", exv.k), (Consumer<gcc>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_cutout_no_cull", exv.k), (Consumer<gcc>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_cutout_no_cull_z_offset", exv.k), (Consumer<gcc>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_item_entity_translucent_cull", exv.k), (Consumer<gcc>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_translucent_cull", exv.k), (Consumer<gcc>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_translucent", exv.k), (Consumer<gcc>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_translucent_emissive", exv.k), (Consumer<gcc>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_smooth_cutout", exv.k), (Consumer<gcc>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_beacon_beam", exv.j), (Consumer<gcc>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_decal", exv.k), (Consumer<gcc>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_no_outline", exv.k), (Consumer<gcc>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_shadow", exv.k), (Consumer<gcc>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_alpha", exv.k), (Consumer<gcc>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_eyes", exv.k), (Consumer<gcc>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_energy_swirl", exv.k), (Consumer<gcc>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_leash", exv.p), (Consumer<gcc>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_water_mask", exv.m), (Consumer<gcc>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_outline", exv.r), (Consumer<gcc>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_armor_glint", exv.q), (Consumer<gcc>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_armor_entity_glint", exv.q), (Consumer<gcc>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_glint_translucent", exv.q), (Consumer<gcc>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_glint", exv.q), (Consumer<gcc>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_glint_direct", exv.q), (Consumer<gcc>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_glint", exv.q), (Consumer<gcc>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_entity_glint_direct", exv.q), (Consumer<gcc>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text", exv.t), (Consumer<gcc>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text_background", exv.p), (Consumer<gcc>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text_intensity", exv.t), (Consumer<gcc>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text_see_through", exv.t), (Consumer<gcc>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text_background_see_through", exv.p), (Consumer<gcc>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_text_intensity_see_through", exv.t), (Consumer<gcc>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_lightning", exv.n), (Consumer<gcc>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_tripwire", exv.j), (Consumer<gcc>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_end_portal", exv.m), (Consumer<gcc>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_end_gateway", exv.m), (Consumer<gcc>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_clouds", exv.v), (Consumer<gcc>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_lines", exv.o), (Consumer<gcc>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_crumbling", exv.j), (Consumer<gcc>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_gui", exv.n), (Consumer<gcc>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_gui_overlay", exv.n), (Consumer<gcc>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_gui_text_highlight", exv.n), (Consumer<gcc>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_gui_ghost_recipe_overlay", exv.n), (Consumer<gcc>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gcc($$0, "rendertype_breeze_wind", exv.k), (Consumer<gcc>)$$0x -> at = $$0x));
         this.d();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gcc)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         gcc $$1x = (gcc)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gcc::close);
      this.O.clear();
   }

   @Nullable
   public gcc a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.aw();
      this.A.a();
      if (this.k.ao() == null) {
         this.k.a(this.k.s);
      }

      this.N.a();
      this.b.a();
      this.q++;
      if (this.k.r.s().i()) {
         this.k.f.a(this.N);
         this.u = this.t;
         if (this.k.l.j().c()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         if (this.H > 0) {
            this.H--;
            if (this.H == 0) {
               this.G = null;
            }
         }
      }
   }

   @Nullable
   public gbr g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      if (this.L != null) {
         this.L.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void b(float $$0) {
      brh $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aJ().a("pick");
            double $$2 = this.k.s.gA();
            double $$3 = this.k.s.gB();
            etn $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof etm $$5 ? $$5.a() : null;
            this.k.aJ().c();
         }
      }
   }

   private etn a(brh $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = axz.k($$4);
      etp $$6 = $$0.j($$3);
      etn $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != etn.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      etp $$9 = $$0.f($$3);
      etp $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      etk $$12 = $$0.cI().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      etm $$13 = cmb.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bx(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static etn a(etn $$0, etp $$1, double $$2) {
      etp $$3 = $$0.e();
      if (!$$3.a((jg)$$1, $$2)) {
         etp $$4 = $$0.e();
         is $$5 = is.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return etl.a($$4, $$5, in.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof gan $$1) {
         $$0 = $$1.c();
      }

      this.s = this.r;
      this.r = this.r + ($$0 - this.r) * 0.5F;
      if (this.r > 1.5F) {
         this.r = 1.5F;
      }

      if (this.r < 0.1F) {
         this.r = 0.1F;
      }
   }

   private double a(fcp $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)axz.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bsa && ((bsa)$$0.g()).ez()) {
            float $$4 = Math.min((float)((bsa)$$0.g()).aR + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         emc $$5 = $$0.k();
         if ($$5 == emc.a || $$5 == emc.b) {
            $$3 *= axz.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(exx $$0, float $$1) {
      if (this.k.ao() instanceof bsa $$2) {
         float $$3 = (float)$$2.aP - $$1;
         if ($$2.ez()) {
            float $$4 = Math.min((float)$$2.aR + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aQ;
         $$3 = axz.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eH();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(exx $$0, float $$1) {
      if (this.k.ao() instanceof clh) {
         clh $$2 = (clh)this.k.ao();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = axz.i($$1, $$2.cf, $$2.cg);
         $$0.a(axz.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(axz.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(axz.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(axz.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L);
      this.D = 1.0F;
   }

   private void a(fcp $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         exx $$3 = new exx();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.ao() instanceof bsa && ((bsa)this.k.ao()).fJ();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Z && this.k.q.j() != daa.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gby.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eyf.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aP().k() / (float)this.k.aP().l(), 0.05F, this.h());
   }

   public float h() {
      return this.n * 4.0F;
   }

   public static float a(bsa $$0, float $$1) {
      bqt $$2 = $$0.c(bqv.p);
      return !$$2.a(200) ? 1.0F : 0.7F + axz.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aC() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.b() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.b();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aP().o() / (double)this.k.aP().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aP().p() / (double)this.k.aP().n());
         RenderSystem.viewport(0, 0, this.k.aP().k(), this.k.aP().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aJ().a("level");
            this.a($$0, $$1);
            this.ax();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.h().a(true);
         }

         exb $$7 = this.k.aP();
         RenderSystem.clear(256, fde.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eyf.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ewt.d();
         fer $$10 = new fer(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aJ().b("gui");
            if (this.k.s != null) {
               float $$11 = axz.i($$3, this.k.s.cI, this.k.s.cH);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bqv.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z) {
               this.a(this.k.aP().o(), this.k.aP().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fde.a);
            this.k.aJ().c();
         }

         if (this.k.aM() != null) {
            try {
               this.k.aM().a($$10, $$5, $$6, this.k.av());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aM().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.av());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.k.n.e(), this.k.n.f()));
               $$18.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aP().o(),
                        this.k.aP().p(),
                        this.k.aP().k(),
                        this.k.aP().l(),
                        this.k.aP().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4 && $$2 && this.k.r != null) {
            this.k.l.b($$10, $$3);
         }

         if ($$4) {
            this.k.aJ().a("toasts");
            this.k.aA().a($$10);
            this.k.aJ().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            grd $$1 = this.k.V();
            if ($$1 != null && !$$1.ag()) {
               $$1.B().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.y = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.k.f.k() > 10 && this.k.f.q()) {
         ewy $$1 = fdp.a(this.k.h());
         ac.g().execute(() -> {
            int $$2 = $$1.a();
            int $$3 = $$1.b();
            int $$4 = 0;
            int $$5 = 0;
            if ($$2 > $$3) {
               $$4 = ($$2 - $$3) / 2;
               $$2 = $$3;
            } else {
               $$5 = ($$3 - $$2) / 2;
               $$3 = $$2;
            }

            try (ewy $$6 = new ewy(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               h.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean ay() {
      if (!this.w) {
         return false;
      } else {
         brh $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof clh && !this.k.m.Z;
         if ($$1 && !((clh)$$0).gb().e) {
            csz $$2 = ((bsa)$$0).eV();
            etn $$3 = this.k.v;
            if ($$3 != null && $$3.c() == etn.a.b) {
               in $$4 = ((etl)$$3).a();
               dqh $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == daa.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dql $$6 = new dql(this.k.r, $$4, false);
                  jj<dde> $$7 = this.k.r.H_().d(le.f);
                  $$1 = !$$2.d() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.A.a($$0);
      if (this.k.ao() == null) {
         this.k.a(this.k.s);
      }

      this.b($$0);
      this.k.aJ().a("center");
      boolean $$2 = this.ay();
      this.k.aJ().b("camera");
      fcp $$3 = this.N;
      brh $$4 = (brh)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      exx $$7 = new exx();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = axz.i($$0, this.k.s.cI, this.k.s.cH) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bqv.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, axz.g / 2.0F, axz.g / 2.0F);
         float $$13 = ((float)this.q + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.k.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$1, $$2, $$3, this, this.A, $$14, $$6);
      this.k.aJ().b("hand");
      if (this.v) {
         RenderSystem.clear(256, fde.a);
         this.a($$3, $$0, $$14);
      }

      this.k.aJ().c();
   }

   public void i() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public feu j() {
      return this.o;
   }

   public void a(csz $$0) {
      this.G = $$0;
      this.H = 40;
      this.I = this.m.i() * 2.0F - 1.0F;
      this.J = this.m.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.G != null && this.H > 0) {
         int $$3 = 40 - this.H;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.I * (float)($$0 / 4);
         float $$10 = this.J * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         exx $$11 = new exx();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * axz.e(axz.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * axz.e(axz.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * axz.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * axz.e(axz.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * axz.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * axz.b($$4 * 8.0F)));
         gbo.a $$13 = this.p.c();
         this.k.as().a(this.G, csw.i, 15728880, gmp.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fer $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = axz.i($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE
      );
      $$0.a($$5, $$6, $$7, 1.0F);
      $$0.a(e, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public fde k() {
      return this.k;
   }

   public float c(float $$0) {
      return axz.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public fcp m() {
      return this.N;
   }

   public gbn n() {
      return this.A;
   }

   public gmp o() {
      return this.B;
   }

   @Nullable
   public static gcc p() {
      return P;
   }

   @Nullable
   public static gcc q() {
      return Q;
   }

   @Nullable
   public static gcc r() {
      return R;
   }

   @Nullable
   public static gcc s() {
      return S;
   }

   @Nullable
   public static gcc t() {
      return T;
   }

   @Nullable
   public static gcc u() {
      return U;
   }

   @Nullable
   public static gcc v() {
      return V;
   }

   @Nullable
   public static gcc w() {
      return W;
   }

   @Nullable
   public static gcc x() {
      return X;
   }

   @Nullable
   public static gcc y() {
      return Y;
   }

   @Nullable
   public static gcc z() {
      return Z;
   }

   @Nullable
   public static gcc A() {
      return aa;
   }

   @Nullable
   public static gcc B() {
      return ab;
   }

   @Nullable
   public static gcc C() {
      return ac;
   }

   @Nullable
   public static gcc D() {
      return ad;
   }

   @Nullable
   public static gcc E() {
      return ae;
   }

   @Nullable
   public static gcc F() {
      return af;
   }

   @Nullable
   public static gcc G() {
      return ag;
   }

   @Nullable
   public static gcc H() {
      return ah;
   }

   @Nullable
   public static gcc I() {
      return ai;
   }

   @Nullable
   public static gcc J() {
      return aj;
   }

   @Nullable
   public static gcc K() {
      return ak;
   }

   @Nullable
   public static gcc L() {
      return al;
   }

   @Nullable
   public static gcc M() {
      return am;
   }

   @Nullable
   public static gcc N() {
      return an;
   }

   @Nullable
   public static gcc O() {
      return ao;
   }

   @Nullable
   public static gcc P() {
      return ap;
   }

   @Nullable
   public static gcc Q() {
      return aq;
   }

   @Nullable
   public static gcc R() {
      return ar;
   }

   @Nullable
   public static gcc S() {
      return as;
   }

   @Nullable
   public static gcc T() {
      return at;
   }

   @Nullable
   public static gcc U() {
      return au;
   }

   @Nullable
   public static gcc V() {
      return av;
   }

   @Nullable
   public static gcc W() {
      return aw;
   }

   @Nullable
   public static gcc X() {
      return ax;
   }

   @Nullable
   public static gcc Y() {
      return ay;
   }

   @Nullable
   public static gcc Z() {
      return az;
   }

   @Nullable
   public static gcc aa() {
      return aA;
   }

   @Nullable
   public static gcc ab() {
      return aB;
   }

   @Nullable
   public static gcc ac() {
      return aC;
   }

   @Nullable
   public static gcc ad() {
      return aD;
   }

   @Nullable
   public static gcc ae() {
      return aE;
   }

   @Nullable
   public static gcc af() {
      return aF;
   }

   @Nullable
   public static gcc ag() {
      return aG;
   }

   @Nullable
   public static gcc ah() {
      return aH;
   }

   @Nullable
   public static gcc ai() {
      return aI;
   }

   @Nullable
   public static gcc aj() {
      return aJ;
   }

   @Nullable
   public static gcc ak() {
      return aK;
   }

   @Nullable
   public static gcc al() {
      return aL;
   }

   @Nullable
   public static gcc am() {
      return aM;
   }

   @Nullable
   public static gcc an() {
      return aN;
   }

   @Nullable
   public static gcc ao() {
      return aO;
   }

   @Nullable
   public static gcc ap() {
      return aP;
   }

   @Nullable
   public static gcc aq() {
      return aQ;
   }

   @Nullable
   public static gcc ar() {
      return aR;
   }

   @Nullable
   public static gcc as() {
      return aS;
   }

   @Nullable
   public static gcc at() {
      return aT;
   }

   @Nullable
   public static gcc au() {
      return aU;
   }

   public static record a(atu a, Map<akh, atp> c) implements atu {
      @Override
      public Optional<atp> getResource(akh $$0) {
         atp $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akh, atp> b() {
         return this.c;
      }
   }
}
