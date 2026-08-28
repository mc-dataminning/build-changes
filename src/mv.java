import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mv implements mf {
   private final mh d;
   private static final mv.b e = new mv.b(true, false, true);
   private static final mv.b f = new mv.b(true, true, true);
   private static final mv.b g = new mv.b(true, true, false);
   private static final mv.b h = new mv.b(false, true, true);
   private static final Map<alh<? extends kd<?>>, mv.b> i = Map.of(lz.bh, e, lz.bg, e, lz.bd, f, lz.be, f, lz.bf, f);
   private static final Map<String, mv.a> j = Map.of(
      "structure", new mv.a(mv.c.a, new mv.b(true, false, true)), "function", new mv.a(mv.c.b, new mv.b(true, true, true))
   );
   static final Codec<alh<? extends kd<?>>> k = ali.a.xmap(alh::a, alh::a);

   public mv(mh $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      mv.d $$1 = new mv.d(this.b(), j);
      Path $$2 = this.d.a(mh.b.c).resolve("datapack.json");
      return mf.a($$0, (JsonElement)mv.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<alh<? extends kd<?>>, mv.b> $$0, alh<? extends kd<?>> $$1, mv.b $$2) {
      mv.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<alh<? extends kd<?>>, mv.b> b() {
      Map<alh<? extends kd<?>>, mv.b> $$0 = new HashMap<>();
      ly.az.forEach($$1 -> this.a($$0, $$1.g(), h));
      ald.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      ald.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (alh<? extends kd<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mv.c b, mv.b c) {
      public static final Codec<mv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mv.c.c.fieldOf("format").forGetter(mv.a::a), mv.b.a.forGetter(mv.a::b)).apply($$0, mv.a::new)
      );

      public mv.c a() {
         return this.b;
      }

      public mv.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mv.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mv.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mv.b::c)
               )
               .apply($$0, mv.b::new)
      );
      public static final Codec<mv.b> b = a.codec();

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

      public static final Codec<mv.c> c = bag.a(mv.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<alh<? extends kd<?>>, mv.b> b, Map<String, mv.a> c) {
      public static final Codec<mv.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mv.k, mv.b.b).fieldOf("registries").forGetter(mv.d::a),
                  Codec.unboundedMap(Codec.STRING, mv.a.a).fieldOf("others").forGetter(mv.d::b)
               )
               .apply($$0, mv.d::new)
      );

      public Map<alh<? extends kd<?>>, mv.b> a() {
         return this.b;
      }

      public Map<String, mv.a> b() {
         return this.c;
      }
   }
}
