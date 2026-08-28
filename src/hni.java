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

public record hni(Map<hni.d, List<hni.c>> b) {
   private static final Codec<List<hni.c>> c = ayy.b(hni.c.a.listOf());
   public static final Codec<hni> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.d(Codec.unboundedMap(hni.d.o, c)).fieldOf("layers").forGetter(hni::b)).apply($$0, hni::new)
   );

   public static hni.a a() {
      return new hni.a();
   }

   public List<hni.c> a(hni.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hni.d, List<hni.c>> a = new EnumMap<>(hni.d.class);

      a() {
      }

      public hni.a a(alk $$0) {
         return this.a($$0, false);
      }

      public hni.a a(alk $$0, boolean $$1) {
         this.a(hni.d.b, hni.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hni.a b(alk $$0, boolean $$1) {
         return this.a(hni.d.a, hni.c.a($$0, $$1));
      }

      public hni.a a(hni.d $$0, hni.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hni a() {
         return new hni(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hni.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayy.i.optionalFieldOf("color_when_undyed").forGetter(hni.b::a)).apply($$0, hni.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alk b, Optional<hni.b> c, boolean d) {
      public static final Codec<hni.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a.fieldOf("texture").forGetter(hni.c::a),
                  hni.b.a.optionalFieldOf("dyeable").forGetter(hni.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hni.c::c)
               )
               .apply($$0, hni.c::new)
      );

      public c(alk $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hni.c a(alk $$0, boolean $$1) {
         return new hni.c($$0, $$1 ? Optional.of(new hni.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hni.c b(alk $$0, boolean $$1) {
         return new hni.c($$0, $$1 ? Optional.of(new hni.b(Optional.empty())) : Optional.empty(), false);
      }

      public alk a(hni.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alk a() {
         return this.b;
      }

      public Optional<hni.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bao {
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

      public static final Codec<hni.d> o = bao.a(hni.d::values);
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
