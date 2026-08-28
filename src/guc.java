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

public class guc implements gtn {
   private final guc.b a;
   private final ebe b;
   @Nullable
   private List<gtn> c;

   guc(guc.b $$0, ebe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public hla a() {
      return this.a.b;
   }

   @Override
   public void a(azx $$0, List<gtm> $$1) {
      if (this.c == null) {
         this.c = this.a.a(this.b);
      }

      long $$2 = $$0.g();

      for (gtn $$3 : this.c) {
         $$0.b($$2);
         $$3.a($$0, $$1);
      }
   }

   public static record a<T>(Predicate<ebe> a, T b) {

      public <S> guc.a<S> a(S $$0) {
         return new guc.a<>(this.a, $$0);
      }
   }

   static final class b {
      private final List<guc.a<gtn>> a;
      final hla b;
      private final Map<BitSet, List<gtn>> c = new ConcurrentHashMap<>();

      private static gtn a(List<guc.a<gtn>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Model must have at least one selector");
         } else {
            return $$0.getFirst().b();
         }
      }

      public b(List<guc.a<gtn>> $$0) {
         this.a = $$0;
         gtn $$1 = a($$0);
         this.b = $$1.a();
      }

      public List<gtn> a(ebe $$0) {
         BitSet $$1 = new BitSet();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.set($$2);
            }
         }

         return this.c.computeIfAbsent($$1, $$0x -> {
            Builder<gtn> $$1x = ImmutableList.builder();

            for (int $$2x = 0; $$2x < this.a.size(); $$2x++) {
               if ($$0x.get($$2x)) {
                  $$1x.add(this.a.get($$2x).b);
               }
            }

            return $$1x.build();
         });
      }
   }

   public static class c implements gtn.c {
      final List<guc.a<gtn.b>> a;
      private final hnj.a<guc.b> b = new hnj.a<guc.b>() {
         public guc.b a(hnj $$0) {
            Builder<guc.a<gtn>> $$1 = ImmutableList.builderWithExpectedSize(c.this.a.size());

            for (guc.a<gtn.b> $$2 : c.this.a) {
               $$1.add($$2.a($$2.b.a($$0)));
            }

            return new guc.b($$1.build());
         }
      };

      public c(List<guc.a<gtn.b>> $$0) {
         this.a = $$0;
      }

      @Override
      public Object a(ebe $$0) {
         IntList $$1 = new IntArrayList();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.add($$2);
            }
         }

         record a(guc.c a, IntList b) {
         }

         return new a(this, $$1);
      }

      @Override
      public void a(hnr.a $$0) {
         this.a.forEach($$1 -> $$1.b.a($$0));
      }

      @Override
      public gtn a(ebe $$0, hnj $$1) {
         guc.b $$2 = $$1.a(this.b);
         return new guc($$2, $$0);
      }
   }
}
