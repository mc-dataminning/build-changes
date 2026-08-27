import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class gov implements JsonDeserializer<gou> {
   private static final bnd a = bnb.a(1.0F);

   public gou a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = axa.m($$0, "entry");
      boolean $$4 = axa.a($$3, "replace", false);
      String $$5 = axa.a($$3, "subtitle", null);
      List<got> $$6 = this.a($$3);
      return new gou($$6, $$4, $$5);
   }

   private List<got> a(JsonObject $$0) {
      List<got> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = axa.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (axa.a($$4)) {
               String $$5 = axa.a($$4, "sound");
               $$1.add(new got($$5, a, a, 1, got.a.a, false, false, 16));
            } else {
               $$1.add(this.b(axa.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private got b(JsonObject $$0) {
      String $$1 = axa.i($$0, "name");
      got.a $$2 = this.a($$0, got.a.a);
      float $$3 = axa.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = axa.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = axa.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = axa.a($$0, "preload", false);
      boolean $$7 = axa.a($$0, "stream", false);
      int $$8 = axa.a($$0, "attenuation_distance", 16);
      return new got($$1, bnb.a($$3), bnb.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private got.a a(JsonObject $$0, got.a $$1) {
      got.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = got.a.a(axa.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
