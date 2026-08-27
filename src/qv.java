import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class qv {
   private static final Logger a = LogUtils.getLogger();
   private final ht b;
   final ama c;
   private final rf d;
   private final int e;
   private final List<qz> f;
   private final List<Pair<qu, Collection<qz>>> g;
   private int h;
   private ejd i;
   private final ht.a j;

   public qv(Collection<qu> $$0, ht $$1, dbf $$2, ama $$3, rf $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ejd(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<qz> $$3x = $$2x.b().stream().map($$2xx -> new qz($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<qz> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<qu, Collection<qz>> $$1 = this.g.get($$0);
         final qu $$2 = (qu)$$1.getFirst();
         Collection<qz> $$3 = (Collection<qz>)$$1.getSecond();
         Map<qz, ht> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final rk $$6 = new rk();
         $$3.forEach($$6::a);
         $$6.a(new ra() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(qv.this.c);
                  qv.this.a($$0 + 1);
               }
            }

            @Override
            public void a(qz $$0x) {
            }

            @Override
            public void b(qz $$0x) {
               this.a();
            }

            @Override
            public void c(qz $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            ht $$2x = $$4.get($$1x);
            rc.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<qz, ht> a(Collection<qz> $$0) {
      Map<qz, ht> $$1 = Maps.newHashMap();

      for (qz $$2 : $$0) {
         ht $$3 = new ht(this.j);
         dgf $$4 = rm.a($$2.t(), $$3, $$2.u(), 2, this.c, true);
         ejd $$5 = rm.a($$4);
         $$2.a($$4.p());
         $$1.put($$2, new ht(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ejd(this.j);
         }
      }

      return $$1;
   }
}
