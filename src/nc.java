import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nc implements mm {
   private final mo d;
   private static final nc.b e = new nc.b(true, false, true);
   private static final nc.b f = new nc.b(true, true, true);
   private static final nc.b g = new nc.b(true, true, false);
   private static final nc.b h = new nc.b(false, true, true);
   private static final Map<alf<? extends jr<?>>, nc.b> i = Map.of(mg.bt, e, mg.bs, e, mg.bp, f, mg.bq, f, mg.br, f);
   private static final Map<String, nc.a> j = Map.of(
      "structure", new nc.a(nc.c.a, new nc.b(true, false, true)), "function", new nc.a(nc.c.b, new nc.b(true, true, true))
   );
   static final Codec<alf<? extends jr<?>>> k = alg.a.xmap(alf::a, alf::a);

   public nc(mo $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      nc.d $$1 = new nc.d(this.b(), j);
      Path $$2 = this.d.a(mo.b.c).resolve("datapack.json");
      return mm.a($$0, (JsonElement)nc.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alf<? extends jr<?>>, nc.b> $$0, alf<? extends jr<?>> $$1, nc.b $$2) {
      nc.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alf<? extends jr<?>>, nc.b> b() {
      Map<alf<? extends jr<?>>, nc.b> $$0 = new HashMap<>();
      mf.aF.forEach($$1 -> this.a($$0, $$1.g(), h));
      alb.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alb.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alf<? extends jr<?>>)$$1, $$2));
      return $$0;
   }

   static record a(nc.c b, nc.b c) {
      public static final Codec<nc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(nc.c.c.fieldOf("format").forGetter(nc.a::a), nc.b.a.forGetter(nc.a::b)).apply($$0, nc.a::new)
      );

      public nc.c a() {
         return this.b;
      }

      public nc.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<nc.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(nc.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(nc.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(nc.b::c)
               )
               .apply($$0, nc.b::new)
      );
      public static final Codec<nc.b> b = a.codec();

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

      public static final Codec<nc.c> c = bak.a(nc.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alf<? extends jr<?>>, nc.b> b, Map<String, nc.a> c) {
      public static final Codec<nc.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(nc.k, nc.b.b).fieldOf("registries").forGetter(nc.d::a),
                  Codec.unboundedMap(Codec.STRING, nc.a.a).fieldOf("others").forGetter(nc.d::b)
               )
               .apply($$0, nc.d::new)
      );

      public Map<alf<? extends jr<?>>, nc.b> a() {
         return this.b;
      }

      public Map<String, nc.a> b() {
         return this.c;
      }
   }
}
