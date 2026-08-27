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

public class geo implements JsonDeserializer<gen> {
   private static final bht a = bhr.a(1.0F);

   public gen a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = asy.m($$0, "entry");
      boolean $$4 = asy.a($$3, "replace", false);
      String $$5 = asy.a($$3, "subtitle", null);
      List<gem> $$6 = this.a($$3);
      return new gen($$6, $$4, $$5);
   }

   private List<gem> a(JsonObject $$0) {
      List<gem> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = asy.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (asy.a($$4)) {
               String $$5 = asy.a($$4, "sound");
               $$1.add(new gem($$5, a, a, 1, gem.a.a, false, false, 16));
            } else {
               $$1.add(this.b(asy.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gem b(JsonObject $$0) {
      String $$1 = asy.i($$0, "name");
      gem.a $$2 = this.a($$0, gem.a.a);
      float $$3 = asy.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = asy.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = asy.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = asy.a($$0, "preload", false);
      boolean $$7 = asy.a($$0, "stream", false);
      int $$8 = asy.a($$0, "attenuation_distance", 16);
      return new gem($$1, bhr.a($$3), bhr.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gem.a a(JsonObject $$0, gem.a $$1) {
      gem.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gem.a.a(asy.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
