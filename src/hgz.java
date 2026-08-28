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

public record hgz(Map<hgz.d, List<hgz.c>> b) {
   private static final Codec<List<hgz.c>> c = ayi.b(hgz.c.a.listOf());
   public static final Codec<hgz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.d(Codec.unboundedMap(hgz.d.g, c)).fieldOf("layers").forGetter(hgz::b)).apply($$0, hgz::new)
   );

   public static hgz.a a() {
      return new hgz.a();
   }

   public List<hgz.c> a(hgz.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hgz.d, List<hgz.c>> a = new EnumMap<>(hgz.d.class);

      a() {
      }

      public hgz.a a(akv $$0) {
         return this.a($$0, false);
      }

      public hgz.a a(akv $$0, boolean $$1) {
         this.a(hgz.d.b, hgz.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hgz.a b(akv $$0, boolean $$1) {
         return this.a(hgz.d.a, hgz.c.a($$0, $$1));
      }

      public hgz.a a(hgz.d $$0, hgz.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hgz a() {
         return new hgz(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hgz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.i.optionalFieldOf("color_when_undyed").forGetter(hgz.b::a)).apply($$0, hgz.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(akv b, Optional<hgz.b> c, boolean d) {
      public static final Codec<hgz.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("texture").forGetter(hgz.c::a),
                  hgz.b.a.optionalFieldOf("dyeable").forGetter(hgz.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hgz.c::c)
               )
               .apply($$0, hgz.c::new)
      );

      public c(akv $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hgz.c a(akv $$0, boolean $$1) {
         return new hgz.c($$0, $$1 ? Optional.of(new hgz.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hgz.c b(akv $$0, boolean $$1) {
         return new hgz.c($$0, $$1 ? Optional.of(new hgz.b(Optional.empty())) : Optional.empty(), false);
      }

      public akv a(hgz.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public akv a() {
         return this.b;
      }

      public Optional<hgz.b> b() {
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

      public static final Codec<hgz.d> g = azv.a(hgz.d::values);
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
