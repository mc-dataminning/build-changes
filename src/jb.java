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
   private static final Map<acq, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final acq a = new acq("root");
   private static final ia<ia<?>> as = new hm<>(acp.a(a), Lifecycle.stable());
   public static final gz<dgl> b = b(jc.z, "step", $$0 -> dgl.Q);
   public static final hr<amg> c = a(jc.ad, $$0 -> amh.ma);
   public static final gz<dxd> d = b(jc.w, "empty", $$0 -> dxf.a);
   public static final hr<bey> e = a(jc.O, $$0 -> bfc.z);
   public static final gz<cpn> f = b(jc.e, "air", $$0 -> cpo.a);
   public static final hr<ckg> g = a(jc.r, $$0 -> ckk.x);
   public static final gz<bfn<?>> h = b(jc.s, "pig", $$0 -> bfn.av);
   public static final gz<cfu> i = b(jc.D, "air", $$0 -> cgc.a);
   public static final gz<chw> j = a(jc.V, "empty", $$0 -> chz.b);
   public static final hr<iu<?>> k = a(jc.Q, $$0 -> iv.c);
   public static final hr<czp<?>> l = a(jc.f, $$0 -> czp.a);
   public static final gz<bvd> m = a(jc.P, "kebab", bve::a);
   public static final hr<acq> n = a(jc.o, $$0 -> amr.E);
   public static final gz<dec> o = a(jc.l, "empty", $$0 -> dec.c);
   public static final hr<dvo<?>> p = a(jc.Z, $$0 -> dvo.a);
   public static final hr<dwc<?>> q = a(jc.aa, $$0 -> dwc.b);
   public static final hr<dvh<?>> r = a(jc.U, $$0 -> dvh.a);
   public static final hr<cck<?>> s = a(jc.N, $$0 -> cck.h);
   public static final hr<cjf<?>> t = a(jc.X, $$0 -> cjf.a);
   public static final hr<cje<?>> u = a(jc.W, $$0 -> cje.b);
   public static final hr<bhb> v = a(jc.b, $$0 -> bhg.k);
   public static final hr<dgq<?>> w = a(jc.T, $$0 -> dgq.a);
   public static final hr<gg<?, ?>> x = a(jc.m, gh::a);
   public static final hr<amq<?>> y = a(jc.ae, $$0 -> amr.c);
   public static final gz<byg> z = a(jc.an, "plains", $$0 -> byg.c);
   public static final gz<bye> A = a(jc.am, "none", $$0 -> bye.b);
   public static final hr<brc> B = a(jc.S, brd::a);
   public static final gz<bpb<?>> C = a(jc.M, "dummy", $$0 -> bpb.a);
   public static final gz<bqg<?>> D = a(jc.ac, "dummy", $$0 -> bqg.a);
   public static final hr<cab> E = a(jc.ab, $$0 -> cab.c);
   public static final hr<bzz> F = a(jc.a, $$0 -> bzz.b);
   public static final hr<eag> G = a(jc.I, $$0 -> ead.a);
   public static final hr<eba> H = a(jc.F, $$0 -> ebb.b);
   public static final hr<ecl> I = a(jc.E, $$0 -> ecm.a);
   public static final hr<ede> J = a(jc.H, $$0 -> edg.a);
   public static final hr<ecx> K = a(jc.G, $$0 -> ecz.b);
   public static final hr<edm> L = a(jc.J, $$0 -> edo.b);
   public static final hr<bdb<?>> M = a(jc.v, $$0 -> bdb.a);
   public static final hr<bdd<?>> N = a(jc.C, $$0 -> bdd.a);
   public static final hr<dqi<?>> O = a(jc.A, $$0 -> dqi.a);
   public static final hr<dis<?>> P = a(jc.g, $$0 -> dis.k);
   public static final hr<djp<?>> Q = a(jc.i, $$0 -> djp.a);
   public static final hr<dko<?>> R = a(jc.t, $$0 -> dko.I);
   public static final hr<dsy<?>> S = a(jc.ag, $$0 -> dsy.a);
   public static final hr<dsr> T = a(jc.af, $$0 -> dsr.c);
   public static final hr<dsj<?>> U = a(jc.aj, $$0 -> dsj.f);
   public static final hr<dri<?>> V = a(jc.R, $$0 -> dri.f);
   public static final hr<dou<?>> W = a(jc.h, $$0 -> dou.a);
   public static final hr<dof<?>> X = a(jc.x, $$0 -> dof.a);
   public static final hr<dpx<?>> Y = a(jc.al, $$0 -> dpx.a);
   public static final hr<dor<?>> Z = a(jc.Y, $$0 -> dor.a);
   public static final hr<dpl<?>> aa = a(jc.ak, $$0 -> dpl.b);
   public static final hr<dnu<?>> ab = a(jc.u, $$0 -> dnu.a);
   public static final hr<Codec<? extends cno>> ac = a(jc.d, Lifecycle.stable(), cnp::a);
   public static final hr<Codec<? extends ddy>> ad = a(jc.k, Lifecycle.stable(), dea::a);
   public static final hr<Codec<? extends dib.f>> ae = a(jc.K, dib.f::a);
   public static final hr<Codec<? extends dib.o>> af = a(jc.L, dib.o::a);
   public static final hr<Codec<? extends dhd>> ag = a(jc.q, dhe::a);
   public static final hr<dvs<?>> ah = a(jc.ai, $$0 -> dvs.e);
   public static final hr<dti<?>> ai = a(jc.ah, $$0 -> dti.d);
   public static final hr<brp> aj = a(jc.j, brp::a);
   public static final hr<brw> ak = a(jc.y, $$0 -> brw.a);
   public static final hr<cze> al = a(jc.c, czf::a);
   public static final hr<cfr> am = a(jc.B, cft::a);
   public static final hr<String> an = a(jc.ao, dad::a);
   public static final hr<cef> ao = a(jc.n, ceg::a);
   public static final hr<? extends hr<?>> ap = as;

   private static <T> hr<T> a(acp<? extends hr<T>> $$0, jb.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> gz<T> a(acp<? extends hr<T>> $$0, String $$1, jb.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> gz<T> b(acp<? extends hr<T>> $$0, String $$1, jb.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hr<T> a(acp<? extends hr<T>> $$0, Lifecycle $$1, jb.a<T> $$2) {
      return a($$0, new hm<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> gz<T> a(acp<? extends hr<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> gz<T> b(acp<? extends hr<T>> $$0, String $$1, Lifecycle $$2, jb.a<T> $$3) {
      return a($$0, new gy<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ia<T>> R a(acp<? extends hr<T>> $$0, R $$1, jb.a<T> $$2, Lifecycle $$3) {
      acq $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((acp<ia<?>>)$$0, $$1, $$3);
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
            acq $$2 = ((gz)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(hr<T> var1);
   }
}
