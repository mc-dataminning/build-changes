import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jb {
   private static final Logger ar = LogUtils.getLogger();
   private static final Map<aez, Supplier<?>> as = Maps.newLinkedHashMap();
   public static final aez a = new aez("root");
   private static final hz<hz<?>> at = new hm<>(aey.a(a), Lifecycle.stable());
   public static final gz<djn> b = b(jc.A, "step", $$0 -> djn.P);
   public static final hq<apf> c = a(jc.ae, $$0 -> apg.ma);
   public static final gz<eaf> d = b(jc.x, "empty", $$0 -> eah.a);
   public static final hq<bih> e = b(jc.P, $$0 -> bil.z);
   public static final gz<ctc> f = b(jc.e, "air", $$0 -> cte.a);
   public static final hq<cnu> g = b(jc.s, $$0 -> cny.x);
   public static final gz<bja<?>> h = b(jc.t, "pig", $$0 -> bja.av);
   public static final gz<cjg> i = b(jc.E, "air", $$0 -> cjo.a);
   public static final gz<cli> j = b(jc.W, "empty", $$0 -> cll.b);
   public static final hq<iu<?>> k = a(jc.R, $$0 -> iv.c);
   public static final hq<ddb<?>> l = b(jc.g, $$0 -> ddb.a);
   public static final gz<byp> m = a(jc.Q, "kebab", byq::a);
   public static final hq<aez> n = a(jc.p, $$0 -> apq.E);
   public static final gz<dhe> o = a(jc.m, "empty", $$0 -> dhe.c);
   public static final hq<dyq<?>> p = a(jc.aa, $$0 -> dyq.a);
   public static final hq<dze<?>> q = a(jc.ab, $$0 -> dze.b);
   public static final hq<dyj<?>> r = a(jc.V, $$0 -> dyj.a);
   public static final hq<cfw<?>> s = a(jc.O, $$0 -> cfw.h);
   public static final hq<cmt<?>> t = a(jc.Y, $$0 -> cmt.a);
   public static final hq<cms<?>> u = a(jc.X, $$0 -> cms.b);
   public static final hq<bkn> v = a(jc.b, $$0 -> bks.j);
   public static final hq<djs<?>> w = a(jc.U, $$0 -> djs.a);
   public static final hq<gi<?, ?>> x = a(jc.n, gj::a);
   public static final hq<app<?>> y = a(jc.af, $$0 -> apq.c);
   public static final gz<cbs> z = a(jc.ao, "plains", $$0 -> cbs.c);
   public static final gz<cbq> A = a(jc.an, "none", $$0 -> cbq.b);
   public static final hq<buo> B = a(jc.T, bup::a);
   public static final gz<bsn<?>> C = a(jc.N, "dummy", $$0 -> bsn.a);
   public static final gz<bts<?>> D = a(jc.ad, "dummy", $$0 -> bts.a);
   public static final hq<cdn> E = a(jc.ac, $$0 -> cdn.c);
   public static final hq<cdl> F = a(jc.a, $$0 -> cdl.b);
   public static final hq<ede> G = a(jc.J, $$0 -> edb.b);
   public static final hq<edy> H = a(jc.G, $$0 -> edz.c);
   public static final hq<efk> I = a(jc.F, $$0 -> efl.b);
   public static final hq<egd> J = a(jc.I, $$0 -> egf.b);
   public static final hq<efw> K = a(jc.H, $$0 -> efy.c);
   public static final hq<egl> L = a(jc.K, $$0 -> egn.c);
   public static final hq<bgi<?>> M = a(jc.w, $$0 -> bgi.a);
   public static final hq<bgk<?>> N = a(jc.D, $$0 -> bgk.a);
   public static final hq<dtk<?>> O = a(jc.B, $$0 -> dtk.a);
   public static final hq<dlu<?>> P = a(jc.h, $$0 -> dlu.k);
   public static final hq<dmr<?>> Q = a(jc.j, $$0 -> dmr.a);
   public static final hq<dnq<?>> R = a(jc.u, $$0 -> dnq.I);
   public static final hq<dwa<?>> S = a(jc.ah, $$0 -> dwa.a);
   public static final hq<dvt> T = a(jc.ag, $$0 -> dvt.c);
   public static final hq<dvl<?>> U = a(jc.ak, $$0 -> dvl.f);
   public static final hq<duk<?>> V = a(jc.S, $$0 -> duk.f);
   public static final hq<drw<?>> W = a(jc.i, $$0 -> drw.a);
   public static final hq<drh<?>> X = a(jc.y, $$0 -> drh.a);
   public static final hq<dsz<?>> Y = a(jc.am, $$0 -> dsz.a);
   public static final hq<drt<?>> Z = a(jc.Z, $$0 -> drt.a);
   public static final hq<dsn<?>> aa = a(jc.al, $$0 -> dsn.b);
   public static final hq<dqw<?>> ab = a(jc.v, $$0 -> dqw.a);
   public static final hq<Codec<? extends crd>> ac = a(jc.d, Lifecycle.stable(), cre::a);
   public static final hq<Codec<? extends dha>> ad = a(jc.l, Lifecycle.stable(), dhc::a);
   public static final hq<Codec<? extends dld.f>> ae = a(jc.L, dld.f::a);
   public static final hq<Codec<? extends dld.o>> af = a(jc.M, dld.o::a);
   public static final hq<Codec<? extends dkf>> ag = a(jc.r, dkg::a);
   public static final hq<MapCodec<? extends ctc>> ah = a(jc.f, ctd::a);
   public static final hq<dyu<?>> ai = a(jc.aj, $$0 -> dyu.e);
   public static final hq<dwk<?>> aj = a(jc.ai, $$0 -> dwk.d);
   public static final hq<bvb> ak = a(jc.k, bvb::a);
   public static final hq<bvi> al = a(jc.z, $$0 -> bvi.a);
   public static final hq<dcq> am = a(jc.c, dcr::a);
   public static final hq<cjd> an = a(jc.C, cjf::a);
   public static final hq<String> ao = a(jc.ap, ddp::a);
   public static final hq<chr> ap = a(jc.o, chs::a);
   public static final hq<? extends hq<?>> aq = at;

   private static <T> hq<T> a(aey<? extends hq<T>> $$0, jb.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> hq<T> b(aey<? extends hq<T>> $$0, jb.a<T> $$1) {
      return a($$0, new hm<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> gz<T> a(aey<? extends hq<T>> $$0, String $$1, jb.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> gz<T> b(aey<? extends hq<T>> $$0, String $$1, jb.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hq<T> a(aey<? extends hq<T>> $$0, Lifecycle $$1, jb.a<T> $$2) {
      return a($$0, new hm<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> gz<T> a(aey<? extends hq<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> gz<T> b(aey<? extends hq<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends hz<T>> R a(aey<? extends hq<T>> $$0, R $$1, jb.a<T> $$2, Lifecycle $$3) {
      aez $$4 = $$0.a();
      as.put($$4, () -> $$2.run($$1));
      at.a((aey<hz<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aq);
   }

   private static void b() {
      as.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ar.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aq.l();

      for (hq<?> $$0 : aq) {
         $$0.l();
      }
   }

   private static <T extends hq<?>> void a(hq<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof gz) {
            aez $$2 = ((gz)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(hq<T> var1);
   }
}
