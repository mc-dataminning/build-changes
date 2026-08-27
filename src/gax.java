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

public class gax implements AutoCloseable {
   private static final akf e = new akf("textures/misc/nausea.png");
   private static final akf f = new akf("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fcu k;
   private final ato l;
   private final ayd m = ayd.a();
   private float n;
   public final gba b;
   private final fek o;
   private final gbk p;
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
   private final gbd A;
   private final gmf B = new gmf();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private csd G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gbh K;
   @Nullable
   private gbh L;
   private boolean M;
   private final fcf N = new fcf();
   public gbs d;
   private final Map<String, gbs> O = Maps.newHashMap();
   @Nullable
   private static gbs P;
   @Nullable
   private static gbs Q;
   @Nullable
   private static gbs R;
   @Nullable
   private static gbs S;
   @Nullable
   private static gbs T;
   @Nullable
   private static gbs U;
   @Nullable
   private static gbs V;
   @Nullable
   private static gbs W;
   @Nullable
   private static gbs X;
   @Nullable
   private static gbs Y;
   @Nullable
   private static gbs Z;
   @Nullable
   private static gbs aa;
   @Nullable
   private static gbs ab;
   @Nullable
   private static gbs ac;
   @Nullable
   private static gbs ad;
   @Nullable
   private static gbs ae;
   @Nullable
   private static gbs af;
   @Nullable
   private static gbs ag;
   @Nullable
   private static gbs ah;
   @Nullable
   private static gbs ai;
   @Nullable
   private static gbs aj;
   @Nullable
   private static gbs ak;
   @Nullable
   private static gbs al;
   @Nullable
   private static gbs am;
   @Nullable
   private static gbs an;
   @Nullable
   private static gbs ao;
   @Nullable
   private static gbs ap;
   @Nullable
   private static gbs aq;
   @Nullable
   private static gbs ar;
   @Nullable
   private static gbs as;
   @Nullable
   private static gbs at;
   @Nullable
   private static gbs au;
   @Nullable
   private static gbs av;
   @Nullable
   private static gbs aw;
   @Nullable
   private static gbs ax;
   @Nullable
   private static gbs ay;
   @Nullable
   private static gbs az;
   @Nullable
   private static gbs aA;
   @Nullable
   private static gbs aB;
   @Nullable
   private static gbs aC;
   @Nullable
   private static gbs aD;
   @Nullable
   private static gbs aE;
   @Nullable
   private static gbs aF;
   @Nullable
   private static gbs aG;
   @Nullable
   private static gbs aH;
   @Nullable
   private static gbs aI;
   @Nullable
   private static gbs aJ;
   @Nullable
   private static gbs aK;
   @Nullable
   private static gbs aL;
   @Nullable
   private static gbs aM;
   @Nullable
   private static gbs aN;
   @Nullable
   private static gbs aO;
   @Nullable
   private static gbs aP;
   @Nullable
   private static gbs aQ;
   @Nullable
   private static gbs aR;
   @Nullable
   private static gbs aS;
   @Nullable
   private static gbs aT;
   @Nullable
   private static gbs aU;

   public gax(fcu $$0, gba $$1, ato $$2, gbk $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fek($$0.aa());
      this.A = new gbd(this, $$0);
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

   public void a(@Nullable bql $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof chd) {
         this.a(new akf("shaders/post/creeper.json"));
      } else if ($$0 instanceof cic) {
         this.a(new akf("shaders/post/spider.json"));
      } else if ($$0 instanceof chh) {
         this.a(new akf("shaders/post/invert.json"));
      }
   }

   private void a(akf $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gbh(this.k.aa(), this.l, this.k.h(), $$0);
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
         this.L = new gbh(this.k.aa(), this.l, this.k.h(), f);
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

   public ati e() {
      return new att<gax.a>() {
         protected gax.a a(ato $$0, ble $$1) {
            Map<akf, atm> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(exb.a.b.b()) || $$1x.endsWith(exb.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akf, atm> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atm($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gax.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gax.a($$0, $$3);
         }

         protected void a(gax.a $$0, ato $$1, ble $$2) {
            gax.this.b($$0);
            if (gax.this.K != null) {
               gax.this.K.close();
            }

            gax.this.K = null;
            gax.this.a(gax.this.k.ao());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atr $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gbs($$0, "blit_screen", exl.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", exl.n);
         aS = this.a($$0, "rendertype_gui_overlay", exl.n);
         P = this.a($$0, "position", exl.m);
         Q = this.a($$0, "position_color", exl.n);
         R = this.a($$0, "position_color_tex", exl.r);
         S = this.a($$0, "position_tex", exl.q);
         T = this.a($$0, "position_tex_color", exl.s);
         aE = this.a($$0, "rendertype_text", exl.t);
      }
   }

   private gbs a(atr $$0, String $$1, exs $$2) {
      try {
         gbs $$3 = new gbs($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(atr $$0) {
      RenderSystem.assertOnRenderThread();
      List<exb> $$1 = Lists.newArrayList();
      $$1.addAll(exb.a.b.c().values());
      $$1.addAll(exb.a.a.c().values());
      $$1.forEach(exb::a);
      List<Pair<gbs, Consumer<gbs>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gbs($$0, "particle", exl.l), (Consumer<gbs>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position", exl.m), (Consumer<gbs>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_color", exl.n), (Consumer<gbs>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_color_lightmap", exl.p), (Consumer<gbs>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_color_tex", exl.r), (Consumer<gbs>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_color_tex_lightmap", exl.t), (Consumer<gbs>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_tex", exl.q), (Consumer<gbs>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gbs($$0, "position_tex_color", exl.s), (Consumer<gbs>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_solid", exl.j), (Consumer<gbs>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_cutout_mipped", exl.j), (Consumer<gbs>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_cutout", exl.j), (Consumer<gbs>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_translucent", exl.j), (Consumer<gbs>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_translucent_moving_block", exl.j), (Consumer<gbs>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_armor_cutout_no_cull", exl.k), (Consumer<gbs>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_solid", exl.k), (Consumer<gbs>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_cutout", exl.k), (Consumer<gbs>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_cutout_no_cull", exl.k), (Consumer<gbs>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_cutout_no_cull_z_offset", exl.k), (Consumer<gbs>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_item_entity_translucent_cull", exl.k), (Consumer<gbs>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_translucent_cull", exl.k), (Consumer<gbs>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_translucent", exl.k), (Consumer<gbs>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_translucent_emissive", exl.k), (Consumer<gbs>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_smooth_cutout", exl.k), (Consumer<gbs>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_beacon_beam", exl.j), (Consumer<gbs>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_decal", exl.k), (Consumer<gbs>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_no_outline", exl.k), (Consumer<gbs>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_shadow", exl.k), (Consumer<gbs>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_alpha", exl.k), (Consumer<gbs>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_eyes", exl.k), (Consumer<gbs>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_energy_swirl", exl.k), (Consumer<gbs>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_leash", exl.p), (Consumer<gbs>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_water_mask", exl.m), (Consumer<gbs>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_outline", exl.r), (Consumer<gbs>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_armor_glint", exl.q), (Consumer<gbs>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_armor_entity_glint", exl.q), (Consumer<gbs>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_glint_translucent", exl.q), (Consumer<gbs>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_glint", exl.q), (Consumer<gbs>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_glint_direct", exl.q), (Consumer<gbs>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_glint", exl.q), (Consumer<gbs>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_entity_glint_direct", exl.q), (Consumer<gbs>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text", exl.t), (Consumer<gbs>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text_background", exl.p), (Consumer<gbs>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text_intensity", exl.t), (Consumer<gbs>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text_see_through", exl.t), (Consumer<gbs>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text_background_see_through", exl.p), (Consumer<gbs>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_text_intensity_see_through", exl.t), (Consumer<gbs>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_lightning", exl.n), (Consumer<gbs>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_tripwire", exl.j), (Consumer<gbs>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_end_portal", exl.m), (Consumer<gbs>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_end_gateway", exl.m), (Consumer<gbs>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_clouds", exl.v), (Consumer<gbs>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_lines", exl.o), (Consumer<gbs>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_crumbling", exl.j), (Consumer<gbs>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_gui", exl.n), (Consumer<gbs>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_gui_overlay", exl.n), (Consumer<gbs>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_gui_text_highlight", exl.n), (Consumer<gbs>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_gui_ghost_recipe_overlay", exl.n), (Consumer<gbs>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gbs($$0, "rendertype_breeze_wind", exl.k), (Consumer<gbs>)$$0x -> at = $$0x));
         this.d();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gbs)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         gbs $$1x = (gbs)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gbs::close);
      this.O.clear();
   }

   @Nullable
   public gbs a(@Nullable String $$0) {
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
   public gbh g() {
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
      bql $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gA();
            double $$3 = this.k.s.gB();
            etd $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof etc $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private etd a(bql $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = axw.k($$4);
      etf $$6 = $$0.j($$3);
      etd $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != etd.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      etf $$9 = $$0.f($$3);
      etf $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      eta $$12 = $$0.cI().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      etc $$13 = clf.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bx(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static etd a(etd $$0, etf $$1, double $$2) {
      etf $$3 = $$0.e();
      if (!$$3.a((jf)$$1, $$2)) {
         etf $$4 = $$0.e();
         ir $$5 = ir.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return etb.a($$4, $$5, im.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof gad $$1) {
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

   private double a(fcf $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)axw.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bre && ((bre)$$0.g()).ez()) {
            float $$4 = Math.min((float)((bre)$$0.g()).aR + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         elt $$5 = $$0.k();
         if ($$5 == elt.a || $$5 == elt.b) {
            $$3 *= axw.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(exn $$0, float $$1) {
      if (this.k.ao() instanceof bre $$2) {
         float $$3 = (float)$$2.aP - $$1;
         if ($$2.ez()) {
            float $$4 = Math.min((float)$$2.aR + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aQ;
         $$3 = axw.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eH();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(exn $$0, float $$1) {
      if (this.k.ao() instanceof ckl) {
         ckl $$2 = (ckl)this.k.ao();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = axw.i($$1, $$2.cf, $$2.cg);
         $$0.a(axw.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(axw.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(axw.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(axw.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fcf $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         exn $$3 = new exn();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.ao() instanceof bre && ((bre)this.k.ao()).fJ();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Z && this.k.q.j() != czr.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gbo.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, exv.a);
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

   public static float a(bre $$0, float $$1) {
      bpx $$2 = $$0.c(bpz.p);
      return !$$2.a(200) ? 1.0F : 0.7F + axw.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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

         ewr $$7 = this.k.aO();
         RenderSystem.clear(256, fcu.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, exv.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ewj.d();
         feh $$10 = new feh(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = axw.i($$3, this.k.s.cG, this.k.s.cF);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bpz.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fcu.a);
            this.k.aI().c();
         }

         if (this.k.aL() != null) {
            try {
               this.k.aL().a($$10, $$5, $$6, this.k.av());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aL().getClass().getCanonicalName());
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
            this.k.aA().a($$10);
            this.k.aI().c();
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
            gqs $$1 = this.k.V();
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
         ewo $$1 = fdf.a(this.k.h());
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

            try (ewo $$6 = new ewo(64, 64, false)) {
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
         bql $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof ckl && !this.k.m.Z;
         if ($$1 && !((ckl)$$0).gb().e) {
            csd $$2 = ((bre)$$0).eV();
            etd $$3 = this.k.v;
            if ($$3 != null && $$3.c() == etd.a.b) {
               im $$4 = ((etb)$$3).a();
               dpy $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == czr.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dqc $$6 = new dqc(this.k.r, $$4, false);
                  ji<dcv> $$7 = this.k.r.H_().d(ld.f);
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
      this.k.aI().a("center");
      boolean $$2 = this.ay();
      this.k.aI().b("camera");
      fcf $$3 = this.N;
      bql $$4 = (bql)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      exn $$7 = new exn();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = axw.i($$0, this.k.s.cG, this.k.s.cF) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bpz.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, axw.g / 2.0F, axw.g / 2.0F);
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
         RenderSystem.clear(256, fcu.a);
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

   public fek j() {
      return this.o;
   }

   public void a(csd $$0) {
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
         exn $$11 = new exn();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * axw.e(axw.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * axw.e(axw.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * axw.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * axw.e(axw.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * axw.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * axw.b($$4 * 8.0F)));
         gbe.a $$13 = this.p.c();
         this.k.as().a(this.G, csa.i, 15728880, gmf.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(feh $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = axw.i($$1, 2.0F, 1.0F);
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

   public fcu k() {
      return this.k;
   }

   public float c(float $$0) {
      return axw.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public fcf m() {
      return this.N;
   }

   public gbd n() {
      return this.A;
   }

   public gmf o() {
      return this.B;
   }

   @Nullable
   public static gbs p() {
      return P;
   }

   @Nullable
   public static gbs q() {
      return Q;
   }

   @Nullable
   public static gbs r() {
      return R;
   }

   @Nullable
   public static gbs s() {
      return S;
   }

   @Nullable
   public static gbs t() {
      return T;
   }

   @Nullable
   public static gbs u() {
      return U;
   }

   @Nullable
   public static gbs v() {
      return V;
   }

   @Nullable
   public static gbs w() {
      return W;
   }

   @Nullable
   public static gbs x() {
      return X;
   }

   @Nullable
   public static gbs y() {
      return Y;
   }

   @Nullable
   public static gbs z() {
      return Z;
   }

   @Nullable
   public static gbs A() {
      return aa;
   }

   @Nullable
   public static gbs B() {
      return ab;
   }

   @Nullable
   public static gbs C() {
      return ac;
   }

   @Nullable
   public static gbs D() {
      return ad;
   }

   @Nullable
   public static gbs E() {
      return ae;
   }

   @Nullable
   public static gbs F() {
      return af;
   }

   @Nullable
   public static gbs G() {
      return ag;
   }

   @Nullable
   public static gbs H() {
      return ah;
   }

   @Nullable
   public static gbs I() {
      return ai;
   }

   @Nullable
   public static gbs J() {
      return aj;
   }

   @Nullable
   public static gbs K() {
      return ak;
   }

   @Nullable
   public static gbs L() {
      return al;
   }

   @Nullable
   public static gbs M() {
      return am;
   }

   @Nullable
   public static gbs N() {
      return an;
   }

   @Nullable
   public static gbs O() {
      return ao;
   }

   @Nullable
   public static gbs P() {
      return ap;
   }

   @Nullable
   public static gbs Q() {
      return aq;
   }

   @Nullable
   public static gbs R() {
      return ar;
   }

   @Nullable
   public static gbs S() {
      return as;
   }

   @Nullable
   public static gbs T() {
      return at;
   }

   @Nullable
   public static gbs U() {
      return au;
   }

   @Nullable
   public static gbs V() {
      return av;
   }

   @Nullable
   public static gbs W() {
      return aw;
   }

   @Nullable
   public static gbs X() {
      return ax;
   }

   @Nullable
   public static gbs Y() {
      return ay;
   }

   @Nullable
   public static gbs Z() {
      return az;
   }

   @Nullable
   public static gbs aa() {
      return aA;
   }

   @Nullable
   public static gbs ab() {
      return aB;
   }

   @Nullable
   public static gbs ac() {
      return aC;
   }

   @Nullable
   public static gbs ad() {
      return aD;
   }

   @Nullable
   public static gbs ae() {
      return aE;
   }

   @Nullable
   public static gbs af() {
      return aF;
   }

   @Nullable
   public static gbs ag() {
      return aG;
   }

   @Nullable
   public static gbs ah() {
      return aH;
   }

   @Nullable
   public static gbs ai() {
      return aI;
   }

   @Nullable
   public static gbs aj() {
      return aJ;
   }

   @Nullable
   public static gbs ak() {
      return aK;
   }

   @Nullable
   public static gbs al() {
      return aL;
   }

   @Nullable
   public static gbs am() {
      return aM;
   }

   @Nullable
   public static gbs an() {
      return aN;
   }

   @Nullable
   public static gbs ao() {
      return aO;
   }

   @Nullable
   public static gbs ap() {
      return aP;
   }

   @Nullable
   public static gbs aq() {
      return aQ;
   }

   @Nullable
   public static gbs ar() {
      return aR;
   }

   @Nullable
   public static gbs as() {
      return aS;
   }

   @Nullable
   public static gbs at() {
      return aT;
   }

   @Nullable
   public static gbs au() {
      return aU;
   }

   public static record a(atr a, Map<akf, atm> c) implements atr {
      @Override
      public Optional<atm> getResource(akf $$0) {
         atm $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akf, atm> b() {
         return this.c;
      }
   }
}
