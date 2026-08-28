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

public class gdj implements AutoCloseable {
   private static final alf e = new alf("textures/misc/nausea.png");
   private static final alf f = new alf("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final ffh k;
   private final aup l;
   private final azh m = azh.a();
   private float n;
   public final gdm b;
   private final fgw o;
   private final gdw p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ac.c();
   private final gdp A;
   private final gos B = new gos();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cur G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gdt K;
   @Nullable
   private gdt L;
   private boolean M;
   private final fes N = new fes();
   public gee d;
   private final Map<String, gee> O = Maps.newHashMap();
   @Nullable
   private static gee P;
   @Nullable
   private static gee Q;
   @Nullable
   private static gee R;
   @Nullable
   private static gee S;
   @Nullable
   private static gee T;
   @Nullable
   private static gee U;
   @Nullable
   private static gee V;
   @Nullable
   private static gee W;
   @Nullable
   private static gee X;
   @Nullable
   private static gee Y;
   @Nullable
   private static gee Z;
   @Nullable
   private static gee aa;
   @Nullable
   private static gee ab;
   @Nullable
   private static gee ac;
   @Nullable
   private static gee ad;
   @Nullable
   private static gee ae;
   @Nullable
   private static gee af;
   @Nullable
   private static gee ag;
   @Nullable
   private static gee ah;
   @Nullable
   private static gee ai;
   @Nullable
   private static gee aj;
   @Nullable
   private static gee ak;
   @Nullable
   private static gee al;
   @Nullable
   private static gee am;
   @Nullable
   private static gee an;
   @Nullable
   private static gee ao;
   @Nullable
   private static gee ap;
   @Nullable
   private static gee aq;
   @Nullable
   private static gee ar;
   @Nullable
   private static gee as;
   @Nullable
   private static gee at;
   @Nullable
   private static gee au;
   @Nullable
   private static gee av;
   @Nullable
   private static gee aw;
   @Nullable
   private static gee ax;
   @Nullable
   private static gee ay;
   @Nullable
   private static gee az;
   @Nullable
   private static gee aA;
   @Nullable
   private static gee aB;
   @Nullable
   private static gee aC;
   @Nullable
   private static gee aD;
   @Nullable
   private static gee aE;
   @Nullable
   private static gee aF;
   @Nullable
   private static gee aG;
   @Nullable
   private static gee aH;
   @Nullable
   private static gee aI;
   @Nullable
   private static gee aJ;
   @Nullable
   private static gee aK;
   @Nullable
   private static gee aL;
   @Nullable
   private static gee aM;
   @Nullable
   private static gee aN;
   @Nullable
   private static gee aO;
   @Nullable
   private static gee aP;
   @Nullable
   private static gee aQ;
   @Nullable
   private static gee aR;
   @Nullable
   private static gee aS;
   @Nullable
   private static gee aT;
   @Nullable
   private static gee aU;

   public gdj(ffh $$0, gdm $$1, aup $$2, gdw $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fgw($$0.aa(), $$0.aG());
      this.A = new gdp(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.au();
      if (this.L != null) {
         this.L.close();
      }

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

   public void a(@Nullable bsw $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cjr) {
         this.a(new alf("shaders/post/creeper.json"));
      } else if ($$0 instanceof ckq) {
         this.a(new alf("shaders/post/spider.json"));
      } else if ($$0 instanceof cjv) {
         this.a(new alf("shaders/post/invert.json"));
      }
   }

   private void a(alf $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gdt(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aO().k(), this.k.aO().l());
         this.M = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.M = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.M = false;
      }
   }

   private void b(aus $$0) {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gdt(this.k.aa(), $$0, this.k.h(), f);
         this.L.a(this.k.aO().k(), this.k.aO().l());
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", f, var3);
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", f, var4);
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

   public auj d() {
      return new auu<gdj.a>() {
         protected gdj.a a(aup $$0, bnk $$1) {
            Map<alf, aun> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ezo.a.b.b()) || $$1x.endsWith(ezo.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<alf, aun> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aun($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gdj.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gdj.a($$0, $$3);
         }

         protected void a(gdj.a $$0, aup $$1, bnk $$2) {
            gdj.this.c($$0);
            if (gdj.this.K != null) {
               gdj.this.K.close();
            }

            gdj.this.K = null;
            gdj.this.a(gdj.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aus $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gee($$0, "blit_screen", ezy.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", ezy.n);
         aS = this.a($$0, "rendertype_gui_overlay", ezy.n);
         P = this.a($$0, "position", ezy.m);
         Q = this.a($$0, "position_color", ezy.n);
         R = this.a($$0, "position_color_tex", ezy.r);
         S = this.a($$0, "position_tex", ezy.q);
         T = this.a($$0, "position_tex_color", ezy.s);
         aE = this.a($$0, "rendertype_text", ezy.t);
      }
   }

   private gee a(aus $$0, String $$1, faf $$2) {
      try {
         gee $$3 = new gee($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(aus $$0) {
      RenderSystem.assertOnRenderThread();
      List<ezo> $$1 = Lists.newArrayList();
      $$1.addAll(ezo.a.b.c().values());
      $$1.addAll(ezo.a.a.c().values());
      $$1.forEach(ezo::a);
      List<Pair<gee, Consumer<gee>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gee($$0, "particle", ezy.l), (Consumer<gee>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gee($$0, "position", ezy.m), (Consumer<gee>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_color", ezy.n), (Consumer<gee>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_color_lightmap", ezy.p), (Consumer<gee>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_color_tex", ezy.r), (Consumer<gee>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_color_tex_lightmap", ezy.t), (Consumer<gee>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_tex", ezy.q), (Consumer<gee>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gee($$0, "position_tex_color", ezy.s), (Consumer<gee>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_solid", ezy.j), (Consumer<gee>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_cutout_mipped", ezy.j), (Consumer<gee>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_cutout", ezy.j), (Consumer<gee>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_translucent", ezy.j), (Consumer<gee>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_translucent_moving_block", ezy.j), (Consumer<gee>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_armor_cutout_no_cull", ezy.k), (Consumer<gee>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_solid", ezy.k), (Consumer<gee>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_cutout", ezy.k), (Consumer<gee>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_cutout_no_cull", ezy.k), (Consumer<gee>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_cutout_no_cull_z_offset", ezy.k), (Consumer<gee>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_item_entity_translucent_cull", ezy.k), (Consumer<gee>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_translucent_cull", ezy.k), (Consumer<gee>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_translucent", ezy.k), (Consumer<gee>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_translucent_emissive", ezy.k), (Consumer<gee>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_smooth_cutout", ezy.k), (Consumer<gee>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_beacon_beam", ezy.j), (Consumer<gee>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_decal", ezy.k), (Consumer<gee>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_no_outline", ezy.k), (Consumer<gee>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_shadow", ezy.k), (Consumer<gee>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_alpha", ezy.k), (Consumer<gee>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_eyes", ezy.k), (Consumer<gee>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_energy_swirl", ezy.k), (Consumer<gee>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_leash", ezy.p), (Consumer<gee>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_water_mask", ezy.m), (Consumer<gee>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_outline", ezy.r), (Consumer<gee>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_armor_glint", ezy.q), (Consumer<gee>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_armor_entity_glint", ezy.q), (Consumer<gee>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_glint_translucent", ezy.q), (Consumer<gee>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_glint", ezy.q), (Consumer<gee>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_glint_direct", ezy.q), (Consumer<gee>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_glint", ezy.q), (Consumer<gee>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_entity_glint_direct", ezy.q), (Consumer<gee>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text", ezy.t), (Consumer<gee>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text_background", ezy.p), (Consumer<gee>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text_intensity", ezy.t), (Consumer<gee>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text_see_through", ezy.t), (Consumer<gee>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text_background_see_through", ezy.p), (Consumer<gee>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_text_intensity_see_through", ezy.t), (Consumer<gee>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_lightning", ezy.n), (Consumer<gee>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_tripwire", ezy.j), (Consumer<gee>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_end_portal", ezy.m), (Consumer<gee>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_end_gateway", ezy.m), (Consumer<gee>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_clouds", ezy.v), (Consumer<gee>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_lines", ezy.o), (Consumer<gee>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_crumbling", ezy.j), (Consumer<gee>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_gui", ezy.n), (Consumer<gee>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_gui_overlay", ezy.n), (Consumer<gee>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_gui_text_highlight", ezy.n), (Consumer<gee>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_gui_ghost_recipe_overlay", ezy.n), (Consumer<gee>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gee($$0, "rendertype_breeze_wind", ezy.k), (Consumer<gee>)$$0x -> at = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gee)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.au();
      $$2.forEach($$0x -> {
         gee $$1x = (gee)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void au() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gee::close);
      this.O.clear();
   }

   @Nullable
   public gee a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void e() {
      this.av();
      this.A.a();
      if (this.k.an() == null) {
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
   public gdt f() {
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
      bsw $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gC();
            double $$3 = this.k.s.gD();
            evr $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof evq $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private evr a(bsw $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayz.k($$4);
      evt $$6 = $$0.j($$3);
      evr $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != evr.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      evt $$9 = $$0.f($$3);
      evt $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      evo $$12 = $$0.cK().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      evq $$13 = cnt.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bz(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static evr a(evr $$0, evt $$1, double $$2) {
      evt $$3 = $$0.e();
      if (!$$3.a((js)$$1, $$2)) {
         evt $$4 = $$0.e();
         je $$5 = je.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return evp.a($$4, $$5, iz.a($$4));
      } else {
         return $$0;
      }
   }

   private void av() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gcp $$1) {
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

   private double a(fes $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayz.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof btr && ((btr)$$0.g()).eB()) {
            float $$4 = Math.min((float)((btr)$$0.g()).aQ + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         enz $$5 = $$0.k();
         if ($$5 == enz.a || $$5 == enz.b) {
            $$3 *= ayz.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(faa $$0, float $$1) {
      if (this.k.an() instanceof btr $$2) {
         float $$3 = (float)$$2.aO - $$1;
         if ($$2.eB()) {
            float $$4 = Math.min((float)$$2.aQ + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aP;
         $$3 = ayz.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eJ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(faa $$0, float $$1) {
      if (this.k.an() instanceof cmz) {
         cmz $$2 = (cmz)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayz.i($$1, $$2.ce, $$2.cf);
         $$0.a(ayz.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ayz.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ayz.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayz.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fes $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         faa $$3 = new faa();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof btr && ((btr)this.k.an()).fL();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dbx.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gea.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fai.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aO().k() / (float)this.k.aO().l(), 0.05F, this.g());
   }

   public float g() {
      return this.n * 4.0F;
   }

   public static float a(btr $$0, float $$1) {
      bse $$2 = $$0.c(bsg.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayz.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aB() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.c();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aO().o() / (double)this.k.aO().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aO().p() / (double)this.k.aO().n());
         RenderSystem.viewport(0, 0, this.k.aO().k(), this.k.aO().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().a("level");
            this.a($$0, $$1);
            this.aw();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.h().a(true);
         }

         eze $$7 = this.k.aO();
         RenderSystem.clear(256, ffh.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fai.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eyw.d();
         fgt $$10 = new fgt(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = ayz.i($$3, this.k.s.cI, this.k.s.cH);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bsg.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Y) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, ffh.a);
            this.k.aI().c();
         }

         if (this.k.aL() != null) {
            try {
               this.k.aL().a($$10, $$5, $$6, this.k.au());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aL().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.au());
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
                        this.k.aO().o(),
                        this.k.aO().p(),
                        this.k.aO().k(),
                        this.k.aO().l(),
                        this.k.aO().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.z();
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
            this.k.aI().a("toasts");
            this.k.ax().a($$10);
            this.k.aI().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void aw() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gtg $$1 = this.k.V();
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
         ezb $$1 = ffr.a(this.k.h());
         ac.h().execute(() -> {
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

            try (ezb $$6 = new ezb(64, 64, false)) {
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

   private boolean ax() {
      if (!this.w) {
         return false;
      } else {
         bsw $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cmz && !this.k.m.Y;
         if ($$1 && !((cmz)$$0).gd().e) {
            cur $$2 = ((btr)$$0).eX();
            evr $$3 = this.k.v;
            if ($$3 != null && $$3.c() == evr.a.b) {
               iz $$4 = ((evp)$$3).a();
               dse $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dbx.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dsi $$6 = new dsi(this.k.r, $$4, false);
                  jv<dfb> $$7 = this.k.r.H_().d(lq.f);
                  $$1 = !$$2.e() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.A.a($$0);
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.b($$0);
      this.k.aI().a("center");
      boolean $$2 = this.ax();
      this.k.aI().b("camera");
      fes $$3 = this.N;
      bsw $$4 = (bsw)(this.k.an() == null ? this.k.s : this.k.an());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      faa $$7 = new faa();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = ayz.i($$0, this.k.s.cI, this.k.s.cH) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bsg.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, ayz.g / 2.0F, ayz.g / 2.0F);
         float $$13 = ((float)this.q + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.k.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$1, $$2, $$3, this, this.A, $$14, $$6);
      this.k.aI().b("hand");
      if (this.v) {
         RenderSystem.clear(256, ffh.a);
         this.a($$3, $$0, $$14);
      }

      this.k.aI().c();
   }

   public void h() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fgw i() {
      return this.o;
   }

   public void a(cur $$0) {
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
         faa $$11 = new faa();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ayz.e(ayz.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ayz.e(ayz.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ayz.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ayz.e(ayz.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ayz.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ayz.b($$4 * 8.0F)));
         gdq.a $$13 = this.p.c();
         this.k.ar().a(this.G, cuo.i, 15728880, gos.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fgt $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayz.i($$1, 2.0F, 1.0F);
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

   public ffh j() {
      return this.k;
   }

   public float c(float $$0) {
      return ayz.i($$0, this.u, this.t);
   }

   public float k() {
      return this.n;
   }

   public fes l() {
      return this.N;
   }

   public gdp m() {
      return this.A;
   }

   public gos n() {
      return this.B;
   }

   @Nullable
   public static gee o() {
      return P;
   }

   @Nullable
   public static gee p() {
      return Q;
   }

   @Nullable
   public static gee q() {
      return R;
   }

   @Nullable
   public static gee r() {
      return S;
   }

   @Nullable
   public static gee s() {
      return T;
   }

   @Nullable
   public static gee t() {
      return U;
   }

   @Nullable
   public static gee u() {
      return V;
   }

   @Nullable
   public static gee v() {
      return W;
   }

   @Nullable
   public static gee w() {
      return X;
   }

   @Nullable
   public static gee x() {
      return Y;
   }

   @Nullable
   public static gee y() {
      return Z;
   }

   @Nullable
   public static gee z() {
      return aa;
   }

   @Nullable
   public static gee A() {
      return ab;
   }

   @Nullable
   public static gee B() {
      return ac;
   }

   @Nullable
   public static gee C() {
      return ad;
   }

   @Nullable
   public static gee D() {
      return ae;
   }

   @Nullable
   public static gee E() {
      return af;
   }

   @Nullable
   public static gee F() {
      return ag;
   }

   @Nullable
   public static gee G() {
      return ah;
   }

   @Nullable
   public static gee H() {
      return ai;
   }

   @Nullable
   public static gee I() {
      return aj;
   }

   @Nullable
   public static gee J() {
      return ak;
   }

   @Nullable
   public static gee K() {
      return al;
   }

   @Nullable
   public static gee L() {
      return am;
   }

   @Nullable
   public static gee M() {
      return an;
   }

   @Nullable
   public static gee N() {
      return ao;
   }

   @Nullable
   public static gee O() {
      return ap;
   }

   @Nullable
   public static gee P() {
      return aq;
   }

   @Nullable
   public static gee Q() {
      return ar;
   }

   @Nullable
   public static gee R() {
      return as;
   }

   @Nullable
   public static gee S() {
      return at;
   }

   @Nullable
   public static gee T() {
      return au;
   }

   @Nullable
   public static gee U() {
      return av;
   }

   @Nullable
   public static gee V() {
      return aw;
   }

   @Nullable
   public static gee W() {
      return ax;
   }

   @Nullable
   public static gee X() {
      return ay;
   }

   @Nullable
   public static gee Y() {
      return az;
   }

   @Nullable
   public static gee Z() {
      return aA;
   }

   @Nullable
   public static gee aa() {
      return aB;
   }

   @Nullable
   public static gee ab() {
      return aC;
   }

   @Nullable
   public static gee ac() {
      return aD;
   }

   @Nullable
   public static gee ad() {
      return aE;
   }

   @Nullable
   public static gee ae() {
      return aF;
   }

   @Nullable
   public static gee af() {
      return aG;
   }

   @Nullable
   public static gee ag() {
      return aH;
   }

   @Nullable
   public static gee ah() {
      return aI;
   }

   @Nullable
   public static gee ai() {
      return aJ;
   }

   @Nullable
   public static gee aj() {
      return aK;
   }

   @Nullable
   public static gee ak() {
      return aL;
   }

   @Nullable
   public static gee al() {
      return aM;
   }

   @Nullable
   public static gee am() {
      return aN;
   }

   @Nullable
   public static gee an() {
      return aO;
   }

   @Nullable
   public static gee ao() {
      return aP;
   }

   @Nullable
   public static gee ap() {
      return aQ;
   }

   @Nullable
   public static gee aq() {
      return aR;
   }

   @Nullable
   public static gee ar() {
      return aS;
   }

   @Nullable
   public static gee as() {
      return aT;
   }

   @Nullable
   public static gee at() {
      return aU;
   }

   public static record a(aus a, Map<alf, aun> c) implements aus {
      @Override
      public Optional<aun> getResource(alf $$0) {
         aun $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<alf, aun> b() {
         return this.c;
      }
   }
}
