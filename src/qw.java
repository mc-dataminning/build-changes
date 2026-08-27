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

public class qw {
   private static final Logger a = LogUtils.getLogger();
   private final ht b;
   final ame c;
   private final rg d;
   private final int e;
   private final List<ra> f;
   private final List<Pair<qv, Collection<ra>>> g;
   private int h;
   private ejp i;
   private final ht.a j;

   public qw(Collection<qv> $$0, ht $$1, dbm $$2, ame $$3, rg $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ejp(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<ra> $$3x = $$2x.b().stream().map($$2xx -> new ra($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<ra> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<qv, Collection<ra>> $$1 = this.g.get($$0);
         final qv $$2 = (qv)$$1.getFirst();
         Collection<ra> $$3 = (Collection<ra>)$$1.getSecond();
         Map<ra, ht> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final rl $$6 = new rl();
         $$3.forEach($$6::a);
         $$6.a(new rb() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(qw.this.c);
                  LongSet $$0 = new LongArraySet(qw.this.c.v());
                  $$0.forEach($$0xxx -> qw.this.c.a(crh.a($$0xxx), crh.b($$0xxx), false));
                  qw.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ra $$0x) {
            }

            @Override
            public void b(ra $$0x) {
               this.a();
            }

            @Override
            public void c(ra $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            ht $$2x = $$4.get($$1x);
            rd.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<ra, ht> a(Collection<ra> $$0) {
      Map<ra, ht> $$1 = Maps.newHashMap();

      for (ra $$2 : $$0) {
         ht $$3 = new ht(this.j);
         dgr $$4 = rn.a($$2.u(), $$3, $$2.v(), this.c, true);
         ejp $$5 = rn.a($$4);
         $$2.a($$4.p());
         $$1.put($$2, new ht(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ejp(this.j);
         }
      }

      return $$1;
   }
}
