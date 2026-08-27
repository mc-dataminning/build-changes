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

public enum uh {
   a("handshake", b().a(xg.b, new uh.b()).a(xg.a, new uh.b<afk>().a(afj.class, afj::new))),
   b(
      "play",
      b()
         .a(
            xg.b,
            new uh.b<za>()
               .b(zl.class, zl::new)
               .a(zb.class, zb::new)
               .a(zc.class, zc::new)
               .a(zd.class, zd::new)
               .a(ze.class, ze::new)
               .a(zf.class, zf::new)
               .a(zg.class, zg::new)
               .a(zh.class, zh::new)
               .a(zi.class, zi::new)
               .a(zj.class, zj::new)
               .a(zk.class, zk::new)
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
               .a(xj.class, xj::new)
               .a(zz.class, zz::new)
               .a(aaa.class, aaa::new)
               .a(xk.class, xk::new)
               .a(aab.class, aab::new)
               .a(aac.class, aac::new)
               .a(aad.class, aad::new)
               .a(aae.class, aae::new)
               .a(aaf.class, aaf::new)
               .a(aag.class, aag::new)
               .a(aah.class, aah::new)
               .a(aai.class, aai::new)
               .a(xl.class, xl::new)
               .a(aak.class, aak::new)
               .a(aal.class, aal::new)
               .a(aam.class, aam::new)
               .a(aan.class, aan::new)
               .a(aap.class, aap::new)
               .a(aaq.class, aaq::new)
               .a(aar.class, aar::new)
               .a(aas.a.class, aas.a::b)
               .a(aas.b.class, aas.b::b)
               .a(aas.c.class, aas.c::b)
               .a(aat.class, aat::new)
               .a(aau.class, aau::new)
               .a(aav.class, aav::new)
               .a(aaw.class, aaw::new)
               .a(xm.class, xm::new)
               .a(agf.class, agf::new)
               .a(aax.class, aax::new)
               .a(aay.class, aay::new)
               .a(aaz.class, aaz::new)
               .a(aba.class, aba::new)
               .a(abb.class, abb::new)
               .a(abc.class, abc::new)
               .a(abd.class, abd::new)
               .a(abe.class, abe::new)
               .a(abf.class, abf::new)
               .a(abg.class, abg::new)
               .a(abh.class, abh::new)
               .a(abi.class, abi::new)
               .a(abj.class, abj::new)
               .a(abk.class, abk::new)
               .a(xn.class, xn::new)
               .a(xo.class, xo::new)
               .a(abl.class, abl::new)
               .a(abm.class, abm::new)
               .a(abn.class, abn::new)
               .a(abo.class, abo::new)
               .a(abp.class, abp::new)
               .a(abq.class, abq::new)
               .a(abr.class, abr::new)
               .a(abs.class, abs::new)
               .a(abt.class, abt::new)
               .a(abu.class, abu::new)
               .a(abv.class, abv::new)
               .a(abw.class, abw::new)
               .a(abx.class, abx::new)
               .a(aby.class, aby::new)
               .a(abz.class, abz::new)
               .a(aca.class, aca::new)
               .a(acb.class, acb::new)
               .a(acc.class, acc::new)
               .a(acd.class, acd::new)
               .a(ace.class, ace::new)
               .a(acf.class, acf::new)
               .a(acg.class, acg::new)
               .a(ach.class, ach::new)
               .a(aci.class, aci::new)
               .a(acj.class, acj::new)
               .a(ack.class, ack::new)
               .a(acl.class, acl::new)
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
               .a(ada.class, ada::new)
               .a(adb.class, adb::new)
               .a(adc.class, adc::new)
               .a(add.class, add::new)
               .a(ade.class, ade::new)
               .a(adf.class, adf::new)
               .a(xp.class, xp::new)
         )
         .a(
            xg.a,
            new uh.b<adj>()
               .a(adm.class, adm::new)
               .a(adn.class, adn::new)
               .a(ado.class, ado::new)
               .a(adp.class, adp::new)
               .a(adq.class, adq::new)
               .a(adr.class, adr::new)
               .a(ads.class, ads::new)
               .a(adt.class, adt::new)
               .a(adu.class, adu::new)
               .a(xr.class, xr::new)
               .a(adv.class, adv::new)
               .a(adw.class, adw::new)
               .a(adx.class, adx::new)
               .a(ady.class, ady::new)
               .a(adz.class, adz::new)
               .a(aea.class, aea::new)
               .a(xs.class, xs::new)
               .a(aeb.class, aeb::new)
               .a(aec.class, aec::new)
               .a(aed.class, aed::new)
               .a(aee.class, aee::new)
               .a(xt.class, xt::new)
               .a(aef.class, aef::new)
               .a(aeg.a.class, aeg.a::b)
               .a(aeg.b.class, aeg.b::b)
               .a(aeg.c.class, aeg.c::b)
               .a(aeg.d.class, aeg.d::b)
               .a(aeh.class, aeh::new)
               .a(aei.class, aei::new)
               .a(aej.class, aej::new)
               .a(agj.class, agj::new)
               .a(aek.class, aek::new)
               .a(ael.class, ael::new)
               .a(aem.class, aem::new)
               .a(aen.class, aen::new)
               .a(aeo.class, aeo::new)
               .a(xu.class, xu::new)
               .a(aep.class, aep::new)
               .a(aeq.class, aeq::new)
               .a(aer.class, aer::new)
               .a(xv.class, xv::new)
               .a(aes.class, aes::new)
               .a(aet.class, aet::new)
               .a(aeu.class, aeu::new)
               .a(aev.class, aev::new)
               .a(aew.class, aew::new)
               .a(aex.class, aex::new)
               .a(aey.class, aey::new)
               .a(aez.class, aez::new)
               .a(afa.class, afa::new)
               .a(afb.class, afb::new)
               .a(afc.class, afc::new)
               .a(afd.class, afd::new)
               .a(afe.class, afe::new)
               .a(aff.class, aff::new)
         )
   ),
   c(
      "status",
      b().a(xg.a, new uh.b<agi>().a(agk.class, agk::new).a(agj.class, agj::new)).a(xg.b, new uh.b<age>().a(agg.class, agg::new).a(agf.class, agf::new))
   ),
   d(
      "login",
      b()
         .a(xg.b, new uh.b<afm>().a(afr.class, afr::new).a(afp.class, afp::new).a(afo.class, afo::new).a(afq.class, afq::new).a(afn.class, afn::new))
         .a(xg.a, new uh.b<afs>().a(afu.class, afu::new).a(afv.class, afv::new).a(aft.class, aft::b).a(afw.class, afw::new))
   ),
   e(
      "configuration",
      b()
         .a(
            xg.b,
            new uh.b<xi>()
               .a(xj.class, xj::new)
               .a(xk.class, xk::new)
               .a(yu.class, yu::new)
               .a(xl.class, xl::new)
               .a(xm.class, xm::new)
               .a(yv.class, yv::new)
               .a(xn.class, xn::new)
               .a(xo.class, xo::new)
               .a(yw.class, yw::new)
               .a(xp.class, xp::new)
         )
         .a(xg.a, new uh.b<xq>().a(xr.class, xr::new).a(xs.class, xs::new).a(yy.class, yy::new).a(xt.class, xt::new).a(xu.class, xu::new).a(xv.class, xv::new))
   );

