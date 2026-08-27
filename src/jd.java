import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jd {
   private static final Logger aq = LogUtils.getLogger();
   private static final Map<aex, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aex a = new aex("root");
   private static final ic<ic<?>> as = new ho<>(aew.a(a), Lifecycle.stable());
   public static final hb<djt> b = b(je.z, "step", $$0 -> djt.P);
   public static final ht<apd> c = a(je.ad, $$0 -> ape.ma);
   public static final hb<eal> d = b(je.w, "empty", $$0 -> ean.a);
   public static final ht<bib> e = b(je.O, $$0 -> bif.z);
   public static final hb<csv> f = b(je.e, "air", $$0 -> csw.a);
   public static final ht<cno> g = b(je.r, $$0 -> cns.x);
   public static final hb<biu<?>> h = b(je.s, "pig", $$0 -> biu.av);
   public static final hb<cja> i = b(je.D, "air", $$0 -> cji.a);
   public static final hb<clc> j = b(je.V, "empty", $$0 -> clf.b);
   public static final ht<iw<?>> k = a(je.Q, $$0 -> ix.c);
   public static final ht<dcx<?>> l = b(je.f, $$0 -> dcx.a);
   public static final hb<byj> m = a(je.P, "kebab", byk::a);
   public static final ht<aex> n = a(je.o, $$0 -> apo.E);
   public static final hb<dhk> o = a(je.l, "empty", $$0 -> dhk.c);
   public static final ht<dyw<?>> p = a(je.Z, $$0 -> dyw.a);
   public static final ht<dzk<?>> q = a(je.aa, $$0 -> dzk.b);
   public static final ht<dyp<?>> r = a(je.U, $$0 -> dyp.a);
   public static final ht<cfq<?>> s = a(je.N, $$0 -> cfq.h);
   public static final ht<cmn<?>> t = a(je.X, $$0 -> cmn.a);
   public static final ht<cmm<?>> u = a(je.W, $$0 -> cmm.b);
   public static final ht<bkh> v = a(je.b, $$0 -> bkm.k);
   public static final ht<djy<?>> w = a(je.T, $$0 -> djy.a);
   public static final ht<gi<?, ?>> x = a(je.m, gj::a);
   public static final ht<apn<?>> y = a(je.ae, $$0 -> apo.c);
   public static final hb<cbm> z = a(je.an, "plains", $$0 -> cbm.c);
   public static final hb<cbk> A = a(je.am, "none", $$0 -> cbk.b);
   public static final ht<bui> B = a(je.S, buj::a);
   public static final hb<bsh<?>> C = a(je.M, "dummy", $$0 -> bsh.a);
   public static final hb<btm<?>> D = a(je.ac, "dummy", $$0 -> btm.a);
   public static final ht<cdh> E = a(je.ab, $$0 -> cdh.c);
   public static final ht<cdf> F = a(je.a, $$0 -> cdf.b);
   public static final ht<edk> G = a(je.I, $$0 -> edh.b);
   public static final ht<eee> H = a(je.F, $$0 -> eef.c);
   public static final ht<efq> I = a(je.E, $$0 -> efr.b);
   public static final ht<egj> J = a(je.H, $$0 -> egl.b);
   public static final ht<egc> K = a(je.G, $$0 -> ege.c);
   public static final ht<egr> L = a(je.J, $$0 -> egt.c);
   public static final ht<bgc<?>> M = a(je.v, $$0 -> bgc.a);
   public static final ht<bge<?>> N = a(je.C, $$0 -> bge.a);
   public static final ht<dtq<?>> O = a(je.A, $$0 -> dtq.a);
   public static final ht<dma<?>> P = a(je.g, $$0 -> dma.k);
   public static final ht<dmx<?>> Q = a(je.i, $$0 -> dmx.a);
   public static final ht<dnw<?>> R = a(je.t, $$0 -> dnw.I);
   public static final ht<dwg<?>> S = a(je.ag, $$0 -> dwg.a);
   public static final ht<dvz> T = a(je.af, $$0 -> dvz.c);
   public static final ht<dvr<?>> U = a(je.aj, $$0 -> dvr.f);
   public static final ht<duq<?>> V = a(je.R, $$0 -> duq.f);
   public static final ht<dsc<?>> W = a(je.h, $$0 -> dsc.a);
   public static final ht<drn<?>> X = a(je.x, $$0 -> drn.a);
   public static final ht<dtf<?>> Y = a(je.al, $$0 -> dtf.a);
   public static final ht<drz<?>> Z = a(je.Y, $$0 -> drz.a);
   public static final ht<dst<?>> aa = a(je.ak, $$0 -> dst.b);
   public static final ht<drc<?>> ab = a(je.u, $$0 -> drc.a);
   public static final ht<Codec<? extends cqx>> ac = a(je.d, Lifecycle.stable(), cqy::a);
   public static final ht<Codec<? extends dhg>> ad = a(je.k, Lifecycle.stable(), dhi::a);
   public static final ht<Codec<? extends dlj.f>> ae = a(je.K, dlj.f::a);
   public static final ht<Codec<? extends dlj.o>> af = a(je.L, dlj.o::a);
   public static final ht<Codec<? extends dkl>> ag = a(je.q, dkm::a);
   public static final ht<dza<?>> ah = a(je.ai, $$0 -> dza.e);
   public static final ht<dwq<?>> ai = a(je.ah, $$0 -> dwq.d);
   public static final ht<buv> aj = a(je.j, buv::a);
   public static final ht<bvc> ak = a(je.y, $$0 -> bvc.a);
   public static final ht<dcm> al = a(je.c, dcn::a);
   public static final ht<cix> am = a(je.B, ciz::a);
   public static final ht<String> an = a(je.ao, ddl::a);
   public static final ht<chl> ao = a(je.n, chm::a);
   public static final ht<? extends ht<?>> ap = as;

   private static <T> ht<T> a(aew<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ht<T> b(aew<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, new ho<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hb<T> a(aew<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hb<T> b(aew<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ht<T> a(aew<? extends ht<T>> $$0, Lifecycle $$1, jd.a<T> $$2) {
      return a($$0, new ho<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hb<T> a(aew<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hb<T> b(aew<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ic<T>> R a(aew<? extends ht<T>> $$0, R $$1, jd.a<T> $$2, Lifecycle $$3) {
      aex $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aew<ic<?>>)$$0, $$1, $$3);
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

      for (ht<?> $$0 : ap) {
         $$0.l();
      }
   }

   private static <T extends ht<?>> void a(ht<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof hb) {
            aex $$2 = ((hb)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(ht<T> var1);
   }
}
