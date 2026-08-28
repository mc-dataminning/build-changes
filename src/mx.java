import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mx implements mh {
   private final mj d;
   private static final mx.b e = new mx.b(true, false, true);
   private static final mx.b f = new mx.b(true, true, true);
   private static final mx.b g = new mx.b(true, true, false);
   private static final mx.b h = new mx.b(false, true, true);
   private static final Map<alo<? extends kd<?>>, mx.b> i = Map.of(mb.bk, e, mb.bj, e, mb.bg, f, mb.bh, f, mb.bi, f);
   private static final Map<String, mx.a> j = Map.of(
      "structure", new mx.a(mx.c.a, new mx.b(true, false, true)), "function", new mx.a(mx.c.b, new mx.b(true, true, true))
   );
   static final Codec<alo<? extends kd<?>>> k = alp.a.xmap(alo::a, alo::a);

   public mx(mj $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      mx.d $$1 = new mx.d(this.b(), j);
      Path $$2 = this.d.a(mj.b.c).resolve("datapack.json");
      return mh.a($$0, (JsonElement)mx.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alo<? extends kd<?>>, mx.b> $$0, alo<? extends kd<?>> $$1, mx.b $$2) {
      mx.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alo<? extends kd<?>>, mx.b> b() {
      Map<alo<? extends kd<?>>, mx.b> $$0 = new HashMap<>();
      ma.aC.forEach($$1 -> this.a($$0, $$1.g(), h));
      alk.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alk.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alo<? extends kd<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mx.c b, mx.b c) {
      public static final Codec<mx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mx.c.c.fieldOf("format").forGetter(mx.a::a), mx.b.a.forGetter(mx.a::b)).apply($$0, mx.a::new)
      );

      public mx.c a() {
         return this.b;
      }

      public mx.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mx.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mx.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mx.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mx.b::c)
               )
               .apply($$0, mx.b::new)
      );
      public static final Codec<mx.b> b = a.codec();

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

   static enum c implements baq {
      a("structure"),
      b("mcfunction");

      public static final Codec<mx.c> c = baq.a(mx.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alo<? extends kd<?>>, mx.b> b, Map<String, mx.a> c) {
      public static final Codec<mx.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mx.k, mx.b.b).fieldOf("registries").forGetter(mx.d::a),
                  Codec.unboundedMap(Codec.STRING, mx.a.a).fieldOf("others").forGetter(mx.d::b)
               )
               .apply($$0, mx.d::new)
      );

      public Map<alo<? extends kd<?>>, mx.b> a() {
         return this.b;
      }

      public Map<String, mx.a> b() {
         return this.c;
      }
   }
}
