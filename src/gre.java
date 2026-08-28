import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gre implements gqv {
   private final List<Pair<Predicate<drx>, gqv>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final gou d;
   protected final ges e;
   protected final geq f;
   private final Map<drx, BitSet> h = new Reference2ObjectOpenHashMap();

   public gre(List<Pair<Predicate<drx>, gqv>> $$0) {
      this.g = $$0;
      gqv $$1 = (gqv)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<geg> a(@Nullable drx $$0, @Nullable je $$1, azc $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<drx>, gqv> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<geg> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((gqv)this.g.get($$8).getRight()).a($$0, $$1, azc.a($$7)));
            }
         }

         return $$6;
      }
   }

   @Override
   public boolean a() {
      return this.a;
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.c;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gou e() {
      return this.d;
   }

   @Override
   public ges f() {
      return this.e;
   }

   @Override
   public geq g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<drx>, gqv>> a = Lists.newArrayList();

      public void a(Predicate<drx> $$0, gqv $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public gqv a() {
         return new gre(this.a);
      }
   }
}
