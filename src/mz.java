import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mz implements nc {
   protected final jr.a a;
   protected final Set<cvt> b;
   protected final cra c;
   protected final Map<alg<eub>, eub.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected exh.a a() {
      jr.b<dbm> $$0 = this.a.d(ly.aM);
      return exo.a(ct.a.a().a(cv.b, co.a(List.of(new bq($$0.b(dbr.v), di.d.b(1))))));
   }

   protected exh.a b() {
      return this.a().invert();
   }

   protected exh.a c() {
      return exo.a(ct.a.a().a(this.a.d(ly.K), cwb.rW));
   }

   private exh.a f() {
      return this.c().or(this.a());
   }

   private exh.a g() {
      return this.f().invert();
   }

   protected mz(Set<cvt> $$0, cra $$1, jr.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mz(Set<cvt> $$0, cra $$1, Map<alg<eub>, eub.a> $$2, jr.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends evg<T>> T a(deu $$0, evg<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(euu.c()) : $$1.c();
   }

   protected <T extends ewz<T>> T a(deu $$0, ewz<T> $$1) {
      return !this.b.contains($$0.j()) ? $$1.b(exd.c()) : $$1.d();
   }

   public eub.a a(deu $$0) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0))));
   }

   private static eub.a a(dhy $$0, exh.a $$1, eum.a<?> $$2) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a(euj.a($$0).a($$1).a($$2)));
   }

   protected eub.a a(dhy $$0, eum.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected eub.a b(dhy $$0, eum.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected eub.a c(dhy $$0, eum.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected eub.a a(dhy $$0, deu $$1) {
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a($$1)));
   }

   protected eub.a a(deu $$0, eyd $$1) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a((eum.a<?>)this.a($$0, euj.a($$0).a(ewb.a($$1)))));
   }

   protected eub.a a(dhy $$0, deu $$1, eyd $$2) {
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a($$1).a(ewb.a($$2))));
   }

   private eub.a c(deu $$0) {
      return eub.b().a(eua.a().a(this.a()).a(eya.a(1.0F)).a(euj.a($$0)));
   }

   private eub.a d(deu $$0) {
      return eub.b().a(this.a(dia.fR, eua.a().a(eya.a(1.0F)).a(euj.a(dia.fR)))).a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0))));
   }

   protected eub.a a(dhy $$0) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a((eum.a<?>)this.a((deu)$$0, euj.a($$0).a(ewb.a(eya.a(2.0F)).a(exg.a($$0).a(ed.a.a().a(dpb.b, dwl.c)))))));
   }

   protected <T extends Comparable<T> & baf> eub.a a(dhy $$0, dwg<T> $$1, T $$2) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0).a(exg.a($$0).a(ed.a.a().a($$1, $$2))))));
   }

   protected eub.a b(dhy $$0) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0).a(euw.a(euw.b.a).a(kt.g)))));
   }

   protected eub.a c(dhy $$0) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0).a(euw.a(euw.b.a).a(kt.g).a(kt.ak).a(kt.an).a(kt.ao)))));
   }

   protected eub.a d(dhy $$0) {
      jr.b<dbm> $$1 = this.a.d(ly.aM);
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a(cwb.oH).a(ewb.a(eyh.a(2.0F, 5.0F))).a(eut.a($$1.b(dbr.x)))));
   }

   protected eub.a e(dhy $$0) {
      jr.b<dbm> $$1 = this.a.d(ly.aM);
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a(cwb.oC).a(ewb.a(eyh.a(4.0F, 9.0F))).a(eut.a($$1.b(dbr.x)))));
   }

   protected eub.a f(dhy $$0) {
      jr.b<dbm> $$1 = this.a.d(ly.aM);
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a(cwb.lH).a(ewb.a(eyh.a(4.0F, 5.0F))).a(eut.b($$1.b(dbr.x)))));
   }

   protected eub.a g(dhy $$0) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$0).a(euw.a(euw.b.a).a(kt.g).a(kt.h).a(kt.q).a(kt.ah).a(kt.k)))));
   }

   protected eub.a h(dhy $$0) {
      return eub.b().a(eua.a().a(this.a()).a(eya.a(1.0F)).a(euj.a($$0).a(euw.a(euw.b.a).a(kt.am)).a(euv.a($$0).a(dhs.c))));
   }

   protected eub.a i(dhy $$0) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a(euj.a($$0).a(this.a()).a(euw.a(euw.b.a).a(kt.am)).a(euv.a($$0).a(dhs.c)).a(euj.a($$0))));
   }

   protected eub.a j(dhy $$0) {
      return eub.b().a(eua.a().a(euj.a(cwb.wy)).a(exg.a($$0).a(ed.a.a().a(diu.v_, true))));
   }

   protected eub.a a(dhy $$0, cvt $$1) {
      jr.b<dbm> $$2 = this.a.d(ly.aM);
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a($$1).a(eut.a($$2.b(dbr.x)))));
   }

   protected eub.a b(dhy $$0, deu $$1) {
      return this.a($$0, (eum.a<?>)this.a((deu)$$0, euj.a($$1).a(ewb.a(eyh.a(-6.0F, 2.0F))).a(evh.a(etv.b(0)))));
   }

   protected eub.a k(dhy $$0) {
      jr.b<dbm> $$1 = this.a.d(ly.aM);
      return this.b($$0, (eum.a<?>)this.a((deu)$$0, euj.a(cwb.pw).a(exm.a(0.125F)).a(eut.a($$1.b(dbr.x), 2))));
   }

   public eub.a b(dhy $$0, cvt $$1) {
      return eub.b()
         .a(
            this.a(
               $$0,
               eua.a()
                  .a(eya.a(1.0F))
                  .a(euj.a($$1).a(dpu.c.a(), $$1x -> ewb.a(exz.a(3, (float)($$1x + 1) / 15.0F)).a(exg.a($$0).a(ed.a.a().a(dpu.c, $$1x.intValue())))))
            )
         );
   }

   public eub.a c(dhy $$0, cvt $$1) {
      return eub.b().a(this.a($$0, eua.a().a(eya.a(1.0F)).a(euj.a($$1).a(ewb.a(exz.a(3, 0.53333336F))))));
   }

   protected eub.a b(deu $$0) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a(this.c()).a(euj.a($$0)));
   }

   protected eub.a a(dhy $$0, exh.a $$1) {
      return eub.b()
         .a(
            eua.a()
               .a(
                  (eum.a<?>)this.a(
                     (deu)$$0,
                     euj.a($$0)
                        .a($$1)
                        .a(jl.values(), $$1x -> ewb.a(eya.a(1.0F), true).a(exg.a($$0).a(ed.a.a().a(dmx.b($$1x), true))))
                        .a(ewb.a(eya.a(-1.0F), true))
                  )
               )
         );
   }

   protected eub.a a(dhy $$0, dhy $$1, float... $$2) {
      jr.b<dbm> $$3 = this.a.d(ly.aM);
      return this.c($$0, ((euo.a)this.a((deu)$$0, euj.a($$1))).a(eww.a($$3.b(dbr.x), $$2)))
         .a(eua.a().a(eya.a(1.0F)).a(this.g()).a(((euo.a)this.a((deu)$$0, euj.a(cwb.pr).a(ewb.a(eyh.a(1.0F, 2.0F))))).a(eww.a($$3.b(dbr.x), f))));
   }

   protected eub.a b(dhy $$0, dhy $$1, float... $$2) {
      jr.b<dbm> $$3 = this.a.d(ly.aM);
      return this.a($$0, $$1, $$2)
         .a(
            eua.a()
               .a(eya.a(1.0F))
               .a(this.g())
               .a(((euo.a)this.a((deu)$$0, euj.a(cwb.ov))).a(eww.a($$3.b(dbr.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected eub.a l(dhy $$0) {
      jr.b<dbm> $$1 = this.a.d(ly.aM);
      return this.c($$0, ((euo.a)this.a((deu)dia.aL, euj.a(cwb.pr).a(ewb.a(eyh.a(1.0F, 2.0F))))).a(eww.a($$1.b(dbr.x), f)));
   }

   protected eub.a a(dhy $$0, cvt $$1, cvt $$2, exh.a $$3) {
      jr.b<dbm> $$4 = this.a.d(ly.aM);
      return this.a((deu)$$0, eub.b().a(eua.a().a(euj.a($$1).a($$3).a(euj.a($$2)))).a(eua.a().a($$3).a(euj.a($$2).a(eut.a($$4.b(dbr.x), 0.5714286F, 3)))));
   }

   protected eub.a m(dhy $$0) {
      return eub.b().a(eua.a().a(this.c()).a(euj.a($$0).a(ewb.a(eya.a(2.0F)))));
   }

   protected eub.a a(dhy $$0, dhy $$1) {
      jr.b<dhy> $$2 = this.a.d(ly.f);
      eum.a<?> $$3 = euj.a($$1).a(ewb.a(eya.a(2.0F))).a(this.c()).a(((euo.a)this.a((deu)$$0, euj.a(cwb.pw))).a(exm.a(0.125F)));
      return eub.b()
         .a(eua.a().a($$3).a(exg.a($$0).a(ed.a.a().a(dkg.b, dvz.b))).a(exf.a(dg.a.a().a(aw.a.a().a($$2, $$0).a(ed.a.a().a(dkg.b, dvz.a))), new jg(0, 1, 0))))
         .a(eua.a().a($$3).a(exg.a($$0).a(ed.a.a().a(dkg.b, dvz.a))).a(exf.a(dg.a.a().a(aw.a.a().a($$2, $$0).a(ed.a.a().a(dkg.b, dvz.b))), new jg(0, -1, 0))));
   }

   protected eub.a n(dhy $$0) {
      return eub.b()
         .a(
            eua.a()
               .a(eya.a(1.0F))
               .a(
                  (eum.a<?>)this.a(
                     $$0, euj.a($$0).a(List.of(2, 3, 4), $$1 -> ewb.a(eya.a((float)$$1.intValue())).a(exg.a($$0).a(ed.a.a().a(din.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected eub.a o(dhy $$0) {
      return eub.b()
         .a(
            eua.a()
               .a(eya.a(1.0F))
               .a(
                  (eum.a<?>)this.a(
                     $$0,
                     euj.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> ewb.a(eya.a((float)$$1.intValue())).a(exg.a($$0).a(ed.a.a().a(dnk.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static eub.a p(dhy $$0) {
      return eub.b().a(eua.a().a(eya.a(1.0F)).a(euj.a($$0)));
   }

   public static eub.a d() {
      return eub.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alg<eub>, eub.a> $$0) {
      this.e();
      Set<alg<eub>> $$1 = new HashSet<>();

      for (dhy $$2 : lx.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alg<eub>)$$3)) {
                  eub.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lx.e.b($$2)));
                  }

                  $$0.accept((alg<eub>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dhy $$0, dhy $$1) {
      jr.b<dbm> $$2 = this.a.d(ly.aM);
      eub.a $$3 = this.c($$0, euj.a($$0).a(eww.a($$2.b(dbr.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected eub.a q(dhy $$0) {
      return this.a($$0, dke.f, dvz.b);
   }

   protected void r(dhy $$0) {
      this.a($$0, $$0x -> this.d((deu)((dla)$$0x).b()));
   }

   protected void c(dhy $$0, dhy $$1) {
      this.a($$0, this.c((deu)$$1));
   }

   protected void c(dhy $$0, deu $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dhy $$0) {
      this.c($$0, $$0);
   }

   protected void t(dhy $$0) {
      this.c($$0, (deu)$$0);
   }

   protected void a(dhy $$0, Function<dhy, eub.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dhy $$0, eub.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
