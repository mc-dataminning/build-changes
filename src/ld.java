import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ld {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<akh, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final js<js<?>> az = new je<>(akg.a(le.a), Lifecycle.stable());
   public static final ir<dva> a = a(le.C, "step", dva::a);
   public static final jj<avb> b = a(le.ag, $$0 -> avc.ns);
   public static final ir<elz> c = b(le.z, "empty", $$0 -> emb.a);
   public static final jj<bqr> d = a(le.R, bqv::a);
   public static final ir<dde> e = b(le.f, "air", $$0 -> ddg.a);
   public static final jj<cyg> f = b(le.u, $$0 -> cyj.x);
   public static final ir<brn<?>> g = b(le.v, "pig", $$0 -> brn.ay);
   public static final ir<csu> h = b(le.G, "air", $$0 -> ctc.a);
   public static final jj<cuw> i = a(le.Y, cuz::a);
   public static final jj<kw<?>> j = a(le.T, $$0 -> kx.b);
   public static final jj<dno<?>> k = b(le.h, $$0 -> dno.a);
   public static final ir<chn> l = a(le.S, "kebab", cho::a);
   public static final jj<akh> m = a(le.r, $$0 -> avm.E);
   public static final ir<dtc> n = a(le.o, "empty", $$0 -> dtc.c);
   public static final jj<ekk<?>> o = a(le.ac, $$0 -> ekk.a);
   public static final jj<eky<?>> p = a(le.ad, $$0 -> eky.b);
   public static final jj<ekd<?>> q = a(le.X, $$0 -> ekd.a);
   public static final jj<cpl<?>> r = a(le.Q, $$0 -> cpl.i);
   public static final jj<cxi<?>> s = a(le.aa, $$0 -> cxi.a);
   public static final jj<cxh<?>> t = a(le.Z, $$0 -> cxh.b);
   public static final jj<btc> u = a(le.c, bth::a);
   public static final jj<dvf<?>> v = a(le.W, $$0 -> dvf.a);
   public static final jj<hx<?, ?>> w = a(le.p, hy::a);
   public static final jj<avl<?>> x = a(le.ah, $$0 -> avm.c);
   public static final ir<ckz> y = a(le.ar, "plains", $$0 -> ckz.c);
   public static final ir<ckx> z = a(le.aq, "none", $$0 -> ckx.b);
   public static final jj<cdg> A = a(le.V, cdh::a);
   public static final ir<cbd<?>> B = a(le.P, "dummy", $$0 -> cbd.a);
   public static final ir<cck<?>> C = a(le.af, "dummy", $$0 -> cck.a);
   public static final jj<cmy> D = a(le.ae, $$0 -> cmy.c);
   public static final jj<cmw> E = a(le.b, $$0 -> cmw.b);
   public static final jj<epc> F = a(le.L, $$0 -> eoz.b);
   public static final jj<epy> G = a(le.I, $$0 -> epz.e);
   public static final jj<err> H = a(le.H, $$0 -> ers.c);
   public static final jj<esk> I = a(le.K, $$0 -> esm.b);
   public static final jj<esd> J = a(le.J, $$0 -> esf.c);
   public static final jj<est> K = a(le.M, $$0 -> esv.c);
   public static final jj<boq<?>> L = a(le.y, $$0 -> boq.a);
   public static final jj<bos<?>> M = a(le.F, $$0 -> bos.a);
   public static final jj<eex<?>> N = a(le.D, $$0 -> eex.a);
   public static final jj<dxh<?>> O = a(le.i, $$0 -> dxh.k);
   public static final jj<dye<?>> P = a(le.k, $$0 -> dye.a);
   public static final jj<dzd<?>> Q = a(le.w, $$0 -> dzd.I);
   public static final jj<ehn<?>> R = a(le.aj, $$0 -> ehn.a);
   public static final jj<ehg> S = a(le.ai, $$0 -> ehg.c);
   public static final jj<egy<?>> T = a(le.an, $$0 -> egy.f);
   public static final jj<efx<?>> U = a(le.U, $$0 -> efx.f);
   public static final jj<edj<?>> V = a(le.j, $$0 -> edj.a);
   public static final jj<ecu<?>> W = a(le.A, $$0 -> ecu.a);
   public static final jj<eem<?>> X = a(le.ap, $$0 -> eem.a);
   public static final jj<edg<?>> Y = a(le.ab, $$0 -> edg.a);
   public static final jj<eea<?>> Z = a(le.ao, $$0 -> eea.b);
   public static final jj<ecj<?>> aa = a(le.x, $$0 -> ecj.a);
   public static final jj<Codec<? extends dbg>> ab = a(le.e, dbh::a);
   public static final jj<Codec<? extends dse>> ac = a(le.n, dsg::a);
   public static final jj<Codec<? extends dwq.f>> ad = a(le.N, dwq.f::a);
   public static final jj<Codec<? extends dwq.o>> ae = a(le.O, dwq.o::a);
   public static final jj<Codec<? extends dvs>> af = a(le.t, dvt::a);
   public static final jj<MapCodec<? extends dde>> ag = a(le.g, ddf::a);
   public static final jj<eko<?>> ah = a(le.am, $$0 -> eko.e);
   public static final jj<ehx<?>> ai = a(le.ak, $$0 -> ehx.d);
   public static final jj<Codec<? extends eia>> aj = a(le.al, eib::a);
   public static final jj<cdt> ak = a(le.l, cdt::a);
   public static final jj<cea> al = a(le.B, cea::a);
   public static final jj<csr> am = a(le.E, cst::a);
   public static final jj<String> an = a(le.as, dod::a);
   public static final jj<crk> ao = a(le.q, crl::a);
   public static final jj<ap<?>> ap = a(le.aN, am::a);
   public static final jj<yl<?>> aq = a(le.at, ym::a);
   public static final jj<cqp> ar = a(le.au, cqq::a);
   public static final jj<jz<?>> as = a(le.av, ka::a);
   public static final jj<MapCodec<? extends bs>> at = a(le.aw, bt::a);
   public static final jj<ci.a<?>> au = a(le.ax, cj::a);
   public static final jj<enk> av = a(le.ay, enl::a);
   public static final jj<? extends jj<?>> aw = az;

   private static <T> jj<T> a(akg<? extends jj<T>> $$0, ld.a<T> $$1) {
      return a($$0, new je<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jj<T> b(akg<? extends jj<T>> $$0, ld.a<T> $$1) {
      return a($$0, new je<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ir<T> a(akg<? extends jj<T>> $$0, String $$1, ld.a<T> $$2) {
      return a($$0, new iq<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ir<T> b(akg<? extends jj<T>> $$0, String $$1, ld.a<T> $$2) {
      return a($$0, new iq<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends js<T>> R a(akg<? extends jj<T>> $$0, R $$1, ld.a<T> $$2) {
      akj.a(() -> "registry " + $$0);
      akh $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((akg<js<?>>)$$0, $$1, ji.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aw);
   }

   private static void b() {
      ay.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ax.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aw.l();

      for (jj<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jj<?>> void a(jj<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ir) {
            akh $$2 = ((ir)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jj<T> var1);
   }
}
