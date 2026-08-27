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

public enum uf {
   a("handshake", b().a(xe.b, new uf.b()).a(xe.a, new uf.b<afh>().a(afg.class, afg::new))),
   b(
      "play",
      b()
         .a(
            xe.b,
            new uf.b<yx>()
               .b(zi.class, zi::new)
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
               .a(xh.class, xh::new)
               .a(zw.class, zw::new)
               .a(zx.class, zx::new)
               .a(xi.class, xi::new)
               .a(zy.class, zy::new)
               .a(zz.class, zz::new)
               .a(aaa.class, aaa::new)
               .a(aab.class, aab::new)
               .a(aac.class, aac::new)
               .a(aad.class, aad::new)
               .a(aae.class, aae::new)
               .a(aaf.class, aaf::new)
               .a(xj.class, xj::new)
               .a(aah.class, aah::new)
               .a(aai.class, aai::new)
               .a(aaj.class, aaj::new)
               .a(aak.class, aak::new)
               .a(aam.class, aam::new)
               .a(aan.class, aan::new)
               .a(aao.class, aao::new)
               .a(aap.a.class, aap.a::b)
               .a(aap.b.class, aap.b::b)
               .a(aap.c.class, aap.c::b)
               .a(aaq.class, aaq::new)
               .a(aar.class, aar::new)
               .a(aas.class, aas::new)
               .a(aat.class, aat::new)
               .a(xk.class, xk::new)
               .a(agc.class, agc::new)
               .a(aau.class, aau::new)
               .a(aav.class, aav::new)
               .a(aaw.class, aaw::new)
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
               .a(xl.class, xl::new)
               .a(abi.class, abi::new)
               .a(abj.class, abj::new)
               .a(abk.class, abk::new)
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
               .a(xm.class, xm::new)
         )
         .a(
            xe.a,
            new uf.b<adg>()
               .a(adj.class, adj::new)
               .a(adk.class, adk::new)
               .a(adl.class, adl::new)
               .a(adm.class, adm::new)
               .a(adn.class, adn::new)
               .a(ado.class, ado::new)
               .a(adp.class, adp::new)
               .a(adq.class, adq::new)
               .a(adr.class, adr::new)
               .a(xo.class, xo::new)
               .a(ads.class, ads::new)
               .a(adt.class, adt::new)
               .a(adu.class, adu::new)
               .a(adv.class, adv::new)
               .a(adw.class, adw::new)
               .a(adx.class, adx::new)
               .a(xp.class, xp::new)
               .a(ady.class, ady::new)
               .a(adz.class, adz::new)
               .a(aea.class, aea::new)
               .a(aeb.class, aeb::new)
               .a(xq.class, xq::new)
               .a(aec.class, aec::new)
               .a(aed.a.class, aed.a::b)
               .a(aed.b.class, aed.b::b)
               .a(aed.c.class, aed.c::b)
               .a(aed.d.class, aed.d::b)
               .a(aee.class, aee::new)
               .a(aef.class, aef::new)
               .a(aeg.class, aeg::new)
               .a(agg.class, agg::new)
               .a(aeh.class, aeh::new)
               .a(aei.class, aei::new)
               .a(aej.class, aej::new)
               .a(aek.class, aek::new)
               .a(ael.class, ael::new)
               .a(xr.class, xr::new)
               .a(aem.class, aem::new)
               .a(aen.class, aen::new)
               .a(aeo.class, aeo::new)
               .a(xs.class, xs::new)
               .a(aep.class, aep::new)
               .a(aeq.class, aeq::new)
               .a(aer.class, aer::new)
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
         )
   ),
   c(
      "status",
      b().a(xe.a, new uf.b<agf>().a(agh.class, agh::new).a(agg.class, agg::new)).a(xe.b, new uf.b<agb>().a(agd.class, agd::new).a(agc.class, agc::new))
   ),
   d(
      "login",
      b()
         .a(xe.b, new uf.b<afj>().a(afo.class, afo::new).a(afm.class, afm::new).a(afl.class, afl::new).a(afn.class, afn::new).a(afk.class, afk::new))
         .a(xe.a, new uf.b<afp>().a(afr.class, afr::new).a(afs.class, afs::new).a(afq.class, afq::b).a(aft.class, aft::new))
   ),
   e(
      "configuration",
      b()
         .a(
            xe.b,
            new uf.b<xg>()
               .a(xh.class, xh::new)
               .a(xi.class, xi::new)
               .a(yr.class, yr::new)
               .a(xj.class, xj::new)
               .a(xk.class, xk::new)
               .a(ys.class, ys::new)
               .a(xl.class, xl::new)
               .a(yt.class, yt::new)
               .a(xm.class, xm::new)
         )
         .a(xe.a, new uf.b<xn>().a(xo.class, xo::new).a(xp.class, xp::new).a(yv.class, yv::new).a(xq.class, xq::new).a(xr.class, xr::new).a(xs.class, xs::new))
   );

