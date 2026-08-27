import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class nl implements nj {
   private final ddy a;
   private final List<nl.b> b = Lists.newArrayList();

   private nl(ddy $$0) {
      this.a = $$0;
   }

   @Override
   public ddy a() {
      return this.a;
   }

   public static nl a(ddy $$0) {
      return new nl($$0);
   }

   public nl a(List<np> $$0) {
      this.b.add(new nl.b($$0));
      return this;
   }

   public nl a(np $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public nl a(nk $$0, List<np> $$1) {
      this.b.add(new nl.a($$0, $$1));
      return this;
   }

   public nl a(nk $$0, np... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public nl a(nk $$0, np $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      drc<ddy, drb> $$0 = this.a.m();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(nl.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends nl.b {
      private final nk a;

      a(nk $$0, List<np> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(drc<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<np> a;

      b(List<np> $$0) {
         this.a = $$0;
      }

      public void a(drc<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", np.a(this.a));
         return $$0;
      }
   }
}
