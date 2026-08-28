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

public record hgr(Map<hgr.d, List<hgr.c>> b) {
   private static final Codec<List<hgr.c>> c = ayh.b(hgr.c.a.listOf());
   public static final Codec<hgr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.d(Codec.unboundedMap(hgr.d.g, c)).fieldOf("layers").forGetter(hgr::b)).apply($$0, hgr::new)
   );

   public static hgr.a a() {
      return new hgr.a();
   }

   public List<hgr.c> a(hgr.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hgr.d, List<hgr.c>> a = new EnumMap<>(hgr.d.class);

      a() {
      }

      public hgr.a a(aku $$0) {
         return this.a($$0, false);
      }

      public hgr.a a(aku $$0, boolean $$1) {
         this.a(hgr.d.b, hgr.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hgr.a b(aku $$0, boolean $$1) {
         return this.a(hgr.d.a, hgr.c.a($$0, $$1));
      }

      public hgr.a a(hgr.d $$0, hgr.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hgr a() {
         return new hgr(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hgr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayh.i.optionalFieldOf("color_when_undyed").forGetter(hgr.b::a)).apply($$0, hgr.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(aku b, Optional<hgr.b> c, boolean d) {
      public static final Codec<hgr.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(hgr.c::a),
                  hgr.b.a.optionalFieldOf("dyeable").forGetter(hgr.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hgr.c::c)
               )
               .apply($$0, hgr.c::new)
      );

      public c(aku $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hgr.c a(aku $$0, boolean $$1) {
         return new hgr.c($$0, $$1 ? Optional.of(new hgr.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hgr.c b(aku $$0, boolean $$1) {
         return new hgr.c($$0, $$1 ? Optional.of(new hgr.b(Optional.empty())) : Optional.empty(), false);
      }

      public aku a(hgr.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public aku a() {
         return this.b;
      }

      public Optional<hgr.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements azu {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<hgr.d> g = azu.a(hgr.d::values);
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
