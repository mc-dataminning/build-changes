import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class na implements nd {
   protected final js.a a;
   protected final Set<cvx> b;
   protected final crf c;
   protected final Map<alh<euh>, euh.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected exn.a a() {
      js.b<dbs> $$0 = this.a.d(lz.aM);
      return exu.a(cu.a.a().a(cw.b, cp.a(List.of(new br($$0.b(dbx.v), dj.d.b(1))))));
   }

   protected exn.a b() {
      return this.a().invert();
   }

   protected exn.a c() {
      return exu.a(cu.a.a().a(this.a.d(lz.K), cwf.rW));
   }

   private exn.a f() {
      return this.c().or(this.a());
   }

   private exn.a g() {
      return this.f().invert();
   }

   protected na(Set<cvx> $$0, crf $$1, js.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected na(Set<cvx> $$0, crf $$1, Map<alh<euh>, euh.a> $$2, js.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends evm<T>> T a(dfa $$0, evm<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(eva.c()) : $$1.c();
   }

   protected <T extends exf<T>> T a(dfa $$0, exf<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exj.c()) : $$1.d();
   }

   public euh.a a(dfa $$0) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0))));
   }

   private static euh.a a(die $$0, exn.a $$1, eus.a<?> $$2) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a($$1).a($$2)));
   }

   protected euh.a a(die $$0, eus.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected euh.a b(die $$0, eus.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected euh.a c(die $$0, eus.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected euh.a a(die $$0, dfa $$1) {
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a($$1)));
   }

   protected euh.a a(dfa $$0, eyj $$1) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a((eus.a<?>)this.a($$0, eup.a($$0).a(ewh.a($$1)))));
   }

   protected euh.a a(die $$0, dfa $$1, eyj $$2) {
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a($$1).a(ewh.a($$2))));
   }

   private euh.a c(dfa $$0) {
      return euh.b().a(eug.a().a(this.a()).a(eyg.a(1.0F)).a(eup.a($$0)));
   }

   private euh.a d(dfa $$0) {
      return euh.b().a(this.a(dig.fR, eug.a().a(eyg.a(1.0F)).a(eup.a(dig.fR)))).a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0))));
   }

   protected euh.a a(die $$0) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a((eus.a<?>)this.a((dfa)$$0, eup.a($$0).a(ewh.a(eyg.a(2.0F)).a(exm.a($$0).a(ee.a.a().a(dph.b, dwr.c)))))));
   }

   protected <T extends Comparable<T> & bag> euh.a a(die $$0, dwm<T> $$1, T $$2) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a(exm.a($$0).a(ee.a.a().a($$1, $$2))))));
   }

   protected euh.a b(die $$0) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a(evc.a(evc.b.a).a(ku.g)))));
   }

   protected euh.a c(die $$0) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a(evc.a(evc.b.a).a(ku.g).a(ku.al).a(ku.ao).a(ku.ap)))));
   }

   protected euh.a d(die $$0) {
      js.b<dbs> $$1 = this.a.d(lz.aM);
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a(cwf.oH).a(ewh.a(eyn.a(2.0F, 5.0F))).a(euz.a($$1.b(dbx.x)))));
   }

   protected euh.a e(die $$0) {
      js.b<dbs> $$1 = this.a.d(lz.aM);
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a(cwf.oC).a(ewh.a(eyn.a(4.0F, 9.0F))).a(euz.a($$1.b(dbx.x)))));
   }

   protected euh.a f(die $$0) {
      js.b<dbs> $$1 = this.a.d(lz.aM);
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a(cwf.lH).a(ewh.a(eyn.a(4.0F, 5.0F))).a(euz.b($$1.b(dbx.x)))));
   }

   protected euh.a g(die $$0) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a(evc.a(evc.b.a).a(ku.g).a(ku.h).a(ku.q).a(ku.ai).a(ku.k)))));
   }

   protected euh.a h(die $$0) {
      return euh.b().a(eug.a().a(this.a()).a(eyg.a(1.0F)).a(eup.a($$0).a(evc.a(evc.b.a).a(ku.an)).a(evb.a($$0).a(dhy.c))));
   }

   protected euh.a i(die $$0) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a(eup.a($$0).a(this.a()).a(evc.a(evc.b.a).a(ku.an)).a(evb.a($$0).a(dhy.c)).a(eup.a($$0))));
   }

   protected euh.a j(die $$0) {
      return euh.b().a(eug.a().a(eup.a(cwf.wy)).a(exm.a($$0).a(ee.a.a().a(dja.v_, true))));
   }

   protected euh.a a(die $$0, cvx $$1) {
      js.b<dbs> $$2 = this.a.d(lz.aM);
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a($$1).a(euz.a($$2.b(dbx.x)))));
   }

   protected euh.a b(die $$0, dfa $$1) {
      return this.a($$0, (eus.a<?>)this.a((dfa)$$0, eup.a($$1).a(ewh.a(eyn.a(-6.0F, 2.0F))).a(evn.a(eub.b(0)))));
   }

   protected euh.a k(die $$0) {
      js.b<dbs> $$1 = this.a.d(lz.aM);
      return this.b($$0, (eus.a<?>)this.a((dfa)$$0, eup.a(cwf.pw).a(exs.a(0.125F)).a(euz.a($$1.b(dbx.x), 2))));
   }

   public euh.a b(die $$0, cvx $$1) {
      return euh.b()
         .a(
            this.a(
               $$0,
               eug.a()
                  .a(eyg.a(1.0F))
                  .a(eup.a($$1).a(dqa.c.a(), $$1x -> ewh.a(eyf.a(3, (float)($$1x + 1) / 15.0F)).a(exm.a($$0).a(ee.a.a().a(dqa.c, $$1x.intValue())))))
            )
         );
   }

   public euh.a c(die $$0, cvx $$1) {
      return euh.b().a(this.a($$0, eug.a().a(eyg.a(1.0F)).a(eup.a($$1).a(ewh.a(eyf.a(3, 0.53333336F))))));
   }

   protected euh.a b(dfa $$0) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a(this.c()).a(eup.a($$0)));
   }

   protected euh.a a(die $$0, exn.a $$1) {
      return euh.b()
         .a(
            eug.a()
               .a(
                  (eus.a<?>)this.a(
                     (dfa)$$0,
                     eup.a($$0)
                        .a($$1)
                        .a(jm.values(), $$1x -> ewh.a(eyg.a(1.0F), true).a(exm.a($$0).a(ee.a.a().a(dnd.b($$1x), true))))
                        .a(ewh.a(eyg.a(-1.0F), true))
                  )
               )
         );
   }

   protected euh.a a(die $$0, die $$1, float... $$2) {
      js.b<dbs> $$3 = this.a.d(lz.aM);
      return this.c($$0, ((euu.a)this.a((dfa)$$0, eup.a($$1))).a(exc.a($$3.b(dbx.x), $$2)))
         .a(eug.a().a(eyg.a(1.0F)).a(this.g()).a(((euu.a)this.a((dfa)$$0, eup.a(cwf.pr).a(ewh.a(eyn.a(1.0F, 2.0F))))).a(exc.a($$3.b(dbx.x), f))));
   }

   protected euh.a b(die $$0, die $$1, float... $$2) {
      js.b<dbs> $$3 = this.a.d(lz.aM);
      return this.a($$0, $$1, $$2)
         .a(
            eug.a()
               .a(eyg.a(1.0F))
               .a(this.g())
               .a(((euu.a)this.a((dfa)$$0, eup.a(cwf.ov))).a(exc.a($$3.b(dbx.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected euh.a l(die $$0) {
      js.b<dbs> $$1 = this.a.d(lz.aM);
      return this.c($$0, ((euu.a)this.a((dfa)dig.aL, eup.a(cwf.pr).a(ewh.a(eyn.a(1.0F, 2.0F))))).a(exc.a($$1.b(dbx.x), f)));
   }

   protected euh.a a(die $$0, cvx $$1, cvx $$2, exn.a $$3) {
      js.b<dbs> $$4 = this.a.d(lz.aM);
      return this.a((dfa)$$0, euh.b().a(eug.a().a(eup.a($$1).a($$3).a(eup.a($$2)))).a(eug.a().a($$3).a(eup.a($$2).a(euz.a($$4.b(dbx.x), 0.5714286F, 3)))));
   }

   protected euh.a m(die $$0) {
      return euh.b().a(eug.a().a(this.c()).a(eup.a($$0).a(ewh.a(eyg.a(2.0F)))));
   }

   protected euh.a a(die $$0, die $$1) {
      js.b<die> $$2 = this.a.d(lz.f);
      eus.a<?> $$3 = eup.a($$1).a(ewh.a(eyg.a(2.0F))).a(this.c()).a(((euu.a)this.a((dfa)$$0, eup.a(cwf.pw))).a(exs.a(0.125F)));
      return euh.b()
         .a(eug.a().a($$3).a(exm.a($$0).a(ee.a.a().a(dkm.b, dwf.b))).a(exl.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dkm.b, dwf.a))), new jh(0, 1, 0))))
         .a(eug.a().a($$3).a(exm.a($$0).a(ee.a.a().a(dkm.b, dwf.a))).a(exl.a(dh.a.a().a(ax.a.a().a($$2, $$0).a(ee.a.a().a(dkm.b, dwf.b))), new jh(0, -1, 0))));
   }

   protected euh.a n(die $$0) {
      return euh.b()
         .a(
            eug.a()
               .a(eyg.a(1.0F))
               .a(
                  (eus.a<?>)this.a(
                     $$0, eup.a($$0).a(List.of(2, 3, 4), $$1 -> ewh.a(eyg.a((float)$$1.intValue())).a(exm.a($$0).a(ee.a.a().a(dit.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected euh.a o(die $$0) {
      return euh.b()
         .a(
            eug.a()
               .a(eyg.a(1.0F))
               .a(
                  (eus.a<?>)this.a(
                     $$0,
                     eup.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ewh.a(eyg.a((float)$$1.intValue())).a(exm.a($$0).a(ee.a.a().a(dnq.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static euh.a p(die $$0) {
      return euh.b().a(eug.a().a(eyg.a(1.0F)).a(eup.a($$0)));
   }

   public static euh.a d() {
      return euh.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alh<euh>, euh.a> $$0) {
      this.e();
      Set<alh<euh>> $$1 = new HashSet<>();

      for (die $$2 : ly.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alh<euh>)$$3)) {
                  euh.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), ly.e.b($$2)));
                  }

                  $$0.accept((alh<euh>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(die $$0, die $$1) {
      js.b<dbs> $$2 = this.a.d(lz.aM);
      euh.a $$3 = this.c($$0, eup.a($$0).a(exc.a($$2.b(dbx.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected euh.a q(die $$0) {
      return this.a($$0, dkk.f, dwf.b);
   }

   protected void r(die $$0) {
      this.a($$0, $$0x -> this.d((dfa)((dlg)$$0x).b()));
   }

   protected void c(die $$0, die $$1) {
      this.a($$0, this.c((dfa)$$1));
   }

   protected void c(die $$0, dfa $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(die $$0) {
      this.c($$0, $$0);
   }

   protected void t(die $$0) {
      this.c($$0, (dfa)$$0);
   }

   protected void a(die $$0, Function<die, euh.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(die $$0, euh.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
