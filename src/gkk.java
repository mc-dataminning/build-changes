import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class gkk implements arn<gkj> {
   public gkj b(JsonObject $$0) {
      Builder<gki> $$1 = ImmutableList.builder();
      int $$2 = awm.a($$0, "frametime", 1);
      if ($$2 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)$$2, "Invalid default frame time");
      }

      if ($$0.has("frames")) {
         try {
            JsonArray $$3 = awm.v($$0, "frames");

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               JsonElement $$5 = $$3.get($$4);
               gki $$6 = this.a($$4, $$5);
               if ($$6 != null) {
                  $$1.add($$6);
               }
            }
         } catch (ClassCastException var8) {
            throw new JsonParseException("Invalid animation->frames: expected array, was " + $$0.get("frames"), var8);
         }
      }

      int $$8 = awm.a($$0, "width", -1);
      int $$9 = awm.a($$0, "height", -1);
      if ($$8 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)$$8, "Invalid width");
      }

      if ($$9 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)$$9, "Invalid height");
      }

      boolean $$10 = awm.a($$0, "interpolate", false);
      return new gkj($$1.build(), $$8, $$9, $$2, $$10);
   }

   @Nullable
   private gki a(int $$0, JsonElement $$1) {
      if ($$1.isJsonPrimitive()) {
         return new gki(awm.g($$1, "frames[" + $$0 + "]"));
      } else if ($$1.isJsonObject()) {
         JsonObject $$2 = awm.m($$1, "frames[" + $$0 + "]");
         int $$3 = awm.a($$2, "time", -1);
         if ($$2.has("time")) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)$$3, "Invalid frame time");
         }

         int $$4 = awm.o($$2, "index");
         Validate.inclusiveBetween(0L, 2147483647L, (long)$$4, "Invalid frame index");
         return new gki($$4, $$3);
      } else {
         return null;
      }
   }

   @Override
   public String a() {
      return "animation";
   }
}
