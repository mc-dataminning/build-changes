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

public record hlw(Map<hlw.d, List<hlw.c>> b) {
   private static final Codec<List<hlw.c>> c = ayu.b(hlw.c.a.listOf());
   public static final Codec<hlw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.d(Codec.unboundedMap(hlw.d.o, c)).fieldOf("layers").forGetter(hlw::b)).apply($$0, hlw::new)
   );

   public static hlw.a a() {
      return new hlw.a();
   }

   public List<hlw.c> a(hlw.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hlw.d, List<hlw.c>> a = new EnumMap<>(hlw.d.class);

      a() {
      }

      public hlw.a a(alg $$0) {
         return this.a($$0, false);
      }

      public hlw.a a(alg $$0, boolean $$1) {
         this.a(hlw.d.b, hlw.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hlw.a b(alg $$0, boolean $$1) {
         return this.a(hlw.d.a, hlw.c.a($$0, $$1));
      }

      public hlw.a a(hlw.d $$0, hlw.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hlw a() {
         return new hlw(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hlw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.i.optionalFieldOf("color_when_undyed").forGetter(hlw.b::a)).apply($$0, hlw.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alg b, Optional<hlw.b> c, boolean d) {
      public static final Codec<hlw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hlw.c::a),
                  hlw.b.a.optionalFieldOf("dyeable").forGetter(hlw.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hlw.c::c)
               )
               .apply($$0, hlw.c::new)
      );

      public c(alg $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hlw.c a(alg $$0, boolean $$1) {
         return new hlw.c($$0, $$1 ? Optional.of(new hlw.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hlw.c b(alg $$0, boolean $$1) {
         return new hlw.c($$0, $$1 ? Optional.of(new hlw.b(Optional.empty())) : Optional.empty(), false);
      }

      public alg a(hlw.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alg a() {
         return this.b;
      }

      public Optional<hlw.b> b() {
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

      public static final Codec<hlw.d> o = bak.a(hlw.d::values);
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
