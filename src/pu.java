import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class pu {
   private static final Logger a = LogUtils.getLogger();
   private final gw b;
   final akr c;
   private final qe d;
   private final int e;
   private final List<py> f;
   private final List<Pair<pt, Collection<py>>> g;
   private int h;
   private ehi i;
   private final gw.a j;

   public pu(Collection<pt> $$0, gw $$1, czh $$2, akr $$3, qe $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ehi(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<py> $$3x = $$2x.b().stream().map($$2xx -> new py($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<py> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<pt, Collection<py>> $$1 = this.g.get($$0);
         final pt $$2 = (pt)$$1.getFirst();
         Collection<py> $$3 = (Collection<py>)$$1.getSecond();
         Map<py, gw> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final qj $$6 = new qj();
         $$3.forEach($$6::a);
         $$6.a(new pz() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(pu.this.c);
                  pu.this.a($$0 + 1);
               }
            }

            @Override
            public void a(py $$0x) {
            }

            @Override
            public void b(py $$0x) {
               this.a();
            }

            @Override
            public void c(py $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gw $$2x = $$4.get($$1x);
            qb.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<py, gw> a(Collection<py> $$0) {
      Map<py, gw> $$1 = Maps.newHashMap();

      for (py $$2 : $$0) {
         gw $$3 = new gw(this.j);
         dei $$4 = ql.a($$2.t(), $$3, $$2.u(), 2, this.c, true);
         ehi $$5 = ql.a($$4);
         $$2.a($$4.p());
         $$1.put($$2, new gw(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ehi(this.j);
         }
      }

      return $$1;
   }
}
