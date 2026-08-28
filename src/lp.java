import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lp {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<alf, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final ke<ke<?>> az = new jq<>(ale.a(lq.a), Lifecycle.stable());
   public static final jd<dwv> a = a(lq.C, "step", dwv::a);
   public static final jv<avz> b = a(lq.ag, $$0 -> awa.nC);
   public static final jd<enu> c = b(lq.z, "empty", $$0 -> enw.a);
   public static final jv<bsa> d = a(lq.R, bse::a);
   public static final jd<dez> e = b(lq.f, "air", $$0 -> dfb.a);
   public static final jv<daa> f = b(lq.u, $$0 -> dad.x);
   public static final jd<bta<?>> g = b(lq.v, "pig", $$0 -> bta.az);
   public static final jd<cuk> h = b(lq.G, "air", $$0 -> cus.a);
   public static final jv<cwo> i = a(lq.Y, cwr::a);
   public static final jv<lh<?>> j = a(lq.T, $$0 -> li.b);
   public static final jv<dpj<?>> k = b(lq.h, $$0 -> dpj.a);
   public static final jd<cjd> l = a(lq.S, "kebab", cje::a);
   public static final jv<alf> m = a(lq.r, $$0 -> awk.E);
   public static final jd<dux> n = a(lq.o, "empty", $$0 -> dux.c);
   public static final jv<emf<?>> o = a(lq.ac, $$0 -> emf.a);
   public static final jv<emt<?>> p = a(lq.ad, $$0 -> emt.b);
   public static final jv<ely<?>> q = a(lq.X, $$0 -> ely.a);
   public static final jv<crb<?>> r = a(lq.Q, $$0 -> crb.i);
   public static final jv<cza<?>> s = a(lq.aa, $$0 -> cza.a);
   public static final jv<cyz<?>> t = a(lq.Z, $$0 -> cyz.b);
   public static final jv<bus> u = a(lq.c, bux::a);
   public static final jv<dxa<?>> v = a(lq.W, $$0 -> dxa.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awj<?>> x = a(lq.ah, $$0 -> awk.c);
   public static final jd<cmp> y = a(lq.ar, "plains", $$0 -> cmp.c);
   public static final jd<cmn> z = a(lq.aq, "none", $$0 -> cmn.b);
   public static final jv<cew> A = a(lq.V, cex::a);
   public static final jd<cct<?>> B = a(lq.P, "dummy", $$0 -> cct.a);
   public static final jd<cea<?>> C = a(lq.af, "dummy", $$0 -> cea.a);
   public static final jv<cop> D = a(lq.ae, $$0 -> cop.c);
   public static final jv<com> E = a(lq.b, $$0 -> com.b);
   public static final jv<eqz> F = a(lq.L, $$0 -> eqw.b);
   public static final jv<erw<?>> G = a(lq.I, $$0 -> erx.e);
   public static final jv<ett> H = a(lq.H, $$0 -> etu.c);
   public static final jv<eum> I = a(lq.K, $$0 -> euo.b);
   public static final jv<euf> J = a(lq.J, $$0 -> euh.c);
   public static final jv<euv> K = a(lq.M, $$0 -> eux.c);
   public static final jv<bpy<?>> L = a(lq.y, $$0 -> bpy.a);
   public static final jv<bqa<?>> M = a(lq.F, $$0 -> bqa.a);
   public static final jv<egs<?>> N = a(lq.D, $$0 -> egs.a);
   public static final jv<dzc<?>> O = a(lq.i, $$0 -> dzc.k);
   public static final jv<dzz<?>> P = a(lq.k, $$0 -> dzz.a);
   public static final jv<eay<?>> Q = a(lq.w, $$0 -> eay.I);
   public static final jv<eji<?>> R = a(lq.aj, $$0 -> eji.a);
   public static final jv<ejb> S = a(lq.ai, $$0 -> ejb.c);
   public static final jv<eit<?>> T = a(lq.an, $$0 -> eit.f);
   public static final jv<ehs<?>> U = a(lq.U, $$0 -> ehs.f);
   public static final jv<efe<?>> V = a(lq.j, $$0 -> efe.a);
   public static final jv<eep<?>> W = a(lq.A, $$0 -> eep.a);
   public static final jv<egh<?>> X = a(lq.ap, $$0 -> egh.a);
   public static final jv<efb<?>> Y = a(lq.ab, $$0 -> efb.a);
   public static final jv<efv<?>> Z = a(lq.ao, $$0 -> efv.b);
   public static final jv<eee<?>> aa = a(lq.x, $$0 -> eee.a);
   public static final jv<MapCodec<? extends ddb>> ab = a(lq.e, ddc::a);
   public static final jv<MapCodec<? extends dtz>> ac = a(lq.n, dub::a);
   public static final jv<MapCodec<? extends dyl.f>> ad = a(lq.N, dyl.f::a);
   public static final jv<MapCodec<? extends dyl.o>> ae = a(lq.O, dyl.o::a);
   public static final jv<MapCodec<? extends dxn>> af = a(lq.t, dxo::a);
   public static final jv<MapCodec<? extends dez>> ag = a(lq.g, dfa::a);
   public static final jv<emj<?>> ah = a(lq.am, $$0 -> emj.e);
   public static final jv<ejs<?>> ai = a(lq.ak, $$0 -> ejs.d);
   public static final jv<MapCodec<? extends ejv>> aj = a(lq.al, ejw::a);
   public static final jv<cfj> ak = a(lq.l, cfj::a);
   public static final jv<cfq> al = a(lq.B, cfq::a);
   public static final jv<cuh> am = a(lq.E, cuj::a);
   public static final jv<String> an = a(lq.as, dpy::a);
   public static final jv<cta> ao = a(lq.q, ctb::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zg<?>> aq = a(lq.at, zh::a);
   public static final jv<csf> ar = a(lq.au, csg::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<epf> av = a(lq.ay, epg::a);
   public static final jv<? extends jv<?>> aw = az;

   private static <T> jv<T> a(ale<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jv<T> b(ale<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jd<T> a(ale<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jd<T> b(ale<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ke<T>> R a(ale<? extends jv<T>> $$0, R $$1, lp.a<T> $$2) {
      alh.a(() -> "registry " + $$0);
      alf $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((ale<ke<?>>)$$0, $$1, ju.a);
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

      for (jv<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jv<?>> void a(jv<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jd) {
            alf $$2 = ((jd)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jv<T> var1);
   }
}
