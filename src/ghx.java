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

public class ghx implements JsonDeserializer<ghw> {
   private static final bjd a = bjb.a(1.0F);

   public ghw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aud.m($$0, "entry");
      boolean $$4 = aud.a($$3, "replace", false);
      String $$5 = aud.a($$3, "subtitle", null);
      List<ghv> $$6 = this.a($$3);
      return new ghw($$6, $$4, $$5);
   }

   private List<ghv> a(JsonObject $$0) {
      List<ghv> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aud.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aud.a($$4)) {
               String $$5 = aud.a($$4, "sound");
               $$1.add(new ghv($$5, a, a, 1, ghv.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aud.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private ghv b(JsonObject $$0) {
      String $$1 = aud.i($$0, "name");
      ghv.a $$2 = this.a($$0, ghv.a.a);
      float $$3 = aud.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aud.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aud.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aud.a($$0, "preload", false);
      boolean $$7 = aud.a($$0, "stream", false);
      int $$8 = aud.a($$0, "attenuation_distance", 16);
      return new ghv($$1, bjb.a($$3), bjb.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private ghv.a a(JsonObject $$0, ghv.a $$1) {
      ghv.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = ghv.a.a(aud.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
