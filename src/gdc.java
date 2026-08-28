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

public class gdc implements AutoCloseable {
   private static final alb e = new alb("textures/misc/nausea.png");
   private static final alb f = new alb("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final ffa k;
   private final aul l;
   private final azc m = azc.a();
   private float n;
   public final gdf b;
   private final fgp o;
   private final gdp p;
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
   private final gdi A;
   private final gol B = new gol();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cuk G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gdm K;
   @Nullable
   private gdm L;
   private boolean M;
   private final fel N = new fel();
   public gdx d;
   private final Map<String, gdx> O = Maps.newHashMap();
   @Nullable
   private static gdx P;
   @Nullable
   private static gdx Q;
   @Nullable
   private static gdx R;
   @Nullable
   private static gdx S;
   @Nullable
   private static gdx T;
   @Nullable
   private static gdx U;
   @Nullable
   private static gdx V;
   @Nullable
   private static gdx W;
   @Nullable
   private static gdx X;
   @Nullable
   private static gdx Y;
   @Nullable
   private static gdx Z;
   @Nullable
   private static gdx aa;
   @Nullable
   private static gdx ab;
   @Nullable
   private static gdx ac;
   @Nullable
   private static gdx ad;
   @Nullable
   private static gdx ae;
   @Nullable
   private static gdx af;
   @Nullable
   private static gdx ag;
   @Nullable
   private static gdx ah;
   @Nullable
   private static gdx ai;
   @Nullable
   private static gdx aj;
   @Nullable
   private static gdx ak;
   @Nullable
   private static gdx al;
   @Nullable
   private static gdx am;
   @Nullable
   private static gdx an;
   @Nullable
   private static gdx ao;
   @Nullable
   private static gdx ap;
   @Nullable
   private static gdx aq;
   @Nullable
   private static gdx ar;
   @Nullable
   private static gdx as;
   @Nullable
   private static gdx at;
   @Nullable
   private static gdx au;
   @Nullable
   private static gdx av;
   @Nullable
   private static gdx aw;
   @Nullable
   private static gdx ax;
   @Nullable
   private static gdx ay;
   @Nullable
   private static gdx az;
   @Nullable
   private static gdx aA;
   @Nullable
   private static gdx aB;
   @Nullable
   private static gdx aC;
   @Nullable
   private static gdx aD;
   @Nullable
   private static gdx aE;
   @Nullable
   private static gdx aF;
   @Nullable
   private static gdx aG;
   @Nullable
   private static gdx aH;
   @Nullable
   private static gdx aI;
   @Nullable
   private static gdx aJ;
   @Nullable
   private static gdx aK;
   @Nullable
   private static gdx aL;
   @Nullable
   private static gdx aM;
   @Nullable
   private static gdx aN;
   @Nullable
   private static gdx aO;
   @Nullable
   private static gdx aP;
   @Nullable
   private static gdx aQ;
   @Nullable
   private static gdx aR;
   @Nullable
   private static gdx aS;
   @Nullable
   private static gdx aT;
   @Nullable
   private static gdx aU;

   public gdc(ffa $$0, gdf $$1, aul $$2, gdp $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fgp($$0.aa(), $$0.aG());
      this.A = new gdi(this, $$0);
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

   public void a(@Nullable bsp $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cjk) {
         this.a(new alb("shaders/post/creeper.json"));
      } else if ($$0 instanceof ckj) {
         this.a(new alb("shaders/post/spider.json"));
      } else if ($$0 instanceof cjo) {
         this.a(new alb("shaders/post/invert.json"));
      }
   }

   private void a(alb $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gdm(this.k.aa(), this.l, this.k.h(), $$0);
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

   public void d() {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gdm(this.k.aa(), this.l, this.k.h(), f);
         this.L.a(this.k.aO().k(), this.k.aO().l());
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

   public auf e() {
      return new auq<gdc.a>() {
         protected gdc.a a(aul $$0, bnd $$1) {
            Map<alb, auj> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ezh.a.b.b()) || $$1x.endsWith(ezh.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<alb, auj> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new auj($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gdc.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gdc.a($$0, $$3);
         }

         protected void a(gdc.a $$0, aul $$1, bnd $$2) {
            gdc.this.b($$0);
            if (gdc.this.K != null) {
               gdc.this.K.close();
            }

            gdc.this.K = null;
            gdc.this.a(gdc.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(auo $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gdx($$0, "blit_screen", ezr.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", ezr.n);
         aS = this.a($$0, "rendertype_gui_overlay", ezr.n);
         P = this.a($$0, "position", ezr.m);
         Q = this.a($$0, "position_color", ezr.n);
         R = this.a($$0, "position_color_tex", ezr.r);
         S = this.a($$0, "position_tex", ezr.q);
         T = this.a($$0, "position_tex_color", ezr.s);
         aE = this.a($$0, "rendertype_text", ezr.t);
      }
   }

   private gdx a(auo $$0, String $$1, ezy $$2) {
      try {
         gdx $$3 = new gdx($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(auo $$0) {
      RenderSystem.assertOnRenderThread();
      List<ezh> $$1 = Lists.newArrayList();
      $$1.addAll(ezh.a.b.c().values());
      $$1.addAll(ezh.a.a.c().values());
      $$1.forEach(ezh::a);
      List<Pair<gdx, Consumer<gdx>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gdx($$0, "particle", ezr.l), (Consumer<gdx>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position", ezr.m), (Consumer<gdx>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_color", ezr.n), (Consumer<gdx>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_color_lightmap", ezr.p), (Consumer<gdx>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_color_tex", ezr.r), (Consumer<gdx>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_color_tex_lightmap", ezr.t), (Consumer<gdx>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_tex", ezr.q), (Consumer<gdx>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gdx($$0, "position_tex_color", ezr.s), (Consumer<gdx>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_solid", ezr.j), (Consumer<gdx>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_cutout_mipped", ezr.j), (Consumer<gdx>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_cutout", ezr.j), (Consumer<gdx>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_translucent", ezr.j), (Consumer<gdx>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_translucent_moving_block", ezr.j), (Consumer<gdx>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_armor_cutout_no_cull", ezr.k), (Consumer<gdx>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_solid", ezr.k), (Consumer<gdx>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_cutout", ezr.k), (Consumer<gdx>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_cutout_no_cull", ezr.k), (Consumer<gdx>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_cutout_no_cull_z_offset", ezr.k), (Consumer<gdx>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_item_entity_translucent_cull", ezr.k), (Consumer<gdx>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_translucent_cull", ezr.k), (Consumer<gdx>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_translucent", ezr.k), (Consumer<gdx>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_translucent_emissive", ezr.k), (Consumer<gdx>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_smooth_cutout", ezr.k), (Consumer<gdx>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_beacon_beam", ezr.j), (Consumer<gdx>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_decal", ezr.k), (Consumer<gdx>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_no_outline", ezr.k), (Consumer<gdx>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_shadow", ezr.k), (Consumer<gdx>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_alpha", ezr.k), (Consumer<gdx>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_eyes", ezr.k), (Consumer<gdx>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_energy_swirl", ezr.k), (Consumer<gdx>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_leash", ezr.p), (Consumer<gdx>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_water_mask", ezr.m), (Consumer<gdx>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_outline", ezr.r), (Consumer<gdx>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_armor_glint", ezr.q), (Consumer<gdx>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_armor_entity_glint", ezr.q), (Consumer<gdx>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_glint_translucent", ezr.q), (Consumer<gdx>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_glint", ezr.q), (Consumer<gdx>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_glint_direct", ezr.q), (Consumer<gdx>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_glint", ezr.q), (Consumer<gdx>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_entity_glint_direct", ezr.q), (Consumer<gdx>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text", ezr.t), (Consumer<gdx>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text_background", ezr.p), (Consumer<gdx>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text_intensity", ezr.t), (Consumer<gdx>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text_see_through", ezr.t), (Consumer<gdx>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text_background_see_through", ezr.p), (Consumer<gdx>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_text_intensity_see_through", ezr.t), (Consumer<gdx>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_lightning", ezr.n), (Consumer<gdx>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_tripwire", ezr.j), (Consumer<gdx>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_end_portal", ezr.m), (Consumer<gdx>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_end_gateway", ezr.m), (Consumer<gdx>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_clouds", ezr.v), (Consumer<gdx>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_lines", ezr.o), (Consumer<gdx>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_crumbling", ezr.j), (Consumer<gdx>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_gui", ezr.n), (Consumer<gdx>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_gui_overlay", ezr.n), (Consumer<gdx>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_gui_text_highlight", ezr.n), (Consumer<gdx>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_gui_ghost_recipe_overlay", ezr.n), (Consumer<gdx>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gdx($$0, "rendertype_breeze_wind", ezr.k), (Consumer<gdx>)$$0x -> at = $$0x));
         this.d();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gdx)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         gdx $$1x = (gdx)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gdx::close);
      this.O.clear();
   }

   @Nullable
   public gdx a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.aw();
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
   public gdm g() {
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
      bsp $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gC();
            double $$3 = this.k.s.gD();
            evk $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof evj $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private evk a(bsp $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayu.k($$4);
      evm $$6 = $$0.j($$3);
      evk $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != evk.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      evm $$9 = $$0.f($$3);
      evm $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      evh $$12 = $$0.cK().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      evj $$13 = cnm.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bz(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static evk a(evk $$0, evm $$1, double $$2) {
      evm $$3 = $$0.e();
      if (!$$3.a((js)$$1, $$2)) {
         evm $$4 = $$0.e();
         je $$5 = je.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return evi.a($$4, $$5, iz.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gci $$1) {
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

   private double a(fel $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayu.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof btk && ((btk)$$0.g()).eB()) {
            float $$4 = Math.min((float)((btk)$$0.g()).aQ + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ens $$5 = $$0.k();
         if ($$5 == ens.a || $$5 == ens.b) {
            $$3 *= ayu.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(ezt $$0, float $$1) {
      if (this.k.an() instanceof btk $$2) {
         float $$3 = (float)$$2.aO - $$1;
         if ($$2.eB()) {
            float $$4 = Math.min((float)$$2.aQ + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aP;
         $$3 = ayu.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eJ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(ezt $$0, float $$1) {
      if (this.k.an() instanceof cms) {
         cms $$2 = (cms)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayu.i($$1, $$2.ce, $$2.cf);
         $$0.a(ayu.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ayu.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ayu.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayu.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fel $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         ezt $$3 = new ezt();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof btk && ((btk)this.k.an()).fL();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dbq.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gdt.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fab.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aO().k() / (float)this.k.aO().l(), 0.05F, this.h());
   }

   public float h() {
      return this.n * 4.0F;
   }

   public static float a(btk $$0, float $$1) {
      brx $$2 = $$0.c(brz.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayu.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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

         eyx $$7 = this.k.aO();
         RenderSystem.clear(256, ffa.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fab.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eyp.d();
         fgm $$10 = new fgm(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = ayu.i($$3, this.k.s.cI, this.k.s.cH);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(brz.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Y) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, ffa.a);
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
            this.k.aI().a("toasts");
            this.k.ax().a($$10);
            this.k.aI().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gsz $$1 = this.k.V();
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
         eyu $$1 = ffk.a(this.k.h());
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

            try (eyu $$6 = new eyu(64, 64, false)) {
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
         bsp $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cms && !this.k.m.Y;
         if ($$1 && !((cms)$$0).gd().e) {
            cuk $$2 = ((btk)$$0).eX();
            evk $$3 = this.k.v;
            if ($$3 != null && $$3.c() == evk.a.b) {
               iz $$4 = ((evi)$$3).a();
               drx $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dbq.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dsb $$6 = new dsb(this.k.r, $$4, false);
                  jv<deu> $$7 = this.k.r.H_().d(lq.f);
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
      boolean $$2 = this.ay();
      this.k.aI().b("camera");
      fel $$3 = this.N;
      bsp $$4 = (bsp)(this.k.an() == null ? this.k.s : this.k.an());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      ezt $$7 = new ezt();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = ayu.i($$0, this.k.s.cI, this.k.s.cH) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(brz.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, ayu.g / 2.0F, ayu.g / 2.0F);
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
         RenderSystem.clear(256, ffa.a);
         this.a($$3, $$0, $$14);
      }

      this.k.aI().c();
   }

   public void i() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fgp j() {
      return this.o;
   }

   public void a(cuk $$0) {
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
         ezt $$11 = new ezt();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ayu.e(ayu.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ayu.e(ayu.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ayu.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ayu.e(ayu.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ayu.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ayu.b($$4 * 8.0F)));
         gdj.a $$13 = this.p.c();
         this.k.ar().a(this.G, cuh.i, 15728880, gol.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fgm $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayu.i($$1, 2.0F, 1.0F);
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

   public ffa k() {
      return this.k;
   }

   public float c(float $$0) {
      return ayu.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public fel m() {
      return this.N;
   }

   public gdi n() {
      return this.A;
   }

   public gol o() {
      return this.B;
   }

   @Nullable
   public static gdx p() {
      return P;
   }

   @Nullable
   public static gdx q() {
      return Q;
   }

   @Nullable
   public static gdx r() {
      return R;
   }

   @Nullable
   public static gdx s() {
      return S;
   }

   @Nullable
   public static gdx t() {
      return T;
   }

   @Nullable
   public static gdx u() {
      return U;
   }

   @Nullable
   public static gdx v() {
      return V;
   }

   @Nullable
   public static gdx w() {
      return W;
   }

   @Nullable
   public static gdx x() {
      return X;
   }

   @Nullable
   public static gdx y() {
      return Y;
   }

   @Nullable
   public static gdx z() {
      return Z;
   }

   @Nullable
   public static gdx A() {
      return aa;
   }

   @Nullable
   public static gdx B() {
      return ab;
   }

   @Nullable
   public static gdx C() {
      return ac;
   }

   @Nullable
   public static gdx D() {
      return ad;
   }

   @Nullable
   public static gdx E() {
      return ae;
   }

   @Nullable
   public static gdx F() {
      return af;
   }

   @Nullable
   public static gdx G() {
      return ag;
   }

   @Nullable
   public static gdx H() {
      return ah;
   }

   @Nullable
   public static gdx I() {
      return ai;
   }

   @Nullable
   public static gdx J() {
      return aj;
   }

   @Nullable
   public static gdx K() {
      return ak;
   }

   @Nullable
   public static gdx L() {
      return al;
   }

   @Nullable
   public static gdx M() {
      return am;
   }

   @Nullable
   public static gdx N() {
      return an;
   }

   @Nullable
   public static gdx O() {
      return ao;
   }

   @Nullable
   public static gdx P() {
      return ap;
   }

   @Nullable
   public static gdx Q() {
      return aq;
   }

   @Nullable
   public static gdx R() {
      return ar;
   }

   @Nullable
   public static gdx S() {
      return as;
   }

   @Nullable
   public static gdx T() {
      return at;
   }

   @Nullable
   public static gdx U() {
      return au;
   }

   @Nullable
   public static gdx V() {
      return av;
   }

   @Nullable
   public static gdx W() {
      return aw;
   }

   @Nullable
   public static gdx X() {
      return ax;
   }

   @Nullable
   public static gdx Y() {
      return ay;
   }

   @Nullable
   public static gdx Z() {
      return az;
   }

   @Nullable
   public static gdx aa() {
      return aA;
   }

   @Nullable
   public static gdx ab() {
      return aB;
   }

   @Nullable
   public static gdx ac() {
      return aC;
   }

   @Nullable
   public static gdx ad() {
      return aD;
   }

   @Nullable
   public static gdx ae() {
      return aE;
   }

   @Nullable
   public static gdx af() {
      return aF;
   }

   @Nullable
   public static gdx ag() {
      return aG;
   }

   @Nullable
   public static gdx ah() {
      return aH;
   }

   @Nullable
   public static gdx ai() {
      return aI;
   }

   @Nullable
   public static gdx aj() {
      return aJ;
   }

   @Nullable
   public static gdx ak() {
      return aK;
   }

   @Nullable
   public static gdx al() {
      return aL;
   }

   @Nullable
   public static gdx am() {
      return aM;
   }

   @Nullable
   public static gdx an() {
      return aN;
   }

   @Nullable
   public static gdx ao() {
      return aO;
   }

   @Nullable
   public static gdx ap() {
      return aP;
   }

   @Nullable
   public static gdx aq() {
      return aQ;
   }

   @Nullable
   public static gdx ar() {
      return aR;
   }

   @Nullable
   public static gdx as() {
      return aS;
   }

   @Nullable
   public static gdx at() {
      return aT;
   }

   @Nullable
   public static gdx au() {
      return aU;
   }

   public static record a(auo a, Map<alb, auj> c) implements auo {
      @Override
      public Optional<auj> getResource(alb $$0) {
         auj $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<alb, auj> b() {
         return this.c;
      }
   }
}
