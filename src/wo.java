import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.JsonOps;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface wo extends Message, wt {
   xl a();

   wp b();

   @Override
   default String getString() {
      return wt.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wt.a)($$2 -> {
         int $$3 = $$0 - $$1.length();
         if ($$3 <= 0) {
            return a;
         } else {
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
         }
      }));
      return $$1.toString();
   }

   List<wo> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xv $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xc e() {
      return xc.a(this.b());
   }

   default xc f() {
      return new xc(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayk g();

   @Override
   default <T> Optional<T> a(wt.b<T> $$0, xl $$1) {
      xl $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wo $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wt.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wo $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wo> h() {
      return this.a(xl.a);
   }

   default List<wo> a(xl $$0) {
      List<wo> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wo $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wo> $$1 = this.h();
         List<wo> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wo a(@Nullable String $$0) {
      return (wo)($$0 != null ? b($$0) : wn.a);
   }

   static xc b(String $$0) {
      return xc.a(xv.a($$0));
   }

   static xc c(String $$0) {
      return xc.a(new xz($$0, null, xz.a));
   }

   static xc a(String $$0, Object... $$1) {
      return xc.a(new xz($$0, null, $$1));
   }

   static xc b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!xz.a($$3) && !($$3 instanceof wo)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xc a(String $$0, @Nullable String $$1) {
      return xc.a(new xz($$0, $$1, xz.a));
   }

   static xc a(String $$0, @Nullable String $$1, Object... $$2) {
      return xc.a(new xz($$0, $$1, $$2));
   }

   static xc i() {
      return xc.a(xv.c);
   }

   static xc d(String $$0) {
      return xc.a(new xs($$0));
   }

   static xc a(String $$0, boolean $$1, Optional<wo> $$2, xq $$3) {
      return xc.a(new xu($$0, $$1, $$2, $$3));
   }

   static xc a(ho $$0, String $$1) {
      return xc.a(new xw(Either.left($$0), $$1));
   }

   static xc b(String $$0, String $$1) {
      return xc.a(new xw(Either.right($$0), $$1));
   }

   static xc a(ho $$0, Optional<wo> $$1) {
      return xc.a(new xx($$0, $$1));
   }

   static wo a(Date $$0) {
      return b($$0.toString());
   }

   static wo a(Message $$0) {
      return (wo)($$0 instanceof wo $$1 ? $$1 : b($$0.getString()));
   }

   static wo a(UUID $$0) {
      return b($$0.toString());
   }

   static wo a(aku $$0) {
      return b($$0.toString());
   }

   static wo a(dfm $$0) {
      return b($$0.toString());
   }

   static wo a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xc b(JsonElement $$0, jt.a $$1) {
         return (xc)wq.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wo $$0, jt.a $$1) {
         return (JsonElement)wq.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wo $$0, jt.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xc a(String $$0, jt.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xc a(@Nullable JsonElement $$0, jt.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xc b(String $$0, jt.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xc>, JsonSerializer<wo> {
      private final jt.a a;

      public b(jt.a $$0) {
         this.a = $$0;
      }

      public xc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wo.a.b($$0, this.a);
      }

      public JsonElement a(wo $$0, Type $$1, JsonSerializationContext $$2) {
         return wo.a.b($$0, this.a);
      }
   }
}
