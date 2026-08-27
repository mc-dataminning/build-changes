import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lh {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<akt, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final jw<jw<?>> az = new ji<>(aks.a(li.a), Lifecycle.stable());
   public static final iv<dxv> a = a(li.C, "step", dxv::a);
   public static final jn<avn> b = a(li.ag, $$0 -> avo.nS);
   public static final iv<epd> c = b(li.z, "empty", $$0 -> epf.a);
   public static final jn<brf> d = a(li.R, brj::a);
   public static final iv<dfc> e = b(li.f, "air", $$0 -> dfe.a);
   public static final jn<dad> f = b(li.u, $$0 -> dag.x);
   public static final iv<bsb<?>> g = b(li.v, "pig", $$0 -> bsb.aA);
   public static final iv<cuc> h = b(li.G, "air", $$0 -> cuk.a);
   public static final jn<cwp> i = a(li.Y, cws::a);
   public static final jn<la<?>> j = a(li.T, $$0 -> lb.b);
   public static final jn<dqe<?>> k = b(li.h, $$0 -> dqe.a);
   public static final iv<cic> l = a(li.S, "kebab", cid::a);
   public static final jn<akt> m = a(li.r, $$0 -> avz.E);
   public static final iv<dvx> n = a(li.o, "empty", $$0 -> dvx.c);
   public static final jn<eno<?>> o = a(li.ac, $$0 -> eno.a);
   public static final jn<eoc<?>> p = a(li.ad, $$0 -> eoc.b);
   public static final jn<enh<?>> q = a(li.X, $$0 -> enh.a);
   public static final jn<cqo<?>> r = a(li.Q, $$0 -> cqo.i);
   public static final jn<czf<?>> s = a(li.aa, $$0 -> czf.a);
   public static final jn<cze<?>> t = a(li.Z, $$0 -> cze.c);
   public static final jn<btq> u = a(li.c, btv::a);
   public static final jn<dya<?>> v = a(li.W, $$0 -> dya.a);
   public static final jn<ib<?, ?>> w = a(li.p, ic::a);
   public static final jn<avy<?>> x = a(li.ah, $$0 -> avz.c);
   public static final iv<clq> y = a(li.ar, "plains", $$0 -> clq.c);
   public static final iv<clo> z = a(li.aq, "none", $$0 -> clo.b);
   public static final jn<cdu> A = a(li.V, cdv::a);
   public static final iv<cbr<?>> B = a(li.P, "dummy", $$0 -> cbr.a);
   public static final iv<ccy<?>> C = a(li.af, "dummy", $$0 -> ccy.a);
   public static final jn<cns> D = a(li.ae, $$0 -> cns.c);
   public static final jn<cnq> E = a(li.b, $$0 -> cnq.b);
   public static final jn<esg> F = a(li.L, $$0 -> esd.b);
   public static final jn<etc> G = a(li.I, $$0 -> etd.e);
   public static final jn<euv> H = a(li.H, $$0 -> euw.c);
   public static final jn<evp> I = a(li.K, $$0 -> evr.b);
   public static final jn<evi> J = a(li.J, $$0 -> evk.c);
   public static final jn<evy> K = a(li.M, $$0 -> ewa.c);
   public static final jn<bpe<?>> L = a(li.y, $$0 -> bpe.a);
   public static final jn<bpg<?>> M = a(li.F, $$0 -> bpg.a);
   public static final jn<eia<?>> N = a(li.D, $$0 -> eia.a);
   public static final jn<eac<?>> O = a(li.i, $$0 -> eac.k);
   public static final jn<eaz<?>> P = a(li.k, $$0 -> eaz.a);
   public static final jn<eca<?>> Q = a(li.w, $$0 -> eca.L);
   public static final jn<ekr<?>> R = a(li.aj, $$0 -> ekr.a);
   public static final jn<ekk> S = a(li.ai, $$0 -> ekk.c);
   public static final jn<ekc<?>> T = a(li.an, $$0 -> ekc.f);
   public static final jn<ejb<?>> U = a(li.U, $$0 -> ejb.f);
   public static final jn<egm<?>> V = a(li.j, $$0 -> egm.a);
   public static final jn<efx<?>> W = a(li.A, $$0 -> efx.a);
   public static final jn<ehp<?>> X = a(li.ap, $$0 -> ehp.a);
   public static final jn<egj<?>> Y = a(li.ab, $$0 -> egj.a);
   public static final jn<ehd<?>> Z = a(li.ao, $$0 -> ehd.b);
   public static final jn<efm<?>> aa = a(li.x, $$0 -> efm.a);
   public static final jn<Codec<? extends ddd>> ab = a(li.e, dde::a);
   public static final jn<Codec<? extends duz>> ac = a(li.n, dvb::a);
   public static final jn<Codec<? extends dzl.f>> ad = a(li.N, dzl.f::a);
   public static final jn<Codec<? extends dzl.o>> ae = a(li.O, dzl.o::a);
   public static final jn<Codec<? extends dyn>> af = a(li.t, dyo::a);
   public static final jn<MapCodec<? extends dfc>> ag = a(li.g, dfd::a);
   public static final jn<ens<?>> ah = a(li.am, $$0 -> ens.e);
   public static final jn<elb<?>> ai = a(li.ak, $$0 -> elb.d);
   public static final jn<Codec<? extends ele>> aj = a(li.al, elf::a);
   public static final jn<cei> ak = a(li.l, cei::a);
   public static final jn<cep> al = a(li.B, cep::a);
   public static final jn<ctz> am = a(li.E, cub::a);
   public static final jn<String> an = a(li.as, dqt::a);
   public static final jn<csq> ao = a(li.q, csr::a);
   public static final jn<aq<?>> ap = a(li.aN, an::a);
   public static final jn<yv<?>> aq = a(li.at, yw::a);
   public static final jn<cru> ar = a(li.au, crv::a);
   public static final jn<kd<?>> as = a(li.av, ke::a);
   public static final jn<MapCodec<? extends bt>> at = a(li.aw, bu::a);
   public static final jn<cj.a<?>> au = a(li.ax, ck::a);
   public static final jn<eqo> av = a(li.ay, eqp::a);
   public static final jn<? extends jn<?>> aw = az;

   private static <T> jn<T> a(aks<? extends jn<T>> $$0, lh.a<T> $$1) {
      return a($$0, new ji<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jn<T> b(aks<? extends jn<T>> $$0, lh.a<T> $$1) {
      return a($$0, new ji<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> iv<T> a(aks<? extends jn<T>> $$0, String $$1, lh.a<T> $$2) {
      return a($$0, new iu<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> iv<T> b(aks<? extends jn<T>> $$0, String $$1, lh.a<T> $$2) {
      return a($$0, new iu<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jw<T>> R a(aks<? extends jn<T>> $$0, R $$1, lh.a<T> $$2) {
      akv.a(() -> "registry " + $$0);
      akt $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((aks<jw<?>>)$$0, $$1, jm.a);
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

      for (jn<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jn<?>> void a(jn<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ad.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof iv) {
            akt $$2 = ((iv)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jn<T> var1);
   }
}
