import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ne implements mo {
   private final mq d;
   private static final ne.b e = new ne.b(true, false, true);
   private static final ne.b f = new ne.b(true, true, true);
   private static final ne.b g = new ne.b(true, true, false);
   private static final ne.b h = new ne.b(false, true, true);
   private static final Map<alj<? extends jt<?>>, ne.b> i = Map.of(mi.bv, e, mi.bu, e, mi.br, f, mi.bs, f, mi.bt, f);
   private static final Map<String, ne.a> j = Map.of(
      "structure", new ne.a(ne.c.a, new ne.b(true, false, true)), "function", new ne.a(ne.c.b, new ne.b(true, true, true))
   );
   static final Codec<alj<? extends jt<?>>> k = alk.a.xmap(alj::a, alj::a);

   public ne(mq $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      ne.d $$1 = new ne.d(this.b(), j);
      Path $$2 = this.d.a(mq.b.c).resolve("datapack.json");
      return mo.a($$0, (JsonElement)ne.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alj<? extends jt<?>>, ne.b> $$0, alj<? extends jt<?>> $$1, ne.b $$2) {
      ne.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alj<? extends jt<?>>, ne.b> b() {
      Map<alj<? extends jt<?>>, ne.b> $$0 = new HashMap<>();
      mh.aF.forEach($$1 -> this.a($$0, $$1.g(), h));
      alf.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alf.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alj<? extends jt<?>>)$$1, $$2));
      return $$0;
   }

   static record a(ne.c b, ne.b c) {
      public static final Codec<ne.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ne.c.c.fieldOf("format").forGetter(ne.a::a), ne.b.a.forGetter(ne.a::b)).apply($$0, ne.a::new)
      );

      public ne.c a() {
         return this.b;
      }

      public ne.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<ne.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(ne.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(ne.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(ne.b::c)
               )
               .apply($$0, ne.b::new)
      );
      public static final Codec<ne.b> b = a.codec();

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

   static enum c implements bao {
      a("structure"),
      b("mcfunction");

      public static final Codec<ne.c> c = bao.a(ne.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alj<? extends jt<?>>, ne.b> b, Map<String, ne.a> c) {
      public static final Codec<ne.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(ne.k, ne.b.b).fieldOf("registries").forGetter(ne.d::a),
                  Codec.unboundedMap(Codec.STRING, ne.a.a).fieldOf("others").forGetter(ne.d::b)
               )
               .apply($$0, ne.d::new)
      );

      public Map<alj<? extends jt<?>>, ne.b> a() {
         return this.b;
      }

      public Map<String, ne.a> b() {
         return this.c;
      }
   }
}
