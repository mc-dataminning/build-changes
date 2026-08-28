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

public class gdq implements AutoCloseable {
   private static final akk e = new akk("textures/misc/nausea.png");
   private static final akk f = new akk("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final ffn k;
   private final atu l;
   private final aym m = aym.a();
   private float n;
   public final gdt b;
   private final fhc o;
   private final ged p;
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
   private final gdw A;
   private final goz B = new goz();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cua G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gea K;
   @Nullable
   private gea L;
   private boolean M;
   private final fey N = new fey();
   public gel d;
   private final Map<String, gel> O = Maps.newHashMap();
   @Nullable
   private static gel P;
   @Nullable
   private static gel Q;
   @Nullable
   private static gel R;
   @Nullable
   private static gel S;
   @Nullable
   private static gel T;
   @Nullable
   private static gel U;
   @Nullable
   private static gel V;
   @Nullable
   private static gel W;
   @Nullable
   private static gel X;
   @Nullable
   private static gel Y;
   @Nullable
   private static gel Z;
   @Nullable
   private static gel aa;
   @Nullable
   private static gel ab;
   @Nullable
   private static gel ac;
   @Nullable
   private static gel ad;
   @Nullable
   private static gel ae;
   @Nullable
   private static gel af;
   @Nullable
   private static gel ag;
   @Nullable
   private static gel ah;
   @Nullable
   private static gel ai;
   @Nullable
   private static gel aj;
   @Nullable
   private static gel ak;
   @Nullable
   private static gel al;
   @Nullable
   private static gel am;
   @Nullable
   private static gel an;
   @Nullable
   private static gel ao;
   @Nullable
   private static gel ap;
   @Nullable
   private static gel aq;
   @Nullable
   private static gel ar;
   @Nullable
   private static gel as;
   @Nullable
   private static gel at;
   @Nullable
   private static gel au;
   @Nullable
   private static gel av;
   @Nullable
   private static gel aw;
   @Nullable
   private static gel ax;
   @Nullable
   private static gel ay;
   @Nullable
   private static gel az;
   @Nullable
   private static gel aA;
   @Nullable
   private static gel aB;
   @Nullable
   private static gel aC;
   @Nullable
   private static gel aD;
   @Nullable
   private static gel aE;
   @Nullable
   private static gel aF;
   @Nullable
   private static gel aG;
   @Nullable
   private static gel aH;
   @Nullable
   private static gel aI;
   @Nullable
   private static gel aJ;
   @Nullable
   private static gel aK;
   @Nullable
   private static gel aL;
   @Nullable
   private static gel aM;
   @Nullable
   private static gel aN;
   @Nullable
   private static gel aO;
   @Nullable
   private static gel aP;
   @Nullable
   private static gel aQ;
   @Nullable
   private static gel aR;
   @Nullable
   private static gel aS;
   @Nullable
   private static gel aT;
   @Nullable
   private static gel aU;

   public gdq(ffn $$0, gdt $$1, atu $$2, ged $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fhc($$0.aa(), $$0.aG());
      this.A = new gdw(this, $$0);
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

   public void a(@Nullable bsd $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof ciz) {
         this.a(new akk("shaders/post/creeper.json"));
      } else if ($$0 instanceof cjy) {
         this.a(new akk("shaders/post/spider.json"));
      } else if ($$0 instanceof cjd) {
         this.a(new akk("shaders/post/invert.json"));
      }
   }

   private void a(akk $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gea(this.k.aa(), this.l, this.k.h(), $$0);
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

   private void b(atx $$0) {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gea(this.k.aa(), $$0, this.k.h(), f);
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

   public ato d() {
      return new atz<gdq.a>() {
         protected gdq.a a(atu $$0, bmr $$1) {
            Map<akk, ats> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ezu.a.b.b()) || $$1x.endsWith(ezu.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akk, ats> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ats($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gdq.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gdq.a($$0, $$3);
         }

         protected void a(gdq.a $$0, atu $$1, bmr $$2) {
            gdq.this.c($$0);
            if (gdq.this.K != null) {
               gdq.this.K.close();
            }

            gdq.this.K = null;
            gdq.this.a(gdq.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atx $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gel($$0, "blit_screen", fae.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", fae.n);
         aS = this.a($$0, "rendertype_gui_overlay", fae.n);
         P = this.a($$0, "position", fae.m);
         Q = this.a($$0, "position_color", fae.n);
         R = this.a($$0, "position_color_tex", fae.r);
         S = this.a($$0, "position_tex", fae.q);
         T = this.a($$0, "position_tex_color", fae.s);
         aE = this.a($$0, "rendertype_text", fae.t);
      }
   }

   private gel a(atx $$0, String $$1, fal $$2) {
      try {
         gel $$3 = new gel($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(atx $$0) {
      RenderSystem.assertOnRenderThread();
      List<ezu> $$1 = Lists.newArrayList();
      $$1.addAll(ezu.a.b.c().values());
      $$1.addAll(ezu.a.a.c().values());
      $$1.forEach(ezu::a);
      List<Pair<gel, Consumer<gel>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gel($$0, "particle", fae.l), (Consumer<gel>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gel($$0, "position", fae.m), (Consumer<gel>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_color", fae.n), (Consumer<gel>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_color_lightmap", fae.p), (Consumer<gel>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_color_tex", fae.r), (Consumer<gel>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_color_tex_lightmap", fae.t), (Consumer<gel>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_tex", fae.q), (Consumer<gel>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gel($$0, "position_tex_color", fae.s), (Consumer<gel>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_solid", fae.j), (Consumer<gel>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_cutout_mipped", fae.j), (Consumer<gel>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_cutout", fae.j), (Consumer<gel>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_translucent", fae.j), (Consumer<gel>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_translucent_moving_block", fae.j), (Consumer<gel>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_armor_cutout_no_cull", fae.k), (Consumer<gel>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_solid", fae.k), (Consumer<gel>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_cutout", fae.k), (Consumer<gel>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_cutout_no_cull", fae.k), (Consumer<gel>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_cutout_no_cull_z_offset", fae.k), (Consumer<gel>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_item_entity_translucent_cull", fae.k), (Consumer<gel>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_translucent_cull", fae.k), (Consumer<gel>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_translucent", fae.k), (Consumer<gel>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_translucent_emissive", fae.k), (Consumer<gel>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_smooth_cutout", fae.k), (Consumer<gel>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_beacon_beam", fae.j), (Consumer<gel>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_decal", fae.k), (Consumer<gel>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_no_outline", fae.k), (Consumer<gel>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_shadow", fae.k), (Consumer<gel>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_alpha", fae.k), (Consumer<gel>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_eyes", fae.k), (Consumer<gel>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_energy_swirl", fae.k), (Consumer<gel>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_leash", fae.p), (Consumer<gel>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_water_mask", fae.m), (Consumer<gel>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_outline", fae.r), (Consumer<gel>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_armor_glint", fae.q), (Consumer<gel>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_armor_entity_glint", fae.q), (Consumer<gel>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_glint_translucent", fae.q), (Consumer<gel>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_glint", fae.q), (Consumer<gel>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_glint_direct", fae.q), (Consumer<gel>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_glint", fae.q), (Consumer<gel>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_entity_glint_direct", fae.q), (Consumer<gel>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text", fae.t), (Consumer<gel>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text_background", fae.p), (Consumer<gel>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text_intensity", fae.t), (Consumer<gel>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text_see_through", fae.t), (Consumer<gel>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text_background_see_through", fae.p), (Consumer<gel>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_text_intensity_see_through", fae.t), (Consumer<gel>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_lightning", fae.n), (Consumer<gel>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_tripwire", fae.j), (Consumer<gel>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_end_portal", fae.m), (Consumer<gel>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_end_gateway", fae.m), (Consumer<gel>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_clouds", fae.v), (Consumer<gel>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_lines", fae.o), (Consumer<gel>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_crumbling", fae.j), (Consumer<gel>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_gui", fae.n), (Consumer<gel>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_gui_overlay", fae.n), (Consumer<gel>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_gui_text_highlight", fae.n), (Consumer<gel>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_gui_ghost_recipe_overlay", fae.n), (Consumer<gel>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gel($$0, "rendertype_breeze_wind", fae.k), (Consumer<gel>)$$0x -> at = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gel)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.au();
      $$2.forEach($$0x -> {
         gel $$1x = (gel)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void au() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gel::close);
      this.O.clear();
   }

   @Nullable
   public gel a(@Nullable String $$0) {
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
   public gea f() {
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
      bsd $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gy();
            double $$3 = this.k.s.gz();
            evx $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof evw $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private evx a(bsd $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = aye.k($$4);
      evz $$6 = $$0.k($$3);
      evx $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != evx.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      evz $$9 = $$0.g($$3);
      evz $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      evu $$12 = $$0.cK().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      evw $$13 = cnb.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bz(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static evx a(evx $$0, evz $$1, double $$2) {
      evz $$3 = $$0.e();
      if (!$$3.a((jt)$$1, $$2)) {
         evz $$4 = $$0.e();
         jf $$5 = jf.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return evv.a($$4, $$5, ja.a($$4));
      } else {
         return $$0;
      }
   }

   private void av() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gcw $$1) {
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

   private double a(fey $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)aye.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bsy && ((bsy)$$0.g()).ex()) {
            float $$4 = Math.min((float)((bsy)$$0.g()).aQ + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eod $$5 = $$0.k();
         if ($$5 == eod.a || $$5 == eod.b) {
            $$3 *= aye.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fag $$0, float $$1) {
      if (this.k.an() instanceof bsy $$2) {
         float $$3 = (float)$$2.aO - $$1;
         if ($$2.ex()) {
            float $$4 = Math.min((float)$$2.aQ + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aP;
         $$3 = aye.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fag $$0, float $$1) {
      if (this.k.an() instanceof cmh) {
         cmh $$2 = (cmh)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = aye.i($$1, $$2.cg, $$2.ch);
         $$0.a(aye.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aye.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aye.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aye.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fey $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         fag $$3 = new fag();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof bsy && ((bsy)this.k.an()).fH();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dca.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            geh.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fao.a);
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

   public static float a(bsy $$0, float $$1) {
      brl $$2 = $$0.c(brn.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aye.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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

         ezk $$7 = this.k.aO();
         RenderSystem.clear(256, ffn.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fao.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ezc.d();
         fgz $$10 = new fgz(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = aye.i($$3, this.k.s.cK, this.k.s.cJ);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(brn.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Y) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, ffn.a);
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
            gtk $$1 = this.k.V();
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
         ezh $$1 = ffx.a(this.k.h());
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

            try (ezh $$6 = new ezh(64, 64, false)) {
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
         bsd $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cmh && !this.k.m.Y;
         if ($$1 && !((cmh)$$0).fZ().e) {
            cua $$2 = ((bsy)$$0).eT();
            evx $$3 = this.k.v;
            if ($$3 != null && $$3.c() == evx.a.b) {
               ja $$4 = ((evv)$$3).a();
               dsh $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dca.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dsl $$6 = new dsl(this.k.r, $$4, false);
                  jw<dff> $$7 = this.k.r.H_().d(lr.f);
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
      fey $$3 = this.N;
      bsd $$4 = (bsd)(this.k.an() == null ? this.k.s : this.k.an());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      fag $$7 = new fag();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = aye.i($$0, this.k.s.cK, this.k.s.cJ) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(brn.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, aye.g / 2.0F, aye.g / 2.0F);
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
         RenderSystem.clear(256, ffn.a);
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

   public fhc i() {
      return this.o;
   }

   public void a(cua $$0) {
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
         fag $$11 = new fag();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aye.e(aye.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aye.e(aye.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aye.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aye.e(aye.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aye.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aye.b($$4 * 8.0F)));
         gdx.a $$13 = this.p.c();
         this.k.ar().a(this.G, ctx.i, 15728880, goz.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fgz $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aye.i($$1, 2.0F, 1.0F);
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

   public ffn j() {
      return this.k;
   }

   public float c(float $$0) {
      return aye.i($$0, this.u, this.t);
   }

   public float k() {
      return this.n;
   }

   public fey l() {
      return this.N;
   }

   public gdw m() {
      return this.A;
   }

   public goz n() {
      return this.B;
   }

   @Nullable
   public static gel o() {
      return P;
   }

   @Nullable
   public static gel p() {
      return Q;
   }

   @Nullable
   public static gel q() {
      return R;
   }

   @Nullable
   public static gel r() {
      return S;
   }

   @Nullable
   public static gel s() {
      return T;
   }

   @Nullable
   public static gel t() {
      return U;
   }

   @Nullable
   public static gel u() {
      return V;
   }

   @Nullable
   public static gel v() {
      return W;
   }

   @Nullable
   public static gel w() {
      return X;
   }

   @Nullable
   public static gel x() {
      return Y;
   }

   @Nullable
   public static gel y() {
      return Z;
   }

   @Nullable
   public static gel z() {
      return aa;
   }

   @Nullable
   public static gel A() {
      return ab;
   }

   @Nullable
   public static gel B() {
      return ac;
   }

   @Nullable
   public static gel C() {
      return ad;
   }

   @Nullable
   public static gel D() {
      return ae;
   }

   @Nullable
   public static gel E() {
      return af;
   }

   @Nullable
   public static gel F() {
      return ag;
   }

   @Nullable
   public static gel G() {
      return ah;
   }

   @Nullable
   public static gel H() {
      return ai;
   }

   @Nullable
   public static gel I() {
      return aj;
   }

   @Nullable
   public static gel J() {
      return ak;
   }

   @Nullable
   public static gel K() {
      return al;
   }

   @Nullable
   public static gel L() {
      return am;
   }

   @Nullable
   public static gel M() {
      return an;
   }

   @Nullable
   public static gel N() {
      return ao;
   }

   @Nullable
   public static gel O() {
      return ap;
   }

   @Nullable
   public static gel P() {
      return aq;
   }

   @Nullable
   public static gel Q() {
      return ar;
   }

   @Nullable
   public static gel R() {
      return as;
   }

   @Nullable
   public static gel S() {
      return at;
   }

   @Nullable
   public static gel T() {
      return au;
   }

   @Nullable
   public static gel U() {
      return av;
   }

   @Nullable
   public static gel V() {
      return aw;
   }

   @Nullable
   public static gel W() {
      return ax;
   }

   @Nullable
   public static gel X() {
      return ay;
   }

   @Nullable
   public static gel Y() {
      return az;
   }

   @Nullable
   public static gel Z() {
      return aA;
   }

   @Nullable
   public static gel aa() {
      return aB;
   }

   @Nullable
   public static gel ab() {
      return aC;
   }

   @Nullable
   public static gel ac() {
      return aD;
   }

   @Nullable
   public static gel ad() {
      return aE;
   }

   @Nullable
   public static gel ae() {
      return aF;
   }

   @Nullable
   public static gel af() {
      return aG;
   }

   @Nullable
   public static gel ag() {
      return aH;
   }

   @Nullable
   public static gel ah() {
      return aI;
   }

   @Nullable
   public static gel ai() {
      return aJ;
   }

   @Nullable
   public static gel aj() {
      return aK;
   }

   @Nullable
   public static gel ak() {
      return aL;
   }

   @Nullable
   public static gel al() {
      return aM;
   }

   @Nullable
   public static gel am() {
      return aN;
   }

   @Nullable
   public static gel an() {
      return aO;
   }

   @Nullable
   public static gel ao() {
      return aP;
   }

   @Nullable
   public static gel ap() {
      return aQ;
   }

   @Nullable
   public static gel aq() {
      return aR;
   }

   @Nullable
   public static gel ar() {
      return aS;
   }

   @Nullable
   public static gel as() {
      return aT;
   }

   @Nullable
   public static gel at() {
      return aU;
   }

   public static record a(atx a, Map<akk, ats> c) implements atx {
      @Override
      public Optional<ats> getResource(akk $$0) {
         ats $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akk, ats> b() {
         return this.c;
      }
   }
}
