import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nd implements mn {
   private final mp d;
   private static final nd.b e = new nd.b(true, false, true);
   private static final nd.b f = new nd.b(true, true, true);
   private static final nd.b g = new nd.b(true, true, false);
   private static final nd.b h = new nd.b(false, true, true);
   private static final Map<alf<? extends js<?>>, nd.b> i = Map.of(mh.bu, e, mh.bt, e, mh.bq, f, mh.br, f, mh.bs, f);
   private static final Map<String, nd.a> j = Map.of(
      "structure", new nd.a(nd.c.a, new nd.b(true, false, true)), "function", new nd.a(nd.c.b, new nd.b(true, true, true))
   );
   static final Codec<alf<? extends js<?>>> k = alg.a.xmap(alf::a, alf::a);

   public nd(mp $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      nd.d $$1 = new nd.d(this.b(), j);
      Path $$2 = this.d.a(mp.b.c).resolve("datapack.json");
      return mn.a($$0, (JsonElement)nd.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alf<? extends js<?>>, nd.b> $$0, alf<? extends js<?>> $$1, nd.b $$2) {
      nd.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alf<? extends js<?>>, nd.b> b() {
      Map<alf<? extends js<?>>, nd.b> $$0 = new HashMap<>();
      mg.aF.forEach($$1 -> this.a($$0, $$1.g(), h));
      alb.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alb.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alf<? extends js<?>>)$$1, $$2));
      return $$0;
   }

   static record a(nd.c b, nd.b c) {
      public static final Codec<nd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(nd.c.c.fieldOf("format").forGetter(nd.a::a), nd.b.a.forGetter(nd.a::b)).apply($$0, nd.a::new)
      );

      public nd.c a() {
         return this.b;
      }

      public nd.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<nd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(nd.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(nd.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(nd.b::c)
               )
               .apply($$0, nd.b::new)
      );
      public static final Codec<nd.b> b = a.codec();

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

   static enum c implements bak {
      a("structure"),
      b("mcfunction");

      public static final Codec<nd.c> c = bak.a(nd.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alf<? extends js<?>>, nd.b> b, Map<String, nd.a> c) {
      public static final Codec<nd.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(nd.k, nd.b.b).fieldOf("registries").forGetter(nd.d::a),
                  Codec.unboundedMap(Codec.STRING, nd.a.a).fieldOf("others").forGetter(nd.d::b)
               )
               .apply($$0, nd.d::new)
      );

      public Map<alf<? extends js<?>>, nd.b> a() {
         return this.b;
      }

      public Map<String, nd.a> b() {
         return this.c;
      }
   }
}
