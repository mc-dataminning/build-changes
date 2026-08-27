import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ggp {
   public static final ggp a = new ggp();
   public final ggo b;
   public final ggo c;
   public final ggo d;
   public final ggo e;
   public final ggo f;
   public final ggo g;
   public final ggo h;
   public final ggo i;

   private ggp() {
      this(ggo.a, ggo.a, ggo.a, ggo.a, ggo.a, ggo.a, ggo.a, ggo.a);
   }

   public ggp(ggp $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public ggp(ggo $$0, ggo $$1, ggo $$2, ggo $$3, ggo $$4, ggo $$5, ggo $$6, ggo $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ggo a(cue $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> ggo.a;
      };
   }

   public boolean b(cue $$0) {
      return this.a($$0) != ggo.a;
   }

   protected static class a implements JsonDeserializer<ggp> {
      public ggp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ggo $$4 = this.a($$2, $$3, cue.c);
         ggo $$5 = this.a($$2, $$3, cue.b);
         if ($$5 == ggo.a) {
            $$5 = $$4;
         }

         ggo $$6 = this.a($$2, $$3, cue.e);
         ggo $$7 = this.a($$2, $$3, cue.d);
         if ($$7 == ggo.a) {
            $$7 = $$6;
         }

         ggo $$8 = this.a($$2, $$3, cue.f);
         ggo $$9 = this.a($$2, $$3, cue.g);
         ggo $$10 = this.a($$2, $$3, cue.h);
         ggo $$11 = this.a($$2, $$3, cue.i);
         return new ggp($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private ggo a(JsonDeserializationContext $$0, JsonObject $$1, cue $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (ggo)$$0.deserialize($$1.get($$3), ggo.class) : ggo.a;
      }
   }
}