   public static final int f = -1;
   private final String g;
   private final Map<xe, uf.a<?>> h;

   private static uf.c b() {
      return new uf.c();
   }

   private uf(String $$0, uf.c $$1) {
      this.g = $$0;
      this.h = $$1.a(this);
   }

   @avn
   public Int2ObjectMap<Class<? extends xd<?>>> a(xe $$0) {
      return this.h.get($$0).d();
   }

   @avn
   public String a() {
      return this.g;
   }

   public uf.a<?> b(xe $$0) {
      return this.h.get($$0);
   }

   public static class a<T extends um> implements xc.b {
      private final uf a;
      private final xe b;
      private final uf.b<T> c;

      public a(uf $$0, xe $$1, uf.b<T> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public uf a() {
         return this.a;
      }

      public xe b() {
         return this.b;
      }

      public int a(xd<?> $$0) {
         return this.c.a($$0.getClass());
      }

      @Override
      public xc c() {
         return this.c.a();
      }

      Int2ObjectMap<Class<? extends xd<?>>> d() {
         Int2ObjectMap<Class<? extends xd<?>>> $$0 = new Int2ObjectOpenHashMap();
         this.c.b.forEach(($$1, $$2) -> $$0.put($$2, $$1));
         return $$0;
      }

      @Nullable
      public xd<?> a(int $$0, ug $$1) {
         return this.c.a($$0, $$1);
      }

      public boolean b(xd<?> $$0) {
         return this.c.b($$0.getClass());
      }
   }

   static class b<T extends um> {
      private static final Logger a = LogUtils.getLogger();
      final Object2IntMap<Class<? extends xd<? super T>>> b = ac.a(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));
      private final List<Function<ug, ? extends xd<? super T>>> c = Lists.newArrayList();
      private xc d = xc.b;
      private final Set<Class<? extends xd<T>>> e = new HashSet<>();

      public <P extends xd<? super T>> uf.b<T> a(Class<P> $$0, Function<ug, P> $$1) {
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

      public <P extends xb<T>> uf.b<T> b(Class<P> $$0, Function<Iterable<xd<T>>, P> $$1) {
         if (this.d != xc.b) {
            throw new IllegalStateException("Bundle packet already configured");
         } else {
            xa<T> $$2 = new xa<>();
            this.a(xa.class, $$1x -> $$2);
            this.d = xc.a($$0, $$1, $$2);
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
      public xd<?> a(int $$0, ug $$1) {
         Function<ug, ? extends xd<? super T>> $$2 = this.c.get($$0);
         return (xd<?>)($$2 != null ? $$2.apply($$1) : null);
      }

      public xc a() {
         return this.d;
      }
   }

   static class c {
      private final Map<xe, uf.b<?>> a = Maps.newEnumMap(xe.class);

      public <T extends um> uf.c a(xe $$0, uf.b<T> $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Map<xe, uf.a<?>> a(uf $$0) {
         Map<xe, uf.a<?>> $$1 = new EnumMap<>(xe.class);

         for (xe $$2 : xe.values()) {
            uf.b<?> $$3 = this.a.get($$2);
            if ($$3 == null) {
               throw new IllegalStateException("Missing packets for flow " + $$2 + " in protocol " + $$0);
            }

            $$1.put($$2, new uf.a<>($$0, $$2, $$3));
         }

         return $$1;
      }
   }
}
