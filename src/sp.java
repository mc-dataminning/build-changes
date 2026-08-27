import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public enum sp {
   a("handshake", b().a(vg.b, new sp.b()).a(vg.a, new sp.b<ade>().a(add.class, add::new))),
   b(
      "play",
      b()
         .a(
            vg.b,
            new sp.b<wy>()
               .b(xj.class, xj::new)
               .a(wz.class, wz::new)
               .a(xa.class, xa::new)
               .a(xb.class, xb::new)
               .a(xc.class, xc::new)
               .a(xd.class, xd::new)
               .a(xe.class, xe::new)
               .a(xf.class, xf::new)
               .a(xg.class, xg::new)
               .a(xh.class, xh::new)
               .a(xi.class, xi::new)
               .a(xk.class, xk::new)
               .a(xl.class, xl::new)
               .a(xm.class, xm::new)
               .a(xn.class, xn::new)
               .a(xo.class, xo::new)
               .a(xp.class, xp::new)
               .a(xq.class, xq::new)
               .a(xr.class, xr::new)
               .a(xs.class, xs::new)
               .a(xt.class, xt::new)
               .a(xu.class, xu::new)
               .a(xv.class, xv::new)
               .a(xw.class, xw::new)
               .a(vj.class, vj::new)
               .a(xx.class, xx::new)
               .a(xy.class, xy::new)
               .a(vk.class, vk::new)
               .a(xz.class, xz::new)
               .a(ya.class, ya::new)
               .a(yb.class, yb::new)
               .a(yc.class, yc::new)
               .a(yd.class, yd::new)
               .a(ye.class, ye::new)
               .a(yf.class, yf::new)
               .a(yg.class, yg::new)
               .a(vl.class, vl::new)
               .a(yi.class, yi::new)
               .a(yj.class, yj::new)
               .a(yk.class, yk::new)
               .a(yl.class, yl::new)
               .a(yn.class, yn::new)
               .a(yo.class, yo::new)
               .a(yp.class, yp::new)
               .a(yq.a.class, yq.a::b)
               .a(yq.b.class, yq.b::b)
               .a(yq.c.class, yq.c::b)
               .a(yr.class, yr::new)
               .a(ys.class, ys::new)
               .a(yt.class, yt::new)
               .a(yu.class, yu::new)
               .a(vm.class, vm::new)
               .a(adz.class, adz::new)
               .a(yv.class, yv::new)
               .a(yw.class, yw::new)
               .a(yx.class, yx::new)
               .a(yy.class, yy::new)
               .a(yz.class, yz::new)
               .a(za.class, za::new)
               .a(zb.class, zb::new)
               .a(zc.class, zc::new)
               .a(zd.class, zd::new)
               .a(ze.class, ze::new)
               .a(zf.class, zf::new)
               .a(zg.class, zg::new)
               .a(zh.class, zh::new)
               .a(vn.class, vn::new)
               .a(zi.class, zi::new)
               .a(zj.class, zj::new)
               .a(zk.class, zk::new)
               .a(zl.class, zl::new)
               .a(zm.class, zm::new)
               .a(zn.class, zn::new)
               .a(zo.class, zo::new)
               .a(zp.class, zp::new)
               .a(zq.class, zq::new)
               .a(zr.class, zr::new)
               .a(zs.class, zs::new)
               .a(zt.class, zt::new)
               .a(zu.class, zu::new)
               .a(zv.class, zv::new)
               .a(zw.class, zw::new)
               .a(zx.class, zx::new)
               .a(zy.class, zy::new)
               .a(zz.class, zz::new)
               .a(aaa.class, aaa::new)
               .a(aab.class, aab::new)
               .a(aac.class, aac::new)
               .a(aad.class, aad::new)
               .a(aae.class, aae::new)
               .a(aaf.class, aaf::new)
               .a(aag.class, aag::new)
               .a(aah.class, aah::new)
               .a(aai.class, aai::new)
               .a(aaj.class, aaj::new)
               .a(aak.class, aak::new)
               .a(aal.class, aal::new)
               .a(aam.class, aam::new)
               .a(aan.class, aan::new)
               .a(aao.class, aao::new)
               .a(aap.class, aap::new)
               .a(aaq.class, aaq::new)
               .a(aar.class, aar::new)
               .a(aas.class, aas::new)
               .a(aat.class, aat::new)
               .a(aau.class, aau::new)
               .a(aav.class, aav::new)
               .a(aaw.class, aaw::new)
               .a(aax.class, aax::new)
               .a(aay.class, aay::new)
               .a(aaz.class, aaz::new)
               .a(aba.class, aba::new)
               .a(vo.class, vo::new)
         )
         .a(
            vg.a,
            new sp.b<abe>()
               .a(abh.class, abh::new)
               .a(abi.class, abi::new)
               .a(abj.class, abj::new)
               .a(abk.class, abk::new)
               .a(abl.class, abl::new)
               .a(abm.class, abm::new)
               .a(abn.class, abn::new)
               .a(abo.class, abo::new)
               .a(abp.class, abp::new)
               .a(vq.class, vq::new)
               .a(abq.class, abq::new)
               .a(abr.class, abr::new)
               .a(abs.class, abs::new)
               .a(abt.class, abt::new)
               .a(abu.class, abu::new)
               .a(vr.class, vr::new)
               .a(abv.class, abv::new)
               .a(abw.class, abw::new)
               .a(abx.class, abx::new)
               .a(aby.class, aby::new)
               .a(vs.class, vs::new)
               .a(abz.class, abz::new)
               .a(aca.a.class, aca.a::b)
               .a(aca.b.class, aca.b::b)
               .a(aca.c.class, aca.c::b)
               .a(aca.d.class, aca.d::b)
               .a(acb.class, acb::new)
               .a(acc.class, acc::new)
               .a(acd.class, acd::new)
               .a(aed.class, aed::new)
               .a(ace.class, ace::new)
               .a(acf.class, acf::new)
               .a(acg.class, acg::new)
               .a(ach.class, ach::new)
               .a(aci.class, aci::new)
               .a(vt.class, vt::new)
               .a(acj.class, acj::new)
               .a(ack.class, ack::new)
               .a(acl.class, acl::new)
               .a(vu.class, vu::new)
               .a(acm.class, acm::new)
               .a(acn.class, acn::new)
               .a(aco.class, aco::new)
               .a(acp.class, acp::new)
               .a(acq.class, acq::new)
               .a(acr.class, acr::new)
               .a(acs.class, acs::new)
               .a(act.class, act::new)
               .a(acu.class, acu::new)
               .a(acv.class, acv::new)
               .a(acw.class, acw::new)
               .a(acx.class, acx::new)
               .a(acy.class, acy::new)
               .a(acz.class, acz::new)
         )
   ),
   c(
      "status",
      b().a(vg.a, new sp.b<aec>().a(aee.class, aee::new).a(aed.class, aed::new)).a(vg.b, new sp.b<ady>().a(aea.class, aea::new).a(adz.class, adz::new))
   ),
   d(
      "login",
      b()
         .a(vg.b, new sp.b<adg>().a(adl.class, adl::new).a(adj.class, adj::new).a(adi.class, adi::new).a(adk.class, adk::new).a(adh.class, adh::new))
         .a(vg.a, new sp.b<adm>().a(ado.class, ado::new).a(adp.class, adp::new).a(adn.class, adn::b).a(adq.class, adq::new))
   ),
   e(
      "configuration",
      b()
         .a(
            vg.b,
            new sp.b<vi>()
               .a(vj.class, vj::new)
               .a(vk.class, vk::new)
               .a(ws.class, ws::new)
               .a(vl.class, vl::new)
               .a(vm.class, vm::new)
               .a(wt.class, wt::new)
               .a(vn.class, vn::new)
               .a(wu.class, wu::new)
               .a(vo.class, vo::new)
         )
         .a(vg.a, new sp.b<vp>().a(vq.class, vq::new).a(vr.class, vr::new).a(ww.class, ww::new).a(vs.class, vs::new).a(vt.class, vt::new).a(vu.class, vu::new))
   );

   public static final int f = -1;
   private final String g;
   private final Map<vg, sp.a<?>> h;

   private static sp.c b() {
      return new sp.c();
   }

   private sp(String $$0, sp.c $$1) {
      this.g = $$0;
      this.h = $$1.a(this);
   }

   @ata
   public Int2ObjectMap<Class<? extends vf<?>>> a(vg $$0) {
      return this.h.get($$0).d();
   }

   @ata
   public String a() {
      return this.g;
   }

   public sp.a<?> b(vg $$0) {
      return this.h.get($$0);
   }

   public static class a<T extends sw> implements ve.b {
      private final sp a;
      private final vg b;
      private final sp.b<T> c;

      public a(sp $$0, vg $$1, sp.b<T> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public sp a() {
         return this.a;
      }

      public vg b() {
         return this.b;
      }

      public int a(vf<?> $$0) {
         return this.c.a($$0.getClass());
      }

      @Override
      public ve c() {
         return this.c.a();
      }

      Int2ObjectMap<Class<? extends vf<?>>> d() {
         Int2ObjectMap<Class<? extends vf<?>>> $$0 = new Int2ObjectOpenHashMap();
         this.c.b.forEach(($$1, $$2) -> $$0.put($$2, $$1));
         return $$0;
      }

      @Nullable
      public vf<?> a(int $$0, sq $$1) {
         return this.c.a($$0, $$1);
      }

      public boolean b(vf<?> $$0) {
         return this.c.b($$0.getClass());
      }
   }

   static class b<T extends sw> {
      private static final Logger a = LogUtils.getLogger();
      final Object2IntMap<Class<? extends vf<? super T>>> b = ac.a(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));
      private final List<Function<sq, ? extends vf<? super T>>> c = Lists.newArrayList();
      private ve d = ve.b;
      private final Set<Class<? extends vf<T>>> e = new HashSet<>();

      public <P extends vf<? super T>> sp.b<T> a(Class<P> $$0, Function<sq, P> $$1) {
         int $$2 = this.c.size();
         int $$3 = this.b.put($$0, $$2);
         if ($$3 != -1) {
            String $$4 = "Packet " + $$0 + " is already registered to ID " + $$3;
            a.error(LogUtils.FATAL_MARKER, $$4);
            throw new IllegalArgumentException($$4);
         } else {
            this.c.add($$1);
            return this;
         }
      }

      public <P extends vd<T>> sp.b<T> b(Class<P> $$0, Function<Iterable<vf<T>>, P> $$1) {
         if (this.d != ve.b) {
            throw new IllegalStateException("Bundle packet already configured");
         } else {
            vc<T> $$2 = new vc<>();
            this.a(vc.class, $$1x -> $$2);
            this.d = ve.a($$0, $$1, $$2);
            this.e.add($$0);
            return this;
         }
      }

      public int a(Class<?> $$0) {
         return this.b.getInt($$0);
      }

      public boolean b(Class<?> $$0) {
         return this.b.containsKey($$0) || this.e.contains($$0);
      }

      @Nullable
      public vf<?> a(int $$0, sq $$1) {
         Function<sq, ? extends vf<? super T>> $$2 = this.c.get($$0);
         return (vf<?>)($$2 != null ? $$2.apply($$1) : null);
      }

      public ve a() {
         return this.d;
      }
   }

   static class c {
      private final Map<vg, sp.b<?>> a = Maps.newEnumMap(vg.class);

      public <T extends sw> sp.c a(vg $$0, sp.b<T> $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Map<vg, sp.a<?>> a(sp $$0) {
         Map<vg, sp.a<?>> $$1 = new EnumMap<>(vg.class);

         for (vg $$2 : vg.values()) {
            sp.b<?> $$3 = this.a.get($$2);
            if ($$3 == null) {
               throw new IllegalStateException("Missing packets for flow " + $$2 + " in protocol " + $$0);
            }

            $$1.put($$2, new sp.a<>($$0, $$2, $$3));
         }

         return $$1;
      }
   }
}
