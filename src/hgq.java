import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record hgq(Map<hgq.d, List<hgq.c>> b) {
   private static final Codec<List<hgq.c>> c = ayi.b(hgq.c.a.listOf());
   public static final Codec<hgq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.d(Codec.unboundedMap(hgq.d.g, c)).fieldOf("layers").forGetter(hgq::b)).apply($$0, hgq::new)
   );

   public static hgq.a a() {
      return new hgq.a();
   }

   public List<hgq.c> a(hgq.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hgq.d, List<hgq.c>> a = new EnumMap<>(hgq.d.class);

      a() {
      }

      public hgq.a a(aku $$0) {
         return this.a($$0, false);
      }

      public hgq.a a(aku $$0, boolean $$1) {
         this.a(hgq.d.b, hgq.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hgq.a b(aku $$0, boolean $$1) {
         return this.a(hgq.d.a, hgq.c.a($$0, $$1));
      }

      public hgq.a a(hgq.d $$0, hgq.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hgq a() {
         return new hgq(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hgq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.i.optionalFieldOf("color_when_undyed").forGetter(hgq.b::a)).apply($$0, hgq.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(aku b, Optional<hgq.b> c, boolean d) {
      public static final Codec<hgq.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(hgq.c::a),
                  hgq.b.a.optionalFieldOf("dyeable").forGetter(hgq.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hgq.c::c)
               )
               .apply($$0, hgq.c::new)
      );

      public c(aku $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hgq.c a(aku $$0, boolean $$1) {
         return new hgq.c($$0, $$1 ? Optional.of(new hgq.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hgq.c b(aku $$0, boolean $$1) {
         return new hgq.c($$0, $$1 ? Optional.of(new hgq.b(Optional.empty())) : Optional.empty(), false);
      }

      public aku a(hgq.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public aku a() {
         return this.b;
      }

      public Optional<hgq.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements azv {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<hgq.d> g = azv.a(hgq.d::values);
      private final String h;

      private d(final String $$0) {
         this.h = $$0;
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
