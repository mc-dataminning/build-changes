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

public class gri implements JsonDeserializer<grh> {
   private static final box a = bov.a(1.0F);

   public grh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = axu.m($$0, "entry");
      boolean $$4 = axu.a($$3, "replace", false);
      String $$5 = axu.a($$3, "subtitle", null);
      List<grg> $$6 = this.a($$3);
      return new grh($$6, $$4, $$5);
   }

   private List<grg> a(JsonObject $$0) {
      List<grg> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = axu.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (axu.a($$4)) {
               String $$5 = axu.a($$4, "sound");
               $$1.add(new grg($$5, a, a, 1, grg.a.a, false, false, 16));
            } else {
               $$1.add(this.b(axu.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private grg b(JsonObject $$0) {
      String $$1 = axu.i($$0, "name");
      grg.a $$2 = this.a($$0, grg.a.a);
      float $$3 = axu.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = axu.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = axu.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = axu.a($$0, "preload", false);
      boolean $$7 = axu.a($$0, "stream", false);
      int $$8 = axu.a($$0, "attenuation_distance", 16);
      return new grg($$1, bov.a($$3), bov.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private grg.a a(JsonObject $$0, grg.a $$1) {
      grg.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = grg.a.a(axu.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
