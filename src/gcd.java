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

public class gcd implements AutoCloseable {
   private static final akm e = new akm("textures/misc/nausea.png");
   private static final akm f = new akm("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fdz k;
   private final atw l;
   private final ayk m = ayk.a();
   private float n;
   public final gcg b;
   private final ffp o;
   private final gcq p;
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
   private final gcj A;
   private final gnm B = new gnm();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cto G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gcn K;
   @Nullable
   private gcn L;
   private boolean M;
   private final fdk N = new fdk();
   public gcy d;
   private final Map<String, gcy> O = Maps.newHashMap();
   @Nullable
   private static gcy P;
   @Nullable
   private static gcy Q;
   @Nullable
   private static gcy R;
   @Nullable
   private static gcy S;
   @Nullable
   private static gcy T;
   @Nullable
   private static gcy U;
   @Nullable
   private static gcy V;
   @Nullable
   private static gcy W;
   @Nullable
   private static gcy X;
   @Nullable
   private static gcy Y;
   @Nullable
   private static gcy Z;
   @Nullable
   private static gcy aa;
   @Nullable
   private static gcy ab;
   @Nullable
   private static gcy ac;
   @Nullable
   private static gcy ad;
   @Nullable
   private static gcy ae;
   @Nullable
   private static gcy af;
   @Nullable
   private static gcy ag;
   @Nullable
   private static gcy ah;
   @Nullable
   private static gcy ai;
   @Nullable
   private static gcy aj;
   @Nullable
   private static gcy ak;
   @Nullable
   private static gcy al;
   @Nullable
   private static gcy am;
   @Nullable
   private static gcy an;
   @Nullable
   private static gcy ao;
   @Nullable
   private static gcy ap;
   @Nullable
   private static gcy aq;
   @Nullable
   private static gcy ar;
   @Nullable
   private static gcy as;
   @Nullable
   private static gcy at;
   @Nullable
   private static gcy au;
   @Nullable
   private static gcy av;
   @Nullable
   private static gcy aw;
   @Nullable
   private static gcy ax;
   @Nullable
   private static gcy ay;
   @Nullable
   private static gcy az;
   @Nullable
   private static gcy aA;
   @Nullable
   private static gcy aB;
   @Nullable
   private static gcy aC;
   @Nullable
   private static gcy aD;
   @Nullable
   private static gcy aE;
   @Nullable
   private static gcy aF;
   @Nullable
   private static gcy aG;
   @Nullable
   private static gcy aH;
   @Nullable
   private static gcy aI;
   @Nullable
   private static gcy aJ;
   @Nullable
   private static gcy aK;
   @Nullable
   private static gcy aL;
   @Nullable
   private static gcy aM;
   @Nullable
   private static gcy aN;
   @Nullable
   private static gcy aO;
   @Nullable
   private static gcy aP;
   @Nullable
   private static gcy aQ;
   @Nullable
   private static gcy aR;
   @Nullable
   private static gcy aS;
   @Nullable
   private static gcy aT;
   @Nullable
   private static gcy aU;

   public gcd(fdz $$0, gcg $$1, atw $$2, gcq $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new ffp($$0.aa(), $$0.aH());
      this.A = new gcj(this, $$0);
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

   public void a(@Nullable bru $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cio) {
         this.a(new akm("shaders/post/creeper.json"));
      } else if ($$0 instanceof cjn) {
         this.a(new akm("shaders/post/spider.json"));
      } else if ($$0 instanceof cis) {
         this.a(new akm("shaders/post/invert.json"));
      }
   }

   private void a(akm $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gcn(this.k.aa(), this.l, this.k.h(), $$0);
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
         this.L = new gcn(this.k.aa(), this.l, this.k.h(), f);
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

   public atq e() {
      return new aub<gcd.a>() {
         protected gcd.a a(atw $$0, bmi $$1) {
            Map<akm, atu> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eyg.a.b.b()) || $$1x.endsWith(eyg.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akm, atu> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atu($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gcd.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gcd.a($$0, $$3);
         }

         protected void a(gcd.a $$0, atw $$1, bmi $$2) {
            gcd.this.b($$0);
            if (gcd.this.K != null) {
               gcd.this.K.close();
            }

            gcd.this.K = null;
            gcd.this.a(gcd.this.k.ao());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atz $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gcy($$0, "blit_screen", eyq.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", eyq.n);
         aS = this.a($$0, "rendertype_gui_overlay", eyq.n);
         P = this.a($$0, "position", eyq.m);
         Q = this.a($$0, "position_color", eyq.n);
         R = this.a($$0, "position_color_tex", eyq.r);
         S = this.a($$0, "position_tex", eyq.q);
         T = this.a($$0, "position_tex_color", eyq.s);
         aE = this.a($$0, "rendertype_text", eyq.t);
      }
   }

   private gcy a(atz $$0, String $$1, eyx $$2) {
      try {
         gcy $$3 = new gcy($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(atz $$0) {
      RenderSystem.assertOnRenderThread();
      List<eyg> $$1 = Lists.newArrayList();
      $$1.addAll(eyg.a.b.c().values());
      $$1.addAll(eyg.a.a.c().values());
      $$1.forEach(eyg::a);
      List<Pair<gcy, Consumer<gcy>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gcy($$0, "particle", eyq.l), (Consumer<gcy>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position", eyq.m), (Consumer<gcy>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_color", eyq.n), (Consumer<gcy>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_color_lightmap", eyq.p), (Consumer<gcy>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_color_tex", eyq.r), (Consumer<gcy>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_color_tex_lightmap", eyq.t), (Consumer<gcy>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_tex", eyq.q), (Consumer<gcy>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gcy($$0, "position_tex_color", eyq.s), (Consumer<gcy>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_solid", eyq.j), (Consumer<gcy>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_cutout_mipped", eyq.j), (Consumer<gcy>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_cutout", eyq.j), (Consumer<gcy>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_translucent", eyq.j), (Consumer<gcy>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_translucent_moving_block", eyq.j), (Consumer<gcy>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_armor_cutout_no_cull", eyq.k), (Consumer<gcy>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_solid", eyq.k), (Consumer<gcy>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_cutout", eyq.k), (Consumer<gcy>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_cutout_no_cull", eyq.k), (Consumer<gcy>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_cutout_no_cull_z_offset", eyq.k), (Consumer<gcy>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_item_entity_translucent_cull", eyq.k), (Consumer<gcy>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_translucent_cull", eyq.k), (Consumer<gcy>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_translucent", eyq.k), (Consumer<gcy>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_translucent_emissive", eyq.k), (Consumer<gcy>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_smooth_cutout", eyq.k), (Consumer<gcy>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_beacon_beam", eyq.j), (Consumer<gcy>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_decal", eyq.k), (Consumer<gcy>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_no_outline", eyq.k), (Consumer<gcy>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_shadow", eyq.k), (Consumer<gcy>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_alpha", eyq.k), (Consumer<gcy>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_eyes", eyq.k), (Consumer<gcy>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_energy_swirl", eyq.k), (Consumer<gcy>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_leash", eyq.p), (Consumer<gcy>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_water_mask", eyq.m), (Consumer<gcy>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_outline", eyq.r), (Consumer<gcy>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_armor_glint", eyq.q), (Consumer<gcy>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_armor_entity_glint", eyq.q), (Consumer<gcy>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_glint_translucent", eyq.q), (Consumer<gcy>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_glint", eyq.q), (Consumer<gcy>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_glint_direct", eyq.q), (Consumer<gcy>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_glint", eyq.q), (Consumer<gcy>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_entity_glint_direct", eyq.q), (Consumer<gcy>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text", eyq.t), (Consumer<gcy>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text_background", eyq.p), (Consumer<gcy>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text_intensity", eyq.t), (Consumer<gcy>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text_see_through", eyq.t), (Consumer<gcy>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text_background_see_through", eyq.p), (Consumer<gcy>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_text_intensity_see_through", eyq.t), (Consumer<gcy>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_lightning", eyq.n), (Consumer<gcy>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_tripwire", eyq.j), (Consumer<gcy>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_end_portal", eyq.m), (Consumer<gcy>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_end_gateway", eyq.m), (Consumer<gcy>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_clouds", eyq.v), (Consumer<gcy>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_lines", eyq.o), (Consumer<gcy>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_crumbling", eyq.j), (Consumer<gcy>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_gui", eyq.n), (Consumer<gcy>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_gui_overlay", eyq.n), (Consumer<gcy>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_gui_text_highlight", eyq.n), (Consumer<gcy>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_gui_ghost_recipe_overlay", eyq.n), (Consumer<gcy>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gcy($$0, "rendertype_breeze_wind", eyq.k), (Consumer<gcy>)$$0x -> at = $$0x));
         this.d();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gcy)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         gcy $$1x = (gcy)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gcy::close);
      this.O.clear();
   }

   @Nullable
   public gcy a(@Nullable String $$0) {
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
   public gcn g() {
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
      bru $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aJ().a("pick");
            double $$2 = this.k.s.gC();
            double $$3 = this.k.s.gD();
            eui $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof euh $$5 ? $$5.a() : null;
            this.k.aJ().c();
         }
      }
   }

   private eui a(bru $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayd.k($$4);
      euk $$6 = $$0.j($$3);
      eui $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != eui.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      euk $$9 = $$0.f($$3);
      euk $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      euf $$12 = $$0.cK().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      euh $$13 = cmq.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bz(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static eui a(eui $$0, euk $$1, double $$2) {
      euk $$3 = $$0.e();
      if (!$$3.a((jh)$$1, $$2)) {
         euk $$4 = $$0.e();
         it $$5 = it.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return eug.a($$4, $$5, io.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof gbj $$1) {
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

   private double a(fdk $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayd.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bso && ((bso)$$0.g()).eB()) {
            float $$4 = Math.min((float)((bso)$$0.g()).aR + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         emw $$5 = $$0.k();
         if ($$5 == emw.a || $$5 == emw.b) {
            $$3 *= ayd.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eys $$0, float $$1) {
      if (this.k.ao() instanceof bso $$2) {
         float $$3 = (float)$$2.aP - $$1;
         if ($$2.eB()) {
            float $$4 = Math.min((float)$$2.aR + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aQ;
         $$3 = ayd.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eJ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eys $$0, float $$1) {
      if (this.k.ao() instanceof clw) {
         clw $$2 = (clw)this.k.ao();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayd.i($$1, $$2.cf, $$2.cg);
         $$0.a(ayd.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ayd.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ayd.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayd.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fdk $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         eys $$3 = new eys();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.ao() instanceof bso && ((bso)this.k.ao()).fL();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Z && this.k.q.j() != dau.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gcu.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eza.a);
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

   public static float a(bso $$0, float $$1) {
      brc $$2 = $$0.c(bre.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayd.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aC() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.c();
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

         exw $$7 = this.k.aP();
         RenderSystem.clear(256, fdz.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eza.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         exo.d();
         ffm $$10 = new ffm(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aJ().b("gui");
            if (this.k.s != null) {
               float $$11 = ayd.i($$3, this.k.s.cI, this.k.s.cH);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bre.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z) {
               this.a(this.k.aP().o(), this.k.aP().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fdz.a);
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
         long $$0 = ac.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gsa $$1 = this.k.V();
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
         ext $$1 = fek.a(this.k.h());
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

            try (ext $$6 = new ext(64, 64, false)) {
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
         bru $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof clw && !this.k.m.Z;
         if ($$1 && !((clw)$$0).gd().e) {
            cto $$2 = ((bso)$$0).eX();
            eui $$3 = this.k.v;
            if ($$3 != null && $$3.c() == eui.a.b) {
               io $$4 = ((eug)$$3).a();
               drb $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dau.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  drf $$6 = new drf(this.k.r, $$4, false);
                  jk<ddy> $$7 = this.k.r.H_().d(lf.f);
                  $$1 = !$$2.e() && ($$2.b($$6) || $$2.a($$6));
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
      fdk $$3 = this.N;
      bru $$4 = (bru)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      eys $$7 = new eys();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = ayd.i($$0, this.k.s.cI, this.k.s.cH) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bre.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, ayd.g / 2.0F, ayd.g / 2.0F);
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
         RenderSystem.clear(256, fdz.a);
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

   public ffp j() {
      return this.o;
   }

   public void a(cto $$0) {
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
         eys $$11 = new eys();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ayd.e(ayd.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ayd.e(ayd.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ayd.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ayd.e(ayd.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ayd.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ayd.b($$4 * 8.0F)));
         gck.a $$13 = this.p.c();
         this.k.as().a(this.G, ctl.i, 15728880, gnm.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ffm $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayd.i($$1, 2.0F, 1.0F);
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

   public fdz k() {
      return this.k;
   }

   public float c(float $$0) {
      return ayd.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public fdk m() {
      return this.N;
   }

   public gcj n() {
      return this.A;
   }

   public gnm o() {
      return this.B;
   }

   @Nullable
   public static gcy p() {
      return P;
   }

   @Nullable
   public static gcy q() {
      return Q;
   }

   @Nullable
   public static gcy r() {
      return R;
   }

   @Nullable
   public static gcy s() {
      return S;
   }

   @Nullable
   public static gcy t() {
      return T;
   }

   @Nullable
   public static gcy u() {
      return U;
   }

   @Nullable
   public static gcy v() {
      return V;
   }

   @Nullable
   public static gcy w() {
      return W;
   }

   @Nullable
   public static gcy x() {
      return X;
   }

   @Nullable
   public static gcy y() {
      return Y;
   }

   @Nullable
   public static gcy z() {
      return Z;
   }

   @Nullable
   public static gcy A() {
      return aa;
   }

   @Nullable
   public static gcy B() {
      return ab;
   }

   @Nullable
   public static gcy C() {
      return ac;
   }

   @Nullable
   public static gcy D() {
      return ad;
   }

   @Nullable
   public static gcy E() {
      return ae;
   }

   @Nullable
   public static gcy F() {
      return af;
   }

   @Nullable
   public static gcy G() {
      return ag;
   }

   @Nullable
   public static gcy H() {
      return ah;
   }

   @Nullable
   public static gcy I() {
      return ai;
   }

   @Nullable
   public static gcy J() {
      return aj;
   }

   @Nullable
   public static gcy K() {
      return ak;
   }

   @Nullable
   public static gcy L() {
      return al;
   }

   @Nullable
   public static gcy M() {
      return am;
   }

   @Nullable
   public static gcy N() {
      return an;
   }

   @Nullable
   public static gcy O() {
      return ao;
   }

   @Nullable
   public static gcy P() {
      return ap;
   }

   @Nullable
   public static gcy Q() {
      return aq;
   }

   @Nullable
   public static gcy R() {
      return ar;
   }

   @Nullable
   public static gcy S() {
      return as;
   }

   @Nullable
   public static gcy T() {
      return at;
   }

   @Nullable
   public static gcy U() {
      return au;
   }

   @Nullable
   public static gcy V() {
      return av;
   }

   @Nullable
   public static gcy W() {
      return aw;
   }

   @Nullable
   public static gcy X() {
      return ax;
   }

   @Nullable
   public static gcy Y() {
      return ay;
   }

   @Nullable
   public static gcy Z() {
      return az;
   }

   @Nullable
   public static gcy aa() {
      return aA;
   }

   @Nullable
   public static gcy ab() {
      return aB;
   }

   @Nullable
   public static gcy ac() {
      return aC;
   }

   @Nullable
   public static gcy ad() {
      return aD;
   }

   @Nullable
   public static gcy ae() {
      return aE;
   }

   @Nullable
   public static gcy af() {
      return aF;
   }

   @Nullable
   public static gcy ag() {
      return aG;
   }

   @Nullable
   public static gcy ah() {
      return aH;
   }

   @Nullable
   public static gcy ai() {
      return aI;
   }

   @Nullable
   public static gcy aj() {
      return aJ;
   }

   @Nullable
   public static gcy ak() {
      return aK;
   }

   @Nullable
   public static gcy al() {
      return aL;
   }

   @Nullable
   public static gcy am() {
      return aM;
   }

   @Nullable
   public static gcy an() {
      return aN;
   }

   @Nullable
   public static gcy ao() {
      return aO;
   }

   @Nullable
   public static gcy ap() {
      return aP;
   }

   @Nullable
   public static gcy aq() {
      return aQ;
   }

   @Nullable
   public static gcy ar() {
      return aR;
   }

   @Nullable
   public static gcy as() {
      return aS;
   }

   @Nullable
   public static gcy at() {
      return aT;
   }

   @Nullable
   public static gcy au() {
      return aU;
   }

   public static record a(atz a, Map<akm, atu> c) implements atz {
      @Override
      public Optional<atu> getResource(akm $$0) {
         atu $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akm, atu> b() {
         return this.c;
      }
   }
}
