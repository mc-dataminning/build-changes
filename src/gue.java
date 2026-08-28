import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gue implements gtp {
   private final gue.b a;
   private final ebg b;
   @Nullable
   private List<gtp> c;

   gue(gue.b $$0, ebg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public hlc a() {
      return this.a.b;
   }

   @Override
   public void a(azz $$0, List<gto> $$1) {
      if (this.c == null) {
         this.c = this.a.a(this.b);
      }

      long $$2 = $$0.g();

      for (gtp $$3 : this.c) {
         $$0.b($$2);
         $$3.a($$0, $$1);
      }
   }

   public static record a<T>(Predicate<ebg> a, T b) {

      public <S> gue.a<S> a(S $$0) {
         return new gue.a<>(this.a, $$0);
      }
   }

   static final class b {
      private final List<gue.a<gtp>> a;
      final hlc b;
      private final Map<BitSet, List<gtp>> c = new ConcurrentHashMap<>();

      private static gtp a(List<gue.a<gtp>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Model must have at least one selector");
         } else {
            return $$0.getFirst().b();
         }
      }

      public b(List<gue.a<gtp>> $$0) {
         this.a = $$0;
         gtp $$1 = a($$0);
         this.b = $$1.a();
      }

      public List<gtp> a(ebg $$0) {
         BitSet $$1 = new BitSet();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.set($$2);
            }
         }

         return this.c.computeIfAbsent($$1, $$0x -> {
            Builder<gtp> $$1x = ImmutableList.builder();

            for (int $$2x = 0; $$2x < this.a.size(); $$2x++) {
               if ($$0x.get($$2x)) {
                  $$1x.add(this.a.get($$2x).b);
               }
            }

            return $$1x.build();
         });
      }
   }

   public static class c implements gtp.c {
      final List<gue.a<gtp.b>> a;
      private final hnl.a<gue.b> b = new hnl.a<gue.b>() {
         public gue.b a(hnl $$0) {
            Builder<gue.a<gtp>> $$1 = ImmutableList.builderWithExpectedSize(c.this.a.size());

            for (gue.a<gtp.b> $$2 : c.this.a) {
               $$1.add($$2.a($$2.b.a($$0)));
            }

            return new gue.b($$1.build());
         }
      };

      public c(List<gue.a<gtp.b>> $$0) {
         this.a = $$0;
      }

      @Override
      public Object a(ebg $$0) {
         IntList $$1 = new IntArrayList();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.add($$2);
            }
         }

         record a(gue.c a, IntList b) {
         }

         return new a(this, $$1);
      }

      @Override
      public void a(hnt.a $$0) {
         this.a.forEach($$1 -> $$1.b.a($$0));
      }

      @Override
      public gtp a(ebg $$0, hnl $$1) {
         gue.b $$2 = $$1.a(this.b);
         return new gue($$2, $$0);
      }
   }
}
