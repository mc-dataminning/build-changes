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

public class fwn implements gje {
   private static final Logger g = LogUtils.getLogger();
   private static final fwp h = new fwp();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fwn.class, new fwn.a())
      .registerTypeAdapter(fwj.class, new fwj.a())
      .registerTypeAdapter(fwk.class, new fwk.a())
      .registerTypeAdapter(fwm.class, new fwm.a())
      .registerTypeAdapter(fwt.class, new fwt.a())
      .registerTypeAdapter(fwu.class, new fwu.a())
      .registerTypeAdapter(fwr.class, new fwr.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fwj> k;
   @Nullable
   private final fwn.b l;
   @Nullable
   private final Boolean m;
   private final fwu n;
   private final List<fwr> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<giw, String>> d;
   @Nullable
   protected fwn e;
   @Nullable
   protected aiy f;

   public static fwn a(Reader $$0) {
      return avx.a(a, $$0, fwn.class);
   }

   public static fwn a(String $$0) {
      return a(new StringReader($$0));
   }

   public fwn(@Nullable aiy $$0, List<fwj> $$1, Map<String, Either<giw, String>> $$2, @Nullable Boolean $$3, @Nullable fwn.b $$4, fwu $$5, List<fwr> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fwj> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fwn.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fwn.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fwr> e() {
      return this.o;
   }

   private fws a(gix $$0, fwn $$1) {
      return this.o.isEmpty() ? fws.a : new fws($$0, $$1, this.o);
   }

   @Override
   public Collection<aiy> f() {
      Set<aiy> $$0 = Sets.newHashSet();

      for (fwr $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aiy, gje> $$0) {
      Set<gje> $$1 = Sets.newLinkedHashSet();

      for (fwn $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gje $$3 = $$0.apply($$2.f);
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
            $$2.f = giy.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fwn)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fwn)$$3;
      }

      this.o.forEach($$1x -> {
         gje $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public git a(gix $$0, Function<giw, ggt> $$1, gjb $$2, aiy $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public git a(gix $$0, fwn $$1, Function<giw, ggt> $$2, gjb $$3, aiy $$4, boolean $$5) {
      ggt $$6 = $$2.apply(this.c("particle"));
      if (this.g() == giy.s) {
         return new giv(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gjd.a $$7 = new gjd.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fwj $$8 : this.a()) {
            for (ie $$9 : $$8.c.keySet()) {
               fwk $$10 = $$8.c.get($$9);
               ggt $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ie.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fwi a(fwj $$0, fwk $$1, ggt $$2, ie $$3, gjb $$4, aiy $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ggj.b().equals(this.c($$0).b());
   }

   public giw c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<giw, String> $$2 = this.d($$0);
         Optional<giw> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new giw(ggs.e, ggj.b());
         }

         $$1.add($$0);
      }
   }

   private Either<giw, String> d(String $$0) {
      for (fwn $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<giw, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new giw(ggs.e, ggj.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fwn g() {
      return this.e == null ? this : this.e.g();
   }

   public fwu h() {
      fwt $$0 = this.a(cow.b);
      fwt $$1 = this.a(cow.c);
      fwt $$2 = this.a(cow.d);
      fwt $$3 = this.a(cow.e);
      fwt $$4 = this.a(cow.f);
      fwt $$5 = this.a(cow.g);
      fwt $$6 = this.a(cow.h);
      fwt $$7 = this.a(cow.i);
      return new fwu($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fwt a(cow $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fwn> {
      public fwn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fwj> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<giw, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fwu $$8 = fwu.a;
         if ($$3.has("display")) {
            JsonObject $$9 = avx.u($$3, "display");
            $$8 = (fwu)$$2.deserialize($$9, fwu.class);
         }

         List<fwr> $$10 = this.a($$2, $$3);
         fwn.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fwn.b.a(avx.i($$3, "gui_light"));
         }

         aiy $$12 = $$5.isEmpty() ? null : new aiy($$5);
         return new fwn($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fwr> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fwr> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : avx.v($$1, "overrides")) {
               $$2.add((fwr)$$0.deserialize($$4, fwr.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<giw, String>> b(JsonObject $$0) {
         aiy $$1 = ggs.e;
         Map<String, Either<giw, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = avx.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<giw, String> a(aiy $$0, String $$1) {
         if (fwn.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aiy $$2 = aiy.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new giw($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return avx.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? avx.k($$0, "ambientocclusion") : null;
      }

      protected List<fwj> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fwj> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : avx.v($$1, "elements")) {
               $$2.add((fwj)$$0.deserialize($$3, fwj.class));
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

      public static fwn.b a(String $$0) {
         for (fwn.b $$1 : values()) {
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
