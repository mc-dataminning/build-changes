import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public record gqi(Map<String, String> c, Set<String> d) {
   public static final gqi a = new gqi(Map.of(), Set.of());
   public static final Codec<gqi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(Codec.STRING, Codec.STRING).optionalFieldOf("values", Map.of()).forGetter(gqi::d),
               Codec.STRING.listOf().xmap(Set::copyOf, List::copyOf).optionalFieldOf("flags", Set.of()).forGetter(gqi::e)
            )
            .apply($$0, gqi::new)
   );

   public static gqi.a a() {
      return new gqi.a();
   }

   public gqi a(gqi $$0) {
      if (this.c()) {
         return $$0;
      } else if ($$0.c()) {
         return this;
      } else {
         Builder<String, String> $$1 = ImmutableMap.builderWithExpectedSize(this.c.size() + $$0.c.size());
         $$1.putAll(this.c);
         $$1.putAll($$0.c);
         com.google.common.collect.ImmutableSet.Builder<String> $$2 = ImmutableSet.builderWithExpectedSize(this.d.size() + $$0.d.size());
         $$2.addAll(this.d);
         $$2.addAll($$0.d);
         return new gqi($$1.buildKeepingLast(), $$2.build());
      }
   }

   public String b() {
      StringBuilder $$0 = new StringBuilder();

      for (Entry<String, String> $$1 : this.c.entrySet()) {
         String $$2 = $$1.getKey();
         String $$3 = $$1.getValue();
         $$0.append("#define ").append($$2).append(" ").append($$3).append('\n');
      }

      for (String $$4 : this.d) {
         $$0.append("#define ").append($$4).append('\n');
      }

      return $$0.toString();
   }

   public boolean c() {
      return this.c.isEmpty() && this.d.isEmpty();
   }

   public Map<String, String> d() {
      return this.c;
   }

   public Set<String> e() {
      return this.d;
   }

   public static class a {
      private final Builder<String, String> a = ImmutableMap.builder();
      private final com.google.common.collect.ImmutableSet.Builder<String> b = ImmutableSet.builder();

      a() {
      }

      public gqi.a a(String $$0, String $$1) {
         if ($$1.isBlank()) {
            throw new IllegalArgumentException("Cannot define empty string");
         } else {
            this.a.put($$0, b($$1));
            return this;
         }
      }

      private static String b(String $$0) {
         return $$0.replaceAll("\n", "\\\\\n");
      }

      public gqi.a a(String $$0, float $$1) {
         this.a.put($$0, String.valueOf($$1));
         return this;
      }

      public gqi.a a(String $$0) {
         this.b.add($$0);
         return this;
      }

      public gqi a() {
         return new gqi(this.a.build(), this.b.build());
      }
   }
}
