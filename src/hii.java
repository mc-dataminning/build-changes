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

public class hii implements JsonDeserializer<hih> {
   private static final brl a = brj.a(1.0F);

   public hih a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayo.m($$0, "entry");
      boolean $$4 = ayo.a($$3, "replace", false);
      String $$5 = ayo.a($$3, "subtitle", null);
      List<hig> $$6 = this.a($$3);
      return new hih($$6, $$4, $$5);
   }

   private List<hig> a(JsonObject $$0) {
      List<hig> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayo.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayo.a($$4)) {
               aku $$5 = aku.a(ayo.a($$4, "sound"));
               $$1.add(new hig($$5, a, a, 1, hig.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayo.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hig b(JsonObject $$0) {
      aku $$1 = aku.a(ayo.i($$0, "name"));
      hig.a $$2 = this.a($$0, hig.a.a);
      float $$3 = ayo.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayo.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayo.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayo.a($$0, "preload", false);
      boolean $$7 = ayo.a($$0, "stream", false);
      int $$8 = ayo.a($$0, "attenuation_distance", 16);
      return new hig($$1, brj.a($$3), brj.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hig.a a(JsonObject $$0, hig.a $$1) {
      hig.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hig.a.a(ayo.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
