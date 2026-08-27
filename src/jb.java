import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jb {
   private static final Logger aq = LogUtils.getLogger();
   private static final Map<aew, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aew a = new aew("root");
   private static final hz<hz<?>> as = new hm<>(aev.a(a), Lifecycle.stable());
   public static final gz<djt> b = b(jc.z, "step", $$0 -> djt.P);
   public static final hq<apc> c = a(jc.ad, $$0 -> apd.ma);
   public static final gz<eal> d = b(jc.w, "empty", $$0 -> ean.a);
   public static final hq<bib> e = b(jc.O, $$0 -> bif.z);
   public static final gz<csv> f = b(jc.e, "air", $$0 -> csw.a);
   public static final hq<cno> g = b(jc.r, $$0 -> cns.x);
   public static final gz<biu<?>> h = b(jc.s, "pig", $$0 -> biu.av);
   public static final gz<cja> i = b(jc.D, "air", $$0 -> cji.a);
   public static final gz<clc> j = b(jc.V, "empty", $$0 -> clf.b);
   public static final hq<iu<?>> k = a(jc.Q, $$0 -> iv.c);
   public static final hq<dcx<?>> l = b(jc.f, $$0 -> dcx.a);
   public static final gz<byj> m = a(jc.P, "kebab", byk::a);
   public static final hq<aew> n = a(jc.o, $$0 -> apn.E);
   public static final gz<dhk> o = a(jc.l, "empty", $$0 -> dhk.c);
   public static final hq<dyw<?>> p = a(jc.Z, $$0 -> dyw.a);
   public static final hq<dzk<?>> q = a(jc.aa, $$0 -> dzk.b);
   public static final hq<dyp<?>> r = a(jc.U, $$0 -> dyp.a);
   public static final hq<cfq<?>> s = a(jc.N, $$0 -> cfq.h);
   public static final hq<cmn<?>> t = a(jc.X, $$0 -> cmn.a);
   public static final hq<cmm<?>> u = a(jc.W, $$0 -> cmm.b);
   public static final hq<bkh> v = a(jc.b, $$0 -> bkm.k);
   public static final hq<djy<?>> w = a(jc.T, $$0 -> djy.a);
   public static final hq<gi<?, ?>> x = a(jc.m, gj::a);
   public static final hq<apm<?>> y = a(jc.ae, $$0 -> apn.c);
   public static final gz<cbm> z = a(jc.an, "plains", $$0 -> cbm.c);
   public static final gz<cbk> A = a(jc.am, "none", $$0 -> cbk.b);
   public static final hq<bui> B = a(jc.S, buj::a);
   public static final gz<bsh<?>> C = a(jc.M, "dummy", $$0 -> bsh.a);
   public static final gz<btm<?>> D = a(jc.ac, "dummy", $$0 -> btm.a);
   public static final hq<cdh> E = a(jc.ab, $$0 -> cdh.c);
   public static final hq<cdf> F = a(jc.a, $$0 -> cdf.b);
   public static final hq<edk> G = a(jc.I, $$0 -> edh.b);
   public static final hq<eee> H = a(jc.F, $$0 -> eef.c);
   public static final hq<efq> I = a(jc.E, $$0 -> efr.b);
   public static final hq<egj> J = a(jc.H, $$0 -> egl.b);
   public static final hq<egc> K = a(jc.G, $$0 -> ege.c);
   public static final hq<egr> L = a(jc.J, $$0 -> egt.c);
   public static final hq<bgc<?>> M = a(jc.v, $$0 -> bgc.a);
   public static final hq<bge<?>> N = a(jc.C, $$0 -> bge.a);
   public static final hq<dtq<?>> O = a(jc.A, $$0 -> dtq.a);
   public static final hq<dma<?>> P = a(jc.g, $$0 -> dma.k);
   public static final hq<dmx<?>> Q = a(jc.i, $$0 -> dmx.a);
   public static final hq<dnw<?>> R = a(jc.t, $$0 -> dnw.I);
   public static final hq<dwg<?>> S = a(jc.ag, $$0 -> dwg.a);
   public static final hq<dvz> T = a(jc.af, $$0 -> dvz.c);
   public static final hq<dvr<?>> U = a(jc.aj, $$0 -> dvr.f);
   public static final hq<duq<?>> V = a(jc.R, $$0 -> duq.f);
   public static final hq<dsc<?>> W = a(jc.h, $$0 -> dsc.a);
   public static final hq<drn<?>> X = a(jc.x, $$0 -> drn.a);
   public static final hq<dtf<?>> Y = a(jc.al, $$0 -> dtf.a);
   public static final hq<drz<?>> Z = a(jc.Y, $$0 -> drz.a);
   public static final hq<dst<?>> aa = a(jc.ak, $$0 -> dst.b);
   public static final hq<drc<?>> ab = a(jc.u, $$0 -> drc.a);
   public static final hq<Codec<? extends cqx>> ac = a(jc.d, Lifecycle.stable(), cqy::a);
   public static final hq<Codec<? extends dhg>> ad = a(jc.k, Lifecycle.stable(), dhi::a);
   public static final hq<Codec<? extends dlj.f>> ae = a(jc.K, dlj.f::a);
   public static final hq<Codec<? extends dlj.o>> af = a(jc.L, dlj.o::a);
   public static final hq<Codec<? extends dkl>> ag = a(jc.q, dkm::a);
   public static final hq<dza<?>> ah = a(jc.ai, $$0 -> dza.e);
   public static final hq<dwq<?>> ai = a(jc.ah, $$0 -> dwq.d);
   public static final hq<buv> aj = a(jc.j, buv::a);
   public static final hq<bvc> ak = a(jc.y, $$0 -> bvc.a);
   public static final hq<dcm> al = a(jc.c, dcn::a);
   public static final hq<cix> am = a(jc.B, ciz::a);
   public static final hq<String> an = a(jc.ao, ddl::a);
   public static final hq<chl> ao = a(jc.n, chm::a);
   public static final hq<? extends hq<?>> ap = as;

   private static <T> hq<T> a(aev<? extends hq<T>> $$0, jb.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> hq<T> b(aev<? extends hq<T>> $$0, jb.a<T> $$1) {
      return a($$0, new hm<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> gz<T> a(aev<? extends hq<T>> $$0, String $$1, jb.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> gz<T> b(aev<? extends hq<T>> $$0, String $$1, jb.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hq<T> a(aev<? extends hq<T>> $$0, Lifecycle $$1, jb.a<T> $$2) {
      return a($$0, new hm<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> gz<T> a(aev<? extends hq<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> gz<T> b(aev<? extends hq<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends hz<T>> R a(aev<? extends hq<T>> $$0, R $$1, jb.a<T> $$2, Lifecycle $$3) {
      aew $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aev<hz<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(ap);
   }

   private static void b() {
      ar.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aq.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      ap.l();

      for (hq<?> $$0 : ap) {
         $$0.l();
      }
   }

   private static <T extends hq<?>> void a(hq<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof gz) {
            aew $$2 = ((gz)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(hq<T> var1);
   }
}
