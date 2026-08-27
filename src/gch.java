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

public class gch implements JsonDeserializer<gcg> {
   private static final bgh a = bgf.a(1.0F);

   public gcg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = arr.m($$0, "entry");
      boolean $$4 = arr.a($$3, "replace", false);
      String $$5 = arr.a($$3, "subtitle", null);
      List<gcf> $$6 = this.a($$3);
      return new gcg($$6, $$4, $$5);
   }

   private List<gcf> a(JsonObject $$0) {
      List<gcf> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = arr.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (arr.a($$4)) {
               String $$5 = arr.a($$4, "sound");
               $$1.add(new gcf($$5, a, a, 1, gcf.a.a, false, false, 16));
            } else {
               $$1.add(this.b(arr.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gcf b(JsonObject $$0) {
      String $$1 = arr.i($$0, "name");
      gcf.a $$2 = this.a($$0, gcf.a.a);
      float $$3 = arr.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = arr.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = arr.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = arr.a($$0, "preload", false);
      boolean $$7 = arr.a($$0, "stream", false);
      int $$8 = arr.a($$0, "attenuation_distance", 16);
      return new gcf($$1, bgf.a($$3), bgf.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gcf.a a(JsonObject $$0, gcf.a $$1) {
      gcf.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gcf.a.a(arr.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
