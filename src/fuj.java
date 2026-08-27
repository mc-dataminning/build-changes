import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuj implements ggy {
   private static final Logger g = LogUtils.getLogger();
   private static final ful h = new ful();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fuj.class, new fuj.a())
      .registerTypeAdapter(fuf.class, new fuf.a())
      .registerTypeAdapter(fug.class, new fug.a())
      .registerTypeAdapter(fui.class, new fui.a())
      .registerTypeAdapter(fup.class, new fup.a())
      .registerTypeAdapter(fuq.class, new fuq.a())
      .registerTypeAdapter(fun.class, new fun.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fuf> k;
   @Nullable
   private final fuj.b l;
   @Nullable
   private final Boolean m;
   private final fuq n;
   private final List<fun> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ggq, String>> d;
   @Nullable
   protected fuj e;
   @Nullable
   protected ahg f;

   public static fuj a(Reader $$0) {
      return aue.a(a, $$0, fuj.class);
   }

   public static fuj a(String $$0) {
      return a(new StringReader($$0));
   }

   public fuj(@Nullable ahg $$0, List<fuf> $$1, Map<String, Either<ggq, String>> $$2, @Nullable Boolean $$3, @Nullable fuj.b $$4, fuq $$5, List<fun> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fuf> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fuj.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fuj.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fun> e() {
      return this.o;
   }

   private fuo a(ggr $$0, fuj $$1) {
      return this.o.isEmpty() ? fuo.a : new fuo($$0, $$1, this.o);
   }

   @Override
   public Collection<ahg> f() {
      Set<ahg> $$0 = Sets.newHashSet();

      for (fun $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ahg, ggy> $$0) {
      Set<ggy> $$1 = Sets.newLinkedHashSet();

      for (fuj $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         ggy $$3 = $$0.apply($$2.f);
         if ($$3 == null) {
            g.warn("No parent '{}' while loading model '{}'", this.f, $$2);
         }

         if ($$1.contains($$3)) {
            g.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               new Object[]{$$2, $$1.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.f}
            );
            $$3 = null;
         }

         if ($$3 == null) {
            $$2.f = ggs.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fuj)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fuj)$$3;
      }

      this.o.forEach($$1x -> {
         ggy $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public ggn a(ggr $$0, Function<ggq, gen> $$1, ggv $$2, ahg $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public ggn a(ggr $$0, fuj $$1, Function<ggq, gen> $$2, ggv $$3, ahg $$4, boolean $$5) {
      gen $$6 = $$2.apply(this.c("particle"));
      if (this.g() == ggs.s) {
         return new ggp(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         ggx.a $$7 = new ggx.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fuf $$8 : this.a()) {
            for (ic $$9 : $$8.c.keySet()) {
               fug $$10 = $$8.c.get($$9);
               gen $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ic.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fue a(fuf $$0, fug $$1, gen $$2, ic $$3, ggv $$4, ahg $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ged.b().equals(this.c($$0).b());
   }

   public ggq c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ggq, String> $$2 = this.d($$0);
         Optional<ggq> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ggq(gem.e, ged.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ggq, String> d(String $$0) {
      for (fuj $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ggq, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ggq(gem.e, ged.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fuj g() {
      return this.e == null ? this : this.e.g();
   }

   public fuq h() {
      fup $$0 = this.a(cmv.b);
      fup $$1 = this.a(cmv.c);
      fup $$2 = this.a(cmv.d);
      fup $$3 = this.a(cmv.e);
      fup $$4 = this.a(cmv.f);
      fup $$5 = this.a(cmv.g);
      fup $$6 = this.a(cmv.h);
      fup $$7 = this.a(cmv.i);
      return new fuq($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fup a(cmv $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fuj> {
      public fuj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fuf> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ggq, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fuq $$8 = fuq.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aue.u($$3, "display");
            $$8 = (fuq)$$2.deserialize($$9, fuq.class);
         }

         List<fun> $$10 = this.a($$2, $$3);
         fuj.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fuj.b.a(aue.i($$3, "gui_light"));
         }

         ahg $$12 = $$5.isEmpty() ? null : new ahg($$5);
         return new fuj($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fun> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fun> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aue.v($$1, "overrides")) {
               $$2.add((fun)$$0.deserialize($$4, fun.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ggq, String>> b(JsonObject $$0) {
         ahg $$1 = gem.e;
         Map<String, Either<ggq, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aue.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ggq, String> a(ahg $$0, String $$1) {
         if (fuj.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ahg $$2 = ahg.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ggq($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aue.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aue.k($$0, "ambientocclusion") : null;
      }

      protected List<fuf> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fuf> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aue.v($$1, "elements")) {
               $$2.add((fuf)$$0.deserialize($$3, fuf.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public static fuj.b a(String $$0) {
         for (fuj.b $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }

   public static class c extends RuntimeException {
      public c(String $$0) {
         super($$0);
      }
   }
}
