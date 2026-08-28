import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class mx implements na {
   protected final jq.a a;
   protected final Set<cvn> b;
   protected final cqq c;
   protected final Map<ald<etq>, etq.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected eww.a a() {
      jq.b<dbn> $$0 = this.a.d(lw.aN);
      return exd.a(cs.a.a().a(cu.b, cn.a(List.of(new bq($$0.b(dbs.v), dh.d.b(1))))));
   }

   protected eww.a b() {
      return this.a().invert();
   }

   protected eww.a c() {
      return exd.a(cs.a.a().a(this.a.d(lw.K), cvw.rW));
   }

   private eww.a f() {
      return this.c().or(this.a());
   }

   private eww.a g() {
      return this.f().invert();
   }

   protected mx(Set<cvn> $$0, cqq $$1, jq.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected mx(Set<cvn> $$0, cqq $$1, Map<ald<etq>, etq.a> $$2, jq.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends euv<T>> T a(dei $$0, euv<T> $$1) {
      return !this.b.contains($$0.q()) ? $$1.b(euj.c()) : $$1.c();
   }

   protected <T extends ewo<T>> T a(dei $$0, ewo<T> $$1) {
      return !this.b.contains($$0.q()) ? $$1.b(ews.c()) : $$1.d();
   }

   public etq.a a(dei $$0) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0))));
   }

   private static etq.a a(dhm $$0, eww.a $$1, eub.a<?> $$2) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a(ety.a($$0).a($$1).a($$2)));
   }

   protected etq.a a(dhm $$0, eub.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected etq.a b(dhm $$0, eub.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected etq.a c(dhm $$0, eub.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected etq.a a(dhm $$0, dei $$1) {
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a($$1)));
   }

   protected etq.a a(dei $$0, exs $$1) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a((eub.a<?>)this.a($$0, ety.a($$0).a(evq.a($$1)))));
   }

   protected etq.a a(dhm $$0, dei $$1, exs $$2) {
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a($$1).a(evq.a($$2))));
   }

   private etq.a c(dei $$0) {
      return etq.b().a(etp.a().a(this.a()).a(exp.a(1.0F)).a(ety.a($$0)));
   }

   private etq.a d(dei $$0) {
      return etq.b().a(this.a(dho.fR, etp.a().a(exp.a(1.0F)).a(ety.a(dho.fR)))).a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0))));
   }

   protected etq.a a(dhm $$0) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a((eub.a<?>)this.a((dei)$$0, ety.a($$0).a(evq.a(exp.a(2.0F)).a(ewv.a($$0).a(ec.a.a().a(doq.b, dwa.c)))))));
   }

   protected <T extends Comparable<T> & bab> etq.a a(dhm $$0, dvv<T> $$1, T $$2) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0).a(ewv.a($$0).a(ec.a.a().a($$1, $$2))))));
   }

   protected etq.a b(dhm $$0) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0).a(eul.a(eul.b.a).a(ks.g)))));
   }

   protected etq.a c(dhm $$0) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0).a(eul.a(eul.b.a).a(ks.g).a(ks.ag).a(ks.aj).a(ks.ak)))));
   }

   protected etq.a d(dhm $$0) {
      jq.b<dbn> $$1 = this.a.d(lw.aN);
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a(cvw.oH).a(evq.a(exw.a(2.0F, 5.0F))).a(eui.a($$1.b(dbs.x)))));
   }

   protected etq.a e(dhm $$0) {
      jq.b<dbn> $$1 = this.a.d(lw.aN);
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a(cvw.oC).a(evq.a(exw.a(4.0F, 9.0F))).a(eui.a($$1.b(dbs.x)))));
   }

   protected etq.a f(dhm $$0) {
      jq.b<dbn> $$1 = this.a.d(lw.aN);
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a(cvw.lH).a(evq.a(exw.a(4.0F, 5.0F))).a(eui.b($$1.b(dbs.x)))));
   }

   protected etq.a g(dhm $$0) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$0).a(eul.a(eul.b.a).a(ks.g).a(ks.h).a(ks.p).a(ks.ad).a(ks.j)))));
   }

   protected etq.a h(dhm $$0) {
      return etq.b().a(etp.a().a(this.a()).a(exp.a(1.0F)).a(ety.a($$0).a(eul.a(eul.b.a).a(ks.ai)).a(euk.a($$0).a(dhg.c))));
   }

   protected etq.a i(dhm $$0) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a(ety.a($$0).a(this.a()).a(eul.a(eul.b.a).a(ks.ai)).a(euk.a($$0).a(dhg.c)).a(ety.a($$0))));
   }

   protected etq.a j(dhm $$0) {
      return etq.b().a(etp.a().a(ety.a(cvw.wy)).a(ewv.a($$0).a(ec.a.a().a(dii.v_, true))));
   }

   protected etq.a a(dhm $$0, cvn $$1) {
      jq.b<dbn> $$2 = this.a.d(lw.aN);
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a($$1).a(eui.a($$2.b(dbs.x)))));
   }

   protected etq.a b(dhm $$0, dei $$1) {
      return this.a($$0, (eub.a<?>)this.a((dei)$$0, ety.a($$1).a(evq.a(exw.a(-6.0F, 2.0F))).a(euw.a(etk.b(0)))));
   }

   protected etq.a k(dhm $$0) {
      jq.b<dbn> $$1 = this.a.d(lw.aN);
      return this.b($$0, (eub.a<?>)this.a((dei)$$0, ety.a(cvw.pw).a(exb.a(0.125F)).a(eui.a($$1.b(dbs.x), 2))));
   }

   public etq.a b(dhm $$0, cvn $$1) {
      return etq.b()
         .a(
            this.a(
               $$0,
               etp.a()
                  .a(exp.a(1.0F))
                  .a(ety.a($$1).a(dpj.c.a(), $$1x -> evq.a(exo.a(3, (float)($$1x + 1) / 15.0F)).a(ewv.a($$0).a(ec.a.a().a(dpj.c, $$1x.intValue())))))
            )
         );
   }

   public etq.a c(dhm $$0, cvn $$1) {
      return etq.b().a(this.a($$0, etp.a().a(exp.a(1.0F)).a(ety.a($$1).a(evq.a(exo.a(3, 0.53333336F))))));
   }

   protected etq.a b(dei $$0) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a(this.c()).a(ety.a($$0)));
   }

   protected etq.a a(dhm $$0, eww.a $$1) {
      return etq.b()
         .a(
            etp.a()
               .a(
                  (eub.a<?>)this.a(
                     (dei)$$0,
                     ety.a($$0)
                        .a($$1)
                        .a(jk.values(), $$1x -> evq.a(exp.a(1.0F), true).a(ewv.a($$0).a(ec.a.a().a(dmm.b($$1x), true))))
                        .a(evq.a(exp.a(-1.0F), true))
                  )
               )
         );
   }

   protected etq.a a(dhm $$0, dhm $$1, float... $$2) {
      jq.b<dbn> $$3 = this.a.d(lw.aN);
      return this.c($$0, ((eud.a)this.a((dei)$$0, ety.a($$1))).a(ewl.a($$3.b(dbs.x), $$2)))
         .a(etp.a().a(exp.a(1.0F)).a(this.g()).a(((eud.a)this.a((dei)$$0, ety.a(cvw.pr).a(evq.a(exw.a(1.0F, 2.0F))))).a(ewl.a($$3.b(dbs.x), f))));
   }

   protected etq.a b(dhm $$0, dhm $$1, float... $$2) {
      jq.b<dbn> $$3 = this.a.d(lw.aN);
      return this.a($$0, $$1, $$2)
         .a(
            etp.a()
               .a(exp.a(1.0F))
               .a(this.g())
               .a(((eud.a)this.a((dei)$$0, ety.a(cvw.ov))).a(ewl.a($$3.b(dbs.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected etq.a l(dhm $$0) {
      jq.b<dbn> $$1 = this.a.d(lw.aN);
      return this.c($$0, ((eud.a)this.a((dei)dho.aL, ety.a(cvw.pr).a(evq.a(exw.a(1.0F, 2.0F))))).a(ewl.a($$1.b(dbs.x), f)));
   }

   protected etq.a a(dhm $$0, cvn $$1, cvn $$2, eww.a $$3) {
      jq.b<dbn> $$4 = this.a.d(lw.aN);
      return this.a((dei)$$0, etq.b().a(etp.a().a(ety.a($$1).a($$3).a(ety.a($$2)))).a(etp.a().a($$3).a(ety.a($$2).a(eui.a($$4.b(dbs.x), 0.5714286F, 3)))));
   }

   protected etq.a m(dhm $$0) {
      return etq.b().a(etp.a().a(this.c()).a(ety.a($$0).a(evq.a(exp.a(2.0F)))));
   }

   protected etq.a a(dhm $$0, dhm $$1) {
      jq.b<dhm> $$2 = this.a.d(lw.f);
      eub.a<?> $$3 = ety.a($$1).a(evq.a(exp.a(2.0F))).a(this.c()).a(((eud.a)this.a((dei)$$0, ety.a(cvw.pw))).a(exb.a(0.125F)));
      return etq.b()
         .a(etp.a().a($$3).a(ewv.a($$0).a(ec.a.a().a(dju.b, dvo.b))).a(ewu.a(df.a.a().a(aw.a.a().a($$2, $$0).a(ec.a.a().a(dju.b, dvo.a))), new jf(0, 1, 0))))
         .a(etp.a().a($$3).a(ewv.a($$0).a(ec.a.a().a(dju.b, dvo.a))).a(ewu.a(df.a.a().a(aw.a.a().a($$2, $$0).a(ec.a.a().a(dju.b, dvo.b))), new jf(0, -1, 0))));
   }

   protected etq.a n(dhm $$0) {
      return etq.b()
         .a(
            etp.a()
               .a(exp.a(1.0F))
               .a(
                  (eub.a<?>)this.a(
                     $$0, ety.a($$0).a(List.of(2, 3, 4), $$1 -> evq.a(exp.a((float)$$1.intValue())).a(ewv.a($$0).a(ec.a.a().a(dib.f, $$1.intValue()))))
                  )
               )
         );
   }

   protected etq.a o(dhm $$0) {
      return etq.b()
         .a(
            etp.a()
               .a(exp.a(1.0F))
               .a(
                  (eub.a<?>)this.a(
                     $$0,
                     ety.a($$0)
                        .a(
                           IntStream.rangeClosed(1, 4).boxed().toList(),
                           $$1 -> evq.a(exp.a((float)$$1.intValue())).a(ewv.a($$0).a(ec.a.a().a(dmz.e, $$1.intValue())))
                        )
                  )
               )
         );
   }

   protected static etq.a p(dhm $$0) {
      return etq.b().a(etp.a().a(exp.a(1.0F)).a(ety.a($$0)));
   }

   public static etq.a d() {
      return etq.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<ald<etq>, etq.a> $$0) {
      this.e();
      Set<ald<etq>> $$1 = new HashSet<>();

      for (dhm $$2 : lv.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((ald<etq>)$$3)) {
                  etq.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), lv.e.b($$2)));
                  }

                  $$0.accept((ald<etq>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dhm $$0, dhm $$1) {
      jq.b<dbn> $$2 = this.a.d(lw.aN);
      etq.a $$3 = this.c($$0, ety.a($$0).a(ewl.a($$2.b(dbs.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected etq.a q(dhm $$0) {
      return this.a($$0, djs.f, dvo.b);
   }

   protected void r(dhm $$0) {
      this.a($$0, $$0x -> this.d((dei)((dkp)$$0x).b()));
   }

   protected void c(dhm $$0, dhm $$1) {
      this.a($$0, this.c((dei)$$1));
   }

   protected void c(dhm $$0, dei $$1) {
      this.a($$0, this.a($$1));
   }

   protected void s(dhm $$0) {
      this.c($$0, $$0);
   }

   protected void t(dhm $$0) {
      this.c($$0, (dei)$$0);
   }

   protected void a(dhm $$0, Function<dhm, etq.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dhm $$0, etq.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
