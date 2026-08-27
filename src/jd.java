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
   private static final Map<aeu, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aeu a = new aeu("root");
   private static final ic<ic<?>> as = new ho<>(aet.a(a), Lifecycle.stable());
   public static final hb<djo> b = b(je.z, "step", $$0 -> djo.P);
   public static final ht<aoy> c = a(je.ad, $$0 -> aoz.ma);
   public static final hb<eag> d = b(je.w, "empty", $$0 -> eai.a);
   public static final ht<bhw> e = b(je.O, $$0 -> bia.z);
   public static final hb<csq> f = b(je.e, "air", $$0 -> csr.a);
   public static final ht<cnj> g = b(je.r, $$0 -> cnn.x);
   public static final hb<bip<?>> h = b(je.s, "pig", $$0 -> bip.av);
   public static final hb<civ> i = b(je.D, "air", $$0 -> cjd.a);
   public static final hb<ckx> j = b(je.V, "empty", $$0 -> cla.b);
   public static final ht<iw<?>> k = a(je.Q, $$0 -> ix.c);
   public static final ht<dcs<?>> l = b(je.f, $$0 -> dcs.a);
   public static final hb<bye> m = a(je.P, "kebab", byf::a);
   public static final ht<aeu> n = a(je.o, $$0 -> apj.E);
   public static final hb<dhf> o = a(je.l, "empty", $$0 -> dhf.c);
   public static final ht<dyr<?>> p = a(je.Z, $$0 -> dyr.a);
   public static final ht<dzf<?>> q = a(je.aa, $$0 -> dzf.b);
   public static final ht<dyk<?>> r = a(je.U, $$0 -> dyk.a);
   public static final ht<cfl<?>> s = a(je.N, $$0 -> cfl.h);
   public static final ht<cmi<?>> t = a(je.X, $$0 -> cmi.a);
   public static final ht<cmh<?>> u = a(je.W, $$0 -> cmh.b);
   public static final ht<bkc> v = a(je.b, $$0 -> bkh.k);
   public static final ht<djt<?>> w = a(je.T, $$0 -> djt.a);
   public static final ht<gi<?, ?>> x = a(je.m, gj::a);
   public static final ht<api<?>> y = a(je.ae, $$0 -> apj.c);
   public static final hb<cbh> z = a(je.an, "plains", $$0 -> cbh.c);
   public static final hb<cbf> A = a(je.am, "none", $$0 -> cbf.b);
   public static final ht<bud> B = a(je.S, bue::a);
   public static final hb<bsc<?>> C = a(je.M, "dummy", $$0 -> bsc.a);
   public static final hb<bth<?>> D = a(je.ac, "dummy", $$0 -> bth.a);
   public static final ht<cdc> E = a(je.ab, $$0 -> cdc.c);
   public static final ht<cda> F = a(je.a, $$0 -> cda.b);
   public static final ht<edf> G = a(je.I, $$0 -> edc.b);
   public static final ht<edz> H = a(je.F, $$0 -> eea.c);
   public static final ht<efl> I = a(je.E, $$0 -> efm.b);
   public static final ht<ege> J = a(je.H, $$0 -> egg.b);
   public static final ht<efx> K = a(je.G, $$0 -> efz.c);
   public static final ht<egm> L = a(je.J, $$0 -> ego.c);
   public static final ht<bfx<?>> M = a(je.v, $$0 -> bfx.a);
   public static final ht<bfz<?>> N = a(je.C, $$0 -> bfz.a);
   public static final ht<dtl<?>> O = a(je.A, $$0 -> dtl.a);
   public static final ht<dlv<?>> P = a(je.g, $$0 -> dlv.k);
   public static final ht<dms<?>> Q = a(je.i, $$0 -> dms.a);
   public static final ht<dnr<?>> R = a(je.t, $$0 -> dnr.I);
   public static final ht<dwb<?>> S = a(je.ag, $$0 -> dwb.a);
   public static final ht<dvu> T = a(je.af, $$0 -> dvu.c);
   public static final ht<dvm<?>> U = a(je.aj, $$0 -> dvm.f);
   public static final ht<dul<?>> V = a(je.R, $$0 -> dul.f);
   public static final ht<drx<?>> W = a(je.h, $$0 -> drx.a);
   public static final ht<dri<?>> X = a(je.x, $$0 -> dri.a);
   public static final ht<dta<?>> Y = a(je.al, $$0 -> dta.a);
   public static final ht<dru<?>> Z = a(je.Y, $$0 -> dru.a);
   public static final ht<dso<?>> aa = a(je.ak, $$0 -> dso.b);
   public static final ht<dqx<?>> ab = a(je.u, $$0 -> dqx.a);
   public static final ht<Codec<? extends cqs>> ac = a(je.d, Lifecycle.stable(), cqt::a);
   public static final ht<Codec<? extends dhb>> ad = a(je.k, Lifecycle.stable(), dhd::a);
   public static final ht<Codec<? extends dle.f>> ae = a(je.K, dle.f::a);
   public static final ht<Codec<? extends dle.o>> af = a(je.L, dle.o::a);
   public static final ht<Codec<? extends dkg>> ag = a(je.q, dkh::a);
   public static final ht<dyv<?>> ah = a(je.ai, $$0 -> dyv.e);
   public static final ht<dwl<?>> ai = a(je.ah, $$0 -> dwl.d);
   public static final ht<buq> aj = a(je.j, buq::a);
   public static final ht<bux> ak = a(je.y, $$0 -> bux.a);
   public static final ht<dch> al = a(je.c, dci::a);
   public static final ht<cis> am = a(je.B, ciu::a);
   public static final ht<String> an = a(je.ao, ddg::a);
   public static final ht<chg> ao = a(je.n, chh::a);
   public static final ht<? extends ht<?>> ap = as;

   private static <T> ht<T> a(aet<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ht<T> b(aet<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, new ho<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hb<T> a(aet<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hb<T> b(aet<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ht<T> a(aet<? extends ht<T>> $$0, Lifecycle $$1, jd.a<T> $$2) {
      return a($$0, new ho<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hb<T> a(aet<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hb<T> b(aet<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ic<T>> R a(aet<? extends ht<T>> $$0, R $$1, jd.a<T> $$2, Lifecycle $$3) {
      aeu $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aet<ic<?>>)$$0, $$1, $$3);
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
            aeu $$2 = ((hb)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(ht<T> var1);
   }
}
