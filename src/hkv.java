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

public record hkv(Map<hkv.d, List<hkv.c>> b) {
   private static final Codec<List<hkv.c>> c = ayu.b(hkv.c.a.listOf());
   public static final Codec<hkv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.d(Codec.unboundedMap(hkv.d.o, c)).fieldOf("layers").forGetter(hkv::b)).apply($$0, hkv::new)
   );

   public static hkv.a a() {
      return new hkv.a();
   }

   public List<hkv.c> a(hkv.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hkv.d, List<hkv.c>> a = new EnumMap<>(hkv.d.class);

      a() {
      }

      public hkv.a a(alg $$0) {
         return this.a($$0, false);
      }

      public hkv.a a(alg $$0, boolean $$1) {
         this.a(hkv.d.b, hkv.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hkv.a b(alg $$0, boolean $$1) {
         return this.a(hkv.d.a, hkv.c.a($$0, $$1));
      }

      public hkv.a a(hkv.d $$0, hkv.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hkv a() {
         return new hkv(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hkv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.i.optionalFieldOf("color_when_undyed").forGetter(hkv.b::a)).apply($$0, hkv.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alg b, Optional<hkv.b> c, boolean d) {
      public static final Codec<hkv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hkv.c::a),
                  hkv.b.a.optionalFieldOf("dyeable").forGetter(hkv.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hkv.c::c)
               )
               .apply($$0, hkv.c::new)
      );

      public c(alg $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hkv.c a(alg $$0, boolean $$1) {
         return new hkv.c($$0, $$1 ? Optional.of(new hkv.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hkv.c b(alg $$0, boolean $$1) {
         return new hkv.c($$0, $$1 ? Optional.of(new hkv.b(Optional.empty())) : Optional.empty(), false);
      }

      public alg a(hkv.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alg a() {
         return this.b;
      }

      public Optional<hkv.b> b() {
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

      public static final Codec<hkv.d> o = bak.a(hkv.d::values);
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
