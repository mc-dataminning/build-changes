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
   public static final gz<djj> b = b(jc.z, "step", $$0 -> djj.P);
   public static final hr<aov> c = a(jc.ad, $$0 -> aow.ma);
   public static final gz<eab> d = b(jc.w, "empty", $$0 -> ead.a);
   public static final hr<bht> e = b(jc.O, $$0 -> bhx.z);
   public static final gz<csl> f = b(jc.e, "air", $$0 -> csm.a);
   public static final hr<cne> g = b(jc.r, $$0 -> cni.x);
   public static final gz<bim<?>> h = b(jc.s, "pig", $$0 -> bim.av);
   public static final gz<cis> i = b(jc.D, "air", $$0 -> cja.a);
   public static final gz<cku> j = b(jc.V, "empty", $$0 -> ckx.b);
   public static final hr<iu<?>> k = a(jc.Q, $$0 -> iv.c);
   public static final hr<dcn<?>> l = b(jc.f, $$0 -> dcn.a);
   public static final gz<byb> m = a(jc.P, "kebab", byc::a);
   public static final hr<aer> n = a(jc.o, $$0 -> apg.E);
   public static final gz<dha> o = a(jc.l, "empty", $$0 -> dha.c);
   public static final hr<dym<?>> p = a(jc.Z, $$0 -> dym.a);
   public static final hr<dza<?>> q = a(jc.aa, $$0 -> dza.b);
   public static final hr<dyf<?>> r = a(jc.U, $$0 -> dyf.a);
   public static final hr<cfi<?>> s = a(jc.N, $$0 -> cfi.h);
   public static final hr<cmd<?>> t = a(jc.X, $$0 -> cmd.a);
   public static final hr<cmc<?>> u = a(jc.W, $$0 -> cmc.b);
   public static final hr<bjz> v = a(jc.b, $$0 -> bke.k);
   public static final hr<djo<?>> w = a(jc.T, $$0 -> djo.a);
   public static final hr<gg<?, ?>> x = a(jc.m, gh::a);
   public static final hr<apf<?>> y = a(jc.ae, $$0 -> apg.c);
   public static final gz<cbe> z = a(jc.an, "plains", $$0 -> cbe.c);
   public static final gz<cbc> A = a(jc.am, "none", $$0 -> cbc.b);
   public static final hr<bua> B = a(jc.S, bub::a);
   public static final gz<brz<?>> C = a(jc.M, "dummy", $$0 -> brz.a);
   public static final gz<bte<?>> D = a(jc.ac, "dummy", $$0 -> bte.a);
   public static final hr<ccz> E = a(jc.ab, $$0 -> ccz.c);
   public static final hr<ccx> F = a(jc.a, $$0 -> ccx.b);
   public static final hr<eda> G = a(jc.I, $$0 -> ecx.b);
   public static final hr<edu> H = a(jc.F, $$0 -> edv.c);
   public static final hr<efg> I = a(jc.E, $$0 -> efh.b);
   public static final hr<efz> J = a(jc.H, $$0 -> egb.b);
   public static final hr<efs> K = a(jc.G, $$0 -> efu.c);
   public static final hr<egh> L = a(jc.J, $$0 -> egj.c);
   public static final hr<bfu<?>> M = a(jc.v, $$0 -> bfu.a);
   public static final hr<bfw<?>> N = a(jc.C, $$0 -> bfw.a);
   public static final hr<dtg<?>> O = a(jc.A, $$0 -> dtg.a);
   public static final hr<dlq<?>> P = a(jc.g, $$0 -> dlq.k);
   public static final hr<dmn<?>> Q = a(jc.i, $$0 -> dmn.a);
   public static final hr<dnm<?>> R = a(jc.t, $$0 -> dnm.I);
   public static final hr<dvw<?>> S = a(jc.ag, $$0 -> dvw.a);
   public static final hr<dvp> T = a(jc.af, $$0 -> dvp.c);
   public static final hr<dvh<?>> U = a(jc.aj, $$0 -> dvh.f);
   public static final hr<dug<?>> V = a(jc.R, $$0 -> dug.f);
   public static final hr<drs<?>> W = a(jc.h, $$0 -> drs.a);
   public static final hr<drd<?>> X = a(jc.x, $$0 -> drd.a);
   public static final hr<dsv<?>> Y = a(jc.al, $$0 -> dsv.a);
   public static final hr<drp<?>> Z = a(jc.Y, $$0 -> drp.a);
   public static final hr<dsj<?>> aa = a(jc.ak, $$0 -> dsj.b);
   public static final hr<dqs<?>> ab = a(jc.u, $$0 -> dqs.a);
   public static final hr<Codec<? extends cqn>> ac = a(jc.d, Lifecycle.stable(), cqo::a);
   public static final hr<Codec<? extends dgw>> ad = a(jc.k, Lifecycle.stable(), dgy::a);
   public static final hr<Codec<? extends dkz.f>> ae = a(jc.K, dkz.f::a);
   public static final hr<Codec<? extends dkz.o>> af = a(jc.L, dkz.o::a);
   public static final hr<Codec<? extends dkb>> ag = a(jc.q, dkc::a);
   public static final hr<dyq<?>> ah = a(jc.ai, $$0 -> dyq.e);
   public static final hr<dwg<?>> ai = a(jc.ah, $$0 -> dwg.d);
   public static final hr<bun> aj = a(jc.j, bun::a);
   public static final hr<buu> ak = a(jc.y, $$0 -> buu.a);
   public static final hr<dcc> al = a(jc.c, dcd::a);
   public static final hr<cip> am = a(jc.B, cir::a);
   public static final hr<String> an = a(jc.ao, ddb::a);
   public static final hr<chd> ao = a(jc.n, che::a);
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
