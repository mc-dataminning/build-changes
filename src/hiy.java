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

public record hiy(Map<hiy.d, List<hiy.c>> b) {
   private static final Codec<List<hiy.c>> c = ays.b(hiy.c.a.listOf());
   public static final Codec<hiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.d(Codec.unboundedMap(hiy.d.o, c)).fieldOf("layers").forGetter(hiy::b)).apply($$0, hiy::new)
   );

   public static hiy.a a() {
      return new hiy.a();
   }

   public List<hiy.c> a(hiy.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hiy.d, List<hiy.c>> a = new EnumMap<>(hiy.d.class);

      a() {
      }

      public hiy.a a(ald $$0) {
         return this.a($$0, false);
      }

      public hiy.a a(ald $$0, boolean $$1) {
         this.a(hiy.d.b, hiy.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hiy.a b(ald $$0, boolean $$1) {
         return this.a(hiy.d.a, hiy.c.a($$0, $$1));
      }

      public hiy.a a(hiy.d $$0, hiy.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hiy a() {
         return new hiy(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hiy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.i.optionalFieldOf("color_when_undyed").forGetter(hiy.b::a)).apply($$0, hiy.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(ald b, Optional<hiy.b> c, boolean d) {
      public static final Codec<hiy.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a.fieldOf("texture").forGetter(hiy.c::a),
                  hiy.b.a.optionalFieldOf("dyeable").forGetter(hiy.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hiy.c::c)
               )
               .apply($$0, hiy.c::new)
      );

      public c(ald $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hiy.c a(ald $$0, boolean $$1) {
         return new hiy.c($$0, $$1 ? Optional.of(new hiy.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hiy.c b(ald $$0, boolean $$1) {
         return new hiy.c($$0, $$1 ? Optional.of(new hiy.b(Optional.empty())) : Optional.empty(), false);
      }

      public ald a(hiy.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public ald a() {
         return this.b;
      }

      public Optional<hiy.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bag {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body"),
      g("pig_saddle"),
      h("strider_saddle"),
      i("camel_saddle"),
      j("horse_saddle"),
      k("donkey_saddle"),
      l("mule_saddle"),
      m("zombie_horse_saddle"),
      n("skeleton_horse_saddle");

      public static final Codec<hiy.d> o = bag.a(hiy.d::values);
      private final String p;

      private d(final String $$0) {
         this.p = $$0;
      }

      @Override
      public String c() {
         return this.p;
      }
   }
}
