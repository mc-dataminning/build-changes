import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gry implements grp {
   private final List<Pair<Predicate<dsk>, grp>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final gpo d;
   protected final gfm e;
   protected final gfk f;
   private final Map<dsk, BitSet> h = new Reference2ObjectOpenHashMap();

   public gry(List<Pair<Predicate<dsk>, grp>> $$0) {
      this.g = $$0;
      grp $$1 = (grp)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<gfa> a(@Nullable dsk $$0, @Nullable jf $$1, ayo $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dsk>, grp> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<gfa> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((grp)this.g.get($$8).getRight()).a($$0, $$1, ayo.a($$7)));
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
   public gpo e() {
      return this.d;
   }

   @Override
   public gfm f() {
      return this.e;
   }

   @Override
   public gfk g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dsk>, grp>> a = Lists.newArrayList();

      public void a(Predicate<dsk> $$0, grp $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public grp a() {
         return new gry(this.a);
      }
   }
}
