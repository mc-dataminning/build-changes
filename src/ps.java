import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class ps {
   private static final Logger a = LogUtils.getLogger();
   private final gw b;
   final akt c;
   private final qc d;
   private final int e;
   private final List<pw> f;
   private final List<Pair<pr, Collection<pw>>> g;
   private int h;
   private ehc i;
   private final gw.a j;

   public ps(Collection<pr> $$0, gw $$1, czn $$2, akt $$3, qc $$4, int $$5) {
      this.j = $$1.j();
      this.i = new ehc(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<pw> $$3x = $$2x.b().stream().map($$2xx -> new pw($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<pw> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<pr, Collection<pw>> $$1 = this.g.get($$0);
         final pr $$2 = (pr)$$1.getFirst();
         Collection<pw> $$3 = (Collection<pw>)$$1.getSecond();
         Map<pw, gw> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final qh $$6 = new qh();
         $$3.forEach($$6::a);
         $$6.a(new px() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(ps.this.c);
                  ps.this.a($$0 + 1);
               }
            }

            @Override
            public void a(pw $$0x) {
            }

            @Override
            public void b(pw $$0x) {
               this.a();
            }

            @Override
            public void c(pw $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gw $$2x = $$4.get($$1x);
            pz.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<pw, gw> a(Collection<pw> $$0) {
      Map<pw, gw> $$1 = Maps.newHashMap();

      for (pw $$2 : $$0) {
         gw $$3 = new gw(this.j);
         dem $$4 = qj.a($$2.t(), $$3, $$2.u(), 2, this.c, true);
         ehc $$5 = qj.a($$4);
         $$2.a($$4.p());
         $$1.put($$2, new gw(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new ehc(this.j);
         }
      }

      return $$1;
   }
}
