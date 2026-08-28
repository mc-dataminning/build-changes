import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class my implements mi {
   private final mk d;
   private static final my.b e = new my.b(true, false, true);
   private static final my.b f = new my.b(true, true, true);
   private static final my.b g = new my.b(true, true, false);
   private static final my.b h = new my.b(false, true, true);
   private static final Map<akt<? extends ke<?>>, my.b> i = Map.of(mc.bk, e, mc.bj, e, mc.bg, f, mc.bh, f, mc.bi, f);
   private static final Map<String, my.a> j = Map.of(
      "structure", new my.a(my.c.a, new my.b(true, false, true)), "function", new my.a(my.c.b, new my.b(true, true, true))
   );
   static final Codec<akt<? extends ke<?>>> k = aku.a.xmap(akt::a, akt::a);

   public my(mk $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      my.d $$1 = new my.d(this.b(), j);
      Path $$2 = this.d.a(mk.b.c).resolve("datapack.json");
      return mi.a($$0, (JsonElement)my.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<akt<? extends ke<?>>, my.b> $$0, akt<? extends ke<?>> $$1, my.b $$2) {
      my.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<akt<? extends ke<?>>, my.b> b() {
      Map<akt<? extends ke<?>>, my.b> $$0 = new HashMap<>();
      mb.aC.forEach($$1 -> this.a($$0, $$1.g(), h));
      akp.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      akp.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (akt<? extends ke<?>>)$$1, $$2));
      return $$0;
   }

   static record a(my.c b, my.b c) {
      public static final Codec<my.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(my.c.c.fieldOf("format").forGetter(my.a::a), my.b.a.forGetter(my.a::b)).apply($$0, my.a::new)
      );

      public my.c a() {
         return this.b;
      }

      public my.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<my.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(my.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(my.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(my.b::c)
               )
               .apply($$0, my.b::new)
      );
      public static final Codec<my.b> b = a.codec();

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

   static enum c implements azu {
      a("structure"),
      b("mcfunction");

      public static final Codec<my.c> c = azu.a(my.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<akt<? extends ke<?>>, my.b> b, Map<String, my.a> c) {
      public static final Codec<my.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(my.k, my.b.b).fieldOf("registries").forGetter(my.d::a),
                  Codec.unboundedMap(Codec.STRING, my.a.a).fieldOf("others").forGetter(my.d::b)
               )
               .apply($$0, my.d::new)
      );

      public Map<akt<? extends ke<?>>, my.b> a() {
         return this.b;
      }

      public Map<String, my.a> b() {
         return this.c;
      }
   }
}
