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

public record hhx(Map<hhx.d, List<hhx.c>> b) {
   private static final Codec<List<hhx.c>> c = ayi.b(hhx.c.a.listOf());
   public static final Codec<hhx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.d(Codec.unboundedMap(hhx.d.g, c)).fieldOf("layers").forGetter(hhx::b)).apply($$0, hhx::new)
   );

   public static hhx.a a() {
      return new hhx.a();
   }

   public List<hhx.c> a(hhx.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hhx.d, List<hhx.c>> a = new EnumMap<>(hhx.d.class);

      a() {
      }

      public hhx.a a(aku $$0) {
         return this.a($$0, false);
      }

      public hhx.a a(aku $$0, boolean $$1) {
         this.a(hhx.d.b, hhx.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hhx.a b(aku $$0, boolean $$1) {
         return this.a(hhx.d.a, hhx.c.a($$0, $$1));
      }

      public hhx.a a(hhx.d $$0, hhx.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hhx a() {
         return new hhx(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hhx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.i.optionalFieldOf("color_when_undyed").forGetter(hhx.b::a)).apply($$0, hhx.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(aku b, Optional<hhx.b> c, boolean d) {
      public static final Codec<hhx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(hhx.c::a),
                  hhx.b.a.optionalFieldOf("dyeable").forGetter(hhx.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hhx.c::c)
               )
               .apply($$0, hhx.c::new)
      );

      public c(aku $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hhx.c a(aku $$0, boolean $$1) {
         return new hhx.c($$0, $$1 ? Optional.of(new hhx.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hhx.c b(aku $$0, boolean $$1) {
         return new hhx.c($$0, $$1 ? Optional.of(new hhx.b(Optional.empty())) : Optional.empty(), false);
      }

      public aku a(hhx.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public aku a() {
         return this.b;
      }

      public Optional<hhx.b> b() {
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

      public static final Codec<hhx.d> g = azv.a(hhx.d::values);
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
