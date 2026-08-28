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
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class gem implements AutoCloseable {
   private static final akq f = akq.b("textures/misc/nausea.png");
   private static final akq g = akq.b("shaders/post/blur.json");
   public static final int a = 10;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float b = 0.05F;
   private static final float j = 1000.0F;
   final fgi k;
   private final aud l;
   private final ayv m = ayv.a();
   private float n;
   public final gep c;
   private final fhw o;
   private final gez p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ad.c();
   private final ges A;
   private final gpw B = new gpw();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int d = 40;
   @Nullable
   private cuo G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gew K;
   @Nullable
   private gew L;
   private boolean M;
   private final ffs N = new ffs();
   @Nullable
   public gfh e;
   private final Map<String, gfh> O = Maps.newHashMap();
   @Nullable
   private static gfh P;
   @Nullable
   private static gfh Q;
   @Nullable
   private static gfh R;
   @Nullable
   private static gfh S;
   @Nullable
   private static gfh T;
   @Nullable
   private static gfh U;
   @Nullable
   private static gfh V;
   @Nullable
   private static gfh W;
   @Nullable
   private static gfh X;
   @Nullable
   private static gfh Y;
   @Nullable
   private static gfh Z;
   @Nullable
   private static gfh aa;
   @Nullable
   private static gfh ab;
   @Nullable
   private static gfh ac;
   @Nullable
   private static gfh ad;
   @Nullable
   private static gfh ae;
   @Nullable
   private static gfh af;
   @Nullable
   private static gfh ag;
   @Nullable
   private static gfh ah;
   @Nullable
   private static gfh ai;
   @Nullable
   private static gfh aj;
   @Nullable
   private static gfh ak;
   @Nullable
   private static gfh al;
   @Nullable
   private static gfh am;
   @Nullable
   private static gfh an;
   @Nullable
   private static gfh ao;
   @Nullable
   private static gfh ap;
   @Nullable
   private static gfh aq;
   @Nullable
   private static gfh ar;
   @Nullable
   private static gfh as;
   @Nullable
   private static gfh at;
   @Nullable
   private static gfh au;
   @Nullable
   private static gfh av;
   @Nullable
   private static gfh aw;
   @Nullable
   private static gfh ax;
   @Nullable
   private static gfh ay;
   @Nullable
   private static gfh az;
   @Nullable
   private static gfh aA;
   @Nullable
   private static gfh aB;
   @Nullable
   private static gfh aC;
   @Nullable
   private static gfh aD;
   @Nullable
   private static gfh aE;
   @Nullable
   private static gfh aF;
   @Nullable
   private static gfh aG;
   @Nullable
   private static gfh aH;
   @Nullable
   private static gfh aI;
   @Nullable
   private static gfh aJ;
   @Nullable
   private static gfh aK;
   @Nullable
   private static gfh aL;
   @Nullable
   private static gfh aM;
   @Nullable
   private static gfh aN;
   @Nullable
   private static gfh aO;
   @Nullable
   private static gfh aP;
   @Nullable
   private static gfh aQ;
   @Nullable
   private static gfh aR;
   @Nullable
   private static gfh aS;
   @Nullable
   private static gfh aT;

   public gem(fgi $$0, gep $$1, aud $$2, gez $$3) {
      this.k = $$0;
      this.l = $$2;
      this.c = $$1;
      this.o = new fhw($$0.aa(), $$0.aF());
      this.A = new ges(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.at();
      if (this.L != null) {
         this.L.close();
      }

      if (this.e != null) {
         this.e.close();
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

   public void a(@Nullable bsq $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cjn) {
         this.a(akq.b("shaders/post/creeper.json"));
      } else if ($$0 instanceof ckm) {
         this.a(akq.b("shaders/post/spider.json"));
      } else if ($$0 instanceof cjr) {
         this.a(akq.b("shaders/post/invert.json"));
      }
   }

   private void a(akq $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gew(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aM().l(), this.k.aM().m());
         this.M = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.M = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.M = false;
      }
   }

   private void b(aug $$0) {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gew(this.k.aa(), $$0, this.k.h(), g);
         this.L.a(this.k.aM().l(), this.k.aM().m());
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", g, var3);
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", g, var4);
      }
   }

   public void a(float $$0) {
      float $$1 = (float)this.k.m.q();
      if (this.L != null && $$1 >= 1.0F) {
         this.L.a("Radius", $$1);
         this.L.a($$0);
      }
   }

   public atx d() {
      return new aui<gem.a>() {
         protected gem.a a(aud $$0, bne $$1) {
            Map<akq, aub> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(faq.a.b.b()) || $$1x.endsWith(faq.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akq, aub> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aub($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gem.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gem.a($$0, $$3);
         }

         protected void a(gem.a $$0, aud $$1, bne $$2) {
            gem.this.c($$0);
            if (gem.this.K != null) {
               gem.this.K.close();
            }

            gem.this.K = null;
            gem.this.a(gem.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aug $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new gfh($$0, "blit_screen", fba.a);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aQ = this.a($$0, "rendertype_gui", fba.f);
         aR = this.a($$0, "rendertype_gui_overlay", fba.f);
         P = this.a($$0, "position", fba.e);
         Q = this.a($$0, "position_color", fba.f);
         R = this.a($$0, "position_tex", fba.i);
         S = this.a($$0, "position_tex_color", fba.j);
         aD = this.a($$0, "rendertype_text", fba.k);
      }
   }

   private gfh a(aug $$0, String $$1, fbh $$2) {
      try {
         gfh $$3 = new gfh($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(aug $$0) {
      RenderSystem.assertOnRenderThread();
      List<faq> $$1 = Lists.newArrayList();
      $$1.addAll(faq.a.b.c().values());
      $$1.addAll(faq.a.a.c().values());
      $$1.forEach(faq::a);
      List<Pair<gfh, Consumer<gfh>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gfh($$0, "particle", fba.d), (Consumer<gfh>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position", fba.e), (Consumer<gfh>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position_color", fba.f), (Consumer<gfh>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position_color_lightmap", fba.h), (Consumer<gfh>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position_color_tex_lightmap", fba.k), (Consumer<gfh>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position_tex", fba.i), (Consumer<gfh>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gfh($$0, "position_tex_color", fba.j), (Consumer<gfh>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_solid", fba.b), (Consumer<gfh>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_cutout_mipped", fba.b), (Consumer<gfh>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_cutout", fba.b), (Consumer<gfh>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_translucent", fba.b), (Consumer<gfh>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_translucent_moving_block", fba.b), (Consumer<gfh>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_armor_cutout_no_cull", fba.c), (Consumer<gfh>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_solid", fba.c), (Consumer<gfh>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_cutout", fba.c), (Consumer<gfh>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_cutout_no_cull", fba.c), (Consumer<gfh>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_cutout_no_cull_z_offset", fba.c), (Consumer<gfh>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_item_entity_translucent_cull", fba.c), (Consumer<gfh>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_translucent_cull", fba.c), (Consumer<gfh>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_translucent", fba.c), (Consumer<gfh>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_translucent_emissive", fba.c), (Consumer<gfh>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_smooth_cutout", fba.c), (Consumer<gfh>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_beacon_beam", fba.b), (Consumer<gfh>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_decal", fba.c), (Consumer<gfh>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_no_outline", fba.c), (Consumer<gfh>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_shadow", fba.c), (Consumer<gfh>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_alpha", fba.c), (Consumer<gfh>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_eyes", fba.c), (Consumer<gfh>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_energy_swirl", fba.c), (Consumer<gfh>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_leash", fba.h), (Consumer<gfh>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_water_mask", fba.e), (Consumer<gfh>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_outline", fba.j), (Consumer<gfh>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_armor_entity_glint", fba.i), (Consumer<gfh>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_glint_translucent", fba.i), (Consumer<gfh>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_glint", fba.i), (Consumer<gfh>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_glint", fba.i), (Consumer<gfh>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_entity_glint_direct", fba.i), (Consumer<gfh>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text", fba.k), (Consumer<gfh>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text_background", fba.h), (Consumer<gfh>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text_intensity", fba.k), (Consumer<gfh>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text_see_through", fba.k), (Consumer<gfh>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text_background_see_through", fba.h), (Consumer<gfh>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_text_intensity_see_through", fba.k), (Consumer<gfh>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_lightning", fba.f), (Consumer<gfh>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_tripwire", fba.b), (Consumer<gfh>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_end_portal", fba.e), (Consumer<gfh>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_end_gateway", fba.e), (Consumer<gfh>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_clouds", fba.m), (Consumer<gfh>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_lines", fba.g), (Consumer<gfh>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_crumbling", fba.b), (Consumer<gfh>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_gui", fba.f), (Consumer<gfh>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_gui_overlay", fba.f), (Consumer<gfh>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_gui_text_highlight", fba.f), (Consumer<gfh>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_gui_ghost_recipe_overlay", fba.f), (Consumer<gfh>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gfh($$0, "rendertype_breeze_wind", fba.c), (Consumer<gfh>)$$0x -> as = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gfh)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.at();
      $$2.forEach($$0x -> {
         gfh $$1x = (gfh)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void at() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gfh::close);
      this.O.clear();
   }

   @Nullable
   public gfh a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void e() {
      this.au();
      this.A.a();
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.N.a();
      this.c.a();
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
   public gew f() {
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
      bsq $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aH().a("pick");
            double $$2 = this.k.s.gz();
            double $$3 = this.k.s.gA();
            ewu $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof ewt $$5 ? $$5.a() : null;
            this.k.aH().c();
         }
      }
   }

   private ewu a(bsq $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayn.k($$4);
      eww $$6 = $$0.k($$3);
      ewu $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != ewu.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      eww $$9 = $$0.g($$3);
      eww $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      ewr $$12 = $$0.cL().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      ewt $$13 = cnp.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bA(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ewu a(ewu $$0, eww $$1, double $$2) {
      eww $$3 = $$0.e();
      if (!$$3.a((jw)$$1, $$2)) {
         eww $$4 = $$0.e();
         ji $$5 = ji.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return ews.a($$4, $$5, jd.a((jw)$$4));
      } else {
         return $$0;
      }
   }

   private void au() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gds $$1) {
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

   private double a(ffs $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayn.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof btl && ((btl)$$0.g()).ey()) {
            float $$4 = Math.min((float)((btl)$$0.g()).aQ + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         epa $$5 = $$0.k();
         if ($$5 == epa.a || $$5 == epa.b) {
            $$3 *= ayn.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fbc $$0, float $$1) {
      if (this.k.an() instanceof btl $$2) {
         float $$3 = (float)$$2.aO - $$1;
         if ($$2.ey()) {
            float $$4 = Math.min((float)$$2.aQ + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aP;
         $$3 = ayn.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fbc $$0, float $$1) {
      if (this.k.an() instanceof cmv) {
         cmv $$2 = (cmv)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayn.i($$1, $$2.cg, $$2.ch);
         $$0.a(ayn.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ayn.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ayn.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayn.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(ffz.a);
      this.D = 1.0F;
   }

   private void a(ffs $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         fbc $$3 = new fbc();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof btl && ((btl)this.k.an()).fI();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dcr.d) {
            this.A.c();
            this.c.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gfd.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fbk.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aM().l() / (float)this.k.aM().m(), 0.05F, this.g());
   }

   public float g() {
      return this.n * 4.0F;
   }

   public static float a(btl $$0, float $$1) {
      bry $$2 = $$0.c(bsa.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayn.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(ffz $$0, boolean $$1) {
      if (!this.k.aA() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ad.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ad.c();
      }

      if (!this.k.x) {
         boolean $$2 = this.k.c();
         int $$3 = (int)(this.k.n.e() * (double)this.k.aM().p() / (double)this.k.aM().n());
         int $$4 = (int)(this.k.n.f() * (double)this.k.aM().q() / (double)this.k.aM().o());
         RenderSystem.viewport(0, 0, this.k.aM().l(), this.k.aM().m());
         if ($$2 && $$1 && this.k.r != null) {
            this.k.aH().a("level");
            this.a($$0);
            this.av();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$0.a());
            }

            this.k.h().a(true);
         }

         fag $$5 = this.k.aM();
         RenderSystem.clear(256, fgi.a);
         Matrix4f $$6 = new Matrix4f().setOrtho(0.0F, (float)((double)$$5.l() / $$5.t()), (float)((double)$$5.m() / $$5.t()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$6, fbk.b);
         Matrix4fStack $$7 = RenderSystem.getModelViewStack();
         $$7.pushMatrix();
         $$7.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ezz.d();
         fht $$8 = new fht(this.k, this.p.c());
         if ($$2 && $$1 && this.k.r != null) {
            this.k.aH().b("gui");
            if (this.k.s != null) {
               float $$9 = ayn.i($$0.a(false), this.k.s.cJ, this.k.s.cI);
               float $$10 = this.k.m.aj().c().floatValue();
               if ($$9 > 0.0F && this.k.s.b(bsa.i) && $$10 < 1.0F) {
                  this.b($$8, $$9 * (1.0F - $$10));
               }
            }

            if (!this.k.m.Y) {
               this.a($$8, $$0.a(false));
            }

            this.k.l.a($$8, $$0);
            RenderSystem.clear(256, fgi.a);
            this.k.aH().c();
         }

         if (this.k.aK() != null) {
            try {
               this.k.aK().a($$8, $$3, $$4, $$0.b());
            } catch (Throwable var15) {
               o $$12 = o.a(var15, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.k.aK().getClass().getCanonicalName());
               throw new z($$12);
            }
         } else if ($$2 && this.k.y != null) {
            try {
               this.k.y.c($$8, $$3, $$4, $$0.b());
            } catch (Throwable var14) {
               o $$15 = o.a(var14, "Rendering screen");
               p $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$3, $$4, this.k.n.e(), this.k.n.f()));
               $$16.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aM().p(),
                        this.k.aM().q(),
                        this.k.aM().l(),
                        this.k.aM().m(),
                        this.k.aM().t()
                     )
               );
               throw new z($$15);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var13) {
               o $$18 = o.a(var13, "Narrating screen");
               p $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new z($$18);
            }
         }

         if ($$2 && $$1 && this.k.r != null) {
            this.k.l.b($$8, $$0);
         }

         if ($$2) {
            this.k.aH().a("toasts");
            this.k.aw().a($$8);
            this.k.aH().c();
         }

         $$8.e();
         $$7.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void av() {
      if (!this.y && this.k.T()) {
         long $$0 = ad.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            guh $$1 = this.k.V();
            if ($$1 != null && !$$1.ag()) {
               $$1.C().ifPresent($$0x -> {
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
         fad $$1 = fgs.a(this.k.h());
         ad.h().execute(() -> {
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

            try (fad $$6 = new fad(64, 64, false)) {
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

   private boolean aw() {
      if (!this.w) {
         return false;
      } else {
         bsq $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cmv && !this.k.m.Y;
         if ($$1 && !((cmv)$$0).ga().e) {
            cuo $$2 = ((btl)$$0).eU();
            ewu $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ewu.a.b) {
               jd $$4 = ((ews)$$3).a();
               dta $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dcr.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dte $$6 = new dte(this.k.r, $$4, false);
                  jz<dfw> $$7 = this.k.r.H_().d(lu.f);
                  $$1 = !$$2.e() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(ffz $$0) {
      float $$1 = $$0.a(true);
      this.A.a($$1);
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.b($$1);
      this.k.aH().a("center");
      boolean $$2 = this.aw();
      this.k.aH().b("camera");
      ffs $$3 = this.N;
      bsq $$4 = (bsq)(this.k.an() == null ? this.k.s : this.k.an());
      float $$5 = this.k.r.s().a($$4) ? 1.0F : $$1;
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), $$5);
      this.n = (float)(this.k.m.aD() * 16);
      double $$6 = this.a($$3, $$1, true);
      Matrix4f $$7 = this.a($$6);
      fbc $$8 = new fbc();
      this.a($$8, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$8, $$3.p());
      }

      $$7.mul($$8.c().a());
      float $$9 = this.k.m.aj().c().floatValue();
      float $$10 = ayn.i($$1, this.k.s.cJ, this.k.s.cI) * $$9 * $$9;
      if ($$10 > 0.0F) {
         int $$11 = this.k.s.b(bsa.i) ? 7 : 20;
         float $$12 = 5.0F / ($$10 * $$10 + 5.0F) - $$10 * 0.04F;
         $$12 *= $$12;
         Vector3f $$13 = new Vector3f(0.0F, ayn.g / 2.0F, ayn.g / 2.0F);
         float $$14 = ((float)this.q + $$1) * (float)$$11 * (float) (Math.PI / 180.0);
         $$7.rotate($$14, $$13);
         $$7.scale(1.0F / $$12, 1.0F, 1.0F);
         $$7.rotate(-$$14, $$13);
      }

      this.a($$7);
      Quaternionf $$15 = $$3.f().conjugate(new Quaternionf());
      Matrix4f $$16 = new Matrix4f().rotation($$15);
      this.k.f.a($$3.b(), $$16, this.a(Math.max($$6, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$2, $$3, this, this.A, $$16, $$7);
      this.k.aH().b("hand");
      if (this.v) {
         RenderSystem.clear(256, fgi.a);
         this.a($$3, $$1, $$16);
      }

      this.k.aH().c();
   }

   public void h() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fhw i() {
      return this.o;
   }

   public void a(cuo $$0) {
      this.G = $$0;
      this.H = 40;
      this.I = this.m.i() * 2.0F - 1.0F;
      this.J = this.m.i() * 2.0F - 1.0F;
   }

   private void a(fht $$0, float $$1) {
      if (this.G != null && this.H > 0) {
         int $$2 = 40 - this.H;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.I * (float)($$0.a() / 4);
         float $$9 = this.J * (float)($$0.b() / 4);
         fbc $$10 = new fbc();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * ayn.e(ayn.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * ayn.e(ayn.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * ayn.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * ayn.e(ayn.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * ayn.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * ayn.b($$3 * 8.0F)));
         $$0.a(() -> this.k.ar().a(this.G, cul.i, 15728880, gpw.d, $$10, $$0.d(), this.k.r, 0));
         $$10.b();
      }
   }

   private void b(fht $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayn.i($$1, 2.0F, 1.0F);
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
      $$0.a(f, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public fgi j() {
      return this.k;
   }

   public float c(float $$0) {
      return ayn.i($$0, this.u, this.t);
   }

   public float k() {
      return this.n;
   }

   public ffs l() {
      return this.N;
   }

   public ges m() {
      return this.A;
   }

   public gpw n() {
      return this.B;
   }

   @Nullable
   public static gfh o() {
      return P;
   }

   @Nullable
   public static gfh p() {
      return Q;
   }

   @Nullable
   public static gfh q() {
      return R;
   }

   @Nullable
   public static gfh r() {
      return S;
   }

   @Nullable
   public static gfh s() {
      return T;
   }

   @Nullable
   public static gfh t() {
      return U;
   }

   @Nullable
   public static gfh u() {
      return V;
   }

   @Nullable
   public static gfh v() {
      return W;
   }

   @Nullable
   public static gfh w() {
      return X;
   }

   @Nullable
   public static gfh x() {
      return Y;
   }

   @Nullable
   public static gfh y() {
      return Z;
   }

   @Nullable
   public static gfh z() {
      return aa;
   }

   @Nullable
   public static gfh A() {
      return ab;
   }

   @Nullable
   public static gfh B() {
      return ac;
   }

   @Nullable
   public static gfh C() {
      return ad;
   }

   @Nullable
   public static gfh D() {
      return ae;
   }

   @Nullable
   public static gfh E() {
      return af;
   }

   @Nullable
   public static gfh F() {
      return ag;
   }

   @Nullable
   public static gfh G() {
      return ah;
   }

   @Nullable
   public static gfh H() {
      return ai;
   }

   @Nullable
   public static gfh I() {
      return aj;
   }

   @Nullable
   public static gfh J() {
      return ak;
   }

   @Nullable
   public static gfh K() {
      return al;
   }

   @Nullable
   public static gfh L() {
      return am;
   }

   @Nullable
   public static gfh M() {
      return an;
   }

   @Nullable
   public static gfh N() {
      return ao;
   }

   @Nullable
   public static gfh O() {
      return ap;
   }

   @Nullable
   public static gfh P() {
      return aq;
   }

   @Nullable
   public static gfh Q() {
      return ar;
   }

   @Nullable
   public static gfh R() {
      return as;
   }

   @Nullable
   public static gfh S() {
      return at;
   }

   @Nullable
   public static gfh T() {
      return au;
   }

   @Nullable
   public static gfh U() {
      return av;
   }

   @Nullable
   public static gfh V() {
      return aw;
   }

   @Nullable
   public static gfh W() {
      return ax;
   }

   @Nullable
   public static gfh X() {
      return ay;
   }

   @Nullable
   public static gfh Y() {
      return az;
   }

   @Nullable
   public static gfh Z() {
      return aA;
   }

   @Nullable
   public static gfh aa() {
      return aB;
   }

   @Nullable
   public static gfh ab() {
      return aC;
   }

   @Nullable
   public static gfh ac() {
      return aD;
   }

   @Nullable
   public static gfh ad() {
      return aE;
   }

   @Nullable
   public static gfh ae() {
      return aF;
   }

   @Nullable
   public static gfh af() {
      return aG;
   }

   @Nullable
   public static gfh ag() {
      return aH;
   }

   @Nullable
   public static gfh ah() {
      return aI;
   }

   @Nullable
   public static gfh ai() {
      return aJ;
   }

   @Nullable
   public static gfh aj() {
      return aK;
   }

   @Nullable
   public static gfh ak() {
      return aL;
   }

   @Nullable
   public static gfh al() {
      return aM;
   }

   @Nullable
   public static gfh am() {
      return aN;
   }

   @Nullable
   public static gfh an() {
      return aO;
   }

   @Nullable
   public static gfh ao() {
      return aP;
   }

   @Nullable
   public static gfh ap() {
      return aQ;
   }

   @Nullable
   public static gfh aq() {
      return aR;
   }

   @Nullable
   public static gfh ar() {
      return aS;
   }

   @Nullable
   public static gfh as() {
      return aT;
   }

   public static record a(aug a, Map<akq, aub> c) implements aug {
      @Override
      public Optional<aub> getResource(akq $$0) {
         aub $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akq, aub> b() {
         return this.c;
      }
   }
}
