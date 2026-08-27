import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class rg {
   private static final Logger a = LogUtils.getLogger();
   private final hv b;
   final amp c;
   private final rq d;
   private final int e;
   private final List<rk> f;
   private final List<Pair<rf, Collection<rk>>> g;
   private int h;
   private ekw i;
   private final hv.a j;

   public rg(Collection<rf> $$0, hv $$1, dcl $$2, amp $$3, rq $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ekw(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<rk> $$3x = $$2x.b().stream().map($$2xx -> new rk($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<rk> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<rf, Collection<rk>> $$1 = this.g.get($$0);
         final rf $$2 = (rf)$$1.getFirst();
         Collection<rk> $$3 = (Collection<rk>)$$1.getSecond();
         Map<rk, hv> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final rv $$6 = new rv();
         $$3.forEach($$6::a);
         $$6.a(new rl() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(rg.this.c);
                  LongSet $$0 = new LongArraySet(rg.this.c.v());
                  $$0.forEach($$0xxx -> rg.this.c.a(csf.a($$0xxx), csf.b($$0xxx), false));
                  rg.this.a($$0 + 1);
               }
            }

            @Override
            public void a(rk $$0x) {
            }

            @Override
            public void b(rk $$0x) {
               this.a();
            }

            @Override
            public void c(rk $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            hv $$2x = $$4.get($$1x);
            rn.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<rk, hv> a(Collection<rk> $$0) {
      Map<rk, hv> $$1 = Maps.newHashMap();

      for (rk $$2 : $$0) {
         hv $$3 = new hv(this.j);
         dhr $$4 = rx.a($$2, $$3, $$2.v(), this.c);
         ekw $$5 = rx.a($$4);
         $$2.a($$4.aB_());
         $$1.put($$2, new hv(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ekw(this.j);
         }
      }

      return $$1;
   }
}
