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

public record hkf(Map<hkf.d, List<hkf.c>> b) {
   private static final Codec<List<hkf.c>> c = ays.b(hkf.c.a.listOf());
   public static final Codec<hkf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.d(Codec.unboundedMap(hkf.d.o, c)).fieldOf("layers").forGetter(hkf::b)).apply($$0, hkf::new)
   );

   public static hkf.a a() {
      return new hkf.a();
   }

   public List<hkf.c> a(hkf.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hkf.d, List<hkf.c>> a = new EnumMap<>(hkf.d.class);

      a() {
      }

      public hkf.a a(ale $$0) {
         return this.a($$0, false);
      }

      public hkf.a a(ale $$0, boolean $$1) {
         this.a(hkf.d.b, hkf.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hkf.a b(ale $$0, boolean $$1) {
         return this.a(hkf.d.a, hkf.c.a($$0, $$1));
      }

      public hkf.a a(hkf.d $$0, hkf.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hkf a() {
         return new hkf(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hkf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.i.optionalFieldOf("color_when_undyed").forGetter(hkf.b::a)).apply($$0, hkf.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(ale b, Optional<hkf.b> c, boolean d) {
      public static final Codec<hkf.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("texture").forGetter(hkf.c::a),
                  hkf.b.a.optionalFieldOf("dyeable").forGetter(hkf.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hkf.c::c)
               )
               .apply($$0, hkf.c::new)
      );

      public c(ale $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hkf.c a(ale $$0, boolean $$1) {
         return new hkf.c($$0, $$1 ? Optional.of(new hkf.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hkf.c b(ale $$0, boolean $$1) {
         return new hkf.c($$0, $$1 ? Optional.of(new hkf.b(Optional.empty())) : Optional.empty(), false);
      }

      public ale a(hkf.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public ale a() {
         return this.b;
      }

      public Optional<hkf.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bai {
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

      public static final Codec<hkf.d> o = bai.a(hkf.d::values);
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
