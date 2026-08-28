import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class mz implements mh {
   private final mj d;
   private static final mz.b e = new mz.b(true, false, true);
   private static final mz.b f = new mz.b(true, true, true);
   private static final mz.b g = new mz.b(true, true, false);
   private static final mz.b h = new mz.b(false, true, true);
   private static final Map<aly<? extends kd<?>>, mz.b> i = Map.of(mb.bj, e, mb.bi, e, mb.bf, f, mb.bg, f, mb.bh, f);
   private static final Map<String, mz.a> j = Map.of(
      "structure", new mz.a(mz.c.a, new mz.b(true, false, true)), "function", new mz.a(mz.c.b, new mz.b(true, true, true))
   );
   static final Codec<aly<? extends kd<?>>> k = alz.a.xmap(aly::a, aly::a);

   public mz(mj $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      mz.d $$1 = new mz.d(this.b(), j);
      Path $$2 = this.d.a(mj.b.c).resolve("datapack.json");
      return mh.a($$0, (JsonElement)mz.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<aly<? extends kd<?>>, mz.b> $$0, aly<? extends kd<?>> $$1, mz.b $$2) {
      mz.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<aly<? extends kd<?>>, mz.b> b() {
      Map<aly<? extends kd<?>>, mz.b> $$0 = new HashMap<>();
      ma.aB.forEach($$1 -> this.a($$0, $$1.g(), h));
      alu.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alu.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (aly<? extends kd<?>>)$$1, $$2));
      return $$0;
   }

   static record a(mz.c b, mz.b c) {
      public static final Codec<mz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(mz.c.c.fieldOf("format").forGetter(mz.a::a), mz.b.a.forGetter(mz.a::b)).apply($$0, mz.a::new)
      );

      public mz.c a() {
         return this.b;
      }

      public mz.b b() {
         return this.c;
      }
   }

   static record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<mz.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("elements").forGetter(mz.b::a),
                  Codec.BOOL.fieldOf("tags").forGetter(mz.b::b),
                  Codec.BOOL.fieldOf("stable").forGetter(mz.b::c)
               )
               .apply($$0, mz.b::new)
      );
      public static final Codec<mz.b> b = a.codec();

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

   static enum c implements bba {
      a("structure"),
      b("mcfunction");

      public static final Codec<mz.c> c = bba.a(mz.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   static record d(Map<aly<? extends kd<?>>, mz.b> b, Map<String, mz.a> c) {
      public static final Codec<mz.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.unboundedMap(mz.k, mz.b.b).fieldOf("registries").forGetter(mz.d::a),
                  Codec.unboundedMap(Codec.STRING, mz.a.a).fieldOf("others").forGetter(mz.d::b)
               )
               .apply($$0, mz.d::new)
      );

      public Map<aly<? extends kd<?>>, mz.b> a() {
         return this.b;
      }

      public Map<String, mz.a> b() {
         return this.c;
      }
   }
}
