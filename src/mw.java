import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mw implements mz {
   protected final jp.a a;
   protected final Set<cvg> b;
   protected final cqh c;
   protected final Map<ala<esy>, esy.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected ewe.a a() {
      jp.b<daw> $$0 = this.a.b(lv.aL);
      return ewl.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(dbb.v), dh.d.b(1))))));
   }

   protected ewe.a b() {
      return this.a().invert();
   }

   protected ewe.a c() {
      return ewl.a(cs.a.a().a(this.a.b(lv.K), cvo.rW));
   }

   private ewe.a f() {
      return this.c().or(this.a());
   }

   private ewe.a g() {
      return this.f().invert();
   }

   protected mw(Set<cvg> $$0, cqh $$1, jp.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mw(Set<cvg> $$0, cqh $$1, Map<ala<esy>, esy.a> $$2, jp.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends eud<T>> T a(ddr $$0, eud<T> $$1) {
      return !this.b.contains($$0.r()) ? $$1.b(etr.c()) : $$1.c();
   }

   protected <T extends evw<T>> T a(ddr $$0, evw<T> $$1) {
      return !this.b.contains($$0.r()) ? $$1.b(ewa.c()) : $$1.d();
   }

   public esy.a a(ddr $$0) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0))));
   }

   private static esy.a a(dgv $$0, ewe.a $$1, etj.a<?> $$2) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a($$1).a($$2)));
   }

   protected esy.a a(dgv $$0, etj.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected esy.a b(dgv $$0, etj.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected esy.a c(dgv $$0, etj.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected esy.a a(dgv $$0, ddr $$1) {
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a($$1)));
   }

   protected esy.a a(ddr $$0, exa $$1) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a((etj.a<?>)this.a($$0, etg.a($$0).a(euy.a($$1)))));
   }

   protected esy.a a(dgv $$0, ddr $$1, exa $$2) {
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a($$1).a(euy.a($$2))));
   }

   private esy.a c(ddr $$0) {
      return esy.b().a(esx.a().a(this.a()).a(ewx.a(1.0F)).a(etg.a($$0)));
   }

   private esy.a d(ddr $$0) {
      return esy.b().a(this.a(dgx.fR, esx.a().a(ewx.a(1.0F)).a(etg.a(dgx.fR)))).a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0))));
   }

   protected esy.a a(dgv $$0) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a((etj.a<?>)this.a((ddr)$$0, etg.a($$0).a(euy.a(ewx.a(2.0F)).a(ewd.a($$0).a(eb.a.a().a(dnz.b, dvi.c)))))));
   }

   protected <T extends Comparable<T> & azy> esy.a a(dgv $$0, dvd<T> $$1, T $$2) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a(ewd.a($$0).a(eb.a.a().a($$1, $$2))))));
   }

   protected esy.a b(dgv $$0) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a(ett.a(ett.b.a).a(kr.g)))));
   }

   protected esy.a c(dgv $$0) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a(ett.a(ett.b.a).a(kr.g).a(kr.ad).a(kr.ag).a(kr.ah)))));
   }

   protected esy.a d(dgv $$0) {
      jp.b<daw> $$1 = this.a.b(lv.aL);
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a(cvo.oH).a(euy.a(exe.a(2.0F, 5.0F))).a(etq.a($$1.b(dbb.x)))));
   }

   protected esy.a e(dgv $$0) {
      jp.b<daw> $$1 = this.a.b(lv.aL);
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a(cvo.oC).a(euy.a(exe.a(4.0F, 9.0F))).a(etq.a($$1.b(dbb.x)))));
   }

   protected esy.a f(dgv $$0) {
      jp.b<daw> $$1 = this.a.b(lv.aL);
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a(cvo.lH).a(euy.a(exe.a(4.0F, 5.0F))).a(etq.b($$1.b(dbb.x)))));
   }

   protected esy.a g(dgv $$0) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a(ett.a(ett.b.a).a(kr.g).a(kr.h).a(kr.p).a(kr.aa).a(kr.j)))));
   }

   protected esy.a h(dgv $$0) {
      return esy.b().a(esx.a().a(this.a()).a(ewx.a(1.0F)).a(etg.a($$0).a(ett.a(ett.b.a).a(kr.af)).a(ets.a($$0).a(dgp.c))));
   }

   protected esy.a i(dgv $$0) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a(etg.a($$0).a(this.a()).a(ett.a(ett.b.a).a(kr.af)).a(ets.a($$0).a(dgp.c)).a(etg.a($$0))));
   }

   protected esy.a j(dgv $$0) {
      return esy.b().a(esx.a().a(etg.a(cvo.wy)).a(ewd.a($$0).a(eb.a.a().a(dhr.v_, true))));
   }

   protected esy.a a(dgv $$0, cvg $$1) {
      jp.b<daw> $$2 = this.a.b(lv.aL);
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a($$1).a(etq.a($$2.b(dbb.x)))));
   }

   protected esy.a b(dgv $$0, ddr $$1) {
      return this.a($$0, (etj.a<?>)this.a((ddr)$$0, etg.a($$1).a(euy.a(exe.a(-6.0F, 2.0F))).a(eue.a(ess.b(0)))));
   }

   protected esy.a k(dgv $$0) {
      jp.b<daw> $$1 = this.a.b(lv.aL);
      return this.b($$0, (etj.a<?>)this.a((ddr)$$0, etg.a(cvo.pw).a(ewj.a(0.125F)).a(etq.a($$1.b(dbb.x), 2))));
   }

   public esy.a b(dgv $$0, cvg $$1) {
      return esy.b()
         .a(
            this.a(
               $$0,
               esx.a()
                  .a(ewx.a(1.0F))
                  .a(etg.a($$1).a(dos.c.a(), $$1x -> euy.a(eww.a(3, (float)($$1x + 1) / 15.0F)).a(ewd.a($$0).a(eb.a.a().a(dos.c, $$1x.intValue())))))
            )
         );
   }

   public esy.a c(dgv $$0, cvg $$1) {
      return esy.b().a(this.a($$0, esx.a().a(ewx.a(1.0F)).a(etg.a($$1).a(euy.a(eww.a(3, 0.53333336F))))));
   }

   protected esy.a b(ddr $$0) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a(this.c()).a(etg.a($$0)));
   }

   protected esy.a a(dgv $$0, ewe.a $$1) {
      return esy.b()
         .a(
            esx.a()
               .a(
                  (etj.a<?>)this.a(
                     (ddr)$$0,
                     etg.a($$0)
                        .a($$1)
                        .a(jj.values(), $$1x -> euy.a(ewx.a(1.0F), true).a(ewd.a($$0).a(eb.a.a().a(dlv.b($$1x), true))))
                        .a(euy.a(ewx.a(-1.0F), true))
                  )
               )
         );
   }

   protected esy.a a(dgv $$0, dgv $$1, float... $$2) {
      jp.b<daw> $$3 = this.a.b(lv.aL);
      return this.c($$0, ((etl.a)this.a((ddr)$$0, etg.a($$1))).a(evt.a($$3.b(dbb.x), $$2)))
         .a(esx.a().a(ewx.a(1.0F)).a(this.g()).a(((etl.a)this.a((ddr)$$0, etg.a(cvo.pr).a(euy.a(exe.a(1.0F, 2.0F))))).a(evt.a($$3.b(dbb.x), f))));
   }

   protected esy.a b(dgv $$0, dgv $$1, float... $$2) {
      jp.b<daw> $$3 = this.a.b(lv.aL);
      return this.a($$0, $$1, $$2)
         .a(
            esx.a()
               .a(ewx.a(1.0F))
               .a(this.g())
               .a(((etl.a)this.a((ddr)$$0, etg.a(cvo.ov))).a(evt.a($$3.b(dbb.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected esy.a l(dgv $$0) {
      jp.b<daw> $$1 = this.a.b(lv.aL);
      return this.c($$0, ((etl.a)this.a((ddr)dgx.aL, etg.a(cvo.pr).a(euy.a(exe.a(1.0F, 2.0F))))).a(evt.a($$1.b(dbb.x), f)));
   }

   protected esy.a a(dgv $$0, cvg $$1, cvg $$2, ewe.a $$3) {
      jp.b<daw> $$4 = this.a.b(lv.aL);
      return this.a((ddr)$$0, esy.b().a(esx.a().a(etg.a($$1).a($$3).a(etg.a($$2)))).a(esx.a().a($$3).a(etg.a($$2).a(etq.a($$4.b(dbb.x), 0.5714286F, 3)))));
   }

   protected esy.a m(dgv $$0) {
      return esy.b().a(esx.a().a(this.c()).a(etg.a($$0).a(euy.a(ewx.a(2.0F)))));
   }

   protected esy.a a(dgv $$0, dgv $$1) {
      jp.b<dgv> $$2 = this.a.b(lv.f);
      etj.a<?> $$3 = etg.a($$1).a(euy.a(ewx.a(2.0F))).a(this.c()).a(((etl.a)this.a((ddr)$$0, etg.a(cvo.pw))).a(ewj.a(0.125F)));
      return esy.b()
         .a(esx.a().a($$3).a(ewd.a($$0).a(eb.a.a().a(djd.b, duw.b))).a(ewc.a(df.a.a().a(aw.a.a().a($$2, $$0).a(eb.a.a().a(djd.b, duw.a))), new je(0, 1, 0))))
         .a(esx.a().a($$3).a(ewd.a($$0).a(eb.a.a().a(djd.b, duw.a))).a(ewc.a(df.a.a().a(aw.a.a().a($$2, $$0).a(eb.a.a().a(djd.b, duw.b))), new je(0, -1, 0))));
   }

   protected esy.a n(dgv $$0) {
      return esy.b()
         .a(
            esx.a()
               .a(ewx.a(1.0F))
               .a(
                  (etj.a<?>)this.a(
                     $$0, etg.a($$0).a(List.of(2, 3, 4), $$1 -> euy.a(ewx.a((float)$$1.intValue())).a(ewd.a($$0).a(eb.a.a().a(dhk.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected esy.a o(dgv $$0) {
      return esy.b()
         .a(
            esx.a()
               .a(ewx.a(1.0F))
               .a(
                  (etj.a<?>)this.a(
                     $$0,
                     etg.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> euy.a(ewx.a((float)$$1.intValue())).a(ewd.a($$0).a(eb.a.a().a(dmi.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static esy.a p(dgv $$0) {
      return esy.b().a(esx.a().a(ewx.a(1.0F)).a(etg.a($$0)));
   }

   public static esy.a d() {
      return esy.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<ala<esy>, esy.a> $$0) {
      this.e();
      Set<ala<esy>> $$1 = new HashSet<>();

      for (dgv $$2 : lu.e) {
         if ($$2.a(this.c)) {
            ala<esy> $$3 = $$2.v();
            if ($$3 != esp.a && $$1.add($$3)) {
               esy.a $$4 = this.d.remove($$3);
               if ($$4 == null) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lu.e.b($$2)));
               }

               $$0.accept($$3, $$4);
            }
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dgv $$0, dgv $$1) {
      jp.b<daw> $$2 = this.a.b(lv.aL);
      esy.a $$3 = this.c($$0, etg.a($$0).a(evt.a($$2.b(dbb.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected esy.a q(dgv $$0) {
      return this.a($$0, djb.f, duw.b);
   }

   protected void r(dgv $$0) {
      this.a($$0, $$0x -> this.d((ddr)((djy)$$0x).b()));
   }

   protected void c(dgv $$0, dgv $$1) {
      this.a($$0, this.c((ddr)$$1));
   }

   protected void c(dgv $$0, ddr $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dgv $$0) {
      this.c($$0, $$0);
   }

   protected void t(dgv $$0) {
      this.c($$0, (ddr)$$0);
   }

   protected void a(dgv $$0, Function<dgv, esy.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dgv $$0, esy.a $$1) {
      this.d.put($$0.v(), $$1);
   }
}
