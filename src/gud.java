import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.slf4j.Logger;

public record gud(Map<String, gud.b> c) implements guc {
   static final Logger d = LogUtils.getLogger();
   public static final Codec<gud> b = ayy.d(Codec.unboundedMap(Codec.STRING, gud.b.a)).xmap(gud::new, gud::a);

   @Override
   public <O, S extends ebi<O, S>> Predicate<S> instantiate(ebh<O, S> $$0) {
      List<Predicate<S>> $$1 = new ArrayList<>(this.c.size());
      this.c.forEach(($$2, $$3) -> $$1.add(a($$0, $$2, $$3)));
      return ag.a($$1);
   }

   private static <O, S extends ebi<O, S>> Predicate<S> a(ebh<O, S> $$0, String $$1, gud.b $$2) {
      ecj<?> $$3 = $$0.a($$1);
      if ($$3 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", $$1, $$0.c()));
      } else {
         return $$2.a($$0.c(), $$3);
      }
   }

   public Map<String, gud.b> a() {
      return this.c;
   }

   public static record a(String a, boolean b) {
      private static final String c = "!";

      public a(String a, boolean b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Empty term");
         } else {
            this.a = a;
            this.b = b;
         }
      }

      public static gud.a a(String $$0) {
         return $$0.startsWith("!") ? new gud.a($$0.substring(1), true) : new gud.a($$0, false);
      }

      @Override
      public String toString() {
         return this.b ? "!" + this.a : this.a;
      }
   }

   public static record b(List<gud.a> b) {
      private static final char c = '|';
      private static final Joiner d = Joiner.on('|');
      private static final Splitter e = Splitter.on('|');
      private static final Codec<String> f = Codec.either(Codec.INT, Codec.BOOL)
         .flatComapMap($$0 -> (String)$$0.map(String::valueOf, String::valueOf), $$0 -> DataResult.error(() -> "This codec can't be used for encoding"));
      public static final Codec<gud.b> a = Codec.withAlternative(Codec.STRING, f).comapFlatMap(gud.b::a, gud.b::toString);

      public b(List<gud.a> b) {
         if (b.isEmpty()) {
            throw new IllegalArgumentException("Empty value for property");
         } else {
            this.b = b;
         }
      }

      public static DataResult<gud.b> a(String $$0) {
         List<gud.a> $$1 = e.splitToStream($$0).map(gud.a::a).toList();
         if ($$1.isEmpty()) {
            return DataResult.error(() -> "Empty value for property");
         } else {
            for (gud.a $$2 : $$1) {
               if ($$2.a.isEmpty()) {
                  return DataResult.error(() -> "Empty term in value '" + $$0 + "'");
               }
            }

            return DataResult.success(new gud.b($$1));
         }
      }

      @Override
      public String toString() {
         return d.join(this.b);
      }

      public <O, S extends ebi<O, S>, T extends Comparable<T>> Predicate<S> a(O $$0, ecj<T> $$1) {
         Predicate<T> $$2 = ag.b(Lists.transform(this.b, $$2x -> this.a($$0, $$1, $$2x)));
         List<T> $$3 = new ArrayList<>($$1.a());
         int $$4 = $$3.size();
         $$3.removeIf($$2.negate());
         int $$5 = $$3.size();
         if ($$5 == 0) {
            gud.d.warn("Condition {} for property {} on {} is always false", new Object[]{this, $$1.f(), $$0});
            return $$0x -> false;
         } else {
            int $$6 = $$4 - $$5;
            if ($$6 == 0) {
               gud.d.warn("Condition {} for property {} on {} is always true", new Object[]{this, $$1.f(), $$0});
               return $$0x -> true;
            } else {
               boolean $$7;
               List<T> $$8;
               if ($$5 <= $$6) {
                  $$7 = false;
                  $$8 = $$3;
               } else {
                  $$7 = true;
                  List<T> $$10 = new ArrayList<>($$1.a());
                  $$10.removeIf($$2);
                  $$8 = $$10;
               }

               if ($$8.size() == 1) {
                  T $$12 = (T)$$8.getFirst();
                  return $$3x -> {
                     T $$4x = $$3x.c($$1);
                     return $$12.equals($$4x) ^ $$7;
                  };
               } else {
                  return $$3x -> {
                     T $$4x = $$3x.c($$1);
                     return $$8.contains($$4x) ^ $$7;
                  };
               }
            }
         }
      }

      private <T extends Comparable<T>> T a(Object $$0, ecj<T> $$1, String $$2) {
         Optional<T> $$3 = $$1.b($$2);
         if ($$3.isEmpty()) {
            throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", $$2, $$1, $$0, this));
         } else {
            return $$3.get();
         }
      }

      private <T extends Comparable<T>> Predicate<T> a(Object $$0, ecj<T> $$1, gud.a $$2) {
         T $$3 = this.a($$0, $$1, $$2.a);
         return $$2.b ? $$1x -> !$$1x.equals($$3) : $$1x -> $$1x.equals($$3);
      }

      public List<gud.a> a() {
         return this.b;
      }
   }
}
