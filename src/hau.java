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

public class hau implements JsonDeserializer<hat> {
   private static final bqs a = bqq.a(1.0F);

   public hat a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayt.m($$0, "entry");
      boolean $$4 = ayt.a($$3, "replace", false);
      String $$5 = ayt.a($$3, "subtitle", null);
      List<has> $$6 = this.a($$3);
      return new hat($$6, $$4, $$5);
   }

   private List<has> a(JsonObject $$0) {
      List<has> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayt.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayt.a($$4)) {
               alc $$5 = alc.a(ayt.a($$4, "sound"));
               $$1.add(new has($$5, a, a, 1, has.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayt.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private has b(JsonObject $$0) {
      alc $$1 = alc.a(ayt.i($$0, "name"));
      has.a $$2 = this.a($$0, has.a.a);
      float $$3 = ayt.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayt.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayt.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayt.a($$0, "preload", false);
      boolean $$7 = ayt.a($$0, "stream", false);
      int $$8 = ayt.a($$0, "attenuation_distance", 16);
      return new has($$1, bqq.a($$3), bqq.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private has.a a(JsonObject $$0, has.a $$1) {
      has.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = has.a.a(ayt.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
