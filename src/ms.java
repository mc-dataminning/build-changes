import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ms implements mc {
   private final me d;
   private static final ms.b e = new ms.b(true, false, true);
   private static final ms.b f = new ms.b(true, true, true);
   private static final ms.b g = new ms.b(true, true, false);
   private static final ms.b h = new ms.b(false, true, true);
   private static final Map<ald<? extends kb<?>>, ms.b> i = Map.of(lw.bi, e, lw.bh, e, lw.be, f, lw.bf, f, lw.bg, f);
   private static final Map<String, ms.a> j = Map.of(
      "structure", new ms.a(ms.c.a, new ms.b(true, false, true)), "function", new ms.a(ms.c.b, new ms.b(true, true, true))
   );
   static final Codec<ald<? extends kb<?>>> k = ale.a.xmap(ald::a, ald::a);

   public ms(me $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      ms.d $$1 = new ms.d(this.b(), j);
      Path $$2 = this.d.a(me.b.c).resolve("datapack.json");
      return mc.a($$0, (JsonElement)ms.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<ald<? extends kb<?>>, ms.b> $$0, ald<? extends kb<?>> $$1, ms.b $$2) {
      ms.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<ald<? extends kb<?>>, ms.b> b() {
      Map<ald<? extends kb<?>>, ms.b> $$0 = new HashMap<>();
      lv.aA.forEach($$1 -> this.a($$0, $$1.g(), h));
      akz.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      akz.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (ald<? extends kb<?>>)$$1, $$2));
      return $$0;
   }

   static record a(ms.c b, ms.b c) {
      public static final Codec<ms.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ms.c.c.fieldOf("format").forGetter(ms.a::a), ms.b.a.forGetter(ms.a::b)).apply($$0, ms.a::new)
      );

      public ms.c a() {
         return this.b;
      }

      public ms.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<ms.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(ms.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(ms.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(ms.b::c)
               )
               .apply($$0, ms.b::new)
      );
      public static final Codec<ms.b> b = a.codec();

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

   static enum c implements bab {
      a("structure"),
      b("mcfunction");

      public static final Codec<ms.c> c = bab.a(ms.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<ald<? extends kb<?>>, ms.b> b, Map<String, ms.a> c) {
      public static final Codec<ms.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(ms.k, ms.b.b).fieldOf("registries").forGetter(ms.d::a),
                  Codec.unboundedMap(Codec.STRING, ms.a.a).fieldOf("others").forGetter(ms.d::b)
               )
               .apply($$0, ms.d::new)
      );

      public Map<ald<? extends kb<?>>, ms.b> a() {
         return this.b;
      }

      public Map<String, ms.a> b() {
         return this.c;
      }
   }
}
