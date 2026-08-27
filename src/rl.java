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

public class rl {
   private static final Logger a = LogUtils.getLogger();
   private final hx b;
   final ane c;
   private final rv d;
   private final int e;
   private final List<rp> f;
   private final List<Pair<rk, Collection<rp>>> g;
   private int h;
   private elx i;
   private final hx.a j;

   public rl(Collection<rk> $$0, hx $$1, ddk $$2, ane $$3, rv $$4, int $$5) {
      this.j = $$1.j();
      this.i = new elx(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<rp> $$3x = $$2x.b().stream().map($$2xx -> new rp($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<rp> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<rk, Collection<rp>> $$1 = this.g.get($$0);
         final rk $$2 = (rk)$$1.getFirst();
         Collection<rp> $$3 = (Collection<rp>)$$1.getSecond();
         Map<rp, hx> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final sa $$6 = new sa();
         $$3.forEach($$6::a);
         $$6.a(new rq() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(rl.this.c);
                  LongSet $$0 = new LongArraySet(rl.this.c.w());
                  $$0.forEach($$0xxx -> rl.this.c.a(cte.a($$0xxx), cte.b($$0xxx), false));
                  rl.this.a($$0 + 1);
               }
            }

            @Override
            public void a(rp $$0x) {
            }

            @Override
            public void b(rp $$0x) {
               this.a();
            }

            @Override
            public void c(rp $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            hx $$2x = $$4.get($$1x);
            rs.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<rp, hx> a(Collection<rp> $$0) {
      Map<rp, hx> $$1 = Maps.newHashMap();

      for (rp $$2 : $$0) {
         hx $$3 = new hx(this.j);
         dir $$4 = sc.a($$2, $$3, $$2.v(), this.c);
         elx $$5 = sc.a($$4);
         $$2.a($$4.aE_());
         $$1.put($$2, new hx(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new elx(this.j);
         }
      }

      return $$1;
   }
}
