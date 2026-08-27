import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class mi implements mg {
   private final czf a;
   private final List<mi.b> b = Lists.newArrayList();

   private mi(czf $$0) {
      this.a = $$0;
   }

   @Override
   public czf a() {
      return this.a;
   }

   public static mi a(czf $$0) {
      return new mi($$0);
   }

   public mi a(List<mm> $$0) {
      this.b.add(new mi.b($$0));
      return this;
   }

   public mi a(mm $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public mi a(mh $$0, List<mm> $$1) {
      this.b.add(new mi.a($$0, $$1));
      return this;
   }

   public mi a(mh $$0, mm... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public mi a(mh $$0, mm $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dmf<czf, dme> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(mi.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends mi.b {
      private final mh a;

      a(mh $$0, List<mm> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dmf<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<mm> a;

      b(List<mm> $$0) {
         this.a = $$0;
      }

      public void a(dmf<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", mm.a(this.a));
         return $$0;
      }
   }
}
