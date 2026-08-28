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

public class hom implements JsonDeserializer<hol> {
   private static final buf a = bud.a(1.0F);

   public hol a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azo.m($$0, "entry");
      boolean $$4 = azo.a($$3, "replace", false);
      String $$5 = azo.a($$3, "subtitle", null);
      List<hok> $$6 = this.a($$3);
      return new hol($$6, $$4, $$5);
   }

   private List<hok> a(JsonObject $$0) {
      List<hok> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azo.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azo.a($$4)) {
               alr $$5 = alr.a(azo.a($$4, "sound"));
               $$1.add(new hok($$5, a, a, 1, hok.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azo.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hok b(JsonObject $$0) {
      alr $$1 = alr.a(azo.i($$0, "name"));
      hok.a $$2 = this.a($$0, hok.a.a);
      float $$3 = azo.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azo.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azo.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azo.a($$0, "preload", false);
      boolean $$7 = azo.a($$0, "stream", false);
      int $$8 = azo.a($$0, "attenuation_distance", 16);
      return new hok($$1, bud.a($$3), bud.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hok.a a(JsonObject $$0, hok.a $$1) {
      hok.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hok.a.a(azo.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
