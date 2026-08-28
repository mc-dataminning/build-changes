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

public record hlp(Map<hlp.d, List<hlp.c>> b) {
   private static final Codec<List<hlp.c>> c = ayu.b(hlp.c.a.listOf());
   public static final Codec<hlp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.d(Codec.unboundedMap(hlp.d.o, c)).fieldOf("layers").forGetter(hlp::b)).apply($$0, hlp::new)
   );

   public static hlp.a a() {
      return new hlp.a();
   }

   public List<hlp.c> a(hlp.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hlp.d, List<hlp.c>> a = new EnumMap<>(hlp.d.class);

      a() {
      }

      public hlp.a a(alg $$0) {
         return this.a($$0, false);
      }

      public hlp.a a(alg $$0, boolean $$1) {
         this.a(hlp.d.b, hlp.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hlp.a b(alg $$0, boolean $$1) {
         return this.a(hlp.d.a, hlp.c.a($$0, $$1));
      }

      public hlp.a a(hlp.d $$0, hlp.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hlp a() {
         return new hlp(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hlp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.i.optionalFieldOf("color_when_undyed").forGetter(hlp.b::a)).apply($$0, hlp.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alg b, Optional<hlp.b> c, boolean d) {
      public static final Codec<hlp.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hlp.c::a),
                  hlp.b.a.optionalFieldOf("dyeable").forGetter(hlp.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hlp.c::c)
               )
               .apply($$0, hlp.c::new)
      );

      public c(alg $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hlp.c a(alg $$0, boolean $$1) {
         return new hlp.c($$0, $$1 ? Optional.of(new hlp.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hlp.c b(alg $$0, boolean $$1) {
         return new hlp.c($$0, $$1 ? Optional.of(new hlp.b(Optional.empty())) : Optional.empty(), false);
      }

      public alg a(hlp.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alg a() {
         return this.b;
      }

      public Optional<hlp.b> b() {
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

      public static final Codec<hlp.d> o = bak.a(hlp.d::values);
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
