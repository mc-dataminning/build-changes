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

public class hcp implements JsonDeserializer<hco> {
   private static final brk a = bri.a(1.0F);

   public hco a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azd.m($$0, "entry");
      boolean $$4 = azd.a($$3, "replace", false);
      String $$5 = azd.a($$3, "subtitle", null);
      List<hcn> $$6 = this.a($$3);
      return new hco($$6, $$4, $$5);
   }

   private List<hcn> a(JsonObject $$0) {
      List<hcn> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azd.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azd.a($$4)) {
               all $$5 = all.a(azd.a($$4, "sound"));
               $$1.add(new hcn($$5, a, a, 1, hcn.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azd.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hcn b(JsonObject $$0) {
      all $$1 = all.a(azd.i($$0, "name"));
      hcn.a $$2 = this.a($$0, hcn.a.a);
      float $$3 = azd.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azd.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azd.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azd.a($$0, "preload", false);
      boolean $$7 = azd.a($$0, "stream", false);
      int $$8 = azd.a($$0, "attenuation_distance", 16);
      return new hcn($$1, bri.a($$3), bri.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hcn.a a(JsonObject $$0, hcn.a $$1) {
      hcn.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hcn.a.a(azd.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
