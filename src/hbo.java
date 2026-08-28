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

public class hbo implements JsonDeserializer<hbn> {
   private static final brb a = bqz.a(1.0F);

   public hbn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayz.m($$0, "entry");
      boolean $$4 = ayz.a($$3, "replace", false);
      String $$5 = ayz.a($$3, "subtitle", null);
      List<hbm> $$6 = this.a($$3);
      return new hbn($$6, $$4, $$5);
   }

   private List<hbm> a(JsonObject $$0) {
      List<hbm> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayz.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayz.a($$4)) {
               alh $$5 = alh.a(ayz.a($$4, "sound"));
               $$1.add(new hbm($$5, a, a, 1, hbm.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayz.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hbm b(JsonObject $$0) {
      alh $$1 = alh.a(ayz.i($$0, "name"));
      hbm.a $$2 = this.a($$0, hbm.a.a);
      float $$3 = ayz.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayz.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayz.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayz.a($$0, "preload", false);
      boolean $$7 = ayz.a($$0, "stream", false);
      int $$8 = ayz.a($$0, "attenuation_distance", 16);
      return new hbm($$1, bqz.a($$3), bqz.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hbm.a a(JsonObject $$0, hbm.a $$1) {
      hbm.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hbm.a.a(ayz.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
