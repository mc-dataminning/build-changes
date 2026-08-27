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
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class fvm implements AutoCloseable {
   private static final aiy f = new aiy("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final exo j;
   private final asb k;
   private final awp l = awp.a();
   private float m;
   public final fvp b;
   private final eze n;
   private final fvz o;
   private int p;
   private float q;
   private float r;
   private float s;
   private float t;
   private boolean u = true;
   private boolean v = true;
   private long w;
   private boolean x;
   private long y = ac.b();
   private final fvs z;
   private final ggs A = new ggs();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cpd F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fvw J;
   static final aiy[] K = new aiy[]{
      new aiy("shaders/post/notch.json"),
      new aiy("shaders/post/fxaa.json"),
      new aiy("shaders/post/art.json"),
      new aiy("shaders/post/bumpy.json"),
      new aiy("shaders/post/blobs2.json"),
      new aiy("shaders/post/pencil.json"),
      new aiy("shaders/post/color_convolve.json"),
      new aiy("shaders/post/deconverge.json"),
      new aiy("shaders/post/flip.json"),
      new aiy("shaders/post/invert.json"),
      new aiy("shaders/post/ntsc.json"),
      new aiy("shaders/post/outline.json"),
      new aiy("shaders/post/phosphor.json"),
      new aiy("shaders/post/scan_pincushion.json"),
      new aiy("shaders/post/sobel.json"),
      new aiy("shaders/post/bits.json"),
      new aiy("shaders/post/desaturate.json"),
      new aiy("shaders/post/green.json"),
      new aiy("shaders/post/blur.json"),
      new aiy("shaders/post/wobble.json"),
      new aiy("shaders/post/blobs.json"),
      new aiy("shaders/post/antialias.json"),
      new aiy("shaders/post/creeper.json"),
      new aiy("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final ewz N = new ewz();
   public fwh e;
   private final Map<String, fwh> O = Maps.newHashMap();
   @Nullable
   private static fwh P;
   @Nullable
   private static fwh Q;
   @Nullable
   private static fwh R;
   @Nullable
   private static fwh S;
   @Nullable
   private static fwh T;
   @Nullable
   private static fwh U;
   @Nullable
   private static fwh V;
   @Nullable
   private static fwh W;
   @Nullable
   private static fwh X;
   @Nullable
   private static fwh Y;
   @Nullable
   private static fwh Z;
   @Nullable
   private static fwh aa;
   @Nullable
   private static fwh ab;
   @Nullable
   private static fwh ac;
   @Nullable
   private static fwh ad;
   @Nullable
   private static fwh ae;
   @Nullable
   private static fwh af;
   @Nullable
   private static fwh ag;
   @Nullable
   private static fwh ah;
   @Nullable
   private static fwh ai;
   @Nullable
   private static fwh aj;
   @Nullable
   private static fwh ak;
   @Nullable
   private static fwh al;
   @Nullable
   private static fwh am;
   @Nullable
   private static fwh an;
   @Nullable
   private static fwh ao;
   @Nullable
   private static fwh ap;
   @Nullable
   private static fwh aq;
   @Nullable
   private static fwh ar;
   @Nullable
   private static fwh as;
   @Nullable
   private static fwh at;
   @Nullable
   private static fwh au;
   @Nullable
   private static fwh av;
   @Nullable
   private static fwh aw;
   @Nullable
   private static fwh ax;
   @Nullable
   private static fwh ay;
   @Nullable
   private static fwh az;
   @Nullable
   private static fwh aA;
   @Nullable
   private static fwh aB;
   @Nullable
   private static fwh aC;
   @Nullable
   private static fwh aD;
   @Nullable
   private static fwh aE;
   @Nullable
   private static fwh aF;
   @Nullable
   private static fwh aG;
   @Nullable
   private static fwh aH;
   @Nullable
   private static fwh aI;
   @Nullable
   private static fwh aJ;
   @Nullable
   private static fwh aK;
   @Nullable
   private static fwh aL;
   @Nullable
   private static fwh aM;
   @Nullable
   private static fwh aN;
   @Nullable
   private static fwh aO;
   @Nullable
   private static fwh aP;
   @Nullable
   private static fwh aQ;
   @Nullable
   private static fwh aR;
   @Nullable
   private static fwh aS;
   @Nullable
   private static fwh aT;
   @Nullable
   private static fwh aU;
   @Nullable
   private static fwh aV;

   public fvm(exo $$0, fvp $$1, asb $$2, fvz $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new eze($$0.Z());
      this.z = new fvs(this, $$0);
      this.o = $$3;
      this.J = null;
   }

   @Override
   public void close() {
      this.z.close();
      this.n.close();
      this.A.close();
      this.b();
      this.aw();
      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public void b(boolean $$0) {
      this.v = $$0;
   }

   public void c(boolean $$0) {
      this.B = $$0;
   }

   public boolean a() {
      return this.B;
   }

   public void b() {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      this.L = d;
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable bnq $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof ced) {
         this.a(new aiy("shaders/post/creeper.json"));
      } else if ($$0 instanceof cfc) {
         this.a(new aiy("shaders/post/spider.json"));
      } else if ($$0 instanceof ceh) {
         this.a(new aiy("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.an() instanceof chl) {
         if (this.J != null) {
            this.J.close();
         }

         this.L = (this.L + 1) % (K.length + 1);
         if (this.L == d) {
            this.J = null;
         } else {
            this.a(K[this.L]);
         }
      }
   }

   void a(aiy $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fvw(this.j.Z(), this.k, this.j.g(), $$0);
         this.J.a(this.j.aN().k(), this.j.aN().l());
         this.M = true;
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", $$0, var3);
         this.L = d;
         this.M = false;
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", $$0, var4);
         this.L = d;
         this.M = false;
      }
   }

   public arv e() {
      return new asg<fvm.a>() {
         protected fvm.a a(asb $$0, bin $$1) {
            Map<aiy, arz> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(erv.a.b.b()) || $$1x.endsWith(erv.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aiy, arz> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new arz($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fvm.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fvm.a($$0, $$3);
         }

         protected void a(fvm.a $$0, asb $$1, bin $$2) {
            fvm.this.b($$0);
            if (fvm.this.J != null) {
               fvm.this.J.close();
            }

            fvm.this.J = null;
            if (fvm.this.L == fvm.d) {
               fvm.this.a(fvm.this.j.an());
            } else {
               fvm.this.a(fvm.K[fvm.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(ase $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fwh($$0, "blit_screen", esf.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", esf.n);
         aT = this.a($$0, "rendertype_gui_overlay", esf.n);
         P = this.a($$0, "position", esf.m);
         Q = this.a($$0, "position_color", esf.n);
         R = this.a($$0, "position_color_tex", esf.r);
         S = this.a($$0, "position_tex", esf.q);
         T = this.a($$0, "position_tex_color", esf.s);
         aG = this.a($$0, "rendertype_text", esf.t);
      }
   }

   private fwh a(ase $$0, String $$1, esm $$2) {
      try {
         fwh $$3 = new fwh($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(ase $$0) {
      RenderSystem.assertOnRenderThread();
      List<erv> $$1 = Lists.newArrayList();
      $$1.addAll(erv.a.b.c().values());
      $$1.addAll(erv.a.a.c().values());
      $$1.forEach(erv::a);
      List<Pair<fwh, Consumer<fwh>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fwh($$0, "particle", esf.l), (Consumer<fwh>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position", esf.m), (Consumer<fwh>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_color", esf.n), (Consumer<fwh>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_color_lightmap", esf.p), (Consumer<fwh>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_color_tex", esf.r), (Consumer<fwh>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_color_tex_lightmap", esf.t), (Consumer<fwh>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_tex", esf.q), (Consumer<fwh>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_tex_color", esf.s), (Consumer<fwh>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_tex_color_normal", esf.v), (Consumer<fwh>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fwh($$0, "position_tex_lightmap_color", esf.u), (Consumer<fwh>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_solid", esf.j), (Consumer<fwh>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_cutout_mipped", esf.j), (Consumer<fwh>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_cutout", esf.j), (Consumer<fwh>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_translucent", esf.j), (Consumer<fwh>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_translucent_moving_block", esf.j), (Consumer<fwh>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_armor_cutout_no_cull", esf.k), (Consumer<fwh>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_solid", esf.k), (Consumer<fwh>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_cutout", esf.k), (Consumer<fwh>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_cutout_no_cull", esf.k), (Consumer<fwh>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_cutout_no_cull_z_offset", esf.k), (Consumer<fwh>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_item_entity_translucent_cull", esf.k), (Consumer<fwh>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_translucent_cull", esf.k), (Consumer<fwh>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_translucent", esf.k), (Consumer<fwh>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_translucent_emissive", esf.k), (Consumer<fwh>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_smooth_cutout", esf.k), (Consumer<fwh>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_beacon_beam", esf.j), (Consumer<fwh>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_decal", esf.k), (Consumer<fwh>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_no_outline", esf.k), (Consumer<fwh>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_shadow", esf.k), (Consumer<fwh>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_alpha", esf.k), (Consumer<fwh>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_eyes", esf.k), (Consumer<fwh>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_energy_swirl", esf.k), (Consumer<fwh>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_leash", esf.p), (Consumer<fwh>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_water_mask", esf.m), (Consumer<fwh>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_outline", esf.r), (Consumer<fwh>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_armor_glint", esf.q), (Consumer<fwh>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_armor_entity_glint", esf.q), (Consumer<fwh>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_glint_translucent", esf.q), (Consumer<fwh>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_glint", esf.q), (Consumer<fwh>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_glint_direct", esf.q), (Consumer<fwh>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_glint", esf.q), (Consumer<fwh>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_entity_glint_direct", esf.q), (Consumer<fwh>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text", esf.t), (Consumer<fwh>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text_background", esf.p), (Consumer<fwh>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text_intensity", esf.t), (Consumer<fwh>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text_see_through", esf.t), (Consumer<fwh>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text_background_see_through", esf.p), (Consumer<fwh>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_text_intensity_see_through", esf.t), (Consumer<fwh>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_lightning", esf.n), (Consumer<fwh>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_tripwire", esf.j), (Consumer<fwh>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_end_portal", esf.m), (Consumer<fwh>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_end_gateway", esf.m), (Consumer<fwh>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_lines", esf.o), (Consumer<fwh>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_crumbling", esf.j), (Consumer<fwh>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_gui", esf.n), (Consumer<fwh>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_gui_overlay", esf.n), (Consumer<fwh>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_gui_text_highlight", esf.n), (Consumer<fwh>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_gui_ghost_recipe_overlay", esf.n), (Consumer<fwh>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new fwh($$0, "rendertype_breeze_wind", esf.k), (Consumer<fwh>)$$0x -> av = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fwh)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fwh $$1x = (fwh)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fwh::close);
      this.O.clear();
   }

   @Nullable
   public fwh a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.an() == null) {
         this.j.a(this.j.s);
      }

      this.N.a();
      this.b.a();
      this.p++;
      if (this.j.r.s().i()) {
         this.j.f.a(this.N);
         this.t = this.s;
         if (this.j.l.j().c()) {
            this.s += 0.05F;
            if (this.s > 1.0F) {
               this.s = 1.0F;
            }
         } else if (this.s > 0.0F) {
            this.s -= 0.0125F;
         }

         if (this.G > 0) {
            this.G--;
            if (this.G == 0) {
               this.F = null;
            }
         }
      }
   }

   @Nullable
   public fvw g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bnq $$1 = this.j.an();
      if ($$1 != null) {
         if (this.j.r != null && this.j.s != null) {
            this.j.aH().a("pick");
            double $$2 = this.j.s.gt();
            double $$3 = this.j.s.gu();
            enx $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.v = $$4;
            this.j.u = $$4 instanceof enw $$5 ? $$5.a() : null;
            this.j.aH().c();
         }
      }
   }

   private enx a(bnq $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = awi.k($$4);
      enz $$6 = $$0.j($$3);
      enx $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != enx.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      enz $$9 = $$0.f($$3);
      enz $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      enu $$12 = $$0.cH().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      enw $$13 = cif.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.P_() && $$0x.bt(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static enx a(enx $$0, enz $$1, double $$2) {
      enz $$3 = $$0.e();
      if (!$$3.a((it)$$1, $$2)) {
         enz $$4 = $$0.e();
         ie $$5 = ie.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return env.a($$4, $$5, hz.a($$4));
      } else {
         return $$0;
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.an() instanceof fus $$1) {
         $$0 = $$1.c();
      }

      this.r = this.q;
      this.q = this.q + ($$0 - this.q) * 0.5F;
      if (this.q > 1.5F) {
         this.q = 1.5F;
      }

      if (this.q < 0.1F) {
         this.q = 0.1F;
      }
   }

   private double a(ewz $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ae().c().intValue();
            $$3 *= (double)awi.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof boi && ((boi)$$0.g()).ex()) {
            float $$4 = Math.min((float)((boi)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         egy $$5 = $$0.k();
         if ($$5 == egy.a || $$5 == egy.b) {
            $$3 *= awi.d(this.j.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(esh $$0, float $$1) {
      if (this.j.an() instanceof boi $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ex()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = awi.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(esh $$0, float $$1) {
      if (this.j.an() instanceof chl) {
         chl $$2 = (chl)this.j.an();
         float $$3 = $$2.X - $$2.W;
         float $$4 = -($$2.X + $$3 * $$1);
         float $$5 = awi.i($$1, $$2.bZ, $$2.ca);
         $$0.a(awi.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(awi.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(awi.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(awi.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new esh());
      this.C = 1.0F;
   }

   private void a(esh $$0, ewz $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.an() instanceof boi && ((boi)this.j.an()).fD();
         if (this.j.m.ax().a() && !$$3 && !this.j.m.Z && this.j.q.j() != cvo.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.c(), this.j.s, this.j.ap().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.ax().a() && !$$3) {
            fwd.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, esp.a);
   }

   public Matrix4f a(double $$0) {
      esh $$1 = new esh();
      $$1.c().a().identity();
      if (this.C != 1.0F) {
         $$1.a(this.D, -this.E, 0.0F);
         $$1.b(this.C, this.C, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aN().k() / (float)this.j.aN().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(boi $$0, float $$1) {
      bnd $$2 = $$0.c(bnf.p);
      return !$$2.a(200) ? 1.0F : 0.7F + awi.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aB() && this.j.m.n && (!this.j.m.W().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         float $$3 = this.j.r != null && this.j.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.j.c();
         int $$5 = (int)(this.j.n.e() * (double)this.j.aN().o() / (double)this.j.aN().m());
         int $$6 = (int)(this.j.n.f() * (double)this.j.aN().p() / (double)this.j.aN().n());
         RenderSystem.viewport(0, 0, this.j.aN().k(), this.j.aN().l());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aH().a("level");
            this.a($$0, $$1, new esh());
            this.ay();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$3);
            }

            this.j.g().a(true);
         }

         erl $$7 = this.j.aN();
         RenderSystem.clear(256, exo.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, esp.b);
         esh $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         erd.b();
         ezb $$10 = new ezb(this.j, this.o.c());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aH().b("gui");
            if (this.j.s != null) {
               float $$11 = awi.i($$3, this.j.s.cA, this.j.s.cz);
               float $$12 = this.j.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.j.s.a(bnf.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.j.m.Z) {
               this.a(this.j.aN().o(), this.j.aN().p(), $$3);
            }

            this.j.l.a($$10, $$3);
            RenderSystem.clear(256, exo.a);
            this.j.aH().c();
         }

         if (this.j.aK() != null) {
            try {
               this.j.aK().a($$10, $$5, $$6, this.j.au());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.j.aK().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.j.y != null) {
            try {
               this.j.y.c($$10, $$5, $$6, this.j.au());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.j.n.e(), this.j.n.f()));
               $$18.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aN().o(),
                        this.j.aN().p(),
                        this.j.aN().k(),
                        this.j.aN().l(),
                        this.j.aN().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.j.y != null) {
                  this.j.y.A();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.j.aH().a("toasts");
            this.j.az().a($$10);
            this.j.aH().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.x && this.j.S()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            glf $$1 = this.j.U();
            if ($$1 != null && !$$1.af()) {
               $$1.z().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.x = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.j.f.k() > 10 && this.j.f.q()) {
         eri $$1 = exz.a(this.j.g());
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

            try (eri $$6 = new eri(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               g.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean az() {
      if (!this.v) {
         return false;
      } else {
         bnq $$0 = this.j.an();
         boolean $$1 = $$0 instanceof chl && !this.j.m.Z;
         if ($$1 && !((chl)$$0).fU().e) {
            cpd $$2 = ((boi)$$0).eT();
            enx $$3 = this.j.v;
            if ($$3 != null && $$3.c() == enx.a.b) {
               hz $$4 = ((env)$$3).a();
               dlj $$5 = this.j.r.a_($$4);
               if (this.j.q.j() == cvo.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dln $$6 = new dln(this.j.r, $$4, false);
                  iv<cys> $$7 = this.j.r.I_().d(kg.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, esh $$2) {
      this.z.a($$0);
      if (this.j.an() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aH().a("center");
      boolean $$3 = this.az();
      this.j.aH().b("camera");
      ewz $$4 = this.N;
      bnq $$5 = (bnq)(this.j.an() == null ? this.j.s : this.j.an());
      $$4.a(this.j.r, $$5, !this.j.m.ax().a(), this.j.m.ax().b(), this.j.r.s().a($$5) ? 1.0F : $$0);
      this.m = (float)(this.j.m.aA() * 16);
      esh $$6 = new esh();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.j.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.j.m.ag().c().floatValue();
      float $$9 = awi.i($$0, this.j.s.cA, this.j.s.cz) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.j.s.a(bnf.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, awi.g / 2.0F, awi.g / 2.0F));
         $$6.a($$12.rotationDegrees(((float)this.p + $$0) * (float)$$10));
         $$6.b(1.0F / $$11, 1.0F, 1.0F);
         float $$13 = -((float)this.p + $$0) * (float)$$10;
         $$6.a($$12.rotationDegrees($$13));
      }

      Matrix4f $$14 = $$6.c().a();
      this.a($$14);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$7, (double)this.j.m.ae().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$14);
      this.j.aH().b("hand");
      if (this.u) {
         RenderSystem.clear(256, exo.a);
         this.a($$2, $$4, $$0);
      }

      this.j.aH().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public eze j() {
      return this.n;
   }

   public void a(cpd $$0) {
      this.F = $$0;
      this.G = 40;
      this.H = this.l.i() * 2.0F - 1.0F;
      this.I = this.l.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.F != null && this.G > 0) {
         int $$3 = 40 - this.G;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.H * (float)($$0 / 4);
         float $$10 = this.I * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         esh $$11 = new esh();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * awi.e(awi.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * awi.e(awi.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * awi.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * awi.e(awi.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * awi.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * awi.b($$4 * 8.0F)));
         fvt.a $$13 = this.o.c();
         this.j.ar().a(this.F, cpa.i, 15728880, ggs.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ezb $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = awi.i($$1, 2.0F, 1.0F);
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

   public exo k() {
      return this.j;
   }

   public float b(float $$0) {
      return awi.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public ewz m() {
      return this.N;
   }

   public fvs n() {
      return this.z;
   }

   public ggs o() {
      return this.A;
   }

   @Nullable
   public static fwh p() {
      return P;
   }

   @Nullable
   public static fwh q() {
      return Q;
   }

   @Nullable
   public static fwh r() {
      return R;
   }

   @Nullable
   public static fwh s() {
      return S;
   }

   @Nullable
   public static fwh t() {
      return T;
   }

   @Nullable
   public static fwh u() {
      return U;
   }

   @Nullable
   public static fwh v() {
      return V;
   }

   @Nullable
   public static fwh w() {
      return W;
   }

   @Nullable
   public static fwh x() {
      return X;
   }

   @Nullable
   public static fwh y() {
      return Y;
   }

   @Nullable
   public static fwh z() {
      return Z;
   }

   @Nullable
   public static fwh A() {
      return aa;
   }

   @Nullable
   public static fwh B() {
      return ab;
   }

   @Nullable
   public static fwh C() {
      return ac;
   }

   @Nullable
   public static fwh D() {
      return ad;
   }

   @Nullable
   public static fwh E() {
      return ae;
   }

   @Nullable
   public static fwh F() {
      return af;
   }

   @Nullable
   public static fwh G() {
      return ag;
   }

   @Nullable
   public static fwh H() {
      return ah;
   }

   @Nullable
   public static fwh I() {
      return ai;
   }

   @Nullable
   public static fwh J() {
      return aj;
   }

   @Nullable
   public static fwh K() {
      return ak;
   }

   @Nullable
   public static fwh L() {
      return al;
   }

   @Nullable
   public static fwh M() {
      return am;
   }

   @Nullable
   public static fwh N() {
      return an;
   }

   @Nullable
   public static fwh O() {
      return ao;
   }

   @Nullable
   public static fwh P() {
      return ap;
   }

   @Nullable
   public static fwh Q() {
      return aq;
   }

   @Nullable
   public static fwh R() {
      return ar;
   }

   @Nullable
   public static fwh S() {
      return as;
   }

   @Nullable
   public static fwh T() {
      return at;
   }

   @Nullable
   public static fwh U() {
      return au;
   }

   @Nullable
   public static fwh V() {
      return av;
   }

   @Nullable
   public static fwh W() {
      return aw;
   }

   @Nullable
   public static fwh X() {
      return ax;
   }

   @Nullable
   public static fwh Y() {
      return ay;
   }

   @Nullable
   public static fwh Z() {
      return az;
   }

   @Nullable
   public static fwh aa() {
      return aA;
   }

   @Nullable
   public static fwh ab() {
      return aB;
   }

   @Nullable
   public static fwh ac() {
      return aC;
   }

   @Nullable
   public static fwh ad() {
      return aD;
   }

   @Nullable
   public static fwh ae() {
      return aE;
   }

   @Nullable
   public static fwh af() {
      return aF;
   }

   @Nullable
   public static fwh ag() {
      return aG;
   }

   @Nullable
   public static fwh ah() {
      return aH;
   }

   @Nullable
   public static fwh ai() {
      return aI;
   }

   @Nullable
   public static fwh aj() {
      return aJ;
   }

   @Nullable
   public static fwh ak() {
      return aK;
   }

   @Nullable
   public static fwh al() {
      return aL;
   }

   @Nullable
   public static fwh am() {
      return aM;
   }

   @Nullable
   public static fwh an() {
      return aN;
   }

   @Nullable
   public static fwh ao() {
      return aO;
   }

   @Nullable
   public static fwh ap() {
      return aP;
   }

   @Nullable
   public static fwh aq() {
      return aQ;
   }

   @Nullable
   public static fwh ar() {
      return aR;
   }

   @Nullable
   public static fwh as() {
      return aS;
   }

   @Nullable
   public static fwh at() {
      return aT;
   }

   @Nullable
   public static fwh au() {
      return aU;
   }

   @Nullable
   public static fwh av() {
      return aV;
   }

   public static record a(ase a, Map<aiy, arz> b) implements ase {
      @Override
      public Optional<arz> getResource(aiy $$0) {
         arz $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