   public static final int f = -1;
   private final String g;
   private final Map<xg, uh.a<?>> h;

   private static uh.c b() {
      return new uh.c();
   }

   private uh(String $$0, uh.c $$1) {
      this.g = $$0;
      this.h = $$1.a(this);
   }

   @avt
   public Int2ObjectMap<Class<? extends xf<?>>> a(xg $$0) {
      return this.h.get($$0).d();
   }

   @avt
   public String a() {
      return this.g;
   }

   public uh.a<?> b(xg $$0) {
      return this.h.get($$0);
   }

   public static class a<T extends uo> implements xe.b {
      private final uh a;
      private final xg b;
      private final uh.b<T> c;

      public a(uh $$0, xg $$1, uh.b<T> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public uh a() {
         return this.a;
      }

      public xg b() {
         return this.b;
      }

      public int a(xf<?> $$0) {
         return this.c.a($$0.getClass());
      }

      @Override
      public xe c() {
         return this.c.a();
      }

      Int2ObjectMap<Class<? extends xf<?>>> d() {
         Int2ObjectMap<Class<? extends xf<?>>> $$0 = new Int2ObjectOpenHashMap();
         this.c.b.forEach(($$1, $$2) -> $$0.put($$2, $$1));
         return $$0;
      }

      @Nullable
      public xf<?> a(int $$0, ui $$1) {
         return this.c.a($$0, $$1);
      }

      public boolean b(xf<?> $$0) {
         return this.c.b($$0.getClass());
      }
   }

   static class b<T extends uo> {
      private static final Logger a = LogUtils.getLogger();
      final Object2IntMap<Class<? extends xf<? super T>>> b = ac.a(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));
      private final List<Function<ui, ? extends xf<? super T>>> c = Lists.newArrayList();
      private xe d = xe.b;
      private final Set<Class<? extends xf<T>>> e = new HashSet<>();

      public <P extends xf<? super T>> uh.b<T> a(Class<P> $$0, Function<ui, P> $$1) {
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

      public <P extends xd<T>> uh.b<T> b(Class<P> $$0, Function<Iterable<xf<T>>, P> $$1) {
         if (this.d != xe.b) {
            throw new IllegalStateException("Bundle packet already configured");
         } else {
            xc<T> $$2 = new xc<>();
            this.a(xc.class, $$1x -> $$2);
            this.d = xe.a($$0, $$1, $$2);
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
      public xf<?> a(int $$0, ui $$1) {
         Function<ui, ? extends xf<? super T>> $$2 = this.c.get($$0);
         return (xf<?>)($$2 != null ? $$2.apply($$1) : null);
      }

      public xe a() {
         return this.d;
      }
   }

   static class c {
      private final Map<xg, uh.b<?>> a = Maps.newEnumMap(xg.class);

      public <T extends uo> uh.c a(xg $$0, uh.b<T> $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Map<xg, uh.a<?>> a(uh $$0) {
         Map<xg, uh.a<?>> $$1 = new EnumMap<>(xg.class);

         for (xg $$2 : xg.values()) {
            uh.b<?> $$3 = this.a.get($$2);
            if ($$3 == null) {
               throw new IllegalStateException("Missing packets for flow " + $$2 + " in protocol " + $$0);
            }

            $$1.put($$2, new uh.a<>($$0, $$2, $$3));
         }

         return $$1;
      }
   }
}
