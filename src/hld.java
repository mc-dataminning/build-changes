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

public record hld(Map<hld.d, List<hld.c>> b) {
   private static final Codec<List<hld.c>> c = ayu.b(hld.c.a.listOf());
   public static final Codec<hld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.d(Codec.unboundedMap(hld.d.o, c)).fieldOf("layers").forGetter(hld::b)).apply($$0, hld::new)
   );

   public static hld.a a() {
      return new hld.a();
   }

   public List<hld.c> a(hld.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hld.d, List<hld.c>> a = new EnumMap<>(hld.d.class);

      a() {
      }

      public hld.a a(alg $$0) {
         return this.a($$0, false);
      }

      public hld.a a(alg $$0, boolean $$1) {
         this.a(hld.d.b, hld.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hld.a b(alg $$0, boolean $$1) {
         return this.a(hld.d.a, hld.c.a($$0, $$1));
      }

      public hld.a a(hld.d $$0, hld.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hld a() {
         return new hld(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hld.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.i.optionalFieldOf("color_when_undyed").forGetter(hld.b::a)).apply($$0, hld.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alg b, Optional<hld.b> c, boolean d) {
      public static final Codec<hld.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hld.c::a),
                  hld.b.a.optionalFieldOf("dyeable").forGetter(hld.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hld.c::c)
               )
               .apply($$0, hld.c::new)
      );

      public c(alg $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hld.c a(alg $$0, boolean $$1) {
         return new hld.c($$0, $$1 ? Optional.of(new hld.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hld.c b(alg $$0, boolean $$1) {
         return new hld.c($$0, $$1 ? Optional.of(new hld.b(Optional.empty())) : Optional.empty(), false);
      }

      public alg a(hld.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alg a() {
         return this.b;
      }

      public Optional<hld.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bak {
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

      public static final Codec<hld.d> o = bak.a(hld.d::values);
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
