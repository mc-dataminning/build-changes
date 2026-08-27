import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class gdr implements gdi {
   private final List<Pair<Predicate<dgw>, gdi>> g;
   protected final boolean a;
   protected final boolean b;
   protected final boolean c;
   protected final gbh d;
   protected final frq e;
   protected final fro f;
   private final Map<dgw, BitSet> h = new Reference2ObjectOpenHashMap();

   public gdr(List<Pair<Predicate<dgw>, gdi>> $$0) {
      this.g = $$0;
      gdi $$1 = (gdi)$$0.iterator().next().getRight();
      this.a = $$1.a();
      this.b = $$1.b();
      this.c = $$1.c();
      this.d = $$1.e();
      this.e = $$1.f();
      this.f = $$1.g();
   }

   @Override
   public List<fre> a(@Nullable dgw $$0, @Nullable hx $$1, ato $$2) {
      if ($$0 == null) {
         return Collections.emptyList();
      } else {
         BitSet $$3 = this.h.get($$0);
         if ($$3 == null) {
            $$3 = new BitSet();

            for (int $$4 = 0; $$4 < this.g.size(); $$4++) {
               Pair<Predicate<dgw>, gdi> $$5 = this.g.get($$4);
               if (((Predicate)$$5.getLeft()).test($$0)) {
                  $$3.set($$4);
               }
            }

            this.h.put($$0, $$3);
         }

         List<fre> $$6 = Lists.newArrayList();
         long $$7 = $$2.g();

         for (int $$8 = 0; $$8 < $$3.length(); $$8++) {
            if ($$3.get($$8)) {
               $$6.addAll(((gdi)this.g.get($$8).getRight()).a($$0, $$1, ato.a($$7)));
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
   public gbh e() {
      return this.d;
   }

   @Override
   public frq f() {
      return this.e;
   }

   @Override
   public fro g() {
      return this.f;
   }

   public static class a {
      private final List<Pair<Predicate<dgw>, gdi>> a = Lists.newArrayList();

      public void a(Predicate<dgw> $$0, gdi $$1) {
         this.a.add(Pair.of($$0, $$1));
      }

      public gdi a() {
         return new gdr(this.a);
      }
   }
}
