import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mw implements mg {
   private final mi d;
   private static final mw.b e = new mw.b(true, false, true);
   private static final mw.b f = new mw.b(true, true, true);
   private static final mw.b g = new mw.b(true, true, false);
   private static final mw.b h = new mw.b(false, true, true);
   private static final Map<ali<? extends kd<?>>, mw.b> i = Map.of(ma.bh, e, ma.bg, e, ma.bd, f, ma.be, f, ma.bf, f);
   private static final Map<String, mw.a> j = Map.of(
      "structure", new mw.a(mw.c.a, new mw.b(true, false, true)), "function", new mw.a(mw.c.b, new mw.b(true, true, true))
   );
   static final Codec<ali<? extends kd<?>>> k = alj.a.xmap(ali::a, ali::a);

   public mw(mi $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(me $$0) {
      mw.d $$1 = new mw.d(this.b(), j);
      Path $$2 = this.d.a(mi.b.c).resolve("datapack.json");
      return mg.a($$0, (JsonElement)mw.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<ali<? extends kd<?>>, mw.b> $$0, ali<? extends kd<?>> $$1, mw.b $$2) {
      mw.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<ali<? extends kd<?>>, mw.b> b() {
      Map<ali<? extends kd<?>>, mw.b> $$0 = new HashMap<>();
      lz.az.forEach($$1 -> this.a($$0, $$1.g(), h));
      ale.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      ale.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (ali<? extends kd<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mw.c b, mw.b c) {
      public static final Codec<mw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mw.c.c.fieldOf("format").forGetter(mw.a::a), mw.b.a.forGetter(mw.a::b)).apply($$0, mw.a::new)
      );

      public mw.c a() {
         return this.b;
      }

      public mw.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mw.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mw.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mw.b::c)
               )
               .apply($$0, mw.b::new)
      );
      public static final Codec<mw.b> b = a.codec();

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

   static enum c implements bai {
      a("structure"),
      b("mcfunction");

      public static final Codec<mw.c> c = bai.a(mw.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<ali<? extends kd<?>>, mw.b> b, Map<String, mw.a> c) {
      public static final Codec<mw.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mw.k, mw.b.b).fieldOf("registries").forGetter(mw.d::a),
                  Codec.unboundedMap(Codec.STRING, mw.a.a).fieldOf("others").forGetter(mw.d::b)
               )
               .apply($$0, mw.d::new)
      );

      public Map<ali<? extends kd<?>>, mw.b> a() {
         return this.b;
      }

      public Map<String, mw.a> b() {
         return this.c;
      }
   }
}
