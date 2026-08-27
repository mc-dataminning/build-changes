import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kf {
   private static final Logger at = LogUtils.getLogger();
   private static final Map<aiy, Supplier<?>> au = Maps.newLinkedHashMap();
   private static final je<je<?>> av = new ir<>(aix.a(kg.a), Lifecycle.stable());
   public static final id<dpw> a = a(kg.B, "step", dpw::a);
   public static final iv<atk> b = a(kg.af, $$0 -> atl.ne);
   public static final id<egv> c = b(kg.y, "empty", $$0 -> egx.a);
   public static final iv<bnb> d = a(kg.Q, bnf::a);
   public static final id<cys> e = b(kg.f, "air", $$0 -> cyu.a);
   public static final iv<ctm> f = b(kg.t, $$0 -> ctp.x);
   public static final id<bnw<?>> g = b(kg.u, "pig", $$0 -> bnw.ax);
   public static final id<coy> h = b(kg.F, "air", $$0 -> cpg.a);
   public static final id<cqz> i = a(kg.X, "empty", crc::a);
   public static final iv<jy<?>> j = a(kg.S, $$0 -> jz.c);
   public static final iv<diz<?>> k = b(kg.h, $$0 -> diz.a);
   public static final id<cds> l = a(kg.R, "kebab", cdt::a);
   public static final iv<aiy> m = a(kg.q, $$0 -> atv.E);
   public static final id<dnk> n = a(kg.n, "empty", $$0 -> dnk.c);
   public static final iv<efg<?>> o = a(kg.ab, $$0 -> efg.a);
   public static final iv<efu<?>> p = a(kg.ac, $$0 -> efu.b);
   public static final iv<eez<?>> q = a(kg.W, $$0 -> eez.a);
   public static final iv<clm<?>> r = a(kg.P, $$0 -> clm.i);
   public static final iv<csk<?>> s = a(kg.Z, $$0 -> csk.a);
   public static final iv<csj<?>> t = a(kg.Y, $$0 -> csj.b);
   public static final iv<bpk> u = a(kg.c, bpp::a);
   public static final iv<dqb<?>> v = a(kg.V, $$0 -> dqb.a);
   public static final iv<hl<?, ?>> w = a(kg.o, hm::a);
   public static final iv<atu<?>> x = a(kg.ag, $$0 -> atv.c);
   public static final id<chd> y = a(kg.aq, "plains", $$0 -> chd.c);
   public static final id<chb> z = a(kg.ap, "none", $$0 -> chb.b);
   public static final iv<bzo> A = a(kg.U, bzp::a);
   public static final id<bxl<?>> B = a(kg.O, "dummy", $$0 -> bxl.a);
   public static final id<bys<?>> C = a(kg.ae, "dummy", $$0 -> bys.a);
   public static final iv<cja> D = a(kg.ad, $$0 -> cja.c);
   public static final iv<ciy> E = a(kg.b, $$0 -> ciy.b);
   public static final iv<ejw> F = a(kg.K, $$0 -> ejt.b);
   public static final iv<ekq> G = a(kg.H, $$0 -> ekr.c);
   public static final iv<emc> H = a(kg.G, $$0 -> emd.b);
   public static final iv<emv> I = a(kg.J, $$0 -> emx.b);
   public static final iv<emo> J = a(kg.I, $$0 -> emq.c);
   public static final iv<end> K = a(kg.L, $$0 -> enf.c);
   public static final iv<bla<?>> L = a(kg.x, $$0 -> bla.a);
   public static final iv<blc<?>> M = a(kg.E, $$0 -> blc.a);
   public static final iv<dzt<?>> N = a(kg.C, $$0 -> dzt.a);
   public static final iv<dsd<?>> O = a(kg.i, $$0 -> dsd.k);
   public static final iv<dta<?>> P = a(kg.k, $$0 -> dta.a);
   public static final iv<dtz<?>> Q = a(kg.v, $$0 -> dtz.I);
   public static final iv<ecj<?>> R = a(kg.ai, $$0 -> ecj.a);
   public static final iv<ecc> S = a(kg.ah, $$0 -> ecc.c);
   public static final iv<ebu<?>> T = a(kg.am, $$0 -> ebu.f);
   public static final iv<eat<?>> U = a(kg.T, $$0 -> eat.f);
   public static final iv<dyf<?>> V = a(kg.j, $$0 -> dyf.a);
   public static final iv<dxq<?>> W = a(kg.z, $$0 -> dxq.a);
   public static final iv<dzi<?>> X = a(kg.ao, $$0 -> dzi.a);
   public static final iv<dyc<?>> Y = a(kg.aa, $$0 -> dyc.a);
   public static final iv<dyw<?>> Z = a(kg.an, $$0 -> dyw.b);
   public static final iv<dxf<?>> aa = a(kg.w, $$0 -> dxf.a);
   public static final iv<Codec<? extends cwu>> ab = a(kg.e, Lifecycle.stable(), cwv::a);
   public static final iv<Codec<? extends dng>> ac = a(kg.m, Lifecycle.stable(), dni::a);
   public static final iv<Codec<? extends drm.f>> ad = a(kg.M, drm.f::a);
   public static final iv<Codec<? extends drm.o>> ae = a(kg.N, drm.o::a);
   public static final iv<Codec<? extends dqo>> af = a(kg.s, dqp::a);
   public static final iv<MapCodec<? extends cys>> ag = a(kg.g, cyt::a);
   public static final iv<efk<?>> ah = a(kg.al, $$0 -> efk.e);
   public static final iv<ect<?>> ai = a(kg.aj, $$0 -> ect.d);
   public static final iv<Codec<? extends ecw>> aj = a(kg.ak, ecx::a);
   public static final iv<cab> ak = a(kg.l, cab::a);
   public static final iv<cai> al = a(kg.A, $$0 -> cai.a);
   public static final iv<dio> am = a(kg.d, dip::a);
   public static final iv<cov> an = a(kg.D, cox::a);
   public static final iv<String> ao = a(kg.ar, djo::a);
   public static final iv<cnj> ap = a(kg.p, cnk::a);
   public static final iv<ap<?>> aq = a(kg.aH, am::a);
   public static final iv<xh<?>> ar = a(kg.as, xi::a);
   public static final iv<? extends iv<?>> as = av;

   private static <T> iv<T> a(aix<? extends iv<T>> $$0, kf.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> iv<T> b(aix<? extends iv<T>> $$0, kf.a<T> $$1) {
      return a($$0, new ir<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> id<T> a(aix<? extends iv<T>> $$0, String $$1, kf.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> id<T> b(aix<? extends iv<T>> $$0, String $$1, kf.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> iv<T> a(aix<? extends iv<T>> $$0, Lifecycle $$1, kf.a<T> $$2) {
      return a($$0, new ir<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> id<T> a(aix<? extends iv<T>> $$0, String $$1, Lifecycle $$2, kf.a<T> $$3) {
      return a($$0, new ic<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> id<T> b(aix<? extends iv<T>> $$0, String $$1, Lifecycle $$2, kf.a<T> $$3) {
      return a($$0, new ic<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends je<T>> R a(aix<? extends iv<T>> $$0, R $$1, kf.a<T> $$2, Lifecycle $$3) {
      aja.a(() -> "registry " + $$0);
      aiy $$4 = $$0.a();
      au.put($$4, () -> $$2.run($$1));
      av.a((aix<je<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(as);
   }

   private static void b() {
      au.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            at.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      as.l();

      for (iv<?> $$0 : as) {
         $$0.l();
      }
   }

   private static <T extends iv<?>> void a(iv<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof id) {
            aiy $$2 = ((id)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(iv<T> var1);
   }
}
