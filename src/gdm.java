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

public class gdm implements gqh {
   private static final Logger g = LogUtils.getLogger();
   private static final gdo h = new gdo();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gdm.class, new gdm.a())
      .registerTypeAdapter(gdi.class, new gdi.a())
      .registerTypeAdapter(gdj.class, new gdj.a())
      .registerTypeAdapter(gdl.class, new gdl.a())
      .registerTypeAdapter(gds.class, new gds.a())
      .registerTypeAdapter(gdt.class, new gdt.a())
      .registerTypeAdapter(gdq.class, new gdq.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gdi> k;
   @Nullable
   private final gdm.b l;
   @Nullable
   private final Boolean m;
   private final gdt n;
   private final List<gdq> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gpz, String>> d;
   @Nullable
   protected gdm e;
   @Nullable
   protected akn f;

   public static gdm a(Reader $$0) {
      return axv.a(a, $$0, gdm.class);
   }

   public static gdm a(String $$0) {
      return a(new StringReader($$0));
   }

   public gdm(@Nullable akn $$0, List<gdi> $$1, Map<String, Either<gpz, String>> $$2, @Nullable Boolean $$3, @Nullable gdm.b $$4, gdt $$5, List<gdq> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gdi> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gdm.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gdm.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gdq> e() {
      return this.o;
   }

   private gdr a(gqa $$0, gdm $$1) {
      return this.o.isEmpty() ? gdr.a : new gdr($$0, $$1, this.o);
   }

   @Override
   public Collection<akn> f() {
      Set<akn> $$0 = Sets.newHashSet();

      for (gdq $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akn, gqh> $$0) {
      Set<gqh> $$1 = Sets.newLinkedHashSet();

      for (gdm $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gqh $$3 = $$0.apply($$2.f);
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
            $$2.f = gqb.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gdm)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gdm)$$3;
      }

      this.o.forEach($$1x -> {
         gqh $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gpw a(gqa $$0, Function<gpz, gnv> $$1, gqe $$2, akn $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gpw a(gqa $$0, gdm $$1, Function<gpz, gnv> $$2, gqe $$3, akn $$4, boolean $$5) {
      gnv $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gqb.s) {
         return new gpy(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gqg.a $$7 = new gqg.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gdi $$8 : this.a()) {
            for (it $$9 : $$8.c.keySet()) {
               gdj $$10 = $$8.c.get($$9);
               gnv $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(it.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gdh a(gdi $$0, gdj $$1, gnv $$2, it $$3, gqe $$4, akn $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gnl.b().equals(this.c($$0).b());
   }

   public gpz c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gpz, String> $$2 = this.d($$0);
         Optional<gpz> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gpz(gnu.e, gnl.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gpz, String> d(String $$0) {
      for (gdm $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gpz, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gpz(gnu.e, gnl.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gdm g() {
      return this.e == null ? this : this.e.g();
   }

   public gdt h() {
      gds $$0 = this.a(ctn.b);
      gds $$1 = this.a(ctn.c);
      gds $$2 = this.a(ctn.d);
      gds $$3 = this.a(ctn.e);
      gds $$4 = this.a(ctn.f);
      gds $$5 = this.a(ctn.g);
      gds $$6 = this.a(ctn.h);
      gds $$7 = this.a(ctn.i);
      return new gdt($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gds a(ctn $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gdm> {
      public gdm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gdi> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gpz, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gdt $$8 = gdt.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axv.u($$3, "display");
            $$8 = (gdt)$$2.deserialize($$9, gdt.class);
         }

         List<gdq> $$10 = this.a($$2, $$3);
         gdm.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gdm.b.a(axv.i($$3, "gui_light"));
         }

         akn $$12 = $$5.isEmpty() ? null : new akn($$5);
         return new gdm($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gdq> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gdq> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axv.v($$1, "overrides")) {
               $$2.add((gdq)$$0.deserialize($$4, gdq.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gpz, String>> b(JsonObject $$0) {
         akn $$1 = gnu.e;
         Map<String, Either<gpz, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axv.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gpz, String> a(akn $$0, String $$1) {
         if (gdm.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akn $$2 = akn.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gpz($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axv.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axv.k($$0, "ambientocclusion") : null;
      }

      protected List<gdi> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gdi> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axv.v($$1, "elements")) {
               $$2.add((gdi)$$0.deserialize($$3, gdi.class));
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

      public static gdm.b a(String $$0) {
         for (gdm.b $$1 : values()) {
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
