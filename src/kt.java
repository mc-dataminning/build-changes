import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kt {
   private static final Logger au = LogUtils.getLogger();
   private static final Map<ajv, Supplier<?>> av = Maps.newLinkedHashMap();
   private static final jj<jj<?>> aw = new iv<>(aju.a(ku.a), Lifecycle.stable());
   public static final ii<dub> a = a(ku.C, "step", dub::a);
   public static final ja<aun> b = a(ku.ag, $$0 -> auo.nn);
   public static final ii<ela> c = b(ku.z, "empty", $$0 -> elc.a);
   public static final ja<bpk> d = a(ku.R, bpo::a);
   public static final ii<dch> e = b(ku.f, "air", $$0 -> dcj.a);
   public static final ja<cwz> f = b(ku.u, $$0 -> cxc.x);
   public static final ii<bqg<?>> g = b(ku.v, "pig", $$0 -> bqg.ay);
   public static final ii<crn> h = b(ku.G, "air", $$0 -> crv.a);
   public static final ja<cto> i = a(ku.Y, ctr::a);
   public static final ja<km<?>> j = a(ku.T, $$0 -> kn.c);
   public static final ja<dmq<?>> k = b(ku.h, $$0 -> dmq.a);
   public static final ii<cgg> l = a(ku.S, "kebab", cgh::a);
   public static final ja<ajv> m = a(ku.r, $$0 -> auz.E);
   public static final ii<dsd> n = a(ku.o, "empty", $$0 -> dsd.c);
   public static final ja<ejl<?>> o = a(ku.ac, $$0 -> ejl.a);
   public static final ja<ejz<?>> p = a(ku.ad, $$0 -> ejz.b);
   public static final ja<eje<?>> q = a(ku.X, $$0 -> eje.a);
   public static final ja<cod<?>> r = a(ku.Q, $$0 -> cod.i);
   public static final ja<cvx<?>> s = a(ku.aa, $$0 -> cvx.a);
   public static final ja<cvw<?>> t = a(ku.Z, $$0 -> cvw.b);
   public static final ja<brv> u = a(ku.c, bsa::a);
   public static final ja<dug<?>> v = a(ku.W, $$0 -> dug.a);
   public static final ja<hp<?, ?>> w = a(ku.p, hq::a);
   public static final ja<auy<?>> x = a(ku.ah, $$0 -> auz.c);
   public static final ii<cjs> y = a(ku.ar, "plains", $$0 -> cjs.c);
   public static final ii<cjq> z = a(ku.aq, "none", $$0 -> cjq.b);
   public static final ja<cbz> A = a(ku.V, cca::a);
   public static final ii<bzw<?>> B = a(ku.P, "dummy", $$0 -> bzw.a);
   public static final ii<cbd<?>> C = a(ku.af, "dummy", $$0 -> cbd.a);
   public static final ja<clr> D = a(ku.ae, $$0 -> clr.c);
   public static final ja<clp> E = a(ku.b, $$0 -> clp.b);
   public static final ja<eoe> F = a(ku.L, $$0 -> eob.b);
   public static final ja<eoz> G = a(ku.I, $$0 -> epa.c);
   public static final ja<eqm> H = a(ku.H, $$0 -> eqn.b);
   public static final ja<erf> I = a(ku.K, $$0 -> erh.b);
   public static final ja<eqy> J = a(ku.J, $$0 -> era.c);
   public static final ja<ern> K = a(ku.M, $$0 -> erp.c);
   public static final ja<bnj<?>> L = a(ku.y, $$0 -> bnj.a);
   public static final ja<bnl<?>> M = a(ku.F, $$0 -> bnl.a);
   public static final ja<edy<?>> N = a(ku.D, $$0 -> edy.a);
   public static final ja<dwi<?>> O = a(ku.i, $$0 -> dwi.k);
   public static final ja<dxf<?>> P = a(ku.k, $$0 -> dxf.a);
   public static final ja<dye<?>> Q = a(ku.w, $$0 -> dye.I);
   public static final ja<ego<?>> R = a(ku.aj, $$0 -> ego.a);
   public static final ja<egh> S = a(ku.ai, $$0 -> egh.c);
   public static final ja<efz<?>> T = a(ku.an, $$0 -> efz.f);
   public static final ja<eey<?>> U = a(ku.U, $$0 -> eey.f);
   public static final ja<eck<?>> V = a(ku.j, $$0 -> eck.a);
   public static final ja<ebv<?>> W = a(ku.A, $$0 -> ebv.a);
   public static final ja<edn<?>> X = a(ku.ap, $$0 -> edn.a);
   public static final ja<ech<?>> Y = a(ku.ab, $$0 -> ech.a);
   public static final ja<edb<?>> Z = a(ku.ao, $$0 -> edb.b);
   public static final ja<ebk<?>> aa = a(ku.x, $$0 -> ebk.a);
   public static final ja<Codec<? extends daj>> ab = a(ku.e, dak::a);
   public static final ja<Codec<? extends drf>> ac = a(ku.n, drh::a);
   public static final ja<Codec<? extends dvr.f>> ad = a(ku.N, dvr.f::a);
   public static final ja<Codec<? extends dvr.o>> ae = a(ku.O, dvr.o::a);
   public static final ja<Codec<? extends dut>> af = a(ku.t, duu::a);
   public static final ja<MapCodec<? extends dch>> ag = a(ku.g, dci::a);
   public static final ja<ejp<?>> ah = a(ku.am, $$0 -> ejp.e);
   public static final ja<egy<?>> ai = a(ku.ak, $$0 -> egy.d);
   public static final ja<Codec<? extends ehb>> aj = a(ku.al, ehc::a);
   public static final ja<ccm> ak = a(ku.l, ccm::a);
   public static final ja<cct> al = a(ku.B, $$0 -> cct.a);
   public static final ja<crk> am = a(ku.E, crm::a);
   public static final ja<String> an = a(ku.as, dnf::a);
   public static final ja<cqd> ao = a(ku.q, cqe::a);
   public static final ja<ap<?>> ap = a(ku.aK, am::a);
   public static final ja<xz<?>> aq = a(ku.at, ya::a);
   public static final ja<cpi> ar = a(ku.au, cpj::a);
   public static final ja<jq<?>> as = a(ku.av, jr::a);
   public static final ja<? extends ja<?>> at = aw;

   private static <T> ja<T> a(aju<? extends ja<T>> $$0, kt.a<T> $$1) {
      return a($$0, new iv<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ja<T> b(aju<? extends ja<T>> $$0, kt.a<T> $$1) {
      return a($$0, new iv<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ii<T> a(aju<? extends ja<T>> $$0, String $$1, kt.a<T> $$2) {
      return a($$0, new ih<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ii<T> b(aju<? extends ja<T>> $$0, String $$1, kt.a<T> $$2) {
      return a($$0, new ih<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jj<T>> R a(aju<? extends ja<T>> $$0, R $$1, kt.a<T> $$2) {
      ajx.a(() -> "registry " + $$0);
      ajv $$3 = $$0.a();
      av.put($$3, () -> $$2.run($$1));
      aw.a((aju<jj<?>>)$$0, $$1, iz.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(at);
   }

   private static void b() {
      av.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            au.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      at.l();

      for (ja<?> $$0 : at) {
         $$0.l();
      }
   }

   private static <T extends ja<?>> void a(ja<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ii) {
            ajv $$2 = ((ii)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ja<T> var1);
   }
}
