import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class ob implements nz {
   private final die a;
   private final List<ob.b> b = Lists.newArrayList();

   private ob(die $$0) {
      this.a = $$0;
   }

   @Override
   public die a() {
      return this.a;
   }

   public static ob a(die $$0) {
      return new ob($$0);
   }

   public ob a(List<of> $$0) {
      this.b.add(new ob.b($$0));
      return this;
   }

   public ob a(of $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public ob a(oa $$0, List<of> $$1) {
      this.b.add(new ob.a($$0, $$1));
      return this;
   }

   public ob a(oa $$0, of... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public ob a(oa $$0, of $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dvk<die, dvj> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(ob.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends ob.b {
      private final oa a;

      a(oa $$0, List<of> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dvk<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<of> a;

      b(List<of> $$0) {
         this.a = $$0;
      }

      public void a(dvk<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", of.a(this.a));
         return $$0;
      }
   }
}
