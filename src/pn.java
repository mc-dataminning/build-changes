import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class pn {
   private static final Logger a = LogUtils.getLogger();
   private final gu b;
   final akk c;
   private final px d;
   private final int e;
   private final List<pr> f;
   private final List<Pair<pm, Collection<pr>>> g;
   private final gu.a h;

   public pn(Collection<pm> $$0, gu $$1, cyy $$2, akk $$3, px $$4, int $$5) {
      this.h = $$1.j();
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<pr> $$3x = $$2x.b().stream().map($$2xx -> new pr($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<pr> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<pm, Collection<pr>> $$1 = this.g.get($$0);
         final pm $$2 = (pm)$$1.getFirst();
         Collection<pr> $$3 = (Collection<pr>)$$1.getSecond();
         Map<pr, gu> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final qc $$6 = new qc();
         $$3.forEach($$6::a);
         $$6.a(new ps() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(pn.this.c);
                  pn.this.a($$0 + 1);
               }
            }

            @Override
            public void a(pr $$0x) {
            }

            @Override
            public void b(pr $$0x) {
               this.a();
            }

            @Override
            public void c(pr $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gu $$2x = $$4.get($$1x);
            pu.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<pr, gu> a(Collection<pr> $$0) {
      Map<pr, gu> $$1 = Maps.newHashMap();
      int $$2 = 0;
      egz $$3 = new egz(this.h);

      for (pr $$4 : $$0) {
         gu $$5 = new gu(this.h);
         ddz $$6 = qe.a($$4.t(), $$5, $$4.u(), 2, this.c, true);
         egz $$7 = qe.a($$6);
         $$4.a($$6.p());
         $$1.put($$4, new gu(this.h));
         $$3 = $$3.b($$7);
         this.h.e((int)$$7.b() + 5, 0, 0);
         if ($$2++ % this.e == this.e - 1) {
            this.h.e(0, 0, (int)$$3.d() + 6);
            this.h.p(this.b.u());
            $$3 = new egz(this.h);
         }
      }

      return $$1;
   }
}
