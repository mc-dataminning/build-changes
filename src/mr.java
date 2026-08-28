import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mr implements mb {
   private final md d;
   private static final mr.b e = new mr.b(true, false, true);
   private static final mr.b f = new mr.b(true, true, true);
   private static final mr.b g = new mr.b(true, true, false);
   private static final mr.b h = new mr.b(false, true, true);
   private static final Map<ala<? extends ka<?>>, mr.b> i = Map.of(lv.bg, e, lv.bf, e, lv.bc, f, lv.bd, f, lv.be, f);
   private static final Map<String, mr.a> j = Map.of(
      "structure", new mr.a(mr.c.a, new mr.b(true, false, true)), "function", new mr.a(mr.c.b, new mr.b(true, true, true))
   );
   static final Codec<ala<? extends ka<?>>> k = alb.a.xmap(ala::a, ala::a);

   public mr(md $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      mr.d $$1 = new mr.d(this.b(), j);
      Path $$2 = this.d.a(md.b.c).resolve("datapack.json");
      return mb.a($$0, (JsonElement)mr.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<ala<? extends ka<?>>, mr.b> $$0, ala<? extends ka<?>> $$1, mr.b $$2) {
      mr.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<ala<? extends ka<?>>, mr.b> b() {
      Map<ala<? extends ka<?>>, mr.b> $$0 = new HashMap<>();
      lu.az.forEach($$1 -> this.a($$0, $$1.d(), h));
      akw.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      akw.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (ala<? extends ka<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mr.c b, mr.b c) {
      public static final Codec<mr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mr.c.c.fieldOf("format").forGetter(mr.a::a), mr.b.a.forGetter(mr.a::b)).apply($$0, mr.a::new)
      );

      public mr.c a() {
         return this.b;
      }

      public mr.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mr.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mr.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mr.b::c)
               )
               .apply($$0, mr.b::new)
      );
      public static final Codec<mr.b> b = a.codec();

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

   static enum c implements azy {
      a("structure"),
      b("mcfunction");

      public static final Codec<mr.c> c = azy.a(mr.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<ala<? extends ka<?>>, mr.b> b, Map<String, mr.a> c) {
      public static final Codec<mr.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mr.k, mr.b.b).fieldOf("registries").forGetter(mr.d::a),
                  Codec.unboundedMap(Codec.STRING, mr.a.a).fieldOf("others").forGetter(mr.d::b)
               )
               .apply($$0, mr.d::new)
      );

      public Map<ala<? extends ka<?>>, mr.b> a() {
         return this.b;
      }

      public Map<String, mr.a> b() {
         return this.c;
      }
   }
}
