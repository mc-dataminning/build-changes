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

public class gbs implements JsonDeserializer<gbr> {
   private static final bft a = bfr.a(1.0F);

   public gbr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = arg.m($$0, "entry");
      boolean $$4 = arg.a($$3, "replace", false);
      String $$5 = arg.a($$3, "subtitle", null);
      List<gbq> $$6 = this.a($$3);
      return new gbr($$6, $$4, $$5);
   }

   private List<gbq> a(JsonObject $$0) {
      List<gbq> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = arg.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (arg.a($$4)) {
               String $$5 = arg.a($$4, "sound");
               $$1.add(new gbq($$5, a, a, 1, gbq.a.a, false, false, 16));
            } else {
               $$1.add(this.b(arg.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gbq b(JsonObject $$0) {
      String $$1 = arg.i($$0, "name");
      gbq.a $$2 = this.a($$0, gbq.a.a);
      float $$3 = arg.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = arg.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = arg.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = arg.a($$0, "preload", false);
      boolean $$7 = arg.a($$0, "stream", false);
      int $$8 = arg.a($$0, "attenuation_distance", 16);
      return new gbq($$1, bfr.a($$3), bfr.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gbq.a a(JsonObject $$0, gbq.a $$1) {
      gbq.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gbq.a.a(arg.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
