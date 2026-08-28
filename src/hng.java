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

public record hng(Map<hng.d, List<hng.c>> b) {
   private static final Codec<List<hng.c>> c = ayw.b(hng.c.a.listOf());
   public static final Codec<hng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.d(Codec.unboundedMap(hng.d.o, c)).fieldOf("layers").forGetter(hng::b)).apply($$0, hng::new)
   );

   public static hng.a a() {
      return new hng.a();
   }

   public List<hng.c> a(hng.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hng.d, List<hng.c>> a = new EnumMap<>(hng.d.class);

      a() {
      }

      public hng.a a(ali $$0) {
         return this.a($$0, false);
      }

      public hng.a a(ali $$0, boolean $$1) {
         this.a(hng.d.b, hng.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hng.a b(ali $$0, boolean $$1) {
         return this.a(hng.d.a, hng.c.a($$0, $$1));
      }

      public hng.a a(hng.d $$0, hng.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hng a() {
         return new hng(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hng.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayw.i.optionalFieldOf("color_when_undyed").forGetter(hng.b::a)).apply($$0, hng.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(ali b, Optional<hng.b> c, boolean d) {
      public static final Codec<hng.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("texture").forGetter(hng.c::a),
                  hng.b.a.optionalFieldOf("dyeable").forGetter(hng.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hng.c::c)
               )
               .apply($$0, hng.c::new)
      );

      public c(ali $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hng.c a(ali $$0, boolean $$1) {
         return new hng.c($$0, $$1 ? Optional.of(new hng.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hng.c b(ali $$0, boolean $$1) {
         return new hng.c($$0, $$1 ? Optional.of(new hng.b(Optional.empty())) : Optional.empty(), false);
      }

      public ali a(hng.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public ali a() {
         return this.b;
      }

      public Optional<hng.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bam {
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

      public static final Codec<hng.d> o = bam.a(hng.d::values);
      private final String p;

      private d(final String $$0) {
         this.p = $$0;
      }

      @Override
      public String c() {
         return this.p;
      }

      public String a() {
         return "trims/entity/" + this.p;
      }
   }
}
