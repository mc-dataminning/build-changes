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

public class ri {
   private static final Logger a = LogUtils.getLogger();
   private final hx b;
   final amz c;
   private final rs d;
   private final int e;
   private final List<rm> f;
   private final List<Pair<rh, Collection<rm>>> g;
   private int h;
   private elh i;
   private final hx.a j;

   public ri(Collection<rh> $$0, hx $$1, dcv $$2, amz $$3, rs $$4, int $$5) {
      this.j = $$1.j();
      this.i = new elh(this.j);
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = $$0.stream().map($$2x -> {
         Collection<rm> $$3x = $$2x.b().stream().map($$2xx -> new rm($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<rm> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<rh, Collection<rm>> $$1 = this.g.get($$0);
         final rh $$2 = (rh)$$1.getFirst();
         Collection<rm> $$3 = (Collection<rm>)$$1.getSecond();
         Map<rm, hx> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final rx $$6 = new rx();
         $$3.forEach($$6::a);
         $$6.a(new rn() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(ri.this.c);
                  LongSet $$0 = new LongArraySet(ri.this.c.w());
                  $$0.forEach($$0xxx -> ri.this.c.a(csp.a($$0xxx), csp.b($$0xxx), false));
                  ri.this.a($$0 + 1);
               }
            }

            @Override
            public void a(rm $$0x) {
            }

            @Override
            public void b(rm $$0x) {
               this.a();
            }

            @Override
            public void c(rm $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            hx $$2x = $$4.get($$1x);
            rp.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<rm, hx> a(Collection<rm> $$0) {
      Map<rm, hx> $$1 = Maps.newHashMap();

      for (rm $$2 : $$0) {
         hx $$3 = new hx(this.j);
         dic $$4 = rz.a($$2, $$3, $$2.v(), this.c);
         elh $$5 = rz.a($$4);
         $$2.a($$4.aB_());
         $$1.put($$2, new hx(this.j));
         this.i = this.i.b($$5);
         this.j.e((int)$$5.b() + 5, 0, 0);
         if (this.h++ % this.e == this.e - 1) {
            this.j.e(0, 0, (int)this.i.d() + 6);
            this.j.p(this.b.u());
            this.i = new elh(this.j);
         }
      }

      return $$1;
   }
}
