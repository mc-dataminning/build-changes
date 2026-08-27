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
   private static final Map<aer, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aer a = new aer("root");
   private static final ia<ia<?>> as = new hm<>(aeq.a(a), Lifecycle.stable());
   public static final gz<djk> b = b(jc.z, "step", $$0 -> djk.P);
   public static final hr<aov> c = a(jc.ad, $$0 -> aow.ma);
   public static final gz<eac> d = b(jc.w, "empty", $$0 -> eae.a);
   public static final hr<bht> e = b(jc.O, $$0 -> bhx.z);
   public static final gz<csm> f = b(jc.e, "air", $$0 -> csn.a);
   public static final hr<cnf> g = b(jc.r, $$0 -> cnj.x);
   public static final gz<bim<?>> h = b(jc.s, "pig", $$0 -> bim.av);
   public static final gz<cit> i = b(jc.D, "air", $$0 -> cjb.a);
   public static final gz<ckv> j = b(jc.V, "empty", $$0 -> cky.b);
   public static final hr<iu<?>> k = a(jc.Q, $$0 -> iv.c);
   public static final hr<dco<?>> l = b(jc.f, $$0 -> dco.a);
   public static final gz<byc> m = a(jc.P, "kebab", byd::a);
   public static final hr<aer> n = a(jc.o, $$0 -> apg.E);
   public static final gz<dhb> o = a(jc.l, "empty", $$0 -> dhb.c);
   public static final hr<dyn<?>> p = a(jc.Z, $$0 -> dyn.a);
   public static final hr<dzb<?>> q = a(jc.aa, $$0 -> dzb.b);
   public static final hr<dyg<?>> r = a(jc.U, $$0 -> dyg.a);
   public static final hr<cfj<?>> s = a(jc.N, $$0 -> cfj.h);
   public static final hr<cme<?>> t = a(jc.X, $$0 -> cme.a);
   public static final hr<cmd<?>> u = a(jc.W, $$0 -> cmd.b);
   public static final hr<bka> v = a(jc.b, $$0 -> bkf.k);
   public static final hr<djp<?>> w = a(jc.T, $$0 -> djp.a);
   public static final hr<gg<?, ?>> x = a(jc.m, gh::a);
   public static final hr<apf<?>> y = a(jc.ae, $$0 -> apg.c);
   public static final gz<cbf> z = a(jc.an, "plains", $$0 -> cbf.c);
   public static final gz<cbd> A = a(jc.am, "none", $$0 -> cbd.b);
   public static final hr<bub> B = a(jc.S, buc::a);
   public static final gz<bsa<?>> C = a(jc.M, "dummy", $$0 -> bsa.a);
   public static final gz<btf<?>> D = a(jc.ac, "dummy", $$0 -> btf.a);
   public static final hr<cda> E = a(jc.ab, $$0 -> cda.c);
   public static final hr<ccy> F = a(jc.a, $$0 -> ccy.b);
   public static final hr<edb> G = a(jc.I, $$0 -> ecy.b);
   public static final hr<edv> H = a(jc.F, $$0 -> edw.c);
   public static final hr<efh> I = a(jc.E, $$0 -> efi.b);
   public static final hr<ega> J = a(jc.H, $$0 -> egc.b);
   public static final hr<eft> K = a(jc.G, $$0 -> efv.c);
   public static final hr<egi> L = a(jc.J, $$0 -> egk.c);
   public static final hr<bfu<?>> M = a(jc.v, $$0 -> bfu.a);
   public static final hr<bfw<?>> N = a(jc.C, $$0 -> bfw.a);
   public static final hr<dth<?>> O = a(jc.A, $$0 -> dth.a);
   public static final hr<dlr<?>> P = a(jc.g, $$0 -> dlr.k);
   public static final hr<dmo<?>> Q = a(jc.i, $$0 -> dmo.a);
   public static final hr<dnn<?>> R = a(jc.t, $$0 -> dnn.I);
   public static final hr<dvx<?>> S = a(jc.ag, $$0 -> dvx.a);
   public static final hr<dvq> T = a(jc.af, $$0 -> dvq.c);
   public static final hr<dvi<?>> U = a(jc.aj, $$0 -> dvi.f);
   public static final hr<duh<?>> V = a(jc.R, $$0 -> duh.f);
   public static final hr<drt<?>> W = a(jc.h, $$0 -> drt.a);
   public static final hr<dre<?>> X = a(jc.x, $$0 -> dre.a);
   public static final hr<dsw<?>> Y = a(jc.al, $$0 -> dsw.a);
   public static final hr<drq<?>> Z = a(jc.Y, $$0 -> drq.a);
   public static final hr<dsk<?>> aa = a(jc.ak, $$0 -> dsk.b);
   public static final hr<dqt<?>> ab = a(jc.u, $$0 -> dqt.a);
   public static final hr<Codec<? extends cqo>> ac = a(jc.d, Lifecycle.stable(), cqp::a);
   public static final hr<Codec<? extends dgx>> ad = a(jc.k, Lifecycle.stable(), dgz::a);
   public static final hr<Codec<? extends dla.f>> ae = a(jc.K, dla.f::a);
   public static final hr<Codec<? extends dla.o>> af = a(jc.L, dla.o::a);
   public static final hr<Codec<? extends dkc>> ag = a(jc.q, dkd::a);
   public static final hr<dyr<?>> ah = a(jc.ai, $$0 -> dyr.e);
   public static final hr<dwh<?>> ai = a(jc.ah, $$0 -> dwh.d);
   public static final hr<buo> aj = a(jc.j, buo::a);
   public static final hr<buv> ak = a(jc.y, $$0 -> buv.a);
   public static final hr<dcd> al = a(jc.c, dce::a);
   public static final hr<ciq> am = a(jc.B, cis::a);
   public static final hr<String> an = a(jc.ao, ddc::a);
   public static final hr<che> ao = a(jc.n, chf::a);
   public static final hr<? extends hr<?>> ap = as;

   private static <T> hr<T> a(aeq<? extends hr<T>> $$0, jb.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> hr<T> b(aeq<? extends hr<T>> $$0, jb.a<T> $$1) {
      return a($$0, new hm<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> gz<T> a(aeq<? extends hr<T>> $$0, String $$1, jb.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> gz<T> b(aeq<? extends hr<T>> $$0, String $$1, jb.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hr<T> a(aeq<? extends hr<T>> $$0, Lifecycle $$1, jb.a<T> $$2) {
      return a($$0, new hm<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> gz<T> a(aeq<? extends hr<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> gz<T> b(aeq<? extends hr<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ia<T>> R a(aeq<? extends hr<T>> $$0, R $$1, jb.a<T> $$2, Lifecycle $$3) {
      aer $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aeq<ia<?>>)$$0, $$1, $$3);
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

      for (hr<?> $$0 : ap) {
         $$0.l();
      }
   }

   private static <T extends hr<?>> void a(hr<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof gz) {
            aer $$2 = ((gz)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(hr<T> var1);
   }
}
