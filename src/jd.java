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
   private static final Map<aey, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aey a = new aey("root");
   private static final ic<ic<?>> as = new ho<>(aex.a(a), Lifecycle.stable());
   public static final hb<djv> b = b(je.z, "step", $$0 -> djv.P);
   public static final ht<ape> c = a(je.ad, $$0 -> apf.ma);
   public static final hb<ean> d = b(je.w, "empty", $$0 -> eap.a);
   public static final ht<bid> e = b(je.O, $$0 -> bih.z);
   public static final hb<csx> f = b(je.e, "air", $$0 -> csy.a);
   public static final ht<cnq> g = b(je.r, $$0 -> cnu.x);
   public static final hb<biw<?>> h = b(je.s, "pig", $$0 -> biw.av);
   public static final hb<cjc> i = b(je.D, "air", $$0 -> cjk.a);
   public static final hb<cle> j = b(je.V, "empty", $$0 -> clh.b);
   public static final ht<iw<?>> k = a(je.Q, $$0 -> ix.c);
   public static final ht<dcz<?>> l = b(je.f, $$0 -> dcz.a);
   public static final hb<byl> m = a(je.P, "kebab", bym::a);
   public static final ht<aey> n = a(je.o, $$0 -> app.E);
   public static final hb<dhm> o = a(je.l, "empty", $$0 -> dhm.c);
   public static final ht<dyy<?>> p = a(je.Z, $$0 -> dyy.a);
   public static final ht<dzm<?>> q = a(je.aa, $$0 -> dzm.b);
   public static final ht<dyr<?>> r = a(je.U, $$0 -> dyr.a);
   public static final ht<cfs<?>> s = a(je.N, $$0 -> cfs.h);
   public static final ht<cmp<?>> t = a(je.X, $$0 -> cmp.a);
   public static final ht<cmo<?>> u = a(je.W, $$0 -> cmo.b);
   public static final ht<bkj> v = a(je.b, $$0 -> bko.k);
   public static final ht<dka<?>> w = a(je.T, $$0 -> dka.a);
   public static final ht<gi<?, ?>> x = a(je.m, gj::a);
   public static final ht<apo<?>> y = a(je.ae, $$0 -> app.c);
   public static final hb<cbo> z = a(je.an, "plains", $$0 -> cbo.c);
   public static final hb<cbm> A = a(je.am, "none", $$0 -> cbm.b);
   public static final ht<buk> B = a(je.S, bul::a);
   public static final hb<bsj<?>> C = a(je.M, "dummy", $$0 -> bsj.a);
   public static final hb<bto<?>> D = a(je.ac, "dummy", $$0 -> bto.a);
   public static final ht<cdj> E = a(je.ab, $$0 -> cdj.c);
   public static final ht<cdh> F = a(je.a, $$0 -> cdh.b);
   public static final ht<edm> G = a(je.I, $$0 -> edj.b);
   public static final ht<eeg> H = a(je.F, $$0 -> eeh.c);
   public static final ht<efs> I = a(je.E, $$0 -> eft.b);
   public static final ht<egl> J = a(je.H, $$0 -> egn.b);
   public static final ht<ege> K = a(je.G, $$0 -> egg.c);
   public static final ht<egt> L = a(je.J, $$0 -> egv.c);
   public static final ht<bge<?>> M = a(je.v, $$0 -> bge.a);
   public static final ht<bgg<?>> N = a(je.C, $$0 -> bgg.a);
   public static final ht<dts<?>> O = a(je.A, $$0 -> dts.a);
   public static final ht<dmc<?>> P = a(je.g, $$0 -> dmc.k);
   public static final ht<dmz<?>> Q = a(je.i, $$0 -> dmz.a);
   public static final ht<dny<?>> R = a(je.t, $$0 -> dny.I);
   public static final ht<dwi<?>> S = a(je.ag, $$0 -> dwi.a);
   public static final ht<dwb> T = a(je.af, $$0 -> dwb.c);
   public static final ht<dvt<?>> U = a(je.aj, $$0 -> dvt.f);
   public static final ht<dus<?>> V = a(je.R, $$0 -> dus.f);
   public static final ht<dse<?>> W = a(je.h, $$0 -> dse.a);
   public static final ht<drp<?>> X = a(je.x, $$0 -> drp.a);
   public static final ht<dth<?>> Y = a(je.al, $$0 -> dth.a);
   public static final ht<dsb<?>> Z = a(je.Y, $$0 -> dsb.a);
   public static final ht<dsv<?>> aa = a(je.ak, $$0 -> dsv.b);
   public static final ht<dre<?>> ab = a(je.u, $$0 -> dre.a);
   public static final ht<Codec<? extends cqz>> ac = a(je.d, Lifecycle.stable(), cra::a);
   public static final ht<Codec<? extends dhi>> ad = a(je.k, Lifecycle.stable(), dhk::a);
   public static final ht<Codec<? extends dll.f>> ae = a(je.K, dll.f::a);
   public static final ht<Codec<? extends dll.o>> af = a(je.L, dll.o::a);
   public static final ht<Codec<? extends dkn>> ag = a(je.q, dko::a);
   public static final ht<dzc<?>> ah = a(je.ai, $$0 -> dzc.e);
   public static final ht<dws<?>> ai = a(je.ah, $$0 -> dws.d);
   public static final ht<bux> aj = a(je.j, bux::a);
   public static final ht<bve> ak = a(je.y, $$0 -> bve.a);
   public static final ht<dco> al = a(je.c, dcp::a);
   public static final ht<ciz> am = a(je.B, cjb::a);
   public static final ht<String> an = a(je.ao, ddn::a);
   public static final ht<chn> ao = a(je.n, cho::a);
   public static final ht<? extends ht<?>> ap = as;

   private static <T> ht<T> a(aex<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ht<T> b(aex<? extends ht<T>> $$0, jd.a<T> $$1) {
      return a($$0, new ho<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hb<T> a(aex<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hb<T> b(aex<? extends ht<T>> $$0, String $$1, jd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ht<T> a(aex<? extends ht<T>> $$0, Lifecycle $$1, jd.a<T> $$2) {
      return a($$0, new ho<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hb<T> a(aex<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hb<T> b(aex<? extends ht<T>> $$0, String $$1, Lifecycle $$2, jd.a<T> $$3) {
      return a($$0, new ha<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ic<T>> R a(aex<? extends ht<T>> $$0, R $$1, jd.a<T> $$2, Lifecycle $$3) {
      aey $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aex<ic<?>>)$$0, $$1, $$3);
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
            aey $$2 = ((hb)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(ht<T> var1);
   }
}
