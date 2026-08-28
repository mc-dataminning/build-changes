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

public class had implements JsonDeserializer<hac> {
   private static final bqn a = bql.a(1.0F);

   public hac a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ays.m($$0, "entry");
      boolean $$4 = ays.a($$3, "replace", false);
      String $$5 = ays.a($$3, "subtitle", null);
      List<hab> $$6 = this.a($$3);
      return new hac($$6, $$4, $$5);
   }

   private List<hab> a(JsonObject $$0) {
      List<hab> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ays.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ays.a($$4)) {
               alb $$5 = alb.a(ays.a($$4, "sound"));
               $$1.add(new hab($$5, a, a, 1, hab.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ays.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hab b(JsonObject $$0) {
      alb $$1 = alb.a(ays.i($$0, "name"));
      hab.a $$2 = this.a($$0, hab.a.a);
      float $$3 = ays.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ays.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ays.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ays.a($$0, "preload", false);
      boolean $$7 = ays.a($$0, "stream", false);
      int $$8 = ays.a($$0, "attenuation_distance", 16);
      return new hab($$1, bql.a($$3), bql.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hab.a a(JsonObject $$0, hab.a $$1) {
      hab.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hab.a.a(ays.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
