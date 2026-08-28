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

public class hfc implements JsonDeserializer<hfb> {
   private static final bsd a = bsb.a(1.0F);

   public hfb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azk.m($$0, "entry");
      boolean $$4 = azk.a($$3, "replace", false);
      String $$5 = azk.a($$3, "subtitle", null);
      List<hfa> $$6 = this.a($$3);
      return new hfb($$6, $$4, $$5);
   }

   private List<hfa> a(JsonObject $$0) {
      List<hfa> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azk.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azk.a($$4)) {
               alp $$5 = alp.a(azk.a($$4, "sound"));
               $$1.add(new hfa($$5, a, a, 1, hfa.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azk.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hfa b(JsonObject $$0) {
      alp $$1 = alp.a(azk.i($$0, "name"));
      hfa.a $$2 = this.a($$0, hfa.a.a);
      float $$3 = azk.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azk.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azk.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azk.a($$0, "preload", false);
      boolean $$7 = azk.a($$0, "stream", false);
      int $$8 = azk.a($$0, "attenuation_distance", 16);
      return new hfa($$1, bsb.a($$3), bsb.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hfa.a a(JsonObject $$0, hfa.a $$1) {
      hfa.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hfa.a.a(azk.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
