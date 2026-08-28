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

public record hmw(Map<hmw.d, List<hmw.c>> b) {
   private static final Codec<List<hmw.c>> c = azg.b(hmw.c.a.listOf());
   public static final Codec<hmw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azg.d(Codec.unboundedMap(hmw.d.o, c)).fieldOf("layers").forGetter(hmw::b)).apply($$0, hmw::new)
   );

   public static hmw.a a() {
      return new hmw.a();
   }

   public List<hmw.c> a(hmw.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<hmw.d, List<hmw.c>> a = new EnumMap<>(hmw.d.class);

      a() {
      }

      public hmw.a a(alr $$0) {
         return this.a($$0, false);
      }

      public hmw.a a(alr $$0, boolean $$1) {
         this.a(hmw.d.b, hmw.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public hmw.a b(alr $$0, boolean $$1) {
         return this.a(hmw.d.a, hmw.c.a($$0, $$1));
      }

      public hmw.a a(hmw.d $$0, hmw.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public hmw a() {
         return new hmw(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<hmw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azg.i.optionalFieldOf("color_when_undyed").forGetter(hmw.b::a)).apply($$0, hmw.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alr b, Optional<hmw.b> c, boolean d) {
      public static final Codec<hmw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alr.a.fieldOf("texture").forGetter(hmw.c::a),
                  hmw.b.a.optionalFieldOf("dyeable").forGetter(hmw.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(hmw.c::c)
               )
               .apply($$0, hmw.c::new)
      );

      public c(alr $$0) {
         this($$0, Optional.empty(), false);
      }

      public static hmw.c a(alr $$0, boolean $$1) {
         return new hmw.c($$0, $$1 ? Optional.of(new hmw.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static hmw.c b(alr $$0, boolean $$1) {
         return new hmw.c($$0, $$1 ? Optional.of(new hmw.b(Optional.empty())) : Optional.empty(), false);
      }

      public alr a(hmw.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alr a() {
         return this.b;
      }

      public Optional<hmw.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bax {
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

      public static final Codec<hmw.d> o = bax.a(hmw.d::values);
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
