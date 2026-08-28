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

public class how implements JsonDeserializer<hov> {
   private static final btu a = bts.a(1.0F);

   public hov a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aze.m($$0, "entry");
      boolean $$4 = aze.a($$3, "replace", false);
      String $$5 = aze.a($$3, "subtitle", null);
      List<hou> $$6 = this.a($$3);
      return new hov($$6, $$4, $$5);
   }

   private List<hou> a(JsonObject $$0) {
      List<hou> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aze.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aze.a($$4)) {
               ali $$5 = ali.a(aze.a($$4, "sound"));
               $$1.add(new hou($$5, a, a, 1, hou.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aze.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hou b(JsonObject $$0) {
      ali $$1 = ali.a(aze.i($$0, "name"));
      hou.a $$2 = this.a($$0, hou.a.a);
      float $$3 = aze.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aze.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aze.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aze.a($$0, "preload", false);
      boolean $$7 = aze.a($$0, "stream", false);
      int $$8 = aze.a($$0, "attenuation_distance", 16);
      return new hou($$1, bts.a($$3), bts.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hou.a a(JsonObject $$0, hou.a $$1) {
      hou.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hou.a.a(aze.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
