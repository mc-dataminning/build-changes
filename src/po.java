import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class po {
   private static final Logger a = LogUtils.getLogger();
   private final gv b;
   final aki c;
   private final py d;
   private final int e;
   private final List<ps> f;
   private final List<Pair<pn, Collection<ps>>> g;
   private final gv.a h;

   public po(Collection<pn> $$0, gv $$1, cyw $$2, aki $$3, py $$4, int $$5) {
      this.h = $$1.j();
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<ps> $$3x = $$2x.b().stream().map($$2xx -> new ps($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<ps> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<pn, Collection<ps>> $$1 = this.g.get($$0);
         final pn $$2 = (pn)$$1.getFirst();
         Collection<ps> $$3 = (Collection<ps>)$$1.getSecond();
         Map<ps, gv> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final qd $$6 = new qd();
         $$3.forEach($$6::a);
         $$6.a(new pt() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(po.this.c);
                  po.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ps $$0x) {
            }

            @Override
            public void b(ps $$0x) {
               this.a();
            }

            @Override
            public void c(ps $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gv $$2x = $$4.get($$1x);
            pv.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<ps, gv> a(Collection<ps> $$0) {
      Map<ps, gv> $$1 = Maps.newHashMap();
      int $$2 = 0;
      eha $$3 = new eha(this.h);

      for (ps $$4 : $$0) {
         gv $$5 = new gv(this.h);
         ddx $$6 = qf.a($$4.t(), $$5, $$4.u(), 2, this.c, true);
         eha $$7 = qf.a($$6);
         $$4.a($$6.p());
         $$1.put($$4, new gv(this.h));
         $$3 = $$3.b($$7);
         this.h.e((int)$$7.b() + 5, 0, 0);
         if ($$2++ % this.e == this.e - 1) {
            this.h.e(0, 0, (int)$$3.d() + 6);
            this.h.p(this.b.u());
            $$3 = new eha(this.h);
         }
      }

      return $$1;
   }
}
