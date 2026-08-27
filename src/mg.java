import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class mg implements me {
   private final cys a;
   private final List<mg.b> b = Lists.newArrayList();

   private mg(cys $$0) {
      this.a = $$0;
   }

   @Override
   public cys a() {
      return this.a;
   }

   public static mg a(cys $$0) {
      return new mg($$0);
   }

   public mg a(List<mk> $$0) {
      this.b.add(new mg.b($$0));
      return this;
   }

   public mg a(mk $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public mg a(mf $$0, List<mk> $$1) {
      this.b.add(new mg.a($$0, $$1));
      return this;
   }

   public mg a(mf $$0, mk... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public mg a(mf $$0, mk $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dlk<cys, dlj> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(mg.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends mg.b {
      private final mf a;

      a(mf $$0, List<mk> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dlk<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<mk> a;

      b(List<mk> $$0) {
         this.a = $$0;
      }

      public void a(dlk<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", mk.a(this.a));
         return $$0;
      }
   }
}
