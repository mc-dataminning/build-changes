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

public class gcl implements JsonDeserializer<gck> {
   private static final bgb a = bfz.a(1.0F);

   public gck a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aro.m($$0, "entry");
      boolean $$4 = aro.a($$3, "replace", false);
      String $$5 = aro.a($$3, "subtitle", null);
      List<gcj> $$6 = this.a($$3);
      return new gck($$6, $$4, $$5);
   }

   private List<gcj> a(JsonObject $$0) {
      List<gcj> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aro.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aro.a($$4)) {
               String $$5 = aro.a($$4, "sound");
               $$1.add(new gcj($$5, a, a, 1, gcj.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aro.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gcj b(JsonObject $$0) {
      String $$1 = aro.i($$0, "name");
      gcj.a $$2 = this.a($$0, gcj.a.a);
      float $$3 = aro.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aro.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aro.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aro.a($$0, "preload", false);
      boolean $$7 = aro.a($$0, "stream", false);
      int $$8 = aro.a($$0, "attenuation_distance", 16);
      return new gcj($$1, bfz.a($$3), bfz.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gcj.a a(JsonObject $$0, gcj.a $$1) {
      gcj.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gcj.a.a(aro.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
