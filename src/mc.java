import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class mc implements ma {
   private final cwj a;
   private final List<mc.b> b = Lists.newArrayList();

   private mc(cwj $$0) {
      this.a = $$0;
   }

   @Override
   public cwj a() {
      return this.a;
   }

   public static mc a(cwj $$0) {
      return new mc($$0);
   }

   public mc a(List<mg> $$0) {
      this.b.add(new mc.b($$0));
      return this;
   }

   public mc a(mg $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public mc a(mb $$0, List<mg> $$1) {
      this.b.add(new mc.a($$0, $$1));
      return this;
   }

   public mc a(mb $$0, mg... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public mc a(mb $$0, mg $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      djb<cwj, dja> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(mc.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends mc.b {
      private final mb a;

      a(mb $$0, List<mg> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(djb<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<mg> a;

      b(List<mg> $$0) {
         this.a = $$0;
      }

      public void a(djb<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", mg.a(this.a));
         return $$0;
      }
   }
}
