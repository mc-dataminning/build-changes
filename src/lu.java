import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class lu implements ls {
   private final cua a;
   private final List<lu.b> b = Lists.newArrayList();

   private lu(cua $$0) {
      this.a = $$0;
   }

   @Override
   public cua a() {
      return this.a;
   }

   public static lu a(cua $$0) {
      return new lu($$0);
   }

   public lu a(List<ly> $$0) {
      this.b.add(new lu.b($$0));
      return this;
   }

   public lu a(ly $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public lu a(lt $$0, List<ly> $$1) {
      this.b.add(new lu.a($$0, $$1));
      return this;
   }

   public lu a(lt $$0, ly... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public lu a(lt $$0, ly $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dgc<cua, dgb> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(lu.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends lu.b {
      private final lt a;

      a(lt $$0, List<ly> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dgc<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<ly> a;

      b(List<ly> $$0) {
         this.a = $$0;
      }

      public void a(dgc<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", ly.a(this.a));
         return $$0;
      }
   }
}
