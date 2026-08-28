import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mu implements me {
   private final mg d;
   private static final mu.b e = new mu.b(true, false, true);
   private static final mu.b f = new mu.b(true, true, true);
   private static final mu.b g = new mu.b(true, true, false);
   private static final mu.b h = new mu.b(false, true, true);
   private static final Map<alg<? extends kc<?>>, mu.b> i = Map.of(ly.bh, e, ly.bg, e, ly.bd, f, ly.be, f, ly.bf, f);
   private static final Map<String, mu.a> j = Map.of(
      "structure", new mu.a(mu.c.a, new mu.b(true, false, true)), "function", new mu.a(mu.c.b, new mu.b(true, true, true))
   );
   static final Codec<alg<? extends kc<?>>> k = alh.a.xmap(alg::a, alg::a);

   public mu(mg $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      mu.d $$1 = new mu.d(this.b(), j);
      Path $$2 = this.d.a(mg.b.c).resolve("datapack.json");
      return me.a($$0, (JsonElement)mu.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alg<? extends kc<?>>, mu.b> $$0, alg<? extends kc<?>> $$1, mu.b $$2) {
      mu.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alg<? extends kc<?>>, mu.b> b() {
      Map<alg<? extends kc<?>>, mu.b> $$0 = new HashMap<>();
      lx.az.forEach($$1 -> this.a($$0, $$1.g(), h));
      alc.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alc.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alg<? extends kc<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mu.c b, mu.b c) {
      public static final Codec<mu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mu.c.c.fieldOf("format").forGetter(mu.a::a), mu.b.a.forGetter(mu.a::b)).apply($$0, mu.a::new)
      );

      public mu.c a() {
         return this.b;
      }

      public mu.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mu.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mu.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mu.b::c)
               )
               .apply($$0, mu.b::new)
      );
      public static final Codec<mu.b> b = a.codec();

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

   static enum c implements baf {
      a("structure"),
      b("mcfunction");

      public static final Codec<mu.c> c = baf.a(mu.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alg<? extends kc<?>>, mu.b> b, Map<String, mu.a> c) {
      public static final Codec<mu.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mu.k, mu.b.b).fieldOf("registries").forGetter(mu.d::a),
                  Codec.unboundedMap(Codec.STRING, mu.a.a).fieldOf("others").forGetter(mu.d::b)
               )
               .apply($$0, mu.d::new)
      );

      public Map<alg<? extends kc<?>>, mu.b> a() {
         return this.b;
      }

      public Map<String, mu.a> b() {
         return this.c;
      }
   }
}
