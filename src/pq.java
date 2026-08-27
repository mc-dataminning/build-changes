import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class pq {
   private static final Logger a = LogUtils.getLogger();
   private final gw b;
   final akn c;
   private final qa d;
   private final int e;
   private final List<pu> f;
   private final List<Pair<pp, Collection<pu>>> g;
   private int h;
   private ehd i;
   private final gw.a j;

   public pq(Collection<pp> $$0, gw $$1, czc $$2, akn $$3, qa $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ehd(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<pu> $$3x = $$2x.b().stream().map($$2xx -> new pu($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<pu> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<pp, Collection<pu>> $$1 = this.g.get($$0);
         final pp $$2 = (pp)$$1.getFirst();
         Collection<pu> $$3 = (Collection<pu>)$$1.getSecond();
         Map<pu, gw> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final qf $$6 = new qf();
         $$3.forEach($$6::a);
         $$6.a(new pv() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(pq.this.c);
                  pq.this.a($$0 + 1);
               }
            }

            @Override
            public void a(pu $$0x) {
            }

            @Override
            public void b(pu $$0x) {
               this.a();
            }

            @Override
            public void c(pu $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gw $$2x = $$4.get($$1x);
            px.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<pu, gw> a(Collection<pu> $$0) {
      Map<pu, gw> $$1 = Maps.newHashMap();

      for (pu $$2 : $$0) {
         gw $$3 = new gw(this.j);
         ded $$4 = qh.a($$2.t(), $$3, $$2.u(), 2, this.c, true);
         ehd $$5 = qh.a($$4);
         $$2.a($$4.p());
         $$1.put($$2, new gw(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ehd(this.j);
         }
      }

      return $$1;
   }
}
