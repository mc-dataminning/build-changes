import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class nx implements nv {
   private final dhm a;
   private final List<nx.b> b = Lists.newArrayList();

   private nx(dhm $$0) {
      this.a = $$0;
   }

   @Override
   public dhm a() {
      return this.a;
   }

   public static nx a(dhm $$0) {
      return new nx($$0);
   }

   public nx a(List<ob> $$0) {
      this.b.add(new nx.b($$0));
      return this;
   }

   public nx a(ob $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public nx a(nw $$0, List<ob> $$1) {
      this.b.add(new nx.a($$0, $$1));
      return this;
   }

   public nx a(nw $$0, ob... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public nx a(nw $$0, ob $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dut<dhm, dus> $$0 = this.a.k();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(nx.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends nx.b {
      private final nw a;

      a(nw $$0, List<ob> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dut<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<ob> a;

      b(List<ob> $$0) {
         this.a = $$0;
      }

      public void a(dut<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", ob.a(this.a));
         return $$0;
      }
   }
}
