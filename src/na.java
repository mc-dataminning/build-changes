import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class na implements mk {
   private final mm d;
   private static final na.b e = new na.b(true, false, true);
   private static final na.b f = new na.b(true, true, true);
   private static final na.b g = new na.b(true, true, false);
   private static final na.b h = new na.b(false, true, true);
   private static final Map<alc<? extends kf<?>>, na.b> i = Map.of(me.br, e, me.bq, e, me.bn, f, me.bo, f, me.bp, f);
   private static final Map<String, na.a> j = Map.of(
      "structure", new na.a(na.c.a, new na.b(true, false, true)), "function", new na.a(na.c.b, new na.b(true, true, true))
   );
   static final Codec<alc<? extends kf<?>>> k = ald.a.xmap(alc::a, alc::a);

   public na(mm $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      na.d $$1 = new na.d(this.b(), j);
      Path $$2 = this.d.a(mm.b.c).resolve("datapack.json");
      return mk.a($$0, (JsonElement)na.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alc<? extends kf<?>>, na.b> $$0, alc<? extends kf<?>> $$1, na.b $$2) {
      na.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alc<? extends kf<?>>, na.b> b() {
      Map<alc<? extends kf<?>>, na.b> $$0 = new HashMap<>();
      md.aG.forEach($$1 -> this.a($$0, $$1.g(), h));
      aky.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      aky.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alc<? extends kf<?>>)$$1, $$2));
      return $$0;
   }

   static record a(na.c b, na.b c) {
      public static final Codec<na.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(na.c.c.fieldOf("format").forGetter(na.a::a), na.b.a.forGetter(na.a::b)).apply($$0, na.a::new)
      );

      public na.c a() {
         return this.b;
      }

      public na.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<na.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(na.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(na.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(na.b::c)
               )
               .apply($$0, na.b::new)
      );
      public static final Codec<na.b> b = a.codec();

      public boolean a() {
         return this.c;
      }

      public boolean b() {
         return this.d;
      }

      public boolean c() {
         return this.e;
      }
   }

   static enum c implements bag {
      a("structure"),
      b("mcfunction");

      public static final Codec<na.c> c = bag.a(na.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alc<? extends kf<?>>, na.b> b, Map<String, na.a> c) {
      public static final Codec<na.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(na.k, na.b.b).fieldOf("registries").forGetter(na.d::a),
                  Codec.unboundedMap(Codec.STRING, na.a.a).fieldOf("others").forGetter(na.d::b)
               )
               .apply($$0, na.d::new)
      );

      public Map<alc<? extends kf<?>>, na.b> a() {
         return this.b;
      }

      public Map<String, na.a> b() {
         return this.c;
      }
   }
}
